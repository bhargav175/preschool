package controllers.Information;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import controllers.Application;
import models.Forum.ForumAnswer;
import models.Forum.ForumThread;
import models.Information.Notification_Info;
import models.Information.Notification_Object;
import models.SecurityRole;
import models.User;
import models.content.ShortNote;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.user_updates;

import java.util.ArrayList;
import java.util.List;

import static play.data.Form.form;

/**
 * Created by Admin on 10/8/14.
 */
public class Notification extends Controller {

    public static void saveUpdate(ShortNote sn, String string, User localUser, User user) {
        models.Information.Notification notification= models.Information.Notification.findNotificationByUser(user);
        if(notification!=null){

        }else{
            notification=models.Information.Notification.createNotification(user);
        }

        Notification_Object notification_object = Notification_Object.findNotificationObjectByShortNote(sn);
        if (notification_object == null) {
            notification_object = Notification_Object.createNotificationObjectFromShortNote(sn);
        } else {

        }
        Notification_Info notification_info = new Notification_Info();
        notification_info.acted = localUser;
        notification_info.verb = string;
        notification_info.notification_object = notification_object;
        notification_info.notification=notification;
        notification_info.eventTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
        notification_info.save();



    }

    public static void saveUpdateForumThread(ForumThread forumThread, String string, User localUser, User user) {
        models.Information.Notification notification = models.Information.Notification.findNotificationByUser(user);
        if (notification != null) {

        } else {
            notification=models.Information.Notification.createNotification(user);
        }
        Notification_Object notification_object = Notification_Object.findNotificationObjectByForumThread(forumThread);
        if (notification_object == null) {
            notification_object = Notification_Object.createNotificationObjectFromForumThread(forumThread);
        } else {

        }
        Notification_Info notification_info = new Notification_Info();
        notification_info.acted = localUser;
        notification_info.verb = string;
        notification_info.notification_object = notification_object;
        notification_info.notification=notification;
        notification_info.eventTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
        notification_info.save();
    }


    public static void saveUpdateForumAnswer(ForumAnswer forumAnswer, String string, User localUser, User user) {
        models.Information.Notification notification = models.Information.Notification.findNotificationByUser(user);
        if (notification != null) {

        } else {
            notification=models.Information.Notification.createNotification(user);
        }
        Notification_Object notification_object = Notification_Object.findNotificationObjectByForumAnswer(forumAnswer);
        if (notification_object == null) {
            notification_object = Notification_Object.createNotificationObjectFromForumAnswer(forumAnswer);
        } else {

        }
        Notification_Info notification_info = new Notification_Info();
        notification_info.acted = localUser;
        notification_info.verb = string;
        notification_info.notification_object = notification_object;
        notification_info.notification=notification;
        notification_info.eventTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
        notification_info.save();
    }

    public static Result getNotification() {
        final User localUser= Application.getLocalUser(session());
        models.Information.Notification notification= models.Information.Notification.findNotificationByUser(localUser);
        List<Notification_Info> notification_infos;
        if(notification==null){
            notification=new models.Information.Notification();
            notification_infos= new ArrayList<Notification_Info>();
        }

        else{
            notification_infos=Notification_Info.find.where().eq("notification",notification)
                    .orderBy("eventTime desc").setMaxRows(15).findList();
            for(Notification_Info notification_info:notification_infos){
                if(notification_info.notification_object.objectType.equals("forumAnswer")){
                    notification_info.notification_object.meta.metaString=ForumAnswer.getForumAnswerBySlug(notification_info.notification_object.identifier).forumThread.slug;

                }
            }
        }
        return ok(Json.toJson(notification_infos));
    }
    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result seeNotification(){
        final User localUser = Application.getLocalUser(session());
        DynamicForm requestData = form().bindFromRequest();
        String id= requestData.get("id");
        Long notId=new Long(id);
        Notification_Info notification_info= Notification_Info.find.byId(notId);
        if(notification_info!=null){
            notification_info.isSeen=true;
            notification_info.update();
            return ok(Json.toJson("Seen"));
        }
        else{
            return ok(Json.toJson("Bad Request"));
        }




    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result updatesPage() {
        final User localUser= Application.getLocalUser(session());
        models.Information.Notification notification= models.Information.Notification.findNotificationByUser(localUser);
        List<Notification_Info> notification_infos;

        if(notification==null){
            notification=new models.Information.Notification();
            notification_infos= new ArrayList<Notification_Info>();

        }
        else{
            notification_infos=Notification_Info.find.where().eq("notification",notification).orderBy("eventTime desc").findList();
            for(Notification_Info notification_info:notification_infos){
                if(notification_info.notification_object.objectType.equals("forumAnswer")){
                    notification_info.notification_object.meta.metaString=ForumAnswer.getForumAnswerBySlug(notification_info.notification_object.identifier).forumThread.slug;

                }
            }
        }
        return ok(user_updates.render(localUser,notification_infos));
    }

    public static Result setNotification() {
        final User localUser= Application.getLocalUser(session());
        models.Information.Notification notification= models.Information.Notification.findNotificationByUser(localUser);
        if(notification==null){
            notification=new models.Information.Notification();
        }
        else{
            for(Notification_Info notification_info:notification.notification_infos){
                if(notification_info.isSeen==false){
                    notification_info.isSeen=true;
                    notification_info.update();
                }

            }
        }
        return ok(Json.toJson("Success"));
    }
}
