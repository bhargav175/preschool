package models.Information;

/**
 * Created by Admin on 24/5/14.
 */


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.Forum.ForumAnswer;
import models.Forum.ForumThread;
import models.User;
import models.content.ShortNote;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Notification_Object extends Model {
    public static final Finder<Long,Notification_Object> find= new Finder<>(Long.class,Notification_Object.class);


    public class Meta{
        @JsonProperty("metaStr")
        public String metaString;
    }

    @JsonProperty("meta")
    public Meta meta=new Meta();

    @JsonProperty("id")
    @Id
    public long id;

    @JsonIgnore
    @OneToMany
    public List<Notification_Info> notification_infoList;

    @JsonProperty("objectType")
    @Column(columnDefinition = "TEXT")
    public String objectType;

    @JsonProperty("identifier")
    public String identifier;


    public static Notification_Object findNotificationObjectByShortNote(ShortNote sn) {
        return find.where().conjunction().eq("objectType","shortNote").eq("identifier",sn.slug).endJunction().findUnique();
    }

    public static Notification_Object createNotificationObjectFromShortNote(ShortNote sn) {
        Notification_Object notification_object= new Notification_Object();
        notification_object.identifier=sn.slug;
        notification_object.objectType="shortNote";
        notification_object.save();
        return notification_object;
    }

    public static Notification_Object findNotificationObjectByForumThread(ForumThread forumThread) {
        return find.where().conjunction().eq("objectType","forumThread").eq("identifier",forumThread.slug).endJunction().findUnique();
    }

    public static Notification_Object findNotificationObjectByForumAnswer(ForumAnswer forumAnswer) {
        return find.where().conjunction().eq("objectType","forumAnswer").eq("identifier",forumAnswer.slug).endJunction().findUnique();
    }

    public static Notification_Object createNotificationObjectFromForumThread(ForumThread forumThread) {
        Notification_Object notification_object= new Notification_Object();
        notification_object.identifier=forumThread.slug;
        notification_object.objectType="forumThread";
        notification_object.save();
        return notification_object;
    }

    public static Notification_Object createNotificationObjectFromForumAnswer(ForumAnswer forumAnswer) {
        Notification_Object notification_object= new Notification_Object();
        notification_object.identifier=forumAnswer.slug;
        notification_object.objectType="forumAnswer";
        notification_object.save();
        return notification_object;
    }
}
