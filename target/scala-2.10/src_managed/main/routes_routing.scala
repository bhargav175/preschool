// @SOURCE:W:/Pre School/conf/routes
// @HASH:634b9baf9a30150472c1d7c13d439ef8ec3e76bf
// @DATE:Fri Jan 02 04:02:07 IST 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:8
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_jsRoutes1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/javascript/routes.js"))))
        

// @LINE:11
private[this] lazy val controllers_Application_user_account2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("account"))))
        

// @LINE:13
private[this] lazy val controllers_Application_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:14
private[this] lazy val controllers_Application_doLogin4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:16
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_logout5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:17
private[this] lazy val com_feth_play_module_pa_controllers_Authenticate_authenticate6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true))))
        

// @LINE:19
private[this] lazy val controllers_Application_signup7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:20
private[this] lazy val controllers_Application_doSignup8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:22
private[this] lazy val controllers_Signup_unverified9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/unverified"))))
        

// @LINE:23
private[this] lazy val controllers_Signup_oAuthDenied10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate/"),DynamicPart("provider", """[^/]+""",true),StaticPart("/denied"))))
        

// @LINE:25
private[this] lazy val controllers_Signup_verify11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Signup_exists12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/exists"))))
        

// @LINE:28
private[this] lazy val controllers_Signup_resetPassword13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset/"),DynamicPart("token", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Signup_doResetPassword14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/reset"))))
        

// @LINE:31
private[this] lazy val controllers_Account_changePassword15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
        

// @LINE:32
private[this] lazy val controllers_Account_doChangePassword16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/password/change"))))
        

// @LINE:34
private[this] lazy val controllers_Account_verifyEmail17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/verify"))))
        

// @LINE:36
private[this] lazy val controllers_Account_link18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/add"))))
        

// @LINE:38
private[this] lazy val controllers_Account_askLink19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
        

// @LINE:39
private[this] lazy val controllers_Account_doLink20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/link"))))
        

// @LINE:41
private[this] lazy val controllers_Account_askMerge21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
        

// @LINE:42
private[this] lazy val controllers_Account_doMerge22 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accounts/merge"))))
        

// @LINE:44
private[this] lazy val controllers_Signup_forgotPassword23 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
        

// @LINE:45
private[this] lazy val controllers_Signup_doForgotPassword24 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/password/forgot"))))
        

// @LINE:46
private[this] lazy val controllers_Application_signupAdmin25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signupadmin"))))
        

// @LINE:47
private[this] lazy val controllers_Application_notfound26 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("404"))))
        

// @LINE:51
private[this] lazy val controllers_Application_about27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:52
private[this] lazy val controllers_Application_contact28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:57
private[this] lazy val controllers_ContentController_enquiry29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("enquiry"))))
        

// @LINE:58
private[this] lazy val controllers_ContentController_franchise30 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("franchise"))))
        

// @LINE:59
private[this] lazy val controllers_ContentController_career31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("career"))))
        

// @LINE:60
private[this] lazy val controllers_ContentController_weeklyReport32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("weeklyreport"))))
        

// @LINE:61
private[this] lazy val controllers_ContentController_enquiries33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("enquiries"))))
        

// @LINE:62
private[this] lazy val controllers_ContentController_franchises34 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("franchises"))))
        

// @LINE:63
private[this] lazy val controllers_ContentController_careers35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("careerrs"))))
        

// @LINE:65
private[this] lazy val controllers_ContentController_saveCareer36 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("career"))))
        

// @LINE:66
private[this] lazy val controllers_ContentController_saveEnquiry37 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("enquiry"))))
        

// @LINE:67
private[this] lazy val controllers_ContentController_saveFranchise38 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("franchise"))))
        

// @LINE:68
private[this] lazy val controllers_ContentController_saveWeeklyReport39 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("weeklyreport"))))
        

// @LINE:70
private[this] lazy val controllers_ContentController_deleteEnquiry40 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("enquiry/del"))))
        

// @LINE:71
private[this] lazy val controllers_ContentController_deleteFranchise41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("franchise/del"))))
        

// @LINE:72
private[this] lazy val controllers_ContentController_deleteCareer42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("career/del"))))
        

// @LINE:73
private[this] lazy val controllers_ContentController_deleteWeeklyReport43 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("weeklyreport/del"))))
        

// @LINE:78
private[this] lazy val controllers_Assets_at44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/javascript/routes.js""","""controllers.Application.jsRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """account""","""controllers.Application.user_account"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.doLogin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""com.feth.play.module.pa.controllers.Authenticate.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>""","""com.feth.play.module.pa.controllers.Authenticate.authenticate(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.doSignup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/unverified""","""controllers.Signup.unverified"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate/$provider<[^/]+>/denied""","""controllers.Signup.oAuthDenied(provider:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify/$token<[^/]+>""","""controllers.Signup.verify(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/exists""","""controllers.Signup.exists"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset/$token<[^/]+>""","""controllers.Signup.resetPassword(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/reset""","""controllers.Signup.doResetPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.changePassword"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/password/change""","""controllers.Account.doChangePassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/verify""","""controllers.Account.verifyEmail"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/add""","""controllers.Account.link"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.askLink"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/link""","""controllers.Account.doLink"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.askMerge"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accounts/merge""","""controllers.Account.doMerge"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.forgotPassword(email:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/password/forgot""","""controllers.Signup.doForgotPassword"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signupadmin""","""controllers.Application.signupAdmin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """404""","""controllers.Application.notfound"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """enquiry""","""controllers.ContentController.enquiry"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """franchise""","""controllers.ContentController.franchise"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """career""","""controllers.ContentController.career"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """weeklyreport""","""controllers.ContentController.weeklyReport"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """enquiries""","""controllers.ContentController.enquiries"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """franchises""","""controllers.ContentController.franchises"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """careerrs""","""controllers.ContentController.careers"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """career""","""controllers.ContentController.saveCareer"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """enquiry""","""controllers.ContentController.saveEnquiry"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """franchise""","""controllers.ContentController.saveFranchise"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """weeklyreport""","""controllers.ContentController.saveWeeklyReport"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """enquiry/del""","""controllers.ContentController.deleteEnquiry(enquiry:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """franchise/del""","""controllers.ContentController.deleteFranchise(franchise:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """career/del""","""controllers.ContentController.deleteCareer(career:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """weeklyreport/del""","""controllers.ContentController.deleteWeeklyReport(weeklyReport:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:8
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_jsRoutes1(params) => {
   call { 
        invokeHandler(controllers.Application.jsRoutes, HandlerDef(this, "controllers.Application", "jsRoutes", Nil,"GET", """""", Routes.prefix + """assets/javascript/routes.js"""))
   }
}
        

// @LINE:11
case controllers_Application_user_account2(params) => {
   call { 
        invokeHandler(controllers.Application.user_account, HandlerDef(this, "controllers.Application", "user_account", Nil,"GET", """""", Routes.prefix + """account"""))
   }
}
        

// @LINE:13
case controllers_Application_login3(params) => {
   call { 
        invokeHandler(controllers.Application.login, HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:14
case controllers_Application_doLogin4(params) => {
   call { 
        invokeHandler(controllers.Application.doLogin, HandlerDef(this, "controllers.Application", "doLogin", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:16
case com_feth_play_module_pa_controllers_Authenticate_logout5(params) => {
   call { 
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.logout, HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:17
case com_feth_play_module_pa_controllers_Authenticate_authenticate6(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>"""))
   }
}
        

// @LINE:19
case controllers_Application_signup7(params) => {
   call { 
        invokeHandler(controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:20
case controllers_Application_doSignup8(params) => {
   call { 
        invokeHandler(controllers.Application.doSignup, HandlerDef(this, "controllers.Application", "doSignup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:22
case controllers_Signup_unverified9(params) => {
   call { 
        invokeHandler(controllers.Signup.unverified, HandlerDef(this, "controllers.Signup", "unverified", Nil,"GET", """""", Routes.prefix + """accounts/unverified"""))
   }
}
        

// @LINE:23
case controllers_Signup_oAuthDenied10(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]),"GET", """""", Routes.prefix + """authenticate/$provider<[^/]+>/denied"""))
   }
}
        

// @LINE:25
case controllers_Signup_verify11(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/verify/$token<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Signup_exists12(params) => {
   call { 
        invokeHandler(controllers.Signup.exists, HandlerDef(this, "controllers.Signup", "exists", Nil,"GET", """""", Routes.prefix + """accounts/exists"""))
   }
}
        

// @LINE:28
case controllers_Signup_resetPassword13(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """accounts/password/reset/$token<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Signup_doResetPassword14(params) => {
   call { 
        invokeHandler(controllers.Signup.doResetPassword, HandlerDef(this, "controllers.Signup", "doResetPassword", Nil,"POST", """""", Routes.prefix + """accounts/password/reset"""))
   }
}
        

// @LINE:31
case controllers_Account_changePassword15(params) => {
   call { 
        invokeHandler(controllers.Account.changePassword, HandlerDef(this, "controllers.Account", "changePassword", Nil,"GET", """""", Routes.prefix + """accounts/password/change"""))
   }
}
        

// @LINE:32
case controllers_Account_doChangePassword16(params) => {
   call { 
        invokeHandler(controllers.Account.doChangePassword, HandlerDef(this, "controllers.Account", "doChangePassword", Nil,"POST", """""", Routes.prefix + """accounts/password/change"""))
   }
}
        

// @LINE:34
case controllers_Account_verifyEmail17(params) => {
   call { 
        invokeHandler(controllers.Account.verifyEmail, HandlerDef(this, "controllers.Account", "verifyEmail", Nil,"GET", """""", Routes.prefix + """accounts/verify"""))
   }
}
        

// @LINE:36
case controllers_Account_link18(params) => {
   call { 
        invokeHandler(controllers.Account.link, HandlerDef(this, "controllers.Account", "link", Nil,"GET", """""", Routes.prefix + """accounts/add"""))
   }
}
        

// @LINE:38
case controllers_Account_askLink19(params) => {
   call { 
        invokeHandler(controllers.Account.askLink, HandlerDef(this, "controllers.Account", "askLink", Nil,"GET", """""", Routes.prefix + """accounts/link"""))
   }
}
        

// @LINE:39
case controllers_Account_doLink20(params) => {
   call { 
        invokeHandler(controllers.Account.doLink, HandlerDef(this, "controllers.Account", "doLink", Nil,"POST", """""", Routes.prefix + """accounts/link"""))
   }
}
        

// @LINE:41
case controllers_Account_askMerge21(params) => {
   call { 
        invokeHandler(controllers.Account.askMerge, HandlerDef(this, "controllers.Account", "askMerge", Nil,"GET", """""", Routes.prefix + """accounts/merge"""))
   }
}
        

// @LINE:42
case controllers_Account_doMerge22(params) => {
   call { 
        invokeHandler(controllers.Account.doMerge, HandlerDef(this, "controllers.Account", "doMerge", Nil,"POST", """""", Routes.prefix + """accounts/merge"""))
   }
}
        

// @LINE:44
case controllers_Signup_forgotPassword23(params) => {
   call(params.fromQuery[String]("email", Some(""))) { (email) =>
        invokeHandler(controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]),"GET", """""", Routes.prefix + """login/password/forgot"""))
   }
}
        

// @LINE:45
case controllers_Signup_doForgotPassword24(params) => {
   call { 
        invokeHandler(controllers.Signup.doForgotPassword, HandlerDef(this, "controllers.Signup", "doForgotPassword", Nil,"POST", """""", Routes.prefix + """login/password/forgot"""))
   }
}
        

// @LINE:46
case controllers_Application_signupAdmin25(params) => {
   call { 
        invokeHandler(controllers.Application.signupAdmin, HandlerDef(this, "controllers.Application", "signupAdmin", Nil,"GET", """""", Routes.prefix + """signupadmin"""))
   }
}
        

// @LINE:47
case controllers_Application_notfound26(params) => {
   call { 
        invokeHandler(controllers.Application.notfound, HandlerDef(this, "controllers.Application", "notfound", Nil,"GET", """""", Routes.prefix + """404"""))
   }
}
        

// @LINE:51
case controllers_Application_about27(params) => {
   call { 
        invokeHandler(controllers.Application.about, HandlerDef(this, "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:52
case controllers_Application_contact28(params) => {
   call { 
        invokeHandler(controllers.Application.contact, HandlerDef(this, "controllers.Application", "contact", Nil,"GET", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:57
case controllers_ContentController_enquiry29(params) => {
   call { 
        invokeHandler(controllers.ContentController.enquiry, HandlerDef(this, "controllers.ContentController", "enquiry", Nil,"GET", """Content""", Routes.prefix + """enquiry"""))
   }
}
        

// @LINE:58
case controllers_ContentController_franchise30(params) => {
   call { 
        invokeHandler(controllers.ContentController.franchise, HandlerDef(this, "controllers.ContentController", "franchise", Nil,"GET", """""", Routes.prefix + """franchise"""))
   }
}
        

// @LINE:59
case controllers_ContentController_career31(params) => {
   call { 
        invokeHandler(controllers.ContentController.career, HandlerDef(this, "controllers.ContentController", "career", Nil,"GET", """""", Routes.prefix + """career"""))
   }
}
        

// @LINE:60
case controllers_ContentController_weeklyReport32(params) => {
   call { 
        invokeHandler(controllers.ContentController.weeklyReport, HandlerDef(this, "controllers.ContentController", "weeklyReport", Nil,"GET", """""", Routes.prefix + """weeklyreport"""))
   }
}
        

// @LINE:61
case controllers_ContentController_enquiries33(params) => {
   call { 
        invokeHandler(controllers.ContentController.enquiries, HandlerDef(this, "controllers.ContentController", "enquiries", Nil,"GET", """""", Routes.prefix + """enquiries"""))
   }
}
        

// @LINE:62
case controllers_ContentController_franchises34(params) => {
   call { 
        invokeHandler(controllers.ContentController.franchises, HandlerDef(this, "controllers.ContentController", "franchises", Nil,"GET", """""", Routes.prefix + """franchises"""))
   }
}
        

// @LINE:63
case controllers_ContentController_careers35(params) => {
   call { 
        invokeHandler(controllers.ContentController.careers, HandlerDef(this, "controllers.ContentController", "careers", Nil,"GET", """""", Routes.prefix + """careerrs"""))
   }
}
        

// @LINE:65
case controllers_ContentController_saveCareer36(params) => {
   call { 
        invokeHandler(controllers.ContentController.saveCareer, HandlerDef(this, "controllers.ContentController", "saveCareer", Nil,"POST", """""", Routes.prefix + """career"""))
   }
}
        

// @LINE:66
case controllers_ContentController_saveEnquiry37(params) => {
   call { 
        invokeHandler(controllers.ContentController.saveEnquiry, HandlerDef(this, "controllers.ContentController", "saveEnquiry", Nil,"POST", """""", Routes.prefix + """enquiry"""))
   }
}
        

// @LINE:67
case controllers_ContentController_saveFranchise38(params) => {
   call { 
        invokeHandler(controllers.ContentController.saveFranchise, HandlerDef(this, "controllers.ContentController", "saveFranchise", Nil,"POST", """""", Routes.prefix + """franchise"""))
   }
}
        

// @LINE:68
case controllers_ContentController_saveWeeklyReport39(params) => {
   call { 
        invokeHandler(controllers.ContentController.saveWeeklyReport, HandlerDef(this, "controllers.ContentController", "saveWeeklyReport", Nil,"POST", """""", Routes.prefix + """weeklyreport"""))
   }
}
        

// @LINE:70
case controllers_ContentController_deleteEnquiry40(params) => {
   call(params.fromQuery[String]("enquiry", None)) { (enquiry) =>
        invokeHandler(controllers.ContentController.deleteEnquiry(enquiry), HandlerDef(this, "controllers.ContentController", "deleteEnquiry", Seq(classOf[String]),"GET", """""", Routes.prefix + """enquiry/del"""))
   }
}
        

// @LINE:71
case controllers_ContentController_deleteFranchise41(params) => {
   call(params.fromQuery[String]("franchise", None)) { (franchise) =>
        invokeHandler(controllers.ContentController.deleteFranchise(franchise), HandlerDef(this, "controllers.ContentController", "deleteFranchise", Seq(classOf[String]),"GET", """""", Routes.prefix + """franchise/del"""))
   }
}
        

// @LINE:72
case controllers_ContentController_deleteCareer42(params) => {
   call(params.fromQuery[String]("career", None)) { (career) =>
        invokeHandler(controllers.ContentController.deleteCareer(career), HandlerDef(this, "controllers.ContentController", "deleteCareer", Seq(classOf[String]),"GET", """""", Routes.prefix + """career/del"""))
   }
}
        

// @LINE:73
case controllers_ContentController_deleteWeeklyReport43(params) => {
   call(params.fromQuery[String]("weeklyReport", None)) { (weeklyReport) =>
        invokeHandler(controllers.ContentController.deleteWeeklyReport(weeklyReport), HandlerDef(this, "controllers.ContentController", "deleteWeeklyReport", Seq(classOf[String]),"GET", """""", Routes.prefix + """weeklyreport/del"""))
   }
}
        

// @LINE:78
case controllers_Assets_at44(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     