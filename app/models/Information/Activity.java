package models.Information;

/**
 * Created by Admin on 24/5/14.
 */


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Activity extends Model {
    public static final Finder<Long,Activity> find= new Finder<>(Long.class,Activity.class);

    @JsonProperty("id")
    @Id
    public long id;

    @JsonBackReference("user")
    @ManyToOne
    public User user;

    @JsonManagedReference("activity_activitychanges")
    @OneToMany
    public List<Activity_Change> activity_changes;

    public static Activity findActivityByUser(User localUser){
        return find.fetch("user").where().eq("user",localUser).findUnique();
    }
    public static Activity createUserActivity(User localUser){
        Activity activity= new Activity();
        activity.user=localUser;

        activity.activity_changes=new ArrayList<Activity_Change>();
        activity.save();
        return activity;
    }

}
