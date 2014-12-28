package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.SecurityRole;
import models.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 19/5/14.
 */
public class UserController extends Controller {
    @JsonProperty("users")
    List<models.User> users= new ArrayList<models.User>();

    public static Result getAllUsers(){
        UserController user = new UserController();
        user.users=models.User.findAllUsers();
        for(SecurityRole securityRole:user.users.get(0).roles){
            System.out.println("\n\n\n\n\n\n\n\n\n\nRole is " + securityRole.getName()+"\n\n\n\n\n");
        }
        return ok(Json.toJson(user));
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result getAllUsersAdmin(){
        UserController user = new UserController();
        user.users=models.User.findAllUsers();
        return ok(Json.toJson(user));
    }

    @Restrict(@Group(SecurityRole.SUPERADMIN_ROLE))
    public static Result getUsers() {
        UserController user = new UserController();
        user.users=models.User.findAllUsers();
        for(SecurityRole securityRole:user.users.get(0).roles){
            System.out.println("\n\n\n\n\n\n\n\n\n\nRole is " + securityRole.getName()+"\n\n\n\n\n");
        }
        return ok(Json.toJson(user));
    }
}
