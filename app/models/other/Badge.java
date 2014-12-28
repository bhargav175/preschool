package models.other;

import com.fasterxml.jackson.annotation.JsonProperty;
import models.content.Subject;
import play.db.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Admin on 24-12-2014.
 */
    @Entity
    public class Badge extends Model {
        public static final Model.Finder<Long,Badge> find= new Model.Finder<>(Long.class,Badge.class);
        @JsonProperty("id")
        @Id
        public Long id;

        @Column(columnDefinition = "TEXT")
        @JsonProperty("name")
        public String name;

    }
