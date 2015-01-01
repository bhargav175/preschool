
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


Seq[Any](format.raw/*3.1*/("""

"""),_display_(Seq[Any](/*5.2*/main("link")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""
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

	<h1>"""),_display_(Seq[Any](/*20.7*/Messages("playauthenticate.verify.user_account.title"))),format.raw/*20.61*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*22.3*/Messages("playauthenticate.verify.user_account.before"))),format.raw/*22.58*/(""" <a href=""""),_display_(Seq[Any](/*22.69*/routes/*22.75*/.Account.verifyEmail)),format.raw/*22.95*/("""">"""),_display_(Seq[Any](/*22.98*/Messages("playauthenticate.verify.user_account.first"))),format.raw/*22.152*/("""</a>.<br/>
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
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/unverified.scala.html
                    HASH: 2d627f8cf212ed6a0b4ec7f8c6db197df35cc9e6
                    MATRIX: 920->53|959->58|979->70|1018->72|1615->634|1691->688|1741->703|1818->758|1865->769|1880->775|1922->795|1961->798|2038->852
                    LINES: 32->3|34->5|34->5|34->5|49->20|49->20|51->22|51->22|51->22|51->22|51->22|51->22|51->22
                    -- GENERATED --
                */
            