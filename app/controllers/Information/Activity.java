package controllers.Information;

import com.fasterxml.jackson.annotation.JsonProperty;
import models.Information.Activity_Change;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 30/5/14.
 */
public class Activity extends Controller{
    @JsonProperty("activities")
    public List<Activity_Change> activity_changeList= new ArrayList<Activity_Change>();
}
