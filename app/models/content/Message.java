package models.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by Admin on 11/5/14.
 */
public class Message extends Model {
    public static final Finder<Long,ShortNote> find= new Finder<>(Long.class,ShortNote.class);
    @JsonProperty("id")
    @Id
    public Long id;



    @Column(columnDefinition = "TEXT")
    @JsonProperty("name")
    public String name;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("slug")
    public String slug;


}
