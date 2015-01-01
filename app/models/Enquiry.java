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
public class Enquiry extends Model {

	public static final Finder<Long, Enquiry> find = new Finder<Long, Enquiry>(
			Long.class, Enquiry.class);
	@Id
	public Integer id;

	public String name;
	public String email;
	public String title;
	public String description;


	public static List<Enquiry> findAll() {
		return find.all();
	}

	public static Enquiry findById(Integer enquiryId) {
		return find.where().eq("id",enquiryId).findUnique();
	}
}