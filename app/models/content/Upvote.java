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
@Entity(name="upvotes")
public class Upvote extends Model {
    public static final Finder<Long,Upvote> find= new Finder<>(Long.class,Upvote.class);

    @Id
    public Long id;

    @JsonBackReference("from")
    @ManyToOne
    public User from;

    @JsonBackReference("shortnote-upvote")
    @ManyToOne
    public ShortNote shortNote;

    @JsonProperty("createdTime")
    public String createdTime;

    public static Integer upvoteWeight;


    public static Boolean hasUserUpvotedPost(User user,ShortNote shortNote){
        Upvote upvote= find.where().conjunction().eq("from",user).where().eq("shortNote",shortNote).endJunction().findUnique();
        if(upvote!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public static void removeUserUpvote(User localUser, ShortNote sn) {
        Upvote upvote= find.where().conjunction().eq("from",localUser).where().eq("shortNote",sn).endJunction().findUnique();
            upvote.delete();

    }


}
