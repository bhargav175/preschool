package controllers;

import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import play.data.Form;

import java.util.ArrayList;
import java.util.List;


public class ContentController extends Controller {
    final static Form<Career> careerForm = Form.form(Career.class);
    final static Form<Enquiry> enquiryForm = Form.form(Enquiry.class);
    final static Form<Franchise> franchiseForm = Form.form(Franchise.class);
    final static Form<WeeklyReport> weeklyReportForm = Form.form(WeeklyReport.class);


    public static Result career()
    {
        List<Career> careerList = Career.findAll();
        return ok(career_template.render(careerForm,careerList));
    }

    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.ADMIN_ROLE)})
    public static Result saveCareer() {
        Form<Career> newCareerForm = Form.form(Career.class).bindFromRequest();
        Career newCareer = newCareerForm.get();
        if(newCareer.name!=null){
            newCareer.save();
            return career();
        }else{
            return career();
        }


    }

    public static Result saveEnquiry() {
        Form<Enquiry> newEnquiryForm = Form.form(Enquiry.class).bindFromRequest();
        Enquiry newEnquiry = newEnquiryForm.get();
        if(newEnquiry.name!=null){
            newEnquiry.save();
            return enquiry();
        }else{
            return enquiry();
        }


    }
    public static Result saveFranchise() {
        Form<Franchise> newFranchiseForm = Form.form(Franchise.class).bindFromRequest();
        Franchise newFranchise = newFranchiseForm.get();
        if(newFranchise.name!=null){
            newFranchise.save();
            return franchise();
        }else{
            return franchise();
        }


    }

    @Restrict(@Group(SecurityRole.TEACHER_ROLE))
    public static Result saveWeeklyReport() {
        Form<WeeklyReport> newWeeklyReport = Form.form(WeeklyReport.class).bindFromRequest();
        WeeklyReport weeklyReport = newWeeklyReport.get();
        if(weeklyReport.childName!=null){
            weeklyReport.save();
            return weeklyReport();
        }else{
            return weeklyReport();
        }


    }

    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result deleteCareer(String careerId) {
        Integer cId = Integer.valueOf(careerId);
        Career career = Career.findById(cId);
        if(career!=null &&career.id!=null){
            career.delete();
            return Application.index();
        }else{
            return Application.index();
        }

    }

    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.ADMIN_ROLE)})
    public static Result deleteWeeklyReport(String weeklyReportId) {
        Integer wId = Integer.valueOf(weeklyReportId);
        WeeklyReport weeklyReport = WeeklyReport.findById(wId);
        if(weeklyReport!=null &&weeklyReport.id!=null){
            weeklyReport.delete();
            return Application.index();
        }else{
            return Application.index();
        }




    }

    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result deleteEnquiry(String enquiryId) {
        Integer eId = Integer.valueOf(enquiryId);
        Enquiry enquiry = Enquiry.findById(eId);
        if(enquiry!=null &&enquiry.id!=null){
            enquiry.delete();
            return Application.index();
        }else{
            return Application.index();
        }




    }
    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result deleteFranchise(String franchiseId) {
        Integer fId = Integer.valueOf(franchiseId);
        Franchise franchise = Franchise.findById(fId);
        if(franchise!=null &&franchise.id!=null){
            franchise.delete();
            return Application.index();
        }else{
            return Application.index();
        }


    }


    public static Result enquiry() {

        List<Enquiry> enquiryList = Enquiry.findAll();
        return ok(enquiry_template.render(enquiryForm,enquiryList));

    }

    public static Result franchise() {
        List<Franchise> franchiseList = Franchise.findAll();
        return ok(franchise_template.render(franchiseForm,franchiseList));
    }

    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.PARENT_ROLE),@Group(SecurityRole.ADMIN_ROLE)})
    public static Result weeklyReport() {
        List<WeeklyReport> weeklyReports = WeeklyReport.findAll();
        return ok(weekly_report_template.render(weeklyReportForm,weeklyReports));
    }

    public static Result careers() {
        return play.mvc.Results.TODO;
    }

    public static Result franchises() {
        return play.mvc.Results.TODO;
    }

    public static Result enquiries() {
        return play.mvc.Results.TODO;
    }
}