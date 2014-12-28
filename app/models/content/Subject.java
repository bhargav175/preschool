package models.content;

import com.avaje.ebean.Page;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.User;
import play.db.ebean.Model;
import play.mvc.Controller;

import javax.persistence.*;
import java.io.IOException;
import java.util.List;

/**
 * Created by Admin on 10/5/14.
 */
@Entity
public class Subject extends Model {
    public static final Model.Finder<Long, Subject> find = new Model.Finder<>(Long.class, Subject.class);
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

    @Column(columnDefinition = "TEXT")
    @JsonProperty("status")
    public String status = "active";

    @Column(columnDefinition = "TEXT")
    @JsonProperty("videoUrl")
    public String videoUrl;


    @JsonProperty("featuredImage")
    @OneToOne
    public Image featuredImage;

    public static List<Subject> findAllSubjects() {

        return find.orderBy("slug").findList();
    }

    public static Subject findSubjectBySlug(String slug) {
        return find.where().eq("slug", slug).findUnique();
    }



    public static Subject fromJson(JsonNode fullJson) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(fullJson.traverse(), models.content.Subject.class);
    }


    public static Subject findSubjectById(Long id) {
        return find.byId(id);
    }

    public void copyValues(Subject sub) {
        this.slug=sub.slug;
        this.description=sub.description;
        this.descriptionHtml=sub.descriptionHtml;
        this.featuredImage=sub.featuredImage;
        this.status=sub.status;
        this.name=sub.name;
        this.videoUrl= sub.videoUrl;
    }
}
