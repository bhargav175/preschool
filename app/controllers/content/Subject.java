package controllers.content;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.Application;
import models.User;
import models.content.*;
import play.libs.Json;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 9/5/14.
 */
public class Subject extends Controller {
    @JsonProperty("subjects")
    public List<models.content.Subject> subjects=new ArrayList<models.content.Subject>();
    public static final String STUDENT_ROLE="user";


    public static Result returnSubjects(){
        final User localUser= Application.getLocalUser(session());
        Subject s= new Subject();
        s.subjects= models.content.Subject.findAllSubjects();
        return ok(Json.toJson(s));


    }

    public static Result saveSubject(models.content.Subject sub)  {
        sub.save();
        return ok("Subject Saved");
    }
    public static models.content.Subject fromJson(JsonNode json) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
       return objectMapper.readValue(json.traverse(), models.content.Subject.class);

    }

    public static Result returnSubject(String slug) {
          models.content.Subject subject = models.content.Subject.findSubjectBySlug(slug);
        if(subject != null){
            return ok(Json.toJson(subject));
        }
        else{
            return badRequest("No Such Data");
        }
    }


}
