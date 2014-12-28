package models.content;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.User;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Result;

import javax.persistence.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by Admin on 11/5/14.
 */
@Entity
public class Chapter extends Model {
    public static final Model.Finder<Long,Chapter> find= new Model.Finder<>(Long.class,Chapter.class);
    @JsonProperty("id")
    @Id
    public Long id;



    @JsonProperty("subject")
    @ManyToOne
    public Subject subject;

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
    @JsonProperty("status")
    public String status = "active";


    @Column(columnDefinition = "TEXT")
    @JsonProperty("videoUrl")
    public String videoUrl;


    @JsonIgnore
    @OneToOne
    public Chapter nextChapter;

    @JsonIgnore
    @OneToOne
    public Chapter previousChapter;

    @JsonProperty("featuredImage")
    @OneToOne
    public Image featuredImage;

    public static List<Chapter> findAllChapters(){

        return find.fetch("subject").fetch("nextChapter").fetch("previousChapter").orderBy("slug").findList();
    }

    public static List<Chapter> findAllChaptersInSubject(Subject subject){

//        return find.fetch("subject").where().eq("subject",subject).orderBy("slug").findList();
          List<Chapter> chapterList= new ArrayList<Chapter>();
          Chapter firstChapter= Chapter.findFirstChapterInSubject(subject);
          if(firstChapter!=null){
              Chapter currChapter;
              chapterList.add(firstChapter);
              currChapter=Chapter.findChapterById(firstChapter.id);
              while(currChapter.nextChapter!=null){
                  currChapter=Chapter.findChapterById(currChapter.nextChapter.id);
                  chapterList.add(currChapter);
              }
          }
        else{

          }
        return chapterList;
    }

    public static Chapter findFirstChapterInSubject(Subject subject){

        return find.where().conjunction().eq("subject",subject).where().eq("previousChapter",null).endJunction().findUnique();
    }

    public static Chapter findLastChapterInSubject(Subject subject){

        return find.where().conjunction().eq("subject",subject).where().eq("nextChapter",null).endJunction().findUnique();
    }

    public static Chapter findChapterBySlug(String slug){

        return find.where().eq("slug",slug).findUnique();
    }
    public static Chapter getChapterContent(Chapter chapter){
        return find.where().eq("id",chapter.id).findUnique();
    }


    public static Chapter findChapterById(Long id) {
        return find.byId(id);
    }


    public void copyValues(Chapter chapter) {
        this.name=chapter.name;
        this.slug=chapter.slug;
        this.description=chapter.slug;
        this.descriptionHtml=chapter.descriptionHtml;
        this.subject=chapter.subject;
        this.featuredImage=chapter.featuredImage;
        this.videoUrl=chapter.videoUrl;

    }

    public static Chapter fromJson(JsonNode fullJson) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(fullJson.traverse(), models.content.Chapter.class);
    }
}
