
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
object unverified extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*4.2*/scripts/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""

""")))};def /*7.2*/scriptsTop/*7.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.16*/("""

""")))};def /*10.2*/links/*10.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.11*/("""

    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

""")))};
Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*6.2*/("""
"""),format.raw/*9.2*/("""
"""),format.raw/*14.2*/("""
"""),_display_(Seq[Any](/*15.2*/template_user_account_info(Messages("playauthenticate.login.title"), "login", scriptsTop, scripts, links)/*15.107*/ {_display_(Seq[Any](format.raw/*15.109*/("""
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

	<h1>"""),_display_(Seq[Any](/*30.7*/Messages("playauthenticate.verify.user_account.title"))),format.raw/*30.61*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*32.3*/Messages("playauthenticate.verify.user_account.before"))),format.raw/*32.58*/(""" <a href=""""),_display_(Seq[Any](/*32.69*/routes/*32.75*/.Account.verifyEmail)),format.raw/*32.95*/("""">"""),_display_(Seq[Any](/*32.98*/Messages("playauthenticate.verify.user_account.first"))),format.raw/*32.152*/("""</a>.<br/>
	</p>
                </div>
            </div>
        </div>
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:29 IST 2014
                    SOURCE: W:/Pre School/app/views/account/unverified.scala.html
                    HASH: 2e165591a70c5579f7265b2de2ab018f36488c42
                    MATRIX: 904->56|918->63|1002->67|1029->75|1047->85|1131->89|1159->97|1172->102|1257->106|1404->53|1432->72|1460->94|1489->215|1527->218|1642->323|1683->325|2280->887|2356->941|2406->956|2483->1011|2530->1022|2545->1028|2587->1048|2626->1051|2703->1105
                    LINES: 31->4|31->4|33->4|35->7|35->7|37->7|39->10|39->10|41->10|46->3|47->6|48->9|49->14|50->15|50->15|50->15|65->30|65->30|67->32|67->32|67->32|67->32|67->32|67->32|67->32
                    -- GENERATED --
                */
            