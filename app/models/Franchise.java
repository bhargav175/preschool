package models;

import play.db.ebean.Model;

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

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Franchise extends Model {

	public static final Finder<Long, Franchise> find = new Finder<Long, Franchise>(
			Long.class, Franchise.class);

	@Id
	public Integer id;

	public String name;
	public String location;
	public String request;
	public String aboutUs;


	public static List<Franchise> findAll() {
		return find.all();
	}
	public static Franchise findById(Integer franchiseId) {
		return find.where().eq("id",franchiseId).findUnique();
	}

}