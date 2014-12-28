package controllers.Admin;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import controllers.Application;
import controllers.content.Concept;
import models.SecurityRole;
import models.User;

import models.content.*;
import play.data.DynamicForm;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Result;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static controllers.Application.getLocalUser;
import static play.data.Form.form;
import static play.mvc.Controller.*;

/**
 * Created by Admin on 12/5/14.
 */
public class AdminApplication {

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result add_subject() {
        final User localUser = getLocalUser(session());
        JsonNode fullJson = request().body().asJson();
        JsonNode s=fullJson.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) fullJson;
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
        Subject sub = null;
        try {
            sub = controllers.content.Subject.fromJson(objectNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sub != null) {

            controllers.content.Subject.saveSubject(sub);
            return ok("saved");
        } else {
            return badRequest("Malformed Json");
        }

    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result add_chapter() {
        final User localUser = getLocalUser(session());
        JsonNode fullJson = request().body().asJson();
        JsonNode s=fullJson.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) fullJson;
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
        JsonNode sub=fullJson.findValue("subject");
        if(sub!=null){
            Long subId=new Long(sub.toString());
            Subject subject=Subject.findSubjectById(subId);
            objectNode.put("subject",Json.toJson(subject));
        }
        Chapter chapter = null;
        try {
            chapter = controllers.content.Chapter.fromJson(objectNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (chapter != null) {

            controllers.content.Chapter.saveChapter(chapter);
            return ok("saved");
        } else {
            return badRequest("Malformed Json");
        }

    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result add_concept() {
        final User localUser = getLocalUser(session());
        JsonNode fullJson = request().body().asJson();

        JsonNode s=fullJson.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) fullJson;
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
        JsonNode chap=fullJson.findValue("chapter");
        if(chap!=null){
            Long chapId=new Long(chap.toString());
            Chapter chapter=Chapter.findChapterById(chapId);
            objectNode.put("chapter", Json.toJson(chapter));
        }
        models.content.Concept concept = null;
        try {
            concept = Concept.fromJson(objectNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (concept != null) {

            controllers.content.Concept.saveConcept(concept);
            return ok("saved");
        } else {
            return badRequest("Malformed Json");
        }

    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result add_tag() {
        final User localUser = getLocalUser(session());
        JsonNode fullJson = request().body().asJson();
        JsonNode s=fullJson.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) fullJson;
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
        JsonNode chap=fullJson.findValue("chapters");
        if(chap.size()>0){
            List<Chapter> chapterList=new ArrayList<Chapter>();
            for(int i=0;i<chap.size();i++){
                Long chapId=new Long(chap.get(i).toString());
                Chapter chapter=Chapter.findChapterById(chapId);
                chapterList.add(chapter);
            } 
            objectNode.put("chapters",Json.toJson(chapterList));
        }
        Tag tag = null;
        try {
            tag = Tag.fromJson(objectNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tag != null) {

            controllers.content.Tag.saveTag(tag, localUser);
            return ok("saved");
        } else {
            return badRequest("Malformed Json");
        }

    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result getCategoriesFromSubject() {
        JsonNode fullJson = request().body().asJson();
        models.content.Subject sub = null;
        try {
            sub = controllers.content.Subject.fromJson(fullJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sub != null) {
            controllers.content.Chapter chapter = controllers.content.Chapter.returnChaptersInSubject(sub);
            return ok(Json.toJson(chapter));
        } else {
            return badRequest("Malformed Json");
        }

    }

    public static Result getChaptersFromSubjectAsList(String subjectSlug) {
        Subject subject = Subject.findSubjectBySlug(subjectSlug);
        if (subject != null) {
            List<Chapter> chapterList = Chapter.findAllChaptersInSubject(subject);
            return ok(Json.toJson(chapterList));
        } else {
            List<Chapter> chapterList = new ArrayList<Chapter>();
            return ok(Json.toJson(chapterList));
        }
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result getAdminData() {
        User localUser = Application.getLocalUser(session());
        List<Subject> subjects = Subject.findAllSubjects();
        List<Chapter> chapters = Chapter.findAllChapters();
        List<models.content.Concept> concepts = models.content.Concept.findAllConcepts();
        List<Tag> tags = Tag.findAllTags();
        List<ShortNote> shortNotes = ShortNote.findAllShortNotes();
        List<User> users = User.findAllUsers();
        List<Report> reports= Report.findAllUnResolvedReports();
        List<SecurityRole> securityRoles = (List<SecurityRole>) localUser.getRoles();
        for(SecurityRole securityRole:securityRoles){
            System.out.println("\n\n\n\n\n\n\n\n\n\nRole is" + securityRole.getName()+"\n\n\n\n\n");
        }
        return ok(views.html.admin.admin_data.render(localUser, subjects, chapters, concepts, tags, shortNotes,reports, users));
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result home() {
        User localUser = Application.getLocalUser(session());
        return ok(views.html.admin.admin_dashboard.render(localUser));
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result newSubject() {
        User localUser = Application.getLocalUser(session());
        return ok(views.html.admin.admin_addsubject.render(localUser, null));

    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result newChapter() {
        User localUser = Application.getLocalUser(session());
        return ok(views.html.admin.admin_addchapter.render(localUser, null));
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result newConcept() {
        User localUser = Application.getLocalUser(session());
        return ok(views.html.admin.admin_addconcept.render(localUser, null));
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result newTag() {
        User localUser = Application.getLocalUser(session());
        return ok(views.html.admin.admin_addtag.render(localUser, null));
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result editTag(String slug) {
        User localUser = Application.getLocalUser(session());
        models.content.Tag newTag = models.content.Tag.findTagBySlug(slug);
        if (newTag != null) {
            return ok(views.html.admin.admin_edittag.render(localUser,newTag));
        } else {
            return badRequest("Not Found");
        }

    }

    public static Result infoSub(String slug) {
        models.content.Subject sub = models.content.Subject.findSubjectBySlug(slug);
        if (sub != null) {
            controllers.content.Subject subject = new controllers.content.Subject();
            subject.subjects.add(sub);
            return ok(Json.toJson(subject));
        } else {
            return badRequest("NO such Subject");
        }

    }

    public static Result infoChap(String slug) {
        models.content.Chapter chapter = models.content.Chapter.findChapterBySlug(slug);
        if (chapter != null) {
            controllers.content.Chapter chapter1 = new controllers.content.Chapter();
            chapter1.chapters.add(chapter);
            return ok(Json.toJson(chapter1));
        } else {
            return badRequest("NO such chapter");
        }

    }

    public static Result infoConc(String slug) {
        models.content.Concept concept = models.content.Concept.findConceptBySlug(slug);
        if (concept != null) {
            controllers.content.Concept concept1 = new Concept();
            concept1.concepts.add(concept);
            return ok(Json.toJson(concept1));
        } else {
            return badRequest("NO such concept");
        }

    }

    public static Result infoTag(String slug) {
        Tag tag = models.content.Tag.findTagBySlug(slug);
        if (tag != null) {
            controllers.content.Tag tagC = new controllers.content.Tag();
            tagC.tags.add(tag);
            return ok(Json.toJson(tagC));

        } else {
            return badRequest("NO such tag");

        }
    }


    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result doedit_tag() {
        final User localUser = getLocalUser(session());
        JsonNode fullJson = request().body().asJson();
        JsonNode s=fullJson.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) fullJson;
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
        JsonNode chap=fullJson.findValue("chapters");
        if(chap.size()>0){
            List<Chapter> chapterList=new ArrayList<Chapter>();
            for(int i=0;i<chap.size();i++){
                Long chapId=new Long(chap.get(i).toString());
                Chapter chapter=Chapter.findChapterById(chapId);
                chapterList.add(chapter);
            }
            objectNode.put("chapters",Json.toJson(chapterList));
        }
        Tag tag = null;
        try {
            tag = Tag.fromJson(fullJson);

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tag != null) {
            Tag newTag = models.content.Tag.findTagById(tag.id);
            if (newTag != null) {
                newTag.copyValues(tag);
                newTag.update();
            } else {
                return badRequest("No such tag");
            }

            //controllers.content.Tag.saveTag(tag, localUser);
            return ok("Updated");
        } else {
            return badRequest("Malformed Json");
        }
    }

    public static Result editSubject(String slug) {
        User localUser = Application.getLocalUser(session());
        models.content.Subject subject = Subject.findSubjectBySlug(slug);
        if (subject != null) {
            return ok(views.html.admin.admin_editsubject.render(localUser,subject));
        } else {
            return badRequest("Not Found");
        }
    }

    public static Result editChapter(String slug) {
        User localUser = Application.getLocalUser(session());
        models.content.Chapter chapter = Chapter.findChapterBySlug(slug);
        if (chapter != null) {
            return ok(views.html.admin.admin_editchapter.render(localUser,chapter));
        } else {
            return badRequest("Not Found");
        }
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result doedit_subject() {
        final User localUser = getLocalUser(session());
        JsonNode fullJson = request().body().asJson();
        JsonNode s=fullJson.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) fullJson;
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
        Subject sub = null;
        try {
            sub = Subject.fromJson(fullJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (sub != null) {
            Subject newSub = models.content.Subject.findSubjectById(sub.id);
            if (newSub != null) {
                newSub.copyValues(sub);
                newSub.update();
            } else {
                return badRequest("No such Subject");
            }

            //controllers.content.Tag.saveTag(tag, localUser);
            return ok("Updated");
        } else {
            return badRequest("Malformed Json");
        }

    }

    public static Result editConcept(String slug) {

        User localUser = Application.getLocalUser(session());
        models.content.Concept concept = models.content.Concept.findConceptBySlug(slug);
        if (concept != null) {
            return ok(views.html.admin.admin_editconcept.render(localUser,concept));
        } else {
            return badRequest("Not Found");
        }
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result doedit_chapter() {
        final User localUser = getLocalUser(session());
        JsonNode fullJson = request().body().asJson();
        JsonNode s=fullJson.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) fullJson;
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
        JsonNode sub=fullJson.findValue("subject");
        if(sub!=null){
            Long subId=new Long(sub.toString());
            Subject subject=Subject.findSubjectById(subId);
            objectNode.put("subject",Json.toJson(subject));
        }
        Chapter chapter = null;
        try {
            chapter = Chapter.fromJson(fullJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (chapter != null) {
//            if(chapter.parentChapter != null){
//                if(chapter.parentChapter.id==chapter.id){
//                    return badRequest("Chapter cant be its own parent");
//                }
//            }
            Chapter newChapter = models.content.Chapter.findChapterById(chapter.id);
            if (newChapter != null) {
                newChapter.copyValues(chapter);
                newChapter.update();
            } else {
                return badRequest("No such Chapter");
            }

            //controllers.content.Tag.saveTag(tag, localUser);
            return ok("Updated");
        } else {
            return badRequest("Malformed Json");
        }
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result doedit_concept() {
        final User localUser = getLocalUser(session());
        JsonNode fullJson = request().body().asJson();
        JsonNode s=fullJson.findValue("featuredImage");
        ObjectNode objectNode=(ObjectNode) fullJson;
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
        JsonNode chap=fullJson.findValue("chapter");
        if(chap!=null){
            Long chapId=new Long(chap.toString());
            Chapter chapter=Chapter.findChapterById(chapId);
            objectNode.put("chapter", Json.toJson(chapter));
        }
        models.content.Concept concept = null;
        try {
            concept = Concept.fromJson(fullJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (concept != null) {

            models.content.Concept newConcept = models.content.Concept.findConceptById(concept.id);
            if (newConcept != null) {
                newConcept.copyValues(concept);
                newConcept.update();
            } else {
                return badRequest("No such Concept");
            }

            //controllers.content.Tag.saveTag(tag, localUser);
            return ok("Updated");
        } else {
            return badRequest("Malformed Json");
        }
    }


    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result chapterMoveUp() {
        DynamicForm requestData = form().bindFromRequest();
        Long id = new Long(requestData.get("id"));
        Chapter chapter = Chapter.findChapterById(id);
        if (chapter != null) {
            Chapter previousChapter = null, nextChapter = null;
            if (chapter.previousChapter != null) {
                previousChapter = Chapter.findChapterById(chapter.previousChapter.id);
                if (previousChapter != null) {
                    if (chapter.nextChapter != null) {
                        nextChapter = Chapter.findChapterById(chapter.nextChapter.id);
                    }
                    previousChapter.nextChapter = nextChapter;
                    chapter.previousChapter = previousChapter.previousChapter;

                    previousChapter.previousChapter = chapter;
                    chapter.nextChapter = previousChapter;
                    previousChapter.update();
                    chapter.update();
                    if (nextChapter != null) {
                        nextChapter.previousChapter = previousChapter;
                        nextChapter.update();
                    }
                    return ok(Json.toJson("Success"));

                } else {
                    return ok(Json.toJson("Fail"));
                }

            } else {
                return ok(Json.toJson("No previous Chapter"));
            }


        } else {
            return ok(Json.toJson("Fail"));
        }
    }


    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result chapterMoveDown() {
        DynamicForm requestData = form().bindFromRequest();
        Long id = new Long(requestData.get("id"));
        Chapter chapter = Chapter.findChapterById(id);
        if (chapter != null) {
            Chapter previousChapter = null, nextChapter = null;
            if (chapter.nextChapter != null) {
                nextChapter = Chapter.findChapterById(chapter.nextChapter.id);

                if (nextChapter != null) {
                    if (chapter.previousChapter != null) {
                        previousChapter = Chapter.findChapterById(chapter.previousChapter.id);
                    }
                    nextChapter.previousChapter = previousChapter;
                    chapter.nextChapter = nextChapter.nextChapter;

                    nextChapter.nextChapter = chapter;
                    chapter.previousChapter = nextChapter;
                    nextChapter.update();
                    chapter.update();
                    if (previousChapter != null) {
                        previousChapter.nextChapter = nextChapter;
                        previousChapter.update();
                    }
                    return ok(Json.toJson("Success")) ;

                } else {
                    return ok(Json.toJson("Fail"));
                }

            } else {
                return ok(Json.toJson("No Next Chapter"));
            }


        } else {
            return ok(Json.toJson("Fail"));
        }
    }


    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result conceptMoveUp() {
        DynamicForm requestData = form().bindFromRequest();
        Long id = new Long(requestData.get("id"));
        models.content.Concept concept = models.content.Concept.findConceptById(id);
        if (concept != null) {
            models.content.Concept previousConcept = null, nextConcept = null;
            if (concept.previousConcept != null) {
                previousConcept = models.content.Concept.findConceptById(concept.previousConcept.id);
                if (previousConcept != null) {
                    if (concept.nextConcept != null) {
                        nextConcept = models.content.Concept.findConceptById(concept.nextConcept.id);
                    }
                    previousConcept.nextConcept = nextConcept;
                    concept.previousConcept = previousConcept.previousConcept;

                    previousConcept.previousConcept = concept;
                    concept.nextConcept = previousConcept;
                    previousConcept.update();
                    concept.update();
                    if (nextConcept != null) {
                        nextConcept.previousConcept = previousConcept;
                        nextConcept.update();
                    }
                    return ok(Json.toJson("Success"));

                } else {
                    return ok(Json.toJson("Fail"));
                }

            } else {
                return ok(Json.toJson("No previous Concept"));
            }


        } else {
            return ok(Json.toJson("Fail"));
        }
    }


    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result conceptMoveDown() {
        DynamicForm requestData = form().bindFromRequest();
        Long id = new Long(requestData.get("id"));
        models.content.Concept concept = models.content.Concept.findConceptById(id);
        if (concept != null) {
            models.content.Concept previousConcept = null, nextConcept = null;
            if (concept.nextConcept != null) {
                nextConcept =  models.content.Concept.findConceptById(concept.nextConcept.id);

                if (nextConcept != null) {
                    if (concept.previousConcept != null) {
                        previousConcept =  models.content.Concept.findConceptById(concept.previousConcept.id);
                    }
                    nextConcept.previousConcept = previousConcept;
                    concept.nextConcept = nextConcept.nextConcept;

                    nextConcept.nextConcept = concept;
                    concept.previousConcept = nextConcept;
                    nextConcept.update();
                    concept.update();
                    if (previousConcept != null) {
                        previousConcept.nextConcept = nextConcept;
                        previousConcept.update();
                    }
                    return ok(Json.toJson("Success")) ;

                } else {
                    return ok(Json.toJson("Fail"));
                }

            } else {
                return ok(Json.toJson("No Next Concept"));
            }


        } else {
            return ok(Json.toJson("Fail"));
        }
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result getUsers() {
        final User localUser = getLocalUser(session());
        return ok(views.html.admin.admin_users.render(localUser));
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    @BodyParser.Of(BodyParser.Json.class)
    public static Result changeUserRole() {
        final User localUser = Application.getLocalUser(session());
        JsonNode jsonObj = request().body().asJson();
        JsonNode roleNode = jsonObj.findValue("role");
        String roleName = roleNode.asText();
        JsonNode usersNode = jsonObj.findValue("users");
        List<Integer> userIds = new ArrayList<Integer>();
        if (usersNode.size() > 0) {
            for (int i = 0; i < usersNode.size(); i++) {
                Integer userId = new Integer(usersNode.get(i).toString());
                userIds.add(userId);
            }
            if (roleName != null && userIds.size() > 0) {
                String trueRoleName = SecurityRole.STUDENT_ROLE;
                if (roleName.equals("admin")) {
                    trueRoleName = SecurityRole.ADMIN_ROLE;
                }
                if (roleName.equals("moderator")){
                    trueRoleName = SecurityRole.MODERATOR_ROLE;
                }
                if (roleName.equals("writer")) {
                    trueRoleName = SecurityRole.CONTENT_WRITER_ROLE;
                }
                if (roleName.equals("organization")) {
                    trueRoleName = SecurityRole.ORGANIZATION_ROLE;
                }
                if (roleName.equals("teacher")){
                    trueRoleName = SecurityRole.TEACHER_ROLE;
                }
                if (roleName.equals("student")){
                    trueRoleName = SecurityRole.STUDENT_ROLE;
                }
                SecurityRole securityRole = SecurityRole.findByRoleName(trueRoleName);
                SecurityRole superAdminRole = SecurityRole.findByRoleName(SecurityRole.SUPERADMIN_ROLE);
                String str = "";
                for (Integer userId : userIds) {
                    User user = User.findUserById(userId);
                    if(user.roles.indexOf(superAdminRole)<0){
                        str += " ,"+user.id;
                        if (user != null) {
                            user.roles.clear();
                            user.roles.add(securityRole);
                            user.update();
                        }
                    }

                }
                return ok(Json.toJson("Success " +str));

            } else {
                return ok(Json.toJson("Fail"));
            }
        }
        else{
            return ok(Json.toJson("Fail"));
        }
    }
}
