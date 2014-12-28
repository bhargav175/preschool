
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

def /*7.6*/scripts/*7.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.17*/("""

    """)))};def /*10.6*/scriptsTop/*10.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.20*/("""

    """)))};def /*13.6*/links/*13.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.15*/("""

        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

    """)))};
Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*5.1*/("""

    """),format.raw/*9.6*/("""
    """),format.raw/*12.6*/("""
    """),format.raw/*17.6*/("""
    """),_display_(Seq[Any](/*18.6*/template_user_account_info(Messages("playauthenticate.login.title"), "login", scriptsTop, scripts, links)/*18.111*/ {_display_(Seq[Any](format.raw/*18.113*/("""
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
	<legend>"""),_display_(Seq[Any](/*31.11*/Messages("playauthenticate.password.forgot.title"))),format.raw/*31.61*/("""</legend>

	<p>
	"""),_display_(Seq[Any](/*34.3*/form(routes.Signup.doForgotPassword)/*34.39*/ {_display_(Seq[Any](format.raw/*34.41*/("""
	   
            """),_display_(Seq[Any](/*36.14*/if(emailForm.hasGlobalErrors)/*36.43*/ {_display_(Seq[Any](format.raw/*36.45*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*38.52*/emailForm/*38.61*/.globalError.message)),format.raw/*38.81*/("""</span>
		        </p>
            """)))})),format.raw/*40.14*/("""
	   
	   """),_display_(Seq[Any](/*42.6*/_emailPartial(emailForm))),format.raw/*42.30*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*44.32*/Messages("playauthenticate.password.forgot.cta"))),format.raw/*44.80*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*45.3*/("""
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
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/signup/password_forgot.scala.html
                    HASH: e0e9303097f9814b6eb1c25fc0702e28f974f660
                    MATRIX: 850->1|1049->137|1064->144|1148->148|1180->164|1199->174|1284->178|1316->194|1330->199|1415->203|1571->71|1601->128|1635->157|1668->187|1701->320|1743->327|1858->432|1899->434|2545->1044|2617->1094|2673->1115|2718->1151|2758->1153|2815->1174|2853->1203|2893->1205|3018->1294|3036->1303|3078->1323|3148->1361|3196->1374|3242->1398|3324->1444|3394->1492|3456->1523
                    LINES: 26->1|31->7|31->7|33->7|35->10|35->10|37->10|39->13|39->13|41->13|46->1|48->5|50->9|51->12|52->17|53->18|53->18|53->18|66->31|66->31|69->34|69->34|69->34|71->36|71->36|71->36|73->38|73->38|73->38|75->40|77->42|77->42|79->44|79->44|80->45
                    -- GENERATED --
                */
            