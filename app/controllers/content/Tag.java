package controllers.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import controllers.Application;
import models.User;
import models.content.*;
import models.content.Chapter;
import play.libs.Json;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;

import static play.mvc.Controller.session;
import static play.mvc.Results.ok;

/**
 * Created by Admin on 15/5/14.
 */
public class Tag {
    @JsonProperty("tags")
    public List<models.content.Tag> tags=new ArrayList<models.content.Tag>();

    public static Result returnTags(){
        Tag t= new Tag();
        t.tags= models.content.Tag.findAllTags();
        return ok(Json.toJson(t));


    }

    public static Result saveTag(models.content.Tag tag, User localUser) {
        tag.save();
        return ok("Tag Saved");
    }



}
