package models.content;
import com.avaje.ebean.Page;
import com.avaje.ebean.RawSql;
import com.avaje.ebean.RawSqlBuilder;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import models.User;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import play.db.ebean.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Admin on 9/5/14.
 */
@Entity
public class ShortNote extends Model {
    public static final Finder<Long,ShortNote> find= new Finder<>(Long.class,ShortNote.class);
    @JsonProperty("id")
    @Id
    public Long id;

    @JsonProperty("user")
    @ManyToOne
    public User user;

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
    public List<Tag> tags = new ArrayList<Tag>();

    @JsonManagedReference("shortnote-upvote")
    @OneToMany(cascade = CascadeType.ALL)
    public List<Upvote> upvotes = new ArrayList<Upvote>();

    @JsonManagedReference("shortnote-downvote")
    @OneToMany(cascade = CascadeType.ALL)
    public List<Downvote> downvotes= new ArrayList<Downvote>();

    @JsonProperty("score")
    @Column(columnDefinition = "int default 0")
    public Integer score=0;

    @JsonIgnore
    @OneToMany
    public List<Flag> flags = new ArrayList<Flag>();

    @JsonIgnore
    @OneToMany
    public List<Report> reports = new ArrayList<Report>();

    @JsonProperty("featuredImage")
    @OneToOne
    public Image featuredImage;

    public static List<ShortNote> findAllShortNotesByUser(User user){

        return find.where().eq("user",user).orderBy("title").findList();
    }

    public static List<ShortNote> findAllShortNotes(){

        return find.orderBy("title").findList();
    }

    public static List<ShortNote> findTenRecentShortNotes(){

        return find.orderBy("title").setMaxRows(10).findList();
    }

        public static ShortNote findShortNoteBySlug(String slug){

        return find.where().eq("slug",slug).findUnique();
    }
    public static ShortNote findShortNoteById(Long id){

        return find.byId(id);
    }


    public void deepCopy(ShortNote sn) {
        this.title=sn.title;
        this.text=sn.text;
        this.html=sn.html;
        this.updatedTime=new DateTime().toDateTimeISO().withZone(DateTimeZone.UTC).toString();
        this.featuredImage=sn.featuredImage;
        this.tags=new ArrayList<Tag>();
        for (Tag tag : sn.tags) {
            this.tags.add(tag);
        };


    }

    public static List<ShortNote> findPostsByTag(Tag tag) {
        List<Tag> tags=new ArrayList<Tag>();
        tags.add(tag);
        List<ShortNote> shortNoteList=new ArrayList<ShortNote>();
        shortNoteList= find.fetch("tags").where().eq("tags.id",tag.id).findList();

        return shortNoteList;

    }


    public static List<ShortNote> feed(User localUser) {
        List<Tag> tagList= localUser.favoriteTags;
        List<ShortNote> shortNoteList=new ArrayList<ShortNote>();

        shortNoteList.addAll(ShortNote.findAllShortNotesByUser(localUser));

        for(Tag tag: tagList){
            for(ShortNote shortNote:ShortNote.findPostsByTag(tag)){
                if(shortNoteList.contains(shortNote)){

                }else{
                    if(shortNote.flags.size()>0){

                    }else{
                    shortNoteList.add(shortNote);
                    }
                }
            };
        }
        if(shortNoteList.size()==0){
            shortNoteList.addAll(ShortNote.findAllShortNotes());
        }
        return shortNoteList;
    }
}
