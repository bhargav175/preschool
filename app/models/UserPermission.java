package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import be.objectify.deadbolt.core.models.Permission;

/**
 * Initial version based on work by Steve Chaloner (steve@objectify.be) for
 * Deadbolt2
 */
@Entity
public class UserPermission extends Model implements Permission {

	public static final String PERMISSION_CRU_ADMINS = "cru.admin";
	public static final String PERMISSION_CRU_MODERATORS = "cru.moderator";
	public static final String PERMISSION_CRU_CONTENT_WRITER = "cru.contentwriter";
	public static final String PERMISSION_CRU_ORGANIZATION = "cru.organization";
	public static final String PERMISSION_CRU_TEACHER = "cru.teacher";
	public static final String PERMISSION_CRU_STUDENT = "cru.student";
	public static final String PERMISSION_LOGIN = "login";
	public static final String PERMISSION_D_ADMIN= "d.admin";
	public static final String PERMISSION_D_MODERATOR = "d.moderator";
	public static final String PERMISSION_D_CONTENT_WRITER = "d.contentwriter";
	public static final String PERMISSION_D_ORGANIZATION= "d.organization";
	public static final String PERMISSION_D_TEACHER = "d.teacher";
	public static final String PERMISSION_D_STUDENT = "d.student";
	public static final String PERMISSION_BLOCK_ADMIN = "block.admin";
	public static final String PERMISSION_BLOCK_MODERATOR= "block.moderator";
	public static final String PERMISSION_BLOCK_CONTENT_WRITER = "block.contentwriter";
	public static final String PERMISSION_BLOCK_ORGANIZATION = "block.organization";
	public static final String PERMISSION_BLOCK_TEACHER = "block.teacher";
	public static final String PERMISSION_BLOCK_STUDENT = "block.student";
	public static final String PERMISSION_CRU_CONTENT = "cru.content";
	public static final String PERMISSION_D_CONTENT = "d.content";
	public static final String PERMISSION_CRU_TAG = "cru.tag";
	public static final String PERMISSION_D_TAG = "d.tag";
	public static final String PERMISSION_CRU_POST = "cru.post";
	public static final String PERMISSION_D_POST = "d.post";
	public static final String PERMISSION_EDIT_POST = "edit.post";
	public static final String PERMISSION_CRU_FORUM_QUESTION = "cru.forum.question";
	public static final String PERMISSION_FLAG_FORUM_QUESTION = "flag.forum.question";
	public static final String PERMISSION_D_FORUM_QUESTION = "d.forum.question";
	public static final String PERMISSION_CRU_FORUM_ANSWER = "cru.forum.answer";
	public static final String PERMISSION_FLAG_FORUM_ANSWER = "flag.forum.answer";
	public static final String PERMISSION_D_FORUM_ANSWER = "d.forum.answer";
	public static final String PERMISSION_CRU_QUIZ = "cru.quiz";
	public static final String PERMISSION_D_QUIZ = "cru.quiz";
	public static final String PERMISSION_ASSIGN_ROLES = "assign.roles";
	public static final String PERMISSION_VIEW_CONTENT = "view.tag";
	public static final String PERMISSION_UPVOTE_NOTES = "upvote.post";
	public static final String PERMISSION_DOWNVOTE_NOTES = "downvote.post";
	public static final String PERMISSION_UPVOTE_FORUM_QUESTION = "upvote.forum.question";
	public static final String PERMISSION_DOWNVOTE_FORUM_QUESTION = "downvote.forum.question";
	public static final String PERMISSION_UPVOTE_FORUM_ANSWER = "upvote.forum.answer";
	public static final String PERMISSION_DOWNVOTE_FORUM_ANSWER = "downvote.forum.answer";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	public String value;

	public static final Model.Finder<Long, UserPermission> find = new Model.Finder<Long, UserPermission>(
			Long.class, UserPermission.class);

	public String getValue() {
		return value;
	}

	public static UserPermission findByValue(String value) {
		return find.where().eq("value", value).findUnique();
	}
}
