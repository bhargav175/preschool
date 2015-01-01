
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
object link extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),_display_(Seq[Any](/*2.2*/main("link")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""


                <h1>"""),_display_(Seq[Any](/*5.22*/Messages("playauthenticate.link.user_account.title"))),format.raw/*5.74*/("""</h1>
    
    <p>
	"""),_display_(Seq[Any](/*8.3*/_providerPartial())),format.raw/*8.21*/("""
    <br/>
    </p>


""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/link.scala.html
                    HASH: 1a16953caf972e9e462a10b7f24d6d46cdf8c722
                    MATRIX: 774->1|869->3|906->6|926->18|965->20|1027->47|1100->99|1158->123|1197->141
                    LINES: 26->1|29->1|30->2|30->2|30->2|33->5|33->5|36->8|36->8
                    -- GENERATED --
                */
            