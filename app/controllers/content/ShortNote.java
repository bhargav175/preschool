package controllers.content;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import controllers.Application;
import controllers.Information.Notification;
import models.Information.Activity;
import models.Information.Activity_Change;
import models.Information.Activity_Object;
import models.SecurityRole;
import models.User;
import models.content.*;
import models.content.Chapter;
import models.content.Tag;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import play.data.DynamicForm;
import play.libs.F;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.WebSocket;

import java.io.IOException;
import java.text.Normalizer;
import java.util.*;
import java.util.regex.Pattern;

import static models.content.ShortNoteEditHistory.saveShortNoteEdits;
import static play.data.Form.form;

/**
 * Created by Admin on 9/5/14.
 */
public class ShortNote extends Controller {

    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

    @JsonProperty("shortnotes")
    public List<models.content.ShortNote> shortNotes = new ArrayList<models.content.ShortNote>();

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result shortNote() {
      final User localUser = Application.getLocalUser(session());
        JsonNode jsonObj = request().body().asJson();
        JsonNode s=jsonObj.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) jsonObj;
        if(s!=null){
            Long fi=new Long(s.toString());
            Image featuredImage=Image.getImageById(localUser,fi);
            if(featuredImage!=null){
            }
            else{
                featuredImage=null;

            }
            objectNode.put("featuredImage",Json.toJson(featuredImage));
        }
        JsonNode tags=jsonObj.findValue("tags");
        if(tags.size()>0){
            List<Tag> tagList=new ArrayList<Tag>();
            for(int i=0;i<tags.size();i++){
                Long tagId=new Long(tags.get(i).toString());
                Tag tag=Tag.findTagById(tagId);
                tagList.add(tag);
            }
            objectNode.put("tags",Json.toJson(tagList));
        }
        models.content.ShortNote sn = null;
        try {
            sn = controllers.content.ShortNote.fromJson(objectNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sn != null) {

            models.content.ShortNote savedShortNote = saveShortNote(sn, localUser);
            saveActivity(savedShortNote, "created", localUser);

            return ok("saved");
        } else {
            return badRequest("Malformed Json");
        }

    }

    public static Result returnShortNotes() {
        List<models.content.ShortNote> shortNotes = models.content.ShortNote.findAllShortNotes();
        return ok(Json.toJson(shortNotes));


    }

    public static Result returnShortNotesByUser() {
        final User localUser = Application.getLocalUser(session());
        List<models.content.ShortNote> shortNotes = models.content.ShortNote.findAllShortNotesByUser(localUser);
        ShortNote shortNoteControllerObject = new ShortNote();
        shortNoteControllerObject.shortNotes = new ArrayList<models.content.ShortNote>(shortNotes);
        System.out.println("done");
        return ok(Json.toJson(shortNoteControllerObject.shortNotes));


    }

    public static models.content.ShortNote saveShortNote(models.content.ShortNote sn, User localUser) {
        sn.createdTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
        sn.updatedTime = sn.createdTime;
        sn.user = localUser;
        sn.slug = toSlug(sn.title);
        models.content.ShortNote shortNote = models.content.ShortNote.findShortNoteBySlug(sn.slug);
        int a = 2;
        String tempSlug=sn.slug;
        while (shortNote != null) {
            tempSlug = sn.slug  + a;
            shortNote = models.content.ShortNote.findShortNoteBySlug(tempSlug);
            a = a + 1;
        }
        sn.slug=tempSlug;
        sn.save();
        models.content.ShortNote shortNote1 = models.content.ShortNote.findShortNoteBySlug(sn.slug);
        return shortNote1;
    }

    public static Result updateShortNote(models.content.ShortNote sn, User localUser) {
        if (sn.user.equals(localUser)) {
            sn.update();
            return ok("done");

        } else {
            return badRequest("You are not the owner of this post");
        }

    }

    public static models.content.ShortNote fromJson(JsonNode json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json.traverse(), models.content.ShortNote.class);

    }

    public static String toSlug(String input) {
        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }


    public static Result infoShortNote(String slug) {
        models.content.ShortNote shortNote = models.content.ShortNote.findShortNoteBySlug(slug);
        if (shortNote != null) {
            ShortNote shortNote1 = new ShortNote();
            shortNote1.shortNotes.add(shortNote);
            return ok(Json.toJson(shortNote1));
        } else {
            return badRequest("No such shortnote");
        }
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result doedit_shortnote() {
        final User localUser = Application.getLocalUser(session());
        JsonNode jsonObj = request().body().asJson();
        JsonNode s=jsonObj.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) jsonObj;
        if(s!=null){
            Long fi=new Long(s.toString());
            Image featuredImage=Image.getImageById(localUser,fi);
            if(featuredImage!=null){
            }
            else{
                featuredImage=null;

            }
            objectNode.put("featuredImage",Json.toJson(featuredImage));
        }
        JsonNode tags=jsonObj.findValue("tags");
        if(tags.size()>0){
            List<Tag> tagList=new ArrayList<Tag>();
            for(int i=0;i<tags.size();i++){
                Long tagId=new Long(tags.get(i).toString());
                Tag tag=Tag.findTagById(tagId);
                tagList.add(tag);
            }
            objectNode.put("tags",Json.toJson(tagList));
        }
        models.content.ShortNote sn = null;
        try {
            sn = fromJson(objectNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sn != null) {
            models.content.ShortNote oldShortNote = models.content.ShortNote.findShortNoteById(sn.id);
            models.content.ShortNote shortNote = models.content.ShortNote.findShortNoteById(sn.id);

            if (shortNote != null) {
                if (sn.updatedTime.equals(shortNote.updatedTime)) {
                    shortNote.deepCopy(sn);
                    saveShortNoteEdits(oldShortNote, shortNote, localUser);

                    saveActivity(shortNote, "edited", localUser);
                    return updateShortNote(shortNote, localUser);
                } else {
                    return badRequest("The post was already edited");
                }

            } else {
                return badRequest("404 Not Found");
            }

        } else {
            return badRequest("Malformed Json");
        }
    }

    private static void saveActivity(models.content.ShortNote shortNote,String string, User localUser) {
        Activity activity = Activity.findActivityByUser(localUser);
        if (activity == null) {
            activity = Activity.createUserActivity(localUser);
        } else {

        }
        Activity_Object activity_object = Activity_Object.findActivityObjectByShortNote(shortNote);
        if (activity_object == null) {
            activity_object = Activity_Object.createActivityObjectFromShortNote(shortNote);
        } else {

        }
        Activity_Change activity_change = new Activity_Change();

        if (string.equals("edited") || string.equals("created")) {
            activity_change.acted = localUser;

        } else {
            activity_change.acted = localUser;

        }
        activity_change.verb = string;
        activity_change.activityObject = activity_object;
        activity_change.activity=activity;
        activity_change.eventTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
        activity_change.save();


    }


    public static Result getEditHistory(Long id) {
        models.content.ShortNote shortNote = models.content.ShortNote.findShortNoteById(id);
        if (shortNote != null) {
            List<ShortNoteEditHistory> shortNoteEditHistories = ShortNoteEditHistory.findEditsOfShortNote(shortNote);
            return ok(Json.toJson(shortNoteEditHistories));
        } else {
            return badRequest("None");
        }

    }


    public static WebSocket<JsonNode> feedShortNode() {

        return new WebSocket<JsonNode>() {

            // Called when the Websocket Handshake is done.
            public void onReady(final play.mvc.WebSocket.In<JsonNode> in, final play.mvc.WebSocket.Out<JsonNode> out) {

                // For each event received on the socket,
                in.onMessage(new F.Callback<JsonNode>() {
                    public void invoke(JsonNode event) {

                        // Log events to the console
                        System.out.println(event);
                        List<models.content.ShortNote> shortNoteList = models.content.ShortNote.findAllShortNotes();
                        out.write(Json.toJson(shortNoteList));

                    }
                });

                // When the socket is closed.
                in.onClose(new F.Callback0() {
                    public void invoke() {

                        System.out.println("Disconnected");

                    }
                });

                // Send a single 'Hello!' message

                Timer timer = new Timer();

                timer.schedule(new TimerTask() {
                    public void run() {
                        List<models.content.ShortNote> shortNoteList = models.content.ShortNote.findAllShortNotes();
                        out.write(Json.toJson(shortNoteList));
                    }
                }, 0, 300 * 1000);


            }


        };
    }

    public static Result getPostsByTag(String slug) {
        models.content.Tag tag = Tag.findTagBySlug(slug);
        if (tag != null) {
            List<models.content.ShortNote> shortNoteList = models.content.ShortNote.findPostsByTag(tag);
            return ok(Json.toJson(shortNoteList));

        } else {
            return badRequest("No such tag");
        }
    }

    public static List<models.content.ShortNote> getPostsByChapterApi(String slug) {
        Chapter chapter = Chapter.findChapterBySlug(slug);
        if (chapter != null) {
            List<Tag> tags = Tag.findTagsInChapter(chapter);
            List<models.content.ShortNote> shortNoteList = new ArrayList<models.content.ShortNote>();
            for (Tag tag : tags) {

                List<models.content.ShortNote> tempShortList = models.content.ShortNote.findPostsByTag(tag);
                for (models.content.ShortNote shortNote : tempShortList) {
                    if (shortNoteList.contains(shortNote)) {

                    } else {
                        shortNoteList.add(shortNote);
                    }
                }

            }

            return shortNoteList;

        } else {
            return new ArrayList<models.content.ShortNote>();
        }
    }

    public static Result getPostsByChapter(String slug) {
        Chapter chapter = Chapter.findChapterBySlug(slug);
        if (chapter != null) {
            List<Tag> tags = Tag.findTagsInChapter(chapter);
            List<models.content.ShortNote> shortNoteList = new ArrayList<models.content.ShortNote>();
            for (Tag tag : tags) {

                List<models.content.ShortNote> tempShortList = models.content.ShortNote.findPostsByTag(tag);
                for (models.content.ShortNote shortNote : tempShortList) {
                    if (shortNoteList.contains(shortNote)) {

                    } else {
                        shortNoteList.add(shortNote);
                    }
                }

            }

            return ok(Json.toJson(shortNoteList));

        } else {
            return badRequest("No such chapter");
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result doUpvote() {
        final User localUser = Application.getLocalUser(session());
        if (localUser != null) {
            JsonNode jsonObj = request().body().asJson();
            Long id = jsonObj.get("id").asLong();
            models.content.ShortNote sn = null;
            if (id != null) {
                sn = models.content.ShortNote.findShortNoteById(id);
                if (sn != null) {
                    if (sn.user.equals(localUser)) {

                        return ok("You cannot upvote ur own post");

                    } else {
                        if (Upvote.hasUserUpvotedPost(localUser, sn)) {
                            return ok("already upvoted");

                        } else {
                            if (Downvote.hasUserDownvotedPost(localUser, sn)) {
                                Downvote.removeUserDownvote(localUser, sn);
                                sn.score=sn.upvotes.size()-sn.downvotes.size();
                                sn.update();
                                User.updateUserScore(sn.user);
                                Notification.saveUpdate(sn,"removeddownvote",localUser,sn.user);

                                saveActivity(sn, "removeddownvote", localUser);

                                return ok("changed");

                            }
                            else{
                                Upvote upvote = new Upvote();
                                upvote.from = localUser;

                                upvote.shortNote = sn;
                                upvote.createdTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
                                upvote.save();
                                sn.score=sn.upvotes.size()-sn.downvotes.size();
                                sn.update();
                                Notification.saveUpdate(sn, "upvoted", localUser, sn.user);
                                saveActivity(sn, "upvoted", localUser);
                                User.updateUserScore(sn.user);

                                return ok("success");

                            }

                        }
                    }
                } else {
                    return ok("No Such Post");

                }
            } else {
                return ok("No Such Post");

            }
        } else {
            return ok("Please login to Upvote");
        }

    }

    @BodyParser.Of(BodyParser.Json.class)
    public static Result doDownvote() {
        final User localUser = Application.getLocalUser(session());
        if (localUser != null) {
            JsonNode jsonObj = request().body().asJson();
            Long id = jsonObj.get("id").asLong();
            models.content.ShortNote sn = null;
            if (id != null) {
                sn = models.content.ShortNote.findShortNoteById(id);
                if (sn != null) {
                    if (sn.user.equals(localUser)) {

                        return ok("You cannot downvote ur own post");

                    } else {
                        if (Downvote.hasUserDownvotedPost(localUser, sn)) {
                            return ok("already downvoted");

                        } else {
                            if (Upvote.hasUserUpvotedPost(localUser, sn)) {
                                Upvote.removeUserUpvote(localUser, sn);
                                sn.score=sn.upvotes.size()-sn.downvotes.size();
                                sn.update();
                                User.updateUserScore(sn.user);
                                Notification.saveUpdate(sn,"removedupvote",localUser,sn.user);

                                saveActivity(sn, "removedupvote", localUser);

                                return ok("changed");
                            }
                            else{
                                Downvote downvote = new Downvote();
                                downvote.from = localUser;
                                downvote.shortNote = sn;
                                downvote.createdTime = new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
                                downvote.save();
                                sn.score=sn.upvotes.size()-sn.downvotes.size();

                                sn.update();
                                Notification.saveUpdate(sn,"downvoted",localUser,sn.user);

                                saveActivity(sn, "downvoted", localUser);

                                User.updateUserScore(sn.user);

                                return ok("success");
                            }

                        }
                    }
                } else {
                    return ok("No Such Post");

                }
            } else {
                return ok("No Such Post");

            }
        } else {
            return ok("Please Login to Downvote");
        }

    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result flag() {
        final User localUser = Application.getLocalUser(session());

        DynamicForm requestData = form().bindFromRequest();
        Long id = new Long(requestData.get("id"));
        String flag = new String(requestData.get("flag"));
        models.content.ShortNote shortNote = models.content.ShortNote.findShortNoteById(id);
        if (shortNote != null && flag != null) {
            Flag flag1 = new Flag();

            if (flag.equals("duplicate")) {
                flag1.flagType = FlagType.DUPLICATE;
                flag1.shortNote = shortNote;
                flag1.user = localUser;
                if (shortNote.flags != null) {
                    shortNote.flags = new ArrayList<Flag>();
                }
                if (!Flag.doesShortNoteHasGivenFlag(shortNote, flag1.flagType)) {
                    shortNote.flags.add(flag1);
                    flag1.save();
                    shortNote.update();
                    return ok("Flagged");
                } else {
                    Flag flag2=Flag.getFlagWithShortNoteWithFlagType(shortNote,flag1.flagType);
                    flag2.delete();
                    return ok("Flag removed " + flag);
                }


            } else if (flag.equals("inappr")) {
                flag1.flagType = FlagType.INAPPROPRIATE;
                flag1.shortNote = shortNote;
                flag1.user = localUser;
                if (shortNote.flags != null) {
                    shortNote.flags = new ArrayList<Flag>();
                }
                if (!Flag.doesShortNoteHasGivenFlag(shortNote, flag1.flagType)) {
                    shortNote.flags.add(flag1);
                    flag1.save();
                    shortNote.update();
                    return ok("Flagged");
                } else {
                    Flag flag2=Flag.getFlagWithShortNoteWithFlagType(shortNote,flag1.flagType);
                    flag2.delete();
                    return ok("Flag removed " + flag);
                }
            } else if (flag.equals("opinion")) {
                flag1.flagType = FlagType.OPINIONISTIC;
                flag1.shortNote = shortNote;
                flag1.user = localUser;
                if (shortNote.flags != null) {
                    shortNote.flags = new ArrayList<Flag>();
                }
                if (!Flag.doesShortNoteHasGivenFlag(shortNote, flag1.flagType)) {
                    shortNote.flags.add(flag1);
                    flag1.save();
                    shortNote.update();
                    return ok("Flagged");
                } else {
                    Flag flag2=Flag.getFlagWithShortNoteWithFlagType(shortNote,flag1.flagType);
                    flag2.delete();
                    return ok("Flag removed " + flag);
                }
            } else if (flag.equals("spam")) {
                flag1.flagType = FlagType.SPAM;
                flag1.shortNote = shortNote;
                flag1.user = localUser;
                if (shortNote.flags != null) {
                    shortNote.flags = new ArrayList<Flag>();
                }
                if (!Flag.doesShortNoteHasGivenFlag(shortNote, flag1.flagType)) {
                    shortNote.flags.add(flag1);
                    flag1.save();
                    shortNote.update();
                    return ok("Flagged");
                } else {
                    Flag flag2=Flag.getFlagWithShortNoteWithFlagType(shortNote,flag1.flagType);
                    flag2.delete();
                    return ok("Flag removed " + flag);
                }
            } else {
                return badRequest("Request Unknown");
            }
        } else {
            return ok("Bad Request");
        }
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result report() {
        final User localUser = Application.getLocalUser(session());

        DynamicForm requestData = form().bindFromRequest();
        Long id = new Long(requestData.get("id"));
        String reportType = new String(requestData.get("reportType"));

        models.content.ShortNote shortNote= models.content.ShortNote.findShortNoteById(id);
        if(shortNote!=null && localUser!=null && shortNote.user!=localUser){
            if(!Report.userHasReportedShortNote(shortNote,localUser)){
                Report report= new Report();
                report.flagType=FlagType.valueOf(reportType);
                report.user=localUser;
                report.createdTime=new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
                report.resolvedTime=null;
                report.shortNote=shortNote;
                report.save();
                return ok(Json.toJson("Thanks We will look into it"));

            }
            else{
                return badRequest("Already reported");
            }
        }
        else{
            return badRequest("Bad Request");
        }

    }
}
