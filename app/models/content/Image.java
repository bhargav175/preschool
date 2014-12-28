package models.content;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;
import play.mvc.Result;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by Admin on 8/6/14.
 */
@Entity
public class Image extends Model {
    public static final Finder<Long,Image> find= new Finder<>(Long.class,Image.class);

    @Id
    public Long id;

    @JsonIgnore
    @ManyToOne
    public User user;

    @JsonProperty("fileName")
    public String fileName;

    @JsonProperty("contentType")
    public String contentType;

    @JsonProperty("path")
    public String path;

    @JsonProperty("createdTime")
    public String createdTime;

        @JsonProperty("height")
    public int height=480;
    @JsonProperty("width")
    public int width=640;
        @JsonProperty("alt")
        public String alt;
        @JsonProperty("description")
        public String description;
        @JsonProperty("caption")
        public String caption;
        @JsonProperty("title")
        public String title;

    public static List<Image> getImagesByUser(User user){
        return find.where().eq("user",user).findList();
    }

    public static Image getImageById(User localUser, Long id) {
        Image image=find.byId(id);
        if(image!=null){
            if(image.user.equals(localUser)){
                return image;
            }
            else{
                return null;
            }

        }
        else{
            return null;
        }
    }
}
