package controllers.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import controllers.Application;
import models.User;
import models.content.*;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 13/5/14.
 */
public class Chapter extends Controller {
    @JsonProperty("chapters")
    public List<models.content.Chapter> chapters=new ArrayList<models.content.Chapter>();

    public static Result returnChapters(){
        final User localUser= Application.getLocalUser(session());
        Chapter c= new Chapter();
        c.chapters= models.content.Chapter.findAllChapters();
        return ok(Json.toJson(c));


    }

    public static Chapter returnChaptersInSubject(models.content.Subject subject){
        Chapter c= new Chapter();
        
        c.chapters= models.content.Chapter.findAllChaptersInSubject(subject);
        return c;


    }

    public static models.content.Chapter fromJson(JsonNode fullJson) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(fullJson.traverse(), models.content.Chapter.class);
    }

    public static Result saveChapter(models.content.Chapter chapter) {
        List<models.content.Chapter> chapterList=models.content.Chapter.findAllChaptersInSubject(chapter.subject);
        if(chapterList.size()==0){
            chapter.nextChapter=null;
            chapter.previousChapter=null;
            chapter.save();
            return ok("Chapter saved");
        }
        else{
            models.content.Chapter chapter1= models.content.Chapter.findLastChapterInSubject(chapter.subject);
            if(chapter1!=null){
                chapter.previousChapter=chapter1;
                chapter.nextChapter=null;
                chapter.save();
                chapter1.nextChapter=chapter;
                chapter1.update();
                return ok("Chapter Saved");

            }
            else{
                return ok("Error");
            }
        }
    }
}
