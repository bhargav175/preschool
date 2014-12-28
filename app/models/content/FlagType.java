package models.content;

import com.avaje.ebean.annotation.EnumValue;


/**
 * Created by Admin on 2/6/14.
 */
public enum FlagType {

    @EnumValue("Duplicate")
    DUPLICATE,
    @EnumValue("Opinionistic")
    OPINIONISTIC,
    @EnumValue("Spam")
    SPAM,
    @EnumValue("Inappropriate")
    INAPPROPRIATE

    
}
