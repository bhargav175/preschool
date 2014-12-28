package models.Information;

/**
 * Created by Admin on 24/5/14.
 */


import com.avaje.ebean.FetchConfig;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.Forum.ForumAnswer;
import models.Forum.ForumThread;
import models.User;
import models.content.ShortNote;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Activity_Object extends Model {
    public static final Finder<Long,Activity_Object> find= new Finder<>(Long.class,Activity_Object.class);


    @JsonProperty("id")
    @Id
    public long id;


    @JsonManagedReference("activity_change")
    @OneToMany
    public List<Activity_Change> activity_changes;



    @JsonProperty("type")
    public String objectType;

    @JsonProperty("identifier")
    public String identifier;


    public static Activity_Object findActivityObjectByShortNote(ShortNote shortNote){
        return find.where().conjunction().eq("identifier",shortNote.id.toString()).eq("objectType","shortNote").endJunction().findUnique();
    }

    public static Activity_Object createActivityObjectFromShortNote(ShortNote shortNote){
        Activity_Object activity_object= new Activity_Object();
        activity_object.activity_changes=new ArrayList<Activity_Change>();
        activity_object.identifier=shortNote.slug.toString();
        activity_object.objectType="shortNote";
        activity_object.save();
        return activity_object;
    }
    public static Activity_Object createActivityObjectFromForumThread(ForumThread forumThread){
        Activity_Object activity_object= new Activity_Object();
        activity_object.activity_changes=new ArrayList<Activity_Change>();
        activity_object.identifier=forumThread.slug.toString();
        activity_object.objectType="forumThread";
        activity_object.save();
        return activity_object;
    }

    public static Activity_Object createActivityObjectFromForumAnswer(ForumAnswer forumAnswer){
        Activity_Object activity_object= new Activity_Object();
        activity_object.activity_changes=new ArrayList<Activity_Change>();
        activity_object.identifier=forumAnswer.slug.toString();
        activity_object.objectType="forumAnswer";
        activity_object.save();
        return activity_object;
    }

    public static Activity_Object findActivityObjectByForumThread(ForumThread forumThread){
        return find.where().conjunction().eq("identifier",forumThread.id.toString()).eq("objectType","forumThread").endJunction().findUnique();
    }

    public static Activity_Object findActivityObjectByForumAnswer(ForumAnswer forumAnswer){
        return find.where().conjunction().eq("identifier",forumAnswer.id.toString()).eq("objectType","forumAnswer").endJunction().findUnique();
    }




}
