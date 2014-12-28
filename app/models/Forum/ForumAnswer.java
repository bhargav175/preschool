package models.Forum;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class ForumAnswer extends Model {
    public static final Finder<Long,ForumAnswer> find= new Finder<>(Long.class,ForumAnswer.class);

    @Id
    public Long id;

    @JsonBackReference("answerCreatedBy")
    @ManyToOne
    public User createdBy;

    @JsonProperty("createdTime")
    public String createdTime;

    @JsonManagedReference("threadAnswers")
    @ManyToOne
    public ForumThread forumThread;

    @JsonProperty("slug")
    public String slug;

    @JsonProperty("text")
    public String text;

    @JsonProperty("html")
    public String html;

    @JsonBackReference("answerLikes")
    @OneToMany
    public List<ForumAnswerLike> answerLikes;

    public static ForumAnswer getForumAnswerBySlug(String slug) {
        return find.where().eq("slug",slug).findUnique();
    }
}
