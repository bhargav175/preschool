package models.Information;

/**
 * Created by Admin on 24/5/14.
 */


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Result;
import play.mvc.Results;

import views.html.defaultpages.badRequest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static play.mvc.Results.ok;

@Entity
public class Notification_Info extends Model {
    public static final Finder<Long,Notification_Info> find= new Finder<>(Long.class,Notification_Info.class);

    @JsonProperty("id")
    @Id
    public long id;

    @JsonProperty("eventTime")
    public String eventTime;

    @JsonProperty("verb")
    @Column(columnDefinition = "TEXT")
    public String verb;

    @JsonProperty("isSeen")
    public Boolean isSeen=false;


    @JsonProperty("acted")
    @ManyToOne
    public User acted;

    @JsonProperty("notificationObject")
    @ManyToOne
    public Notification_Object notification_object;

    @JsonBackReference("updateChange")
    @ManyToOne
    public Notification notification;


}
