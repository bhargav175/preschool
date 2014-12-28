package models.Information;

/**
 * Created by Admin on 24/5/14.
 */


import com.avaje.ebean.FetchConfig;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Activity_Change extends Model {

    public static final Finder<Long,Activity_Change> find= new Finder<>(Long.class,Activity_Change.class);

    @JsonProperty("id")
    @Id
    public long id;

    @JsonBackReference("activity_change")
    @ManyToOne
    public Activity_Object  activityObject;

    @JsonProperty("eventTime")
    public String eventTime;

    @JsonProperty("verb")
    @Column(columnDefinition = "TEXT")
    public String verb;

   @JsonBackReference("activity_activitychanges")
   @ManyToOne
   public Activity activity;

   @JsonBackReference("acted")
   @ManyToOne
   public User acted;


    public static List<Activity_Change> findAllActivityChangesByUser(User localUser){
//        Activity activity=Activity.findActivityByUser(localUser);
//        if(activity!=null){
//            List<Activity_Object> activity_object1= Activity_Object.findActivityObjectByActivity(activity);
//            List<Activity_Change> activity_changes=new ArrayList<Activity_Change>();
//            if(activity_object1.size()!=0){
//                for(Activity_Object activity_object2: activity_object1){
//                    List<Activity_Change> activity_changes1= find.fetch("activityObject", new FetchConfig().query()).fetch("activityObject.shortNote").
//                            fetch("activityObject",new FetchConfig().query()).fetch("activityObject.activity",new FetchConfig().query()).fetch("activityObject.activity.user").
//                            where().eq("activityObject", activity_object2).orderBy("eventTime desc").findList();
//                    activity_changes.addAll(activity_changes1);
//
//                }
//                System.out.println("Activities");
//                return activity_changes;
//            }
//            else{
//                System.out.println("Activities es");
//
//                return new ArrayList<Activity_Change>();
//            }
//
//            Activity_Change.findAllActivityChangesByUser(localUser);
//        }
//        else{
//            System.out.println("Activities esld");
//
//            return new ArrayList<Activity_Change>();
//
//        }
        return find.where().eq("acted",localUser).orderBy("eventTime desc").findList();
    }



}
