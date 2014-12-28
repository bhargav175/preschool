package controllers.Forum;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.annotation.JsonProperty;
import controllers.Application;
import controllers.Information.Notification;
import models.Forum.ForumAnswer;
import models.Forum.ForumAnswerLike;
import models.Forum.ForumThread;
import models.Forum.ForumThreadLike;
import models.Information.Activity;
import models.Information.Activity_Change;
import models.Information.Activity_Object;
import models.SecurityRole;
import models.User;
import models.content.Tag;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.*;

import views.html.forum.*;

import static play.data.Form.form;

/**
 * Created by Admin on 8/8/14.
 */
public class Forum extends Controller {



    public static class ForumInfo{
        @JsonProperty("forumThreadLikes")
        public List<ForumThreadLike> forumThreadLikes;

        @JsonProperty("isLiked")
        public Boolean isliked;
    }
    public static class ForumAnswerInfo{
        @JsonProperty("forumAnswerLikes")
        public List<ForumAnswerLike> forumAnswerLikes;

        @JsonProperty("isLiked")
        public Boolean isliked;
    }

    @JsonProperty("forumThreads")
    public static List<ForumThread> forumThreads= new ArrayList<ForumThread>();
    public static Result ForumPage(){
        Forum forum= new Forum();
        forum.forumThreads=new ArrayList<models.Forum.ForumThread>(ForumThread.getAllForumThreads());
        return ok(forumPage.render(forum.forumThreads));
    }
    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result addForumThread(){
        final User localUser=Application.getLocalUser(session());
        return ok(addForumThread.render(localUser));
    }


    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result saveQuestion() {
        DynamicForm requestData = form().bindFromRequest();
        String title=requestData.get("title");
        String text=requestData.get("text");
        ForumThread forumThread=new ForumThread();
        Map<String,String[]> maps=request().body().asFormUrlEncoded();
        List<Tag> tags= new ArrayList<Tag>();
        for(String key:maps.keySet()){
            if(key.contains("tags")){
               String[] keyValue= maps.get(key);
                List<String> valueList = Arrays.asList(keyValue);
                models.content.Tag tag= Tag.findTagBySlug(valueList.get(0));
                if(tag!=null){
                    tags.add(tag);
                }
            }

        }

        final User localUser=Application.getLocalUser(session());
        if(title!=null &&text!=null){
            forumThread.text=text;
            forumThread.title=title;
            forumThread.createdBy=localUser;
            forumThread.createdTime= new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
            forumThread.answers=null;
            forumThread.html=text;
            forumThread.tags=tags;
            forumThread.slug=controllers.content.ShortNote.toSlug(forumThread.title);
            forumThread.threadLikes=null;
            ForumThread ft=ForumThread.getForumBySlug(forumThread.slug);
            int a = 2;
            String tempSlug=forumThread.slug;
            while (ft != null) {
                tempSlug = forumThread.slug  + a;
                ft = ForumThread.getForumBySlug(tempSlug);
                a = a + 1;
            }
            forumThread.slug=tempSlug;

            forumThread.save();
            saveActivityForumThread(forumThread,"created",localUser);

            return redirect(controllers.Forum.routes.Forum.getForumThread(forumThread.slug));
        }
        else{
            return badRequest("Title or Text is null");
        }

    }

    public static Result getForumThread(String slug) {
        final User localUser=Application.getLocalUser(session());

        ForumThread forumThread=ForumThread.getForumBySlug(slug);
        if(forumThread!=null){
            return ok(singleForumThread.render(localUser,forumThread));
        }else{
            return badRequest("No such Thread");
        }

    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result saveAnswer() {
        DynamicForm requestData = form().bindFromRequest();
        String title=requestData.get("title");
        String text=requestData.get("text");
        String questionSlug=requestData.get("questionSlug");
        ForumAnswer forumAnswer=new ForumAnswer();
        ForumThread question=ForumThread.getForumBySlug(questionSlug);
        final User localUser=Application.getLocalUser(session());
        if(question!=null &&text!=null){
            forumAnswer.text=text;

            forumAnswer.createdBy=localUser;
            forumAnswer.createdTime= new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
            forumAnswer.forumThread=question;
            forumAnswer.html=text;
            if(text.length()>15){
                forumAnswer.slug=controllers.content.ShortNote.toSlug(forumAnswer.text.substring(0,15));
            }
            else{
                forumAnswer.slug=controllers.content.ShortNote.toSlug(forumAnswer.text);
            }

            forumAnswer.answerLikes=null;
            ForumAnswer fa=ForumAnswer.getForumAnswerBySlug(forumAnswer.slug);
            int a = 2;
            String tempSlug=forumAnswer.slug;
            while (fa != null) {
                tempSlug = forumAnswer.slug  + a;
                fa = ForumAnswer.getForumAnswerBySlug(tempSlug);
                a = a + 1;
            }
            forumAnswer.slug=tempSlug;
            forumAnswer.save();
            saveActivityForumAnswer(forumAnswer,"created",localUser);
            controllers.Information.Notification.saveUpdateForumAnswer(forumAnswer,"created",localUser,forumAnswer.forumThread.createdBy);

            return redirect(controllers.Forum.routes.Forum.getForumThread(questionSlug));
        }
        else{
            return badRequest("Bad Request");
        }
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result editForumThread(String slug) {
        final User localUser = Application.getLocalUser(session());
        ForumThread forumThread = ForumThread.getForumBySlug(slug);
        if (forumThread != null && forumThread.createdBy.equals(localUser)) {
            return ok(editForumThread.render(localUser, forumThread));
        } else {
            return badRequest("No such Thread");
        }
    }

    public static Result getApiForumThread(String slug) {
        ForumThread forumThread=ForumThread.getForumBySlug(slug);
        return ok(Json.toJson(forumThread));
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result saveEditedForumThread() {
        DynamicForm requestData = form().bindFromRequest();
        String title=requestData.get("title");
        String text=requestData.get("text");
        String slug=requestData.get("forumThreadSlug");
        final User localUser=Application.getLocalUser(session());
        ForumThread forumThread=ForumThread.getForumBySlug(slug);
        if(forumThread!=null && forumThread.createdBy.equals(localUser)){
            Map<String,String[]> maps=request().body().asFormUrlEncoded();
            List<Tag> tags= new ArrayList<Tag>();
            for(String key:maps.keySet()){
                if(key.contains("tags")){
                    String[] keyValue= maps.get(key);
                    List<String> valueList = Arrays.asList(keyValue);
                    models.content.Tag tag= Tag.findTagBySlug(valueList.get(0));
                    if(tag!=null){
                        tags.add(tag);
                    }
                }

            }

                forumThread.text=text;
                forumThread.title=title;
                forumThread.answers=null;
                forumThread.html=text;
                forumThread.tags=tags;
                forumThread.threadLikes=null;
                forumThread.update();
                saveActivityForumThread(forumThread,"edited",localUser);

            return redirect(controllers.Forum.routes.Forum.getForumThread(forumThread.slug));

        }
        else{
              return badRequest("Bad Request");
        }


    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result editAnswerThread(String slug) {
        final User localUser = Application.getLocalUser(session());
        ForumAnswer forumAnswer = ForumAnswer.getForumAnswerBySlug(slug);
        if (forumAnswer != null) {
            return ok(editForumAnswer.render(localUser, forumAnswer));
        } else {
            return badRequest("No such Thread");
        }    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result saveEditedAnswer() {
        DynamicForm requestData = form().bindFromRequest();
        String text=requestData.get("answerText");
        String slug=requestData.get("slug");
        ForumAnswer forumAnswer=ForumAnswer.getForumAnswerBySlug(slug);
        final User localUser=Application.getLocalUser(session());
        if(forumAnswer!=null && forumAnswer.createdBy.equals(localUser)){
            forumAnswer.text=text;
            forumAnswer.update();
            saveActivityForumAnswer(forumAnswer,"edited",localUser);
            controllers.Information.Notification.saveUpdateForumAnswer(forumAnswer,"edited",localUser,forumAnswer.forumThread.createdBy);



            return redirect(controllers.Forum.routes.Forum.getForumThread(forumAnswer.forumThread.slug));
        }
        else{
            return badRequest("No such Answer");
        }

    }


    public static Result getApiForumThreadLike(String slug) {
        ForumThread forumThread=ForumThread.getForumBySlug(slug);
        final User localUser=Application.getLocalUser(session());
        if(forumThread!=null){
            ForumInfo info= new ForumInfo();
            info.forumThreadLikes=forumThread.threadLikes;
            info.isliked=false;
                for(ForumThreadLike forumThreadLike: forumThread.threadLikes){
                    if(forumThreadLike.createdBy.equals(localUser)){
                        info.isliked=true;
                        forumThread.threadLikes.remove(forumThreadLike);
                        forumThreadLike.delete();
                        saveActivityForumThread(forumThread,"unLiked",localUser);
                        Notification.saveUpdateForumThread(forumThread, "unLiked", localUser, forumThread.createdBy);

                        forumThread.update();
                        info.forumThreadLikes=forumThread.threadLikes;
                        info.isliked=false;
                        return ok(Json.toJson(info));

                    }

                }


               ForumThreadLike forumThreadLike=new ForumThreadLike();
               forumThreadLike.createdTime=new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
               forumThreadLike.createdBy=localUser;
               forumThreadLike.forumThread=forumThread;
               forumThreadLike.save();
               saveActivityForumThread(forumThread,"liked",localUser);
                 Notification.saveUpdateForumThread(forumThread, "liked", localUser, forumThread.createdBy);

               forumThread=ForumThread.getForumBySlug(slug);
               info.forumThreadLikes=forumThread.threadLikes;
               info.isliked=true;




            return ok(Json.toJson(info));
        }
        else{
            return badRequest("No likes");
        }
    }

    public static Result getApiForumThreadLikedByUser(String slug) {
        ForumThread forumThread=ForumThread.getForumBySlug(slug);
        final User localUser=Application.getLocalUser(session());
        if(forumThread!=null ){
            for(ForumThreadLike forumThreadLike: forumThread.threadLikes){
                if(forumThreadLike.createdBy.equals(localUser)){
                    return ok(Json.toJson(true));
                }

            }
            return ok(Json.toJson(false));
        }
        else{
            return badRequest("No likes");
        }
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result getApiForumAnswerLike(String slug) {
        ForumAnswer forumAnswer=ForumAnswer.getForumAnswerBySlug(slug);
        final User localUser=Application.getLocalUser(session());
        if(forumAnswer!=null){
            ForumAnswerInfo answerInfo= new ForumAnswerInfo();
            answerInfo.forumAnswerLikes=forumAnswer.answerLikes;
            answerInfo.isliked=false;
            for(ForumAnswerLike forumAnswerLike: forumAnswer.answerLikes){
                if(forumAnswerLike.createdBy.equals(localUser)){
                    answerInfo.isliked=true;
                    forumAnswer.answerLikes.remove(forumAnswerLike);
                    forumAnswerLike.delete();
                    forumAnswer.update();
                    saveActivityForumAnswer(forumAnswer,"unLiked",localUser);
                    Notification.saveUpdateForumAnswer(forumAnswer, "unLiked", localUser, forumAnswer.createdBy);

                    answerInfo.forumAnswerLikes=forumAnswer.answerLikes;
                    answerInfo.isliked=false;
                    return ok(Json.toJson(answerInfo));

                }

            }


            ForumAnswerLike forumAnswerLike=new ForumAnswerLike();
            forumAnswerLike.createdTime=new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
            forumAnswerLike.createdBy=localUser;
            forumAnswerLike.forumAnswer=forumAnswer;
            forumAnswerLike.save();
            saveActivityForumAnswer(forumAnswer,"liked",localUser);
            Notification.saveUpdateForumAnswer(forumAnswer, "liked", localUser, forumAnswer.createdBy);

            forumAnswer=ForumAnswer.getForumAnswerBySlug(slug);
            answerInfo.forumAnswerLikes=forumAnswer.answerLikes;
            answerInfo.isliked=true;



            return ok(Json.toJson(answerInfo));
        }
        else{
            return badRequest("No likes");
        }    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result getApiForumAnswerLikedByUser(String slug) {
        ForumAnswer forumAnswer=ForumAnswer.getForumAnswerBySlug(slug);
        final User localUser=Application.getLocalUser(session());
        if(forumAnswer!=null ){
            for(ForumAnswerLike forumAnswerLike: forumAnswer.answerLikes){
                if(forumAnswerLike.createdBy.equals(localUser)){
                    return ok(Json.toJson(true));
                }

            }
            return ok(Json.toJson(false));
        }
        else{
            return badRequest("No likes");
        }    }


    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result saveActivityForumThread(ForumThread forumThread,String string, User localUser){
        Activity activity = Activity.findActivityByUser(localUser);
        if (activity == null) {
            activity = Activity.createUserActivity(localUser);
        } else {

        }
        Activity_Object activity_object = Activity_Object.findActivityObjectByForumThread(forumThread);
        if (activity_object == null) {
            activity_object = Activity_Object.createActivityObjectFromForumThread(forumThread);
        } else {

        }
        Activity_Change activity_change = new Activity_Change();
        activity_change.acted = localUser;
        activity_change.verb = string;
        activity_change.activityObject = activity_object;
        activity_change.activity=activity;
        activity_change.eventTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
        activity_change.save();
        return ok();
    }
    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result saveActivityForumAnswer(ForumAnswer forumAnswer,String string, User localUser){
        Activity activity = Activity.findActivityByUser(localUser);
        if (activity == null) {
            activity = Activity.createUserActivity(localUser);
        } else {

        }
        Activity_Object activity_object = Activity_Object.findActivityObjectByForumAnswer(forumAnswer);
        if (activity_object == null) {
            activity_object = Activity_Object.createActivityObjectFromForumAnswer(forumAnswer);
        } else {

        }
        Activity_Change activity_change = new Activity_Change();
        activity_change.acted = localUser;
        activity_change.verb = string;
        activity_change.activityObject = activity_object;
        activity_change.activity=activity;
        activity_change.eventTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
        activity_change.save();

        return ok();

    }
}
