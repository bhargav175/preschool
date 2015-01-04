package models;

import be.objectify.deadbolt.core.models.Permission;
import be.objectify.deadbolt.core.models.Role;
import be.objectify.deadbolt.core.models.Subject;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.ExpressionList;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthUser;
import com.feth.play.module.pa.user.*;
import controllers.Application;
import models.TokenAction.Type;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

/**
 * Initial version based on work by Steve Chaloner (steve@objectify.be) for
 * Deadbolt2
 */
@Entity
@Table(name = "users")
public class User extends Model implements Subject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@Constraints.Email
	// if you make this unique, keep in mind that users *must* merge/link their
	// accounts then on signup with additional providers
	// @Column(unique = true)
	public String email;

	public String name;

	public String firstName;

	public String lastName;

    @JsonIgnore
    @Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date lastLogin;

    @JsonIgnore
    public boolean active;

    @JsonIgnore
    public boolean emailValidated;

	@JsonProperty("roles")
    @ManyToMany
	public List<SecurityRole> roles;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
	public List<LinkedAccount> linkedAccounts;


	@JsonProperty("permissions")
    @ManyToMany
	public List<UserPermission> permissions;



	public static final Finder<Long, User> find = new Finder<Long, User>(
			Long.class, User.class);
	private boolean teacher;

	@JsonIgnore
    @Override
	public String getIdentifier()
	{
		return Long.toString(id);
	}

	@Override
	public List<? extends Role> getRoles() {
		return roles;
	}

	@Override
	public List<? extends Permission> getPermissions() {
		return permissions;
	}

	public static boolean existsByAuthUserIdentity(
			final AuthUserIdentity identity) {
		final ExpressionList<User> exp;
		if (identity instanceof UsernamePasswordAuthUser) {
			exp = getUsernamePasswordAuthUserFind((UsernamePasswordAuthUser) identity);
		} else {
			exp = getAuthUserFind(identity);
		}
		return exp.findRowCount() > 0;
	}

	private static ExpressionList<User> getAuthUserFind(
			final AuthUserIdentity identity) {
		return find.where().eq("active", true)
				.eq("linkedAccounts.providerUserId", identity.getId())
				.eq("linkedAccounts.providerKey", identity.getProvider());
	}

	public static User findByAuthUserIdentity(final AuthUserIdentity identity) {
		if (identity == null) {
			return null;
		}
		if (identity instanceof UsernamePasswordAuthUser) {
			return findByUsernamePasswordIdentity((UsernamePasswordAuthUser) identity);
		} else {
			return getAuthUserFind(identity).findUnique();
		}
	}

	public static User findByUsernamePasswordIdentity(
			final UsernamePasswordAuthUser identity) {
		return getUsernamePasswordAuthUserFind(identity).findUnique();
	}

	private static ExpressionList<User> getUsernamePasswordAuthUserFind(
			final UsernamePasswordAuthUser identity) {
		return getEmailUserFind(identity.getEmail()).eq(
				"linkedAccounts.providerKey", identity.getProvider());
	}

	public void merge(final User otherUser) {
		for (final LinkedAccount acc : otherUser.linkedAccounts) {
			this.linkedAccounts.add(LinkedAccount.create(acc));
		}
		// do all other merging stuff here - like resources, etc.

		// deactivate the merged user that got added to this one
		otherUser.active = false;
		Ebean.save(Arrays.asList(new User[]{otherUser, this}));
	}

	public static User create(final AuthUser authUser) {
		final User user = new User();
        System.out.println(Application.IS_SUPER_ADMIN);
        if(controllers.Application.IS_SUPER_ADMIN ==false){

            user.roles = Collections.singletonList(SecurityRole
                    .findByRoleName(SecurityRole.USER_ROLE));
        }
        else{
            user.roles = Collections.singletonList(SecurityRole
                    .findByRoleName(SecurityRole.ADMIN_ROLE));
        }

		user.active = true;
		user.lastLogin = new Date();
		user.linkedAccounts = Collections.singletonList(LinkedAccount
				.create(authUser));

		if (authUser instanceof EmailIdentity) {
			final EmailIdentity identity = (EmailIdentity) authUser;
			// Remember, even when getting them from FB & Co., emails should be
			// verified within the application as a security breach there might
			// break your security as well!
			user.email = identity.getEmail();
			user.emailValidated = false;
		}

		if (authUser instanceof NameIdentity) {
			final NameIdentity identity = (NameIdentity) authUser;
			final String name = identity.getName();
			if (name != null) {
				user.name = name;
			}
		}
		
		if (authUser instanceof FirstLastNameIdentity) {
		  final FirstLastNameIdentity identity = (FirstLastNameIdentity) authUser;
		  final String firstName = identity.getFirstName();
		  final String lastName = identity.getLastName();
		  if (firstName != null) {
		    user.firstName = firstName;
		  }
		  if (lastName != null) {
		    user.lastName = lastName;
		  }
		}

		user.save();
		user.saveManyToManyAssociations("roles");
		user.saveManyToManyAssociations("permissions");
		return user;
	}

	public static void merge(final AuthUser oldUser, final AuthUser newUser) {
		User.findByAuthUserIdentity(oldUser).merge(
				User.findByAuthUserIdentity(newUser));
	}

	public Set<String> getProviders() {
		final Set<String> providerKeys = new HashSet<String>(
				linkedAccounts.size());
		for (final LinkedAccount acc : linkedAccounts) {
			providerKeys.add(acc.providerKey);
		}
		return providerKeys;
	}

	public static void addLinkedAccount(final AuthUser oldUser,
			final AuthUser newUser) {
		final User u = User.findByAuthUserIdentity(oldUser);
		u.linkedAccounts.add(LinkedAccount.create(newUser));
		u.save();
	}

	public static void setLastLoginDate(final AuthUser knownUser) {
		final User u = User.findByAuthUserIdentity(knownUser);
		u.lastLogin = new Date();
		u.save();
	}

	public static User findByEmail(final String email) {
		return getEmailUserFind(email).findUnique();
	}

	private static ExpressionList<User> getEmailUserFind(final String email) {
		return find.where().eq("active", true).eq("email", email);
	}

	public LinkedAccount getAccountByProvider(final String providerKey) {
		return LinkedAccount.findByProviderKey(this, providerKey);
	}

	public static void verify(final User unverified) {
		// You might want to wrap this into a transaction
		unverified.emailValidated = true;
		unverified.save();
		TokenAction.deleteByUser(unverified, Type.EMAIL_VERIFICATION);
	}

	public void changePassword(final UsernamePasswordAuthUser authUser,
			final boolean create) {
		LinkedAccount a = this.getAccountByProvider(authUser.getProvider());
		if (a == null) {
			if (create) {
				a = LinkedAccount.create(authUser);
				a.user = this;
			} else {
				throw new RuntimeException(
						"Account not enabled for password usage");
			}
		}
		a.providerUserId = authUser.getHashedPassword();
		a.save();
	}

	public void resetPassword(final UsernamePasswordAuthUser authUser,
			final boolean create) {
		// You might want to wrap this into a transaction
		this.changePassword(authUser, create);
		TokenAction.deleteByUser(this, Type.PASSWORD_RESET);
	}
    public static List<User> findAllUsers(){
		return find.fetch("roles").where().ne("roles.id",1).orderBy("name").findList();
    }

    public static User findByUsername(String username) {
        return find.where().eq("name",username).findUnique();
    }

	public static User findUserById(Integer id) {
		return find.where().eq("id", id).findUnique();
	}

	public  boolean isAdmin(){
		List<SecurityRole> securityRoles = this.roles;
		if(securityRoles.contains(SecurityRole.findByRoleName(SecurityRole.ADMIN_ROLE))){
			return true;
		}else{
			return false;
		}
	}

	public boolean isTeacher() {
		List<SecurityRole> securityRoles = this.roles;
		if(securityRoles.contains(SecurityRole.findByRoleName(SecurityRole.TEACHER_ROLE))){
			return true;
		}else{
			return false;
		}	}

	public boolean isParent() {
		List<SecurityRole> securityRoles = this.roles;
		if(securityRoles.contains(SecurityRole.findByRoleName(SecurityRole.PARENT_ROLE))){
			return true;
		}else {
			return false;
		}
	}
}
