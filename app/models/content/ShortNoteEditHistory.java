package models.content;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import play.db.ebean.Model;
import play.mvc.Result;
import play.mvc.Results;
import views.html.defaultpages.badRequest;

import javax.persistence.*;
import java.util.List;

import static play.mvc.Results.ok;

/**
 * Created by Admin on 9/5/14.
 */
@Entity
public class ShortNoteEditHistory extends Model {
    public static final Finder<Long,ShortNoteEditHistory> find= new Finder<>(Long.class,ShortNoteEditHistory.class);
    @JsonProperty("id")
    @Id
    public Long id;



    @JsonBackReference("shortnote")
    @ManyToOne
    public ShortNote shortnote;

    @JsonProperty("createdTime")
    public String createdTime;

    @JsonProperty("updatedTime")
    public String updatedTime;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("title")
    public String title;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("slug")
    public String slug;

    @Column(columnDefinition = "TEXT")
    @JsonProperty("text")
    public String text;
    @Column(columnDefinition = "TEXT")
    @JsonProperty("html")
    public String html;

    @JsonProperty("tags")
    @ManyToMany
    public List<Tag> tags;

    @JsonProperty("featuredImage")
    @OneToOne
    public Image featuredImage;

    @JsonBackReference("editor")
    @ManyToOne
    public User editor;

    public static Result saveShortNoteEdits(ShortNote oldShortNote,ShortNote shortNote, User editor) {
        if (shortNote != null && editor != null) {
            if(findEditsOfShortNote(shortNote).size()==0){
                ShortNoteEditHistory oldShortNoteEditHistory = new ShortNoteEditHistory();
                oldShortNoteEditHistory.deepCopyEdits(oldShortNote).editor=oldShortNote.user;
                oldShortNoteEditHistory.save();
            }


            ShortNoteEditHistory shortNoteEditHistory = new ShortNoteEditHistory();
            shortNoteEditHistory.deepCopyEdits(shortNote).editor=editor;
            shortNoteEditHistory.save();
            return ok("Saved");
        } else {
            return Results.badRequest("Bad Request");
        }


    }
    public static List<ShortNoteEditHistory> findEditsOfShortNote(ShortNote shortNote){
        return find.where().eq("shortnote", shortNote).orderBy("updatedTime desc").findList();
    }

    public ShortNoteEditHistory deepCopyEdits(ShortNote shortNote){
        this.createdTime = shortNote.createdTime;
        this.shortnote=shortNote;
        this.updatedTime = shortNote.updatedTime;
        this.title = shortNote.title;
        this.text = shortNote.text;
        this.html = shortNote.html;
        this.slug = shortNote.slug;
        for (Tag tag : shortNote.tags) {
            this.tags.add(tag);
        }

        return this;
    }



}
