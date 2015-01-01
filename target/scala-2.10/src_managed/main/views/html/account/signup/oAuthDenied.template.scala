
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
object oAuthDenied extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(providerKey: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(Seq[Any](/*3.2*/main(Messages("playauthenticate.oauth.access.denied.title"))/*3.62*/ {_display_(Seq[Any](format.raw/*3.64*/("""

	<h1>"""),_display_(Seq[Any](/*5.7*/Messages("playauthenticate.oauth.access.denied.title"))),format.raw/*5.61*/("""</h1>
	<p>
		"""),_display_(Seq[Any](/*7.4*/Messages("playauthenticate.oauth.access.denied.explanation"))),format.raw/*7.64*/("""<br/>
	</p>
	<p>
		"""),_display_(Seq[Any](/*10.4*/Messages("playauthenticate.oauth.access.denied.alternative"))),format.raw/*10.64*/(""" <a href=""""),_display_(Seq[Any](/*10.75*/routes/*10.81*/.Application.signup)),format.raw/*10.100*/("""">"""),_display_(Seq[Any](/*10.103*/Messages("playauthenticate.oauth.access.denied.alternative.cta"))),format.raw/*10.167*/("""</a>.
	</p>
""")))})))}
    }
    
    def render(providerKey:String): play.api.templates.HtmlFormat.Appendable = apply(providerKey)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/signup/oAuthDenied.scala.html
                    HASH: f92e059852f084090f38bcbec71ae9e31ce470f5
                    MATRIX: 795->1|910->22|949->27|1017->87|1056->89|1100->99|1175->153|1225->169|1306->229|1364->252|1446->312|1493->323|1508->329|1550->348|1590->351|1677->415
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|35->7|35->7|38->10|38->10|38->10|38->10|38->10|38->10|38->10
                    -- GENERATED --
                */
            