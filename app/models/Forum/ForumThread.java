package models.Forum;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import models.content.Tag;
import org.joda.time.DateTime;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Admin on 8/8/14.
 */
@Entity
public class ForumThread extends Model {
    public static final Finder<Long,ForumThread> find= new Finder<>(Long.class,ForumThread.class);


    @Id
    public Long id;

    @JsonProperty("threadCreatedBy")
    @ManyToOne
    public User createdBy;

    @JsonProperty("threadTags")
    @ManyToMany
    public List<Tag> tags;

    @JsonProperty("createdTime")
    public String createdTime;

    @JsonBackReference("threadAnswers")
    @OneToMany
    public List<ForumAnswer> answers;

    @JsonProperty("title")
    public String title;

    @JsonProperty("text")
    public String text;

    @JsonProperty("slug")
    public String slug;

    @JsonProperty("html")
    public String html;

    @JsonProperty("threadLikes")
    @OneToMany
    public List<ForumThreadLike> threadLikes;

    public static List<ForumThread> getAllForumThreads() {
        return find.orderBy("createdTime desc").setMaxRows(25).findList();
    }

    public static ForumThread getForumBySlug(String slug) {
        return find.where().eq("slug",slug).findUnique();
    }
}
