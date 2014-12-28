package models.content;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Admin on 2/6/14.
 */
@Entity
public class Flag extends Model {
    public static final Finder<Long,Flag> find= new Finder<>(Long.class,Flag.class);

    @Id
    public Long id;

    @JsonIgnore
    @ManyToOne
    public ShortNote shortNote;

    @JsonProperty("flag")
    public FlagType flagType;

    @JsonIgnore
    @ManyToOne
    public User user;

    @JsonProperty("createdTime")
    public String createdTime;

    public static Boolean doesShortNoteHasGivenFlag(ShortNote shortNote, FlagType flagType){
        Flag flag= find.fetch("shortNote").where().conjunction().eq("shortNote",shortNote).where().eq("flagType",flagType).endJunction().findUnique();
        if(flag!=null){
            return true;
        }
        else{
            return false;
        }
    }

    public static Flag getFlagWithShortNoteWithFlagType(ShortNote shortNote, FlagType flagType) {

       return find.fetch("shortNote").where().conjunction().eq("shortNote",shortNote).where().eq("flagType",flagType).endJunction().findUnique();
    }
}
