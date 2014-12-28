package models.Forum;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import org.joda.time.DateTime;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Admin on 8/8/14.
 */
@Entity
public class ForumAnswerLike extends Model {
    public static final Finder<Long,ForumAnswerLike> find= new Finder<>(Long.class,ForumAnswerLike.class);

    @Id
    public Long id;
    @JsonBackReference("answerCreatedBy")
    @ManyToOne
    public User createdBy;

    @JsonProperty("createdTime")
    public String createdTime;

    @JsonBackReference("answerLikes")
    @ManyToOne
    public ForumAnswer forumAnswer;



}
