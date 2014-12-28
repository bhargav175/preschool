package models.content;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Result;

import javax.persistence.*;
import java.util.List;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by Admin on 11/5/14.
 */
@Entity

public class ConceptEditHistory extends Model {
    public static final Finder<Long,ConceptEditHistory> find= new Finder<>(Long.class,ConceptEditHistory.class);
    @JsonProperty("id")
    @Id
    public Long id;

    @JsonIgnore
    @ManyToOne
    public User user;

    @JsonProperty("subject")
    @ManyToOne
    public Subject subject;

    @JsonProperty("chapter")
    @ManyToOne
    public Chapter chapter;

    @JsonProperty("nextConcept")
    @ManyToOne
    public Concept nextConcept;

    @JsonProperty("previousConcept")
    @ManyToOne
    public Concept previousConcept;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("videoUrl")
    public String videoUrl;



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

    @JsonProperty("featuredImage")
    @OneToOne
    public Image featuredImage;

    @JsonBackReference("editor")
    @ManyToOne
    public User editor;



}
