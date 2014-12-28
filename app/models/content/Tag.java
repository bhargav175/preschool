package models.content;

import com.avaje.ebean.FetchConfig;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.db.ebean.Model;

import javax.persistence.*;
import java.io.IOException;
import java.util.List;

/**
 * Created by Admin on 11/5/14.
 */
@Entity
public class Tag extends Model {
    public static final Finder<Long,Tag> find= new Finder<>(Long.class,Tag.class);
    @JsonProperty("id")
    @Id
    public Long id;



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


    @JsonProperty("chapters")
    @ManyToMany
    public List<Chapter> chapters;

    @JsonProperty("featuredImage")
    @OneToOne
    public Image featuredImage;

    public static List<Tag> findAllTags(){

        return find.orderBy("slug").findList();
    }


    public static Tag fromJson(JsonNode fullJson) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(fullJson.traverse(), models.content.Tag.class);
    }

    public static Tag findTagById(Long id) {

        return find.byId(id);
    }
    public void copyValues(Tag oldTag){
            this.name=oldTag.name;
            this.slug=oldTag.slug;
            this.description=oldTag.description;
        this.descriptionHtml=oldTag.descriptionHtml;
        this.chapters=oldTag.chapters;
        this.featuredImage=oldTag.featuredImage;

    }

    public static Tag findTagBySlug(String slug) {
        return find.where().eq("slug",slug).findUnique();
    }

    public static List<Tag> getTagByChapter(Chapter chapter) {
        return find.where().eq("chapters.id",chapter.id).findList();
    }


    public static List<Tag> findTagsInChapter(Chapter chapter) {
            return find.fetch("chapters",new FetchConfig().query()).fetch("chapters").where().eq("chapters.id",chapter.id).findList();
    }
}
