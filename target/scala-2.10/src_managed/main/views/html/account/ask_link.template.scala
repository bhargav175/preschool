
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
object ask_link extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Account.Accept],com.feth.play.module.pa.user.AuthUser,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(acceptForm: Form[Account.Accept], newAccount: com.feth.play.module.pa.user.AuthUser):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/label/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
	"""),_display_(Seq[Any](/*7.3*/_providerIcon(newAccount.getProvider()))),format.raw/*7.42*/(""" """),_display_(Seq[Any](/*7.44*/Messages("playauthenticate.link.user_account.question",newAccount))),format.raw/*7.110*/("""
""")))};
Seq[Any](format.raw/*1.87*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(Messages("playauthenticate.link.user_account.title"))/*10.60*/ {_display_(Seq[Any](format.raw/*10.62*/("""

	<h1>"""),_display_(Seq[Any](/*12.7*/Messages("playauthenticate.link.user_account.title"))),format.raw/*12.59*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*14.3*/form(routes.Account.doLink)/*14.30*/ {_display_(Seq[Any](format.raw/*14.32*/("""
	   
            """),_display_(Seq[Any](/*16.14*/if(acceptForm.hasGlobalErrors)/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/(""" 
                <p class="error">
		            <span class="label label-important">"""),_display_(Seq[Any](/*18.52*/acceptForm/*18.62*/.globalError.message)),format.raw/*18.82*/("""</span>
		        </p>
            """)))})),format.raw/*20.14*/("""
	   
	   """),_display_(Seq[Any](/*22.6*/inputRadioGroup(
            acceptForm("accept"),
            options = Seq(
            	"true"-> Messages("playauthenticate.link.user_account.true"),
            	"false"->Messages("playauthenticate.link.user_account.false")
            ),
            '_label -> label,
            '_showConstraints -> false
        ))),format.raw/*30.10*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*32.32*/Messages("playauthenticate.link.user_account.ok"))),format.raw/*32.81*/("""" class="btn btn-primary">
	""")))})),format.raw/*33.3*/("""
	</p>
""")))})))}
    }
    
    def render(acceptForm:Form[Account.Accept],newAccount:com.feth.play.module.pa.user.AuthUser): play.api.templates.HtmlFormat.Appendable = apply(acceptForm,newAccount)
    
    def f:((Form[Account.Accept],com.feth.play.module.pa.user.AuthUser) => play.api.templates.HtmlFormat.Appendable) = (acceptForm,newAccount) => apply(acceptForm,newAccount)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:29 IST 2014
                    SOURCE: W:/Pre School/app/views/account/ask_link.scala.html
                    HASH: ef4249b275d61f4b728f800c71cc13e4f618e135
                    MATRIX: 837->1|1051->146|1063->151|1147->155|1185->159|1245->198|1282->200|1370->266|1412->86|1442->143|1470->269|1510->274|1577->332|1617->334|1662->344|1736->396|1786->411|1822->438|1862->440|1919->461|1958->491|1998->493|2123->582|2142->592|2184->612|2254->650|2302->663|2653->992|2735->1038|2806->1087|2867->1117
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|34->7|34->7|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|45->14|45->14|45->14|47->16|47->16|47->16|49->18|49->18|49->18|51->20|53->22|61->30|63->32|63->32|64->33
                    -- GENERATED --
                */
            