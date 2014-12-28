package controllers.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.User;
import models.content.*;
import models.content.Chapter;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 13/5/14.
 */
public class Concept extends Controller {
    @JsonProperty("concepts")
    public List<models.content.Concept> concepts=new ArrayList<models.content.Concept>();
    public static models.content.Concept fromJson(JsonNode fullJson) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(fullJson.traverse(), models.content.Concept.class);
    }

    public static Result saveConcept(models.content.Concept concept) {

        List<models.content.Concept> conceptList=models.content.Concept.findAllConceptsInChapter(concept.chapter);
        if(conceptList.size()==0){
            concept.nextConcept=null;
            concept.previousConcept=null;
            concept.save();
            return ok("Concept saved");
        }
        else{
            models.content.Concept concept1= models.content.Concept.findLastConceptInChapter(concept.chapter);
            if(concept1!=null){
                concept.previousConcept=concept1;
                concept.nextConcept=null;
                concept.save();
                concept1.nextConcept=concept;
                concept1.update();
                return ok("Concept Saved");

            }
            else{
                return ok("Error");
            }
        }

    }

    public static Result returnAllConcepts(){
        Concept c= new Concept();
        c.concepts= models.content.Concept.findAllConcepts();
        return ok(Json.toJson(c));
    }



}
