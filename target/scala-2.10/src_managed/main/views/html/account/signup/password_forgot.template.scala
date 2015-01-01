
package views.html.account.signup

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object password_forgot extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[providers.MyUsernamePasswordAuthProvider.MyIdentity],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(emailForm: Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*5.1*/("""

    """),_display_(Seq[Any](/*7.6*/main("link")/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
        <div class="uauth col-md-offset-2 col-md-8">
            <div class="modal-content animated fadeInLeft">
                <div class="modal-header">
                    <div class="col-md-12">
                        <h3><a href="home">The Civil Servant</a></h3>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="modal-content animated fadeInLeft">
                <div class="modal-body" style="overflow : hidden">
                    <div class="container-fluid modal-body-container">
	<legend>"""),_display_(Seq[Any](/*20.11*/Messages("playauthenticate.password.forgot.title"))),format.raw/*20.61*/("""</legend>

	<p>
	"""),_display_(Seq[Any](/*23.3*/form(routes.Signup.doForgotPassword)/*23.39*/ {_display_(Seq[Any](format.raw/*23.41*/("""
	   
            """),_display_(Seq[Any](/*25.14*/if(emailForm.hasGlobalErrors)/*25.43*/ {_display_(Seq[Any](format.raw/*25.45*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*27.52*/emailForm/*27.61*/.globalError.message)),format.raw/*27.81*/("""</span>
		        </p>
            """)))})),format.raw/*29.14*/("""
	   
	   """),_display_(Seq[Any](/*31.6*/_emailPartial(emailForm))),format.raw/*31.30*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*33.32*/Messages("playauthenticate.password.forgot.cta"))),format.raw/*33.80*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*34.3*/("""
	</p>
                        </div>
                    </div>
                </div>
            </div>
""")))})))}
    }
    
    def render(emailForm:Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]): play.api.templates.HtmlFormat.Appendable = apply(emailForm)
    
    def f:((Form[providers.MyUsernamePasswordAuthProvider.MyIdentity]) => play.api.templates.HtmlFormat.Appendable) = (emailForm) => apply(emailForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/signup/password_forgot.scala.html
                    HASH: 0c91a500f9a434335671095731b00482f824fc37
                    MATRIX: 850->1|1066->71|1096->128|1139->137|1159->149|1198->151|1844->761|1916->811|1972->832|2017->868|2057->870|2114->891|2152->920|2192->922|2317->1011|2335->1020|2377->1040|2447->1078|2495->1091|2541->1115|2623->1161|2693->1209|2755->1240
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|49->20|49->20|52->23|52->23|52->23|54->25|54->25|54->25|56->27|56->27|56->27|58->29|60->31|60->31|62->33|62->33|63->34
                    -- GENERATED --
                */
            