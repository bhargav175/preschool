package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthProvider;
import com.feth.play.module.pa.user.AuthUser;
import models.*;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import play.*;
import play.data.DynamicForm;
import play.libs.Crypto;
import play.libs.Json;
import play.mvc.*;

import providers.MyUsernamePasswordAuthProvider;
import views.html.*;


import play.data.Form;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import play.db.ebean.Model;

import static play.data.Form.form;
import static play.libs.Json.*;


public class Application extends Controller {

    public static final String FLASH_MESSAGE_KEY = "message";
    public static final String FLASH_ERROR_KEY = "error";
    public static Boolean IS_SUPER_ADMIN =false;


    public static Result index() {
        final User localUser = getLocalUser(session());
        if (localUser != null) {
            if (localUser.isAdmin()) {
                List<Enquiry> enquiryList = Enquiry.findAll();
                List<Franchise> franchiseList = Franchise.findAll();
                List<Career> careerList = Career.findAll();
                List<WeeklyReport> weeklyReports = WeeklyReport.findAll();

                return ok(admin_data.render(careerList,franchiseList,enquiryList,weeklyReports));

            }else if(localUser.isTeacher()){
                List<WeeklyReport> weeklyReports = WeeklyReport.findAll();

                return ok(teacher_data.render(weeklyReports));
            }else {
                return ok(index.render());
            }

        }else{
            return ok(index.render());
        }
    }

    public static Result about() {
        final User localUser = getLocalUser(session());

        return ok(about_us.render());


    }
    public static Result contact() {
        final User localUser = getLocalUser(session());

        return ok(contact_us.render());


    }

    public static User getLocalUser(final Http.Session session) {
        final AuthUser currentAuthUser = PlayAuthenticate.getUser(session);
        final User localUser = User.findByAuthUserIdentity(currentAuthUser);
        return localUser;
    }
    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.PARENT_ROLE),@Group(SecurityRole.ADMIN_ROLE)})
    public static Result user_account() {
        final User localUser = getLocalUser(session());
        return ok(user_account.render(localUser));
    }



    public static Result login() {
        return ok(login.render(MyUsernamePasswordAuthProvider.LOGIN_FORM));
    }




    public static Result doLogin() {
        com.feth.play.module.pa.controllers.Authenticate.noCache(response());
        final Form<MyUsernamePasswordAuthProvider.MyLogin> filledForm = MyUsernamePasswordAuthProvider.LOGIN_FORM
                .bindFromRequest();
        if (filledForm.hasErrors()) {
            // UserController did not fill everything properly
            return badRequest(login.render(filledForm));
        } else {
            // Everything was filled
            return UsernamePasswordAuthProvider.handleLogin(ctx());
        }
    }
    public static Result notfound(){
        return ok(Json.toJson("Not Found"));
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
        final Form<MyUsernamePasswordAuthProvider.MySignup> filledForm = MyUsernamePasswordAuthProvider.SIGNUP_FORM
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
            if(sr.getName().equals(SecurityRole.ADMIN_ROLE)){
                isAdmin=true;
                break;
            }
        }
        return isAdmin;
    }

}