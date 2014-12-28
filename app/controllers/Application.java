package controllers;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import controllers.Information.Activity;
import models.Information.Activity_Change;
import models.SecurityRole;
import models.User;
import models.content.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import play.Routes;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Crypto;
import play.libs.Json;
import play.mvc.*;
import play.mvc.Http.Session;
import play.mvc.Result;
import providers.MyUsernamePasswordAuthProvider;
import providers.MyUsernamePasswordAuthProvider.MyLogin;
import providers.MyUsernamePasswordAuthProvider.MySignup;

import views.html.*;
import views.html.admin.*;
import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthProvider;
import com.feth.play.module.pa.user.AuthUser;

import static play.data.Form.form;

public class Application extends Controller {

	public static final String FLASH_MESSAGE_KEY = "message";
	public static final String FLASH_ERROR_KEY = "error";
    public static Boolean IS_SUPER_ADMIN =false;


    public static Result index() {
        final User localUser = getLocalUser(session());
        if(localUser != null){
            return home();
        }
        else{
            return ok(index.render());
        }

	}

	public static User getLocalUser(final Session session) {
		final AuthUser currentAuthUser = PlayAuthenticate.getUser(session);
		final User localUser = User.findByAuthUserIdentity(currentAuthUser);
		return localUser;
	}

    @Restrict({@Group(SecurityRole.SUPERADMIN_ROLE),@Group(SecurityRole.ADMIN_ROLE),@Group(SecurityRole.MODERATOR_ROLE),@Group(SecurityRole.CONTENT_WRITER_ROLE),@Group(SecurityRole.ORGANIZATION_ROLE),@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.STUDENT_ROLE)})
	public static Result home() {

		final User localUser = getLocalUser(session());
        Boolean isAdmin= isUserAdmin(localUser);
        if(!isAdmin){
            List<models.content.ShortNote> shortNoteList=models.content.ShortNote.feed(localUser);

            return ok(home.render(localUser, shortNoteList));
        }
        else{
            return ok(views.html.admin.admin_dashboard.render(localUser));
        }


	}

	@Restrict(@Group(SecurityRole.STUDENT_ROLE))
	public static Result user_account() {
		final User localUser = getLocalUser(session());
		return ok(user_account.render(localUser));
	}
    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
	public static Result profile(String username) {
		final User localUser = getLocalUser(session());
        Activity activity = new Activity();
        User profileUser=User.findByUsername(username);
        if(profileUser!=null){
        activity.activity_changeList=new ArrayList<Activity_Change>(Activity_Change.findAllActivityChangesByUser(profileUser));
		return ok(user_profile.render(profileUser,activity.activity_changeList));
	}
        else{
            return badRequest("No Such User");
        }
    }

	public static Result login() {
		return ok(login.render(MyUsernamePasswordAuthProvider.LOGIN_FORM));
	}




    public static Result doLogin() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MyLogin> filledForm = MyUsernamePasswordAuthProvider.LOGIN_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// UserController did not fill everything properly
			return badRequest(login.render(filledForm));
		} else {
			// Everything was filled
			return UsernamePasswordAuthProvider.handleLogin(ctx());
		}
	}

	public static Result signup() {
        IS_SUPER_ADMIN =false;
        return ok(signup.render(MyUsernamePasswordAuthProvider.SIGNUP_FORM));
	}
    public static Result signupAdmin() {
        IS_SUPER_ADMIN =true;
		return ok(signup.render(MyUsernamePasswordAuthProvider.SIGNUP_FORM));
	}

	public static Result jsRoutes() {
		return ok(
				Routes.javascriptRouter("jsRoutes",
						controllers.routes.javascript.Signup.forgotPassword()))
				.as("text/javascript");
	}

	public static Result doSignup() {
		com.feth.play.module.pa.controllers.Authenticate.noCache(response());
		final Form<MySignup> filledForm = MyUsernamePasswordAuthProvider.SIGNUP_FORM
				.bindFromRequest();
		if (filledForm.hasErrors()) {
			// UserController did not fill everything properly
			return badRequest(signup.render(filledForm));
		} else {
			// Everything was filled
			// do something with your part of the form before handling the user
			// signup
			return UsernamePasswordAuthProvider.handleSignup(ctx());
		}
	}

	public static String formatTimestamp(final long t) {
		return new SimpleDateFormat("yyyy-dd-MM HH:mm:ss").format(new Date(t));
	}
    public static Boolean isUserAdmin(User localUser){
        Boolean isAdmin=false;
        for(int i=0 ; i < localUser.getRoles().size();i++){
            SecurityRole sr= (SecurityRole)localUser.getRoles().get(i);
            if(sr.getName().equals(SecurityRole.SUPERADMIN_ROLE)){
                isAdmin=true;
                break;
            }
        }
        return isAdmin;
    }
    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result editShortnote(String slug) {
        final User localUser = getLocalUser(session());
        ShortNote shortNote=ShortNote.findShortNoteBySlug(slug);
        if(shortNote!=null){
            return ok(user_editShortNote.render(localUser,shortNote));
        }
        else{
            return badRequest("No such Note");
        }


    }
    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result getUserActivity() {
        final User localUser=getLocalUser(session());
        Activity activity = new Activity();
        activity.activity_changeList=new ArrayList<Activity_Change>(Activity_Change.findAllActivityChangesByUser(localUser));
        return ok(Json.toJson(activity.activity_changeList));
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result newShortNote() {
        final User localUser=getLocalUser(session());
        return ok(user_add_note.render(localUser));
    }


    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result reader() {
        final User localUser=getLocalUser(session());
        return ok(user_reader.render(localUser));
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result recentTenShortNotes() {
        return ok(Json.toJson(ShortNote.findTenRecentShortNotes()));
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result testwebSocket() {
        final User localUser=getLocalUser(session());

        return ok(websocketTest.render(localUser));
    }

    public static Result discover() {
        List<Subject> subjects= Subject.findAllSubjects();
        return ok(discover_view.render(subjects));
    }

    public static Result subject(String slug) {
        Subject subject=Subject.findSubjectBySlug(slug);
        List<Chapter> chapterList=null;
        if(subject!=null){
            chapterList=Chapter.findAllChaptersInSubject(subject);
            return ok(subject_view.render(subject,chapterList));

        }
        else{
            return badRequest("No such Subject");
        }
    }

    public static Result chapter(String slug) {
        Chapter chapter=Chapter.findChapterBySlug(slug);
        List<Concept> conceptList=null;
        List<ShortNote> shortNoteList=new ArrayList<ShortNote>();
        if(chapter!=null){
            conceptList=Concept.findAllConceptsInChapter(chapter);

            shortNoteList=controllers.content.ShortNote.getPostsByChapterApi(chapter.slug);
            return ok(chapter_view.render(chapter,conceptList,shortNoteList));

        }
        else{
            return badRequest("No such Chapter");
        }
    }

    public static Result concept(String slug) {
        Concept concept=Concept.findConceptBySlug(slug);
        if(concept!=null){
            return ok(concept_view.render(concept));

        }
        else{
            return badRequest("No such Concept");
        }
    }


    public static Result tags() {
            List<Tag> tags=Tag.findAllTags();
            return ok(tags_view.render(tags));

    }
    public static Result notfound(){
        return ok(Json.toJson("Not Found"));
    }

    public static Result tag(String slug) {
            Tag tag= Tag.findTagBySlug(slug);
            List<ShortNote>  shortNoteList=new ArrayList<ShortNote>();
        if(tag!=null){
                shortNoteList=ShortNote.findPostsByTag(tag);
            }
            return ok(tag_single_view.render(tag,shortNoteList));
    }

    public static Result getShortNote(String slug) {
        ShortNote shortNote=ShortNote.findShortNoteBySlug(slug);
        if(shortNote!=null){
            Boolean hasUpvoted=false;
            Boolean hasDownvoted=false;
            final   User  localUser= Application.getLocalUser(session());
            if(localUser!=null){
                if(Upvote.hasUserUpvotedPost(localUser, shortNote)){
                    hasUpvoted=true;
                }
                if(Downvote.hasUserDownvotedPost(localUser, shortNote)){
                   hasDownvoted=true;
                }
            }
            else{

            }
            return ok(shortNote_view.render(localUser, shortNote,hasUpvoted,hasDownvoted,Report.userHasReportedShortNote(shortNote,localUser)));
        } 
        else{
            return badRequest("Not Found");
        }
    }

    public static Result getPostsByTagByChapter(String slug) {
        Chapter chapter= Chapter.findChapterBySlug(slug);
        if(chapter!=null){
            List<Tag> tags= Tag.findTagsInChapter(chapter) ;
            return ok(Json.toJson(tags));
        }
        else{
            return ok(Json.toJson("null"));
        }

    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result moderateShortNote(String slug) {
        final User localUser = getLocalUser(session());
        ShortNote shortNote=ShortNote.findShortNoteBySlug(slug);
        if(shortNote!=null){
            return ok(admin_editShortNote.render(localUser,shortNote));
        }
        else{
            return badRequest("No such Note");
        }
    }

    public static Result upload() {
        final User localUser=Application.getLocalUser(session());
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart picture = body.getFile("picture");
        if (picture != null && localUser!=null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            String path= file.getPath();
            try {
                DateTime dateTime=new DateTime();
                String year=String.valueOf(dateTime.getYear());
                String month=String.valueOf(dateTime.getMonthOfYear());
                String time=String.valueOf(dateTime.getMillisOfDay());
                String ext= FilenameUtils.getExtension(fileName);

                Image image = new Image();

                image.createdTime=new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();

                File file1=new File("public/images/"+ Crypto.encryptAES(localUser.name)+"/"+Crypto.encryptAES(year+month)+"/", Crypto.encryptAES(fileName+time)+"."+ext);
                FileUtils.moveFile(file,file1);
                image.contentType=contentType;
                image.fileName=fileName;
                image.path=file1.getPath();
                image.user=localUser;
                image.save();

            } catch (IOException ioe) {
                System.out.println("Problem operating on filesystem");
            }
            return ok("File uploaded");
        } else {
            flash("error", "Missing file");
            return redirect(routes.Application.index());
        }
    }

    @Restrict({@Group(SecurityRole.SUPERADMIN_ROLE),@Group(SecurityRole.STUDENT_ROLE)})
    public static List<Image> getCurrentUserImages(){
        final User localUser=Application.getLocalUser(session());
        if(localUser!=null){
            return Image.getImagesByUser(localUser);
        }else{
            return new ArrayList<Image>();
        }
    }

    @Restrict({@Group(SecurityRole.SUPERADMIN_ROLE),@Group(SecurityRole.STUDENT_ROLE)})
    public static Result getCurrentUserImagesAsJson(){
        final User localUser=Application.getLocalUser(session());
        if(localUser!=null){
            return ok(Json.toJson(Image.getImagesByUser(localUser)));
        }else{
            return ok(Json.toJson(null));
        }
    }

    @Restrict({@Group(SecurityRole.SUPERADMIN_ROLE),@Group(SecurityRole.STUDENT_ROLE)})
    public static Result getImage(Long id) {

        final User localUser=Application.getLocalUser(session());

        if(localUser!=null){

            return ok(Json.toJson(Image.getImageById(localUser, id)));
        }else{
            return ok(Json.toJson("Not Found"));
        }    }


    @Restrict({@Group(SecurityRole.SUPERADMIN_ROLE),@Group(SecurityRole.STUDENT_ROLE)})
    public static Result updateImage() {
        final User localUser = Application.getLocalUser(session());

        DynamicForm requestData = form().bindFromRequest();
        Long id = new Long(requestData.get("id"));
        String alt=requestData.get("alt");
        String caption=requestData.get("caption");
        String description=requestData.get("description");
        String title=requestData.get("title");

        Image image=Image.getImageById(localUser,id);
        if(image!=null){
            image.alt=alt;
            image.caption=caption;
            image.title=title;
            image.description=description;

            image.update();
            return ok("Done");

        }else{
            return badRequest("Forbidden");
        }

    }

    public static String excerpt(String string){
        if(string.length()==0){
            return string;
        }
        else if(string.length()<201){
            return string;
        }
        else{
            return string.substring(0,197)+"...";
        }
    }


    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result followUser() {
        final User localUser = Application.getLocalUser(session());
        DynamicForm requestData = form().bindFromRequest();
        String username = new String(requestData.get("username"));
        User user= User.findByUsername(username);
        if(user!=null){
            if(user.followers.contains(localUser) || user==localUser){
                return badRequest();

            }
            else{
                localUser.following.add(user);
                localUser.update();
                return ok("success");

            }
        }
        else{
            return badRequest("Bad Request");
        }

    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result unfollowUser() {
        final User localUser = Application.getLocalUser(session());
        DynamicForm requestData = form().bindFromRequest();
        String username = new String(requestData.get("username"));
        User user= User.findByUsername(username);
       if(user!=null){
           if(!user.followers.contains(localUser) || user==localUser){
               return badRequest();

           }
           else{
               localUser.following.remove(user);
               localUser.update();
               return ok("success");

           }
       }else{
           return badRequest("Bad Request");
       }
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result isfollowing(String username) {
        final User localUser = Application.getLocalUser(session());
        User user= User.findByUsername(username);
        if(user!=null){
            if(!user.followers.contains(localUser) || user==localUser){
                return ok(Json.toJson(false));
            }
            else{
                return ok(Json.toJson(true));
            }
        }else{
            return badRequest("Bad Request");
        }

    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result followTag() {
        DynamicForm requestData = form().bindFromRequest();
        String tagslug = new String(requestData.get("tagslug"));
        Tag tag=Tag.findTagBySlug(tagslug);
        final User localUser = Application.getLocalUser(session());
        if(tag!=null){
            if(!localUser.favoriteTags.contains(tag)){
                localUser.favoriteTags.add(tag);
                localUser.update();
                return ok("success");
            }else{
                return badRequest();
            }
        }else{
            return badRequest();
        }
    }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result unfollowTag() {
        DynamicForm requestData = form().bindFromRequest();
        String tagslug = new String(requestData.get("tagslug"));
        Tag tag=Tag.findTagBySlug(tagslug);
        final User localUser = Application.getLocalUser(session());
        if(tag!=null){
            if(localUser.favoriteTags.contains(tag)){
                localUser.favoriteTags.remove(tag);
                localUser.update();

                return ok("success");
            }else{
                return badRequest();
            }
        }else{
            return badRequest();
        }

    }

    public static Result isfollowingTag(String username,String tagslug) {
        User user= User.findByUsername(username);
        Tag tag=Tag.findTagBySlug(tagslug);
        if(tag!=null && user!=null){
            if(!user.favoriteTags.contains(tag)){
                return ok(Json.toJson(false));
            }
            else{
                return ok(Json.toJson(true));
            }
        }else{
            return badRequest("Bad Request");
        }
           }

    @Restrict(@Group(SecurityRole.STUDENT_ROLE))
    public static Result settings() {
        return ok(user_settings.render(Application.getLocalUser(session())));
    }
}