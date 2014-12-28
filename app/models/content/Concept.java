package models.content;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Result;

import javax.persistence.*;
import java.net.URL;
import java.util.List;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by Admin on 11/5/14.
 */
@Entity

public class Concept extends Model {
    public static final Finder<Long,Concept> find= new Finder<>(Long.class,Concept.class);
    @JsonProperty("id")
    @Id
    public Long id;




    @JsonProperty("chapter")
    @ManyToOne
    public Chapter chapter;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("status")
    public String status = "active";



    @Column(columnDefinition = "TEXT")
    @JsonProperty("name")
    public String name;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("slug")
    public String slug;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("description")
    public String description;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("descriptionHtml")
    public String descriptionHtml;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("videoUrl")
    public String videoUrl;




    @JsonIgnore
    @ManyToOne
    public Concept nextConcept;

    @JsonIgnore
    @ManyToOne
    public Concept previousConcept;

    @JsonProperty("featuredImage")
    @OneToOne
    public Image featuredImage;

    public static List<Concept> findAllConcepts(){

        return find.fetch("chapter").fetch("nextConcept").fetch("previousConcept").orderBy("slug").findList();
    }

    public static Concept findConceptBySlug(String slug){
        return find.where().eq("slug",slug).findUnique();
    }
    public static Result infoConc(String slug) {
        models.content.Concept concept= models.content.Concept.findConceptBySlug(slug);
        if(concept!=null){
            return ok(Json.toJson(concept));
        }
        else{
            return badRequest("NO such chapter");
        }

    }


    public static Concept findConceptById(Long id) {
        return find.byId(id);
    }

    public void copyValues(Concept concept) {
        this.name=concept.name;
        this.slug=concept.slug;
        this.chapter=concept.chapter;
        this.description=concept.description;
        this.descriptionHtml=concept.descriptionHtml;
        this.featuredImage=concept.featuredImage;
        this.videoUrl=concept.videoUrl;
    }

    public static List<Concept> findAllConceptsInChapter(Chapter chapter){

        return find.fetch("chapter").where().eq("chapter",chapter).orderBy("slug").findList();
    }

    public static Concept findFirstConceptInChapter(Chapter chapter){

        return find.where().conjunction().eq("chapter",chapter).where().eq("previousConcept",null).endJunction().findUnique();
    }

    public static Concept findLastConceptInChapter(Chapter chapter){

        return find.where().conjunction().eq("chapter",chapter).where().eq("nextConcept",null).endJunction().findUnique();
    }


}
