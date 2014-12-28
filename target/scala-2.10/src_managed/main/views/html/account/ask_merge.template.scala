
package views.html.account

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
object ask_merge extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(acceptForm: Form[Account.Accept], aUser: com.feth.play.module.pa.user.AuthUser, bUser: com.feth.play.module.pa.user.AuthUser):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/label/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(Seq[Any](/*7.3*/Messages("playauthenticate.merge.accounts.question",aUser,bUser))),format.raw/*7.67*/("""
""")))};
Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(Messages("playauthenticate.merge.accounts.title"))/*10.57*/ {_display_(Seq[Any](format.raw/*10.59*/("""

	<h1>"""),_display_(Seq[Any](/*12.7*/Messages("playauthenticate.merge.accounts.title"))),format.raw/*12.56*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*14.3*/form(routes.Account.doMerge)/*14.31*/ {_display_(Seq[Any](format.raw/*14.33*/("""

            """),_display_(Seq[Any](/*16.14*/if(acceptForm.hasGlobalErrors)/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*18.52*/acceptForm/*18.62*/.globalError.message)),format.raw/*18.82*/("""</span>
		        </p>
            """)))})),format.raw/*20.14*/("""
	   
	   """),_display_(Seq[Any](/*22.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.merge.accounts.true"),
            	"false"->Messages("playauthenticate.merge.accounts.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        ))),format.raw/*30.10*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*32.32*/Messages("playauthenticate.merge.accounts.ok"))),format.raw/*32.78*/("""" class="btn btn-primary">
	""")))})),format.raw/*33.3*/("""
	</p>
""")))})))}
    }
    
    def render(acceptForm:Form[Account.Accept],aUser:com.feth.play.module.pa.user.AuthUser,bUser:com.feth.play.module.pa.user.AuthUser): play.api.templates.HtmlFormat.Appendable = apply(acceptForm,aUser,bUser)
    
    def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,com.feth.play.module.pa.user.AuthUser) => play.api.templates.HtmlFormat.Appendable) = (acceptForm,aUser,bUser) => apply(acceptForm,aUser,bUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:29 IST 2014
                    SOURCE: W:/Pre School/app/views/account/ask_merge.scala.html
                    HASH: 6ff4d322a932ee187ac859e9f1bc38a6b1a57e19
                    MATRIX: 876->1|1131->187|1143->192|1227->196|1265->200|1350->264|1393->127|1423->184|1451->267|1491->272|1555->327|1595->329|1640->339|1711->388|1761->403|1798->431|1838->433|1891->450|1930->480|1970->482|2095->571|2114->581|2156->601|2226->639|2274->652|2619->975|2701->1021|2769->1067|2830->1097
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|49->18|51->20|53->22|61->30|63->32|63->32|64->33
                    -- GENERATED --
                */
            