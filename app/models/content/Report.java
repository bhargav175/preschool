package models.content;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import models.User;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Admin on 2/6/14.
 */
@Entity
public class Report extends Model {
    public static final Finder<Long,Report> find= new Finder<>(Long.class,Report.class);

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


    @JsonProperty("resolved")
    public Boolean resolved=false;

    @JsonProperty("helpful")
    public Boolean helpful=true;

    @JsonProperty("createdTime")
    public String createdTime;

    @JsonProperty("resolvedTime")
    public String resolvedTime;



    public static boolean userHasReportedShortNote(ShortNote shortNote, User localUser) {
        Report report=  find.where().conjunction().eq("shortNote",shortNote).where().eq("user",localUser).endJunction().findUnique();
        if(report!=null){
            return true;
        }
        else{
            return false;
        }

    }

    public static List<Report> findAllUnResolvedReports() {
        return find.where().eq("resolved",false).findList();

    }
}
