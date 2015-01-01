
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
object unverified extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.verify.email.title"))/*2.55*/ {_display_(Seq[Any](format.raw/*2.57*/("""

	<h1>"""),_display_(Seq[Any](/*4.7*/Messages("playauthenticate.verify.email.title"))),format.raw/*4.54*/("""</h1>
	<p>
		"""),_display_(Seq[Any](/*6.4*/Messages("playauthenticate.verify.email.requirement"))),format.raw/*6.57*/("""</br>
		"""),_display_(Seq[Any](/*7.4*/Messages("playauthenticate.verify.email.cta"))),format.raw/*7.49*/("""
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
                    SOURCE: W:/Pre School/app/views/account/signup/unverified.scala.html
                    HASH: 3e7bcf135309d1ef7651f8a48c7ea7f2ee83ebc3
                    MATRIX: 884->3|945->56|984->58|1028->68|1096->115|1146->131|1220->184|1264->194|1330->239
                    LINES: 29->2|29->2|29->2|31->4|31->4|33->6|33->6|34->7|34->7
                    -- GENERATED --
                */
            