package models.content;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by Admin on 27/5/14.
 */
@Entity
public class Downvote extends Model {
    public static final Finder<Long,Downvote> find= new Finder<>(Long.class,Downvote.class);

    @Id
    public Long id;

    @JsonProperty("from")
    @ManyToOne
    public User from;

    @JsonBackReference("shortnote-downvote")
    @ManyToOne
    public ShortNote shortNote;

    @JsonProperty("createdTime")
    public String createdTime;

    public static Integer downvoteWeight;

    public static Boolean hasUserDownvotedPost(User user,ShortNote shortNote){
        Downvote downvote= find.where().conjunction().eq("from",user).where().eq("shortNote",shortNote).endJunction().findUnique();
        if(downvote!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public static void removeUserDownvote(User localUser, ShortNote sn) {
        Downvote downvote= find.where().conjunction().eq("from",localUser).where().eq("shortNote",sn).endJunction().findUnique();
        downvote.delete();
    }
}
