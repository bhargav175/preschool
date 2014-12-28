package models.content;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.User;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.IOException;
import java.util.List;

/**
 * Created by Admin on 10/5/14.
 */
@Entity
public class Track extends Model {
    public static final Finder<Long, Track> find = new Finder<>(Long.class, Track.class);
    @JsonProperty("id")
    @Id
    public Long id;

    @JsonIgnore
    @ManyToOne
    public User user;

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



}
