
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
object password_reset extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[controllers.Signup.PasswordReset],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(resetForm: Form[controllers.Signup.PasswordReset]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*5.1*/("""
    """),_display_(Seq[Any](/*6.6*/main("link")/*6.18*/ {_display_(Seq[Any](format.raw/*6.20*/("""
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

	<legend>"""),_display_(Seq[Any](/*20.11*/Messages("playauthenticate.password.reset.title"))),format.raw/*20.60*/("""</legend>
	<p>
	"""),_display_(Seq[Any](/*22.3*/form(routes.Signup.doResetPassword)/*22.38*/ {_display_(Seq[Any](format.raw/*22.40*/("""
	   
       """),_display_(Seq[Any](/*24.9*/if(resetForm.hasGlobalErrors)/*24.38*/ {_display_(Seq[Any](format.raw/*24.40*/(""" 
        <p class="error">
          <span class="label label-important">"""),_display_(Seq[Any](/*26.48*/resetForm/*26.57*/.globalError.message)),format.raw/*26.77*/("""</span>
     	</p>
       """)))})),format.raw/*28.9*/("""
       
        """),_display_(Seq[Any](/*30.10*/input(
   			resetForm("token"),
   			'_label -> "",
   			'_showConstraints -> false
   		
   		)/*35.7*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*35.36*/("""
		    <input type="hidden" value=""""),_display_(Seq[Any](/*36.36*/value)),format.raw/*36.41*/("""" name=""""),_display_(Seq[Any](/*36.50*/name)),format.raw/*36.54*/("""" id=""""),_display_(Seq[Any](/*36.61*/id)),format.raw/*36.63*/("""" """),_display_(Seq[Any](/*36.66*/toHtmlArgs(args))),format.raw/*36.82*/(""">
		""")))})),format.raw/*37.4*/("""
	   
	   """),_display_(Seq[Any](/*39.6*/_passwordPartial(resetForm))),format.raw/*39.33*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*41.32*/Messages("playauthenticate.password.reset.cta"))),format.raw/*41.79*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*42.3*/("""
	</p>
                    </div>
                </div>
            </div>
""")))})))}
    }
    
    def render(resetForm:Form[controllers.Signup.PasswordReset]): play.api.templates.HtmlFormat.Appendable = apply(resetForm)
    
    def f:((Form[controllers.Signup.PasswordReset]) => play.api.templates.HtmlFormat.Appendable) = (resetForm) => apply(resetForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/signup/password_reset.scala.html
                    HASH: 2aaacf6ce3b3492ae5207c62cbc6fbf0d97a95ff
                    MATRIX: 830->1|1027->52|1057->109|1098->116|1118->128|1157->130|1761->698|1832->747|1886->766|1930->801|1970->803|2021->819|2059->848|2099->850|2212->927|2230->936|2272->956|2332->985|2388->1005|2500->1109|2567->1138|2640->1175|2667->1180|2712->1189|2738->1193|2781->1200|2805->1202|2844->1205|2882->1221|2919->1227|2967->1240|3016->1267|3098->1313|3167->1360|3229->1391
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|49->20|49->20|51->22|51->22|51->22|53->24|53->24|53->24|55->26|55->26|55->26|57->28|59->30|64->35|64->35|65->36|65->36|65->36|65->36|65->36|65->36|65->36|65->36|66->37|68->39|68->39|70->41|70->41|71->42
                    -- GENERATED --
                */
            