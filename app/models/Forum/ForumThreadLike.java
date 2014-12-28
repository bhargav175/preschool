package models.Forum;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import org.joda.time.DateTime;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Admin on 8/8/14.
 */
@Entity
public class ForumThreadLike extends Model {
    public static final Finder<Long,ForumThreadLike> find= new Finder<>(Long.class,ForumThreadLike.class);

    @Id
    public Long id;

    @JsonBackReference("threadCreatedBy")
    @ManyToOne
    public User createdBy;

    @JsonProperty("createdTime")
    public String createdTime;

    @JsonBackReference("threadLikes")
    @ManyToOne
    public ForumThread forumThread;


}
