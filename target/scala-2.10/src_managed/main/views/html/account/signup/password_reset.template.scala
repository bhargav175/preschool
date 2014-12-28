
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

def /*6.6*/scripts/*6.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.17*/("""

    """)))};def /*9.6*/scriptsTop/*9.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.20*/("""

    """)))};def /*12.6*/links/*12.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.15*/("""

        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

    """)))};
Seq[Any](format.raw/*1.53*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*8.6*/("""
    """),format.raw/*11.6*/("""
    """),format.raw/*16.6*/("""
    """),_display_(Seq[Any](/*17.6*/template_user_account_info(Messages("playauthenticate.login.title"), "login", scriptsTop, scripts, links)/*17.111*/ {_display_(Seq[Any](format.raw/*17.113*/("""
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

	<legend>"""),_display_(Seq[Any](/*31.11*/Messages("playauthenticate.password.reset.title"))),format.raw/*31.60*/("""</legend>
	<p>
	"""),_display_(Seq[Any](/*33.3*/form(routes.Signup.doResetPassword)/*33.38*/ {_display_(Seq[Any](format.raw/*33.40*/("""
	   
       """),_display_(Seq[Any](/*35.9*/if(resetForm.hasGlobalErrors)/*35.38*/ {_display_(Seq[Any](format.raw/*35.40*/(""" 
        <p class="error">
          <span class="label label-important">"""),_display_(Seq[Any](/*37.48*/resetForm/*37.57*/.globalError.message)),format.raw/*37.77*/("""</span>
     	</p>
       """)))})),format.raw/*39.9*/("""
       
        """),_display_(Seq[Any](/*41.10*/input(
   			resetForm("token"),
   			'_label -> "",
   			'_showConstraints -> false
   		
   		)/*46.7*/ { (id, name, value, args) =>_display_(Seq[Any](format.raw/*46.36*/("""
		    <input type="hidden" value=""""),_display_(Seq[Any](/*47.36*/value)),format.raw/*47.41*/("""" name=""""),_display_(Seq[Any](/*47.50*/name)),format.raw/*47.54*/("""" id=""""),_display_(Seq[Any](/*47.61*/id)),format.raw/*47.63*/("""" """),_display_(Seq[Any](/*47.66*/toHtmlArgs(args))),format.raw/*47.82*/(""">
		""")))})),format.raw/*48.4*/("""
	   
	   """),_display_(Seq[Any](/*50.6*/_passwordPartial(resetForm))),format.raw/*50.33*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*52.32*/Messages("playauthenticate.password.reset.cta"))),format.raw/*52.79*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*53.3*/("""
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
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/signup/password_reset.scala.html
                    HASH: 856dbaea2047ba5cd9e36927b77e0ed53d49fcbd
                    MATRIX: 830->1|1010->116|1025->123|1109->127|1140->143|1158->153|1242->157|1274->173|1288->178|1373->182|1529->52|1559->109|1591->136|1624->166|1657->299|1699->306|1814->411|1855->413|2455->977|2526->1026|2580->1045|2624->1080|2664->1082|2715->1098|2753->1127|2793->1129|2906->1206|2924->1215|2966->1235|3026->1264|3082->1284|3194->1388|3261->1417|3334->1454|3361->1459|3406->1468|3432->1472|3475->1479|3499->1481|3538->1484|3576->1500|3613->1506|3661->1519|3710->1546|3792->1592|3861->1639|3923->1670
                    LINES: 26->1|31->6|31->6|33->6|35->9|35->9|37->9|39->12|39->12|41->12|46->1|48->5|49->8|50->11|51->16|52->17|52->17|52->17|66->31|66->31|68->33|68->33|68->33|70->35|70->35|70->35|72->37|72->37|72->37|74->39|76->41|81->46|81->46|82->47|82->47|82->47|82->47|82->47|82->47|82->47|82->47|83->48|85->50|85->50|87->52|87->52|88->53
                    -- GENERATED --
                */
            