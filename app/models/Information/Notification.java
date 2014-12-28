package models.Information;

/**
 * Created by Admin on 24/5/14.
 */


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.User;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Result;

import javax.persistence.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

@Entity
public class Notification extends Model {
    public static final Finder<Long,Notification> find= new Finder<>(Long.class,Notification.class);

    @JsonProperty("id")
    @Id
    public long id;

    @JsonBackReference("updateUser")
    @ManyToOne
    public User user;

    @JsonManagedReference("updateChange")
    @OneToMany
    public List<Notification_Info> notification_infos;


    public static Notification findNotificationByUser(User user) {
        return find.where().eq("user",user).findUnique();
    }

    public static Notification createNotification(User user) {
        Notification notification= new Notification();
        notification.notification_infos=new ArrayList<Notification_Info>();
        notification.user=user;
        notification.save();
        return notification;

    }
}
