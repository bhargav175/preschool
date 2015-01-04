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

    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.ADMIN_ROLE)})
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
            return redirect("/");
        }else{
            return redirect("/");
        }

    }

    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.ADMIN_ROLE)})
    public static Result deleteWeeklyReport(String weeklyReportId) {
        Integer wId = Integer.valueOf(weeklyReportId);
        WeeklyReport weeklyReport = WeeklyReport.findById(wId);
        if(weeklyReport!=null &&weeklyReport.id!=null){
            weeklyReport.delete();
            return redirect("/");
        }else{
            return redirect("/");
        }




    }

    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result deleteEnquiry(String enquiryId) {
        Integer eId = Integer.valueOf(enquiryId);
        Enquiry enquiry = Enquiry.findById(eId);
        if(enquiry!=null &&enquiry.id!=null){
            enquiry.delete();
            return redirect("/");
        }else{
            return redirect("/");
        }




    }
    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result deleteFranchise(String franchiseId) {
        Integer fId = Integer.valueOf(franchiseId);
        Franchise franchise = Franchise.findById(fId);
        if(franchise!=null &&franchise.id!=null){
            franchise.delete();
            return redirect("/");
        }else{
            return redirect("/");
        }


    }



//    Edit

    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result careerEdit(String careerId) {
        Integer cId = Integer.valueOf(careerId);
        Career career = Career.findById(cId);
        Form<Career> careerForm2 = Form.form(Career.class);

        if(career!=null &&career.id!=null){
            careerForm2 = careerForm2.fill(career);
            careerForm2.bindFromRequest();
            return ok(edit_career_template.render(careerForm2,career));

        }else{
            return redirect("/");
        }

    }

    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.ADMIN_ROLE)})
    public static Result weeklyReportEdit(String weeklyReportId) {
        Integer wId = Integer.valueOf(weeklyReportId);
        WeeklyReport weeklyReport = WeeklyReport.findById(wId);
        Form<WeeklyReport> weeklyReportForm1 = Form.form(WeeklyReport.class);

        if(weeklyReport!=null &&weeklyReport.id!=null){
            weeklyReportForm1 = weeklyReportForm1.fill(weeklyReport);
            weeklyReportForm1.bindFromRequest();
            return ok(edit_weekly_report_template.render(weeklyReportForm1,weeklyReport));

        }else{
            return redirect("/");
        }



    }

    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result enquiryEdit(String enquiryId) {
        Integer eId = Integer.valueOf(enquiryId);
        Enquiry enquiry = Enquiry.findById(eId);
        Form<Enquiry> enquiryForm1 = Form.form(Enquiry.class);

        if(enquiry!=null &&enquiry.id!=null){
            enquiryForm1 = enquiryForm1.fill(enquiry);
            enquiryForm1.bindFromRequest();
            return ok(edit_enquiry_template.render(enquiryForm1,enquiry));

        }else{
            return redirect("/");
        }




    }
    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result franchiseEdit(String franchiseId) {
        Integer fId = Integer.valueOf(franchiseId);
        Franchise franchise = Franchise.findById(fId);
        Form<Franchise> franchiseForm1 = Form.form(Franchise.class);

        if(franchise!=null &&franchise.id!=null){
            franchiseForm1 = franchiseForm1.fill(franchise);
            franchiseForm1.bindFromRequest();
            return ok(edit_franchise_template.render(franchiseForm1,franchise));

        }else{
            return redirect("/");
        }

    }


//UPdate

    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result careerUpdate(String careerId) {
        Form<Career> careerForm1 = Form.form(Career.class).bindFromRequest();
        Career career1 = careerForm1.get();
        Integer cId = Integer.valueOf(careerId);
        Career career = Career.findById(cId);
        if(career!=null &&cId!=null ){
            career1.id = career.id;
            career1.update(cId);
            return redirect("/");
        }else{
            return redirect("/");
        }

    }

    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.ADMIN_ROLE)})
    public static Result weeklyReportUpdate(String weeklyReportId) {
        Form<WeeklyReport> weeklyReportForm1 = Form.form(WeeklyReport.class).bindFromRequest();
        WeeklyReport weeklyReport = weeklyReportForm1.get();
        Integer wId = Integer.valueOf(weeklyReportId);
        WeeklyReport weeklyReport1 = WeeklyReport.findById(wId);
        if(weeklyReport1!=null &&wId!=null ){
            weeklyReport1.id = weeklyReport.id;
            weeklyReport.update(wId);
            return redirect("/");
        }else{
            return redirect("/");
        }


    }

    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result enquiryUpdate(String enquiryId) {
        Form<Enquiry> enquiryForm1 = Form.form(Enquiry.class).bindFromRequest();
        Enquiry enquiry = enquiryForm1.get();
        Integer eId = Integer.valueOf(enquiryId);
        Enquiry enquiry1 = Enquiry.findById(eId);
        if(enquiry!=null &&eId!=null ){
            enquiry1.id = enquiry.id;
            enquiry.update(eId);
            return redirect("/");
        }else{
            return redirect("/");
        }



    }
    @Restrict(@Group(SecurityRole.ADMIN_ROLE))
    public static Result franchiseUpdate(String franchiseId) {
        Form<Franchise> franchiseForm1 = Form.form(Franchise.class).bindFromRequest();
        Franchise franchise = franchiseForm1.get();
        Integer fId = Integer.valueOf(franchiseId);
        Franchise franchise1 = Franchise.findById(fId);
        if(franchise!=null &&fId!=null ){
            franchise1.id = franchise.id;
            franchise.update(fId);
            return redirect("/");
        }else{
            return redirect("/");
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

    @Restrict({@Group(SecurityRole.TEACHER_ROLE),@Group(SecurityRole.PARENT_ROLE),@Group(SecurityRole.ADMIN_ROLE),@Group(SecurityRole.USER_ROLE)})    public static Result weeklyReport() {
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

    public static Result gallery() {
        return ok(gallery.render());
    }
}