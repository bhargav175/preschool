// @SOURCE:W:/Pre School/conf/routes
// @HASH:634b9baf9a30150472c1d7c13d439ef8ec3e76bf
// @DATE:Fri Jan 02 04:02:07 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:16
package com.feth.play.module.pa.controllers {

// @LINE:17
// @LINE:16
class ReverseAuthenticate {
    

// @LINE:16
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:17
def authenticate(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)))
}
                                                
    
}
                          
}
                  

// @LINE:78
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:52
// @LINE:51
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
package controllers {

// @LINE:78
class ReverseAssets {
    

// @LINE:78
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
class ReverseContentController {
    

// @LINE:73
def deleteWeeklyReport(weeklyReport:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "weeklyreport/del" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("weeklyReport", weeklyReport)))))
}
                                                

// @LINE:65
def saveCareer(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "career")
}
                                                

// @LINE:71
def deleteFranchise(franchise:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "franchise/del" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("franchise", franchise)))))
}
                                                

// @LINE:63
def careers(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "careerrs")
}
                                                

// @LINE:72
def deleteCareer(career:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "career/del" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("career", career)))))
}
                                                

// @LINE:59
def career(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "career")
}
                                                

// @LINE:68
def saveWeeklyReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "weeklyreport")
}
                                                

// @LINE:66
def saveEnquiry(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "enquiry")
}
                                                

// @LINE:62
def franchises(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "franchises")
}
                                                

// @LINE:61
def enquiries(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "enquiries")
}
                                                

// @LINE:57
def enquiry(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "enquiry")
}
                                                

// @LINE:60
def weeklyReport(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "weeklyreport")
}
                                                

// @LINE:58
def franchise(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "franchise")
}
                                                

// @LINE:67
def saveFranchise(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "franchise")
}
                                                

// @LINE:70
def deleteEnquiry(enquiry:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "enquiry/del" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("enquiry", enquiry)))))
}
                                                
    
}
                          

// @LINE:52
// @LINE:51
// @LINE:47
// @LINE:46
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:20
def doSignup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:46
def signupAdmin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signupadmin")
}
                                                

// @LINE:11
def user_account(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "account")
}
                                                

// @LINE:9
def jsRoutes(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/javascript/routes.js")
}
                                                

// @LINE:19
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:51
def about(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                                                

// @LINE:14
def doLogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:47
def notfound(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "404")
}
                                                

// @LINE:8
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:52
def contact(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                                                

// @LINE:13
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
class ReverseSignup {
    

// @LINE:26
def exists(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/exists")
}
                                                

// @LINE:25
def verify(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:22
def unverified(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/unverified")
}
                                                

// @LINE:23
def oAuthDenied(provider:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "authenticate/" + implicitly[PathBindable[String]].unbind("provider", dynamicString(provider)) + "/denied")
}
                                                

// @LINE:28
def resetPassword(token:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/reset/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
}
                                                

// @LINE:29
def doResetPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/reset")
}
                                                

// @LINE:45
def doForgotPassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/password/forgot")
}
                                                

// @LINE:44
def forgotPassword(email:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/password/forgot" + queryString(List(if(email == "") None else Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
}
                                                
    
}
                          

// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
class ReverseAccount {
    

// @LINE:41
def askMerge(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:42
def doMerge(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/merge")
}
                                                

// @LINE:34
def verifyEmail(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/verify")
}
                                                

// @LINE:38
def askLink(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:39
def doLink(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/link")
}
                                                

// @LINE:31
def changePassword(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                

// @LINE:36
def link(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accounts/add")
}
                                                

// @LINE:32
def doChangePassword(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accounts/password/change")
}
                                                
    
}
                          
}
                  


// @LINE:17
// @LINE:16
package com.feth.play.module.pa.controllers.javascript {

// @LINE:17
// @LINE:16
class ReverseAuthenticate {
    

// @LINE:16
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:17
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "com.feth.play.module.pa.controllers.Authenticate.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
      }
   """
)
                        
    
}
              
}
        

// @LINE:78
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:52
// @LINE:51
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
package controllers.javascript {

// @LINE:78
class ReverseAssets {
    

// @LINE:78
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
class ReverseContentController {
    

// @LINE:73
def deleteWeeklyReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.deleteWeeklyReport",
   """
      function(weeklyReport) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "weeklyreport/del" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("weeklyReport", weeklyReport)])})
      }
   """
)
                        

// @LINE:65
def saveCareer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.saveCareer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "career"})
      }
   """
)
                        

// @LINE:71
def deleteFranchise : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.deleteFranchise",
   """
      function(franchise) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "franchise/del" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("franchise", franchise)])})
      }
   """
)
                        

// @LINE:63
def careers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.careers",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "careerrs"})
      }
   """
)
                        

// @LINE:72
def deleteCareer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.deleteCareer",
   """
      function(career) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "career/del" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("career", career)])})
      }
   """
)
                        

// @LINE:59
def career : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.career",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "career"})
      }
   """
)
                        

// @LINE:68
def saveWeeklyReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.saveWeeklyReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "weeklyreport"})
      }
   """
)
                        

// @LINE:66
def saveEnquiry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.saveEnquiry",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "enquiry"})
      }
   """
)
                        

// @LINE:62
def franchises : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.franchises",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "franchises"})
      }
   """
)
                        

// @LINE:61
def enquiries : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.enquiries",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enquiries"})
      }
   """
)
                        

// @LINE:57
def enquiry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.enquiry",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enquiry"})
      }
   """
)
                        

// @LINE:60
def weeklyReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.weeklyReport",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "weeklyreport"})
      }
   """
)
                        

// @LINE:58
def franchise : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.franchise",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "franchise"})
      }
   """
)
                        

// @LINE:67
def saveFranchise : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.saveFranchise",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "franchise"})
      }
   """
)
                        

// @LINE:70
def deleteEnquiry : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ContentController.deleteEnquiry",
   """
      function(enquiry) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enquiry/del" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("enquiry", enquiry)])})
      }
   """
)
                        
    
}
              

// @LINE:52
// @LINE:51
// @LINE:47
// @LINE:46
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:20
def doSignup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doSignup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:46
def signupAdmin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signupAdmin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signupadmin"})
      }
   """
)
                        

// @LINE:11
def user_account : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.user_account",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account"})
      }
   """
)
                        

// @LINE:9
def jsRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsRoutes",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/javascript/routes.js"})
      }
   """
)
                        

// @LINE:19
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:51
def about : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

// @LINE:14
def doLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.doLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:47
def notfound : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.notfound",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "404"})
      }
   """
)
                        

// @LINE:8
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:52
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

// @LINE:13
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
class ReverseSignup {
    

// @LINE:26
def exists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.exists",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/exists"})
      }
   """
)
                        

// @LINE:25
def verify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.verify",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:22
def unverified : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.unverified",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/unverified"})
      }
   """
)
                        

// @LINE:23
def oAuthDenied : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.oAuthDenied",
   """
      function(provider) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider)) + "/denied"})
      }
   """
)
                        

// @LINE:28
def resetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
      }
   """
)
                        

// @LINE:29
def doResetPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/reset"})
      }
   """
)
                        

// @LINE:45
def doForgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.doForgotPassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot"})
      }
   """
)
                        

// @LINE:44
def forgotPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Signup.forgotPassword",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/password/forgot" + _qS([(email == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email))])})
      }
   """
)
                        
    
}
              

// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
class ReverseAccount {
    

// @LINE:41
def askMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askMerge",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:42
def doMerge : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doMerge",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/merge"})
      }
   """
)
                        

// @LINE:34
def verifyEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.verifyEmail",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/verify"})
      }
   """
)
                        

// @LINE:38
def askLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.askLink",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:39
def doLink : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doLink",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/link"})
      }
   """
)
                        

// @LINE:31
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.changePassword",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        

// @LINE:36
def link : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.link",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/add"})
      }
   """
)
                        

// @LINE:32
def doChangePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Account.doChangePassword",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accounts/password/change"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:17
// @LINE:16
package com.feth.play.module.pa.controllers.ref {


// @LINE:17
// @LINE:16
class ReverseAuthenticate {
    

// @LINE:16
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.logout(), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:17
def authenticate(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   com.feth.play.module.pa.controllers.Authenticate.authenticate(provider), HandlerDef(this, "com.feth.play.module.pa.controllers.Authenticate", "authenticate", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>""")
)
                      
    
}
                          
}
        

// @LINE:78
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
// @LINE:52
// @LINE:51
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
package controllers.ref {


// @LINE:78
class ReverseAssets {
    

// @LINE:78
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:70
// @LINE:68
// @LINE:67
// @LINE:66
// @LINE:65
// @LINE:63
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:58
// @LINE:57
class ReverseContentController {
    

// @LINE:73
def deleteWeeklyReport(weeklyReport:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.deleteWeeklyReport(weeklyReport), HandlerDef(this, "controllers.ContentController", "deleteWeeklyReport", Seq(classOf[String]), "GET", """""", _prefix + """weeklyreport/del""")
)
                      

// @LINE:65
def saveCareer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.saveCareer(), HandlerDef(this, "controllers.ContentController", "saveCareer", Seq(), "POST", """""", _prefix + """career""")
)
                      

// @LINE:71
def deleteFranchise(franchise:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.deleteFranchise(franchise), HandlerDef(this, "controllers.ContentController", "deleteFranchise", Seq(classOf[String]), "GET", """""", _prefix + """franchise/del""")
)
                      

// @LINE:63
def careers(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.careers(), HandlerDef(this, "controllers.ContentController", "careers", Seq(), "GET", """""", _prefix + """careerrs""")
)
                      

// @LINE:72
def deleteCareer(career:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.deleteCareer(career), HandlerDef(this, "controllers.ContentController", "deleteCareer", Seq(classOf[String]), "GET", """""", _prefix + """career/del""")
)
                      

// @LINE:59
def career(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.career(), HandlerDef(this, "controllers.ContentController", "career", Seq(), "GET", """""", _prefix + """career""")
)
                      

// @LINE:68
def saveWeeklyReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.saveWeeklyReport(), HandlerDef(this, "controllers.ContentController", "saveWeeklyReport", Seq(), "POST", """""", _prefix + """weeklyreport""")
)
                      

// @LINE:66
def saveEnquiry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.saveEnquiry(), HandlerDef(this, "controllers.ContentController", "saveEnquiry", Seq(), "POST", """""", _prefix + """enquiry""")
)
                      

// @LINE:62
def franchises(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.franchises(), HandlerDef(this, "controllers.ContentController", "franchises", Seq(), "GET", """""", _prefix + """franchises""")
)
                      

// @LINE:61
def enquiries(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.enquiries(), HandlerDef(this, "controllers.ContentController", "enquiries", Seq(), "GET", """""", _prefix + """enquiries""")
)
                      

// @LINE:57
def enquiry(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.enquiry(), HandlerDef(this, "controllers.ContentController", "enquiry", Seq(), "GET", """Content""", _prefix + """enquiry""")
)
                      

// @LINE:60
def weeklyReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.weeklyReport(), HandlerDef(this, "controllers.ContentController", "weeklyReport", Seq(), "GET", """""", _prefix + """weeklyreport""")
)
                      

// @LINE:58
def franchise(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.franchise(), HandlerDef(this, "controllers.ContentController", "franchise", Seq(), "GET", """""", _prefix + """franchise""")
)
                      

// @LINE:67
def saveFranchise(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.saveFranchise(), HandlerDef(this, "controllers.ContentController", "saveFranchise", Seq(), "POST", """""", _prefix + """franchise""")
)
                      

// @LINE:70
def deleteEnquiry(enquiry:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ContentController.deleteEnquiry(enquiry), HandlerDef(this, "controllers.ContentController", "deleteEnquiry", Seq(classOf[String]), "GET", """""", _prefix + """enquiry/del""")
)
                      
    
}
                          

// @LINE:52
// @LINE:51
// @LINE:47
// @LINE:46
// @LINE:20
// @LINE:19
// @LINE:14
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:8
class ReverseApplication {
    

// @LINE:20
def doSignup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doSignup(), HandlerDef(this, "controllers.Application", "doSignup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:46
def signupAdmin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signupAdmin(), HandlerDef(this, "controllers.Application", "signupAdmin", Seq(), "GET", """""", _prefix + """signupadmin""")
)
                      

// @LINE:11
def user_account(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.user_account(), HandlerDef(this, "controllers.Application", "user_account", Seq(), "GET", """""", _prefix + """account""")
)
                      

// @LINE:9
def jsRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsRoutes(), HandlerDef(this, "controllers.Application", "jsRoutes", Seq(), "GET", """""", _prefix + """assets/javascript/routes.js""")
)
                      

// @LINE:19
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:51
def about(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq(), "GET", """""", _prefix + """about""")
)
                      

// @LINE:14
def doLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.doLogin(), HandlerDef(this, "controllers.Application", "doLogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:47
def notfound(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.notfound(), HandlerDef(this, "controllers.Application", "notfound", Seq(), "GET", """""", _prefix + """404""")
)
                      

// @LINE:8
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:52
def contact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq(), "GET", """""", _prefix + """contact""")
)
                      

// @LINE:13
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:45
// @LINE:44
// @LINE:29
// @LINE:28
// @LINE:26
// @LINE:25
// @LINE:23
// @LINE:22
class ReverseSignup {
    

// @LINE:26
def exists(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.exists(), HandlerDef(this, "controllers.Signup", "exists", Seq(), "GET", """""", _prefix + """accounts/exists""")
)
                      

// @LINE:25
def verify(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.verify(token), HandlerDef(this, "controllers.Signup", "verify", Seq(classOf[String]), "GET", """""", _prefix + """accounts/verify/$token<[^/]+>""")
)
                      

// @LINE:22
def unverified(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.unverified(), HandlerDef(this, "controllers.Signup", "unverified", Seq(), "GET", """""", _prefix + """accounts/unverified""")
)
                      

// @LINE:23
def oAuthDenied(provider:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.oAuthDenied(provider), HandlerDef(this, "controllers.Signup", "oAuthDenied", Seq(classOf[String]), "GET", """""", _prefix + """authenticate/$provider<[^/]+>/denied""")
)
                      

// @LINE:28
def resetPassword(token:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.resetPassword(token), HandlerDef(this, "controllers.Signup", "resetPassword", Seq(classOf[String]), "GET", """""", _prefix + """accounts/password/reset/$token<[^/]+>""")
)
                      

// @LINE:29
def doResetPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doResetPassword(), HandlerDef(this, "controllers.Signup", "doResetPassword", Seq(), "POST", """""", _prefix + """accounts/password/reset""")
)
                      

// @LINE:45
def doForgotPassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.doForgotPassword(), HandlerDef(this, "controllers.Signup", "doForgotPassword", Seq(), "POST", """""", _prefix + """login/password/forgot""")
)
                      

// @LINE:44
def forgotPassword(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Signup.forgotPassword(email), HandlerDef(this, "controllers.Signup", "forgotPassword", Seq(classOf[String]), "GET", """""", _prefix + """login/password/forgot""")
)
                      
    
}
                          

// @LINE:42
// @LINE:41
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:31
class ReverseAccount {
    

// @LINE:41
def askMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askMerge(), HandlerDef(this, "controllers.Account", "askMerge", Seq(), "GET", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:42
def doMerge(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doMerge(), HandlerDef(this, "controllers.Account", "doMerge", Seq(), "POST", """""", _prefix + """accounts/merge""")
)
                      

// @LINE:34
def verifyEmail(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.verifyEmail(), HandlerDef(this, "controllers.Account", "verifyEmail", Seq(), "GET", """""", _prefix + """accounts/verify""")
)
                      

// @LINE:38
def askLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.askLink(), HandlerDef(this, "controllers.Account", "askLink", Seq(), "GET", """""", _prefix + """accounts/link""")
)
                      

// @LINE:39
def doLink(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doLink(), HandlerDef(this, "controllers.Account", "doLink", Seq(), "POST", """""", _prefix + """accounts/link""")
)
                      

// @LINE:31
def changePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.changePassword(), HandlerDef(this, "controllers.Account", "changePassword", Seq(), "GET", """""", _prefix + """accounts/password/change""")
)
                      

// @LINE:36
def link(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.link(), HandlerDef(this, "controllers.Account", "link", Seq(), "GET", """""", _prefix + """accounts/add""")
)
                      

// @LINE:32
def doChangePassword(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Account.doChangePassword(), HandlerDef(this, "controllers.Account", "doChangePassword", Seq(), "POST", """""", _prefix + """accounts/password/change""")
)
                      
    
}
                          
}
        
    