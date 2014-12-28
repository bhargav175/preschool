package models.content;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.User;
import play.db.ebean.Model;

import javax.persistence.*;
import java.io.IOException;
import java.util.List;

/**
 * Created by Admin on 11/5/14.
 */
@Entity
public class ChapterEditHistory extends Model {
    public static final Finder<Long,ChapterEditHistory> find= new Finder<>(Long.class,ChapterEditHistory.class);
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

    @JsonProperty("nextChapter")
    @ManyToOne
    public Chapter nextChapter;

    @JsonProperty("previousChapter")
    @ManyToOne
    public Chapter previousChapter;

    @JsonProperty("featuredImage")
    @OneToOne
    public Image featuredImage;

    @JsonBackReference("editor")
    @ManyToOne
    public User editor;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("videoUrl")
    public String videoUrl;


}
