
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
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/template_user_settings(null)/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""


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
                    DATE: Sun Dec 28 16:26:29 IST 2014
                    SOURCE: W:/Pre School/app/views/account/link.scala.html
                    HASH: 02b6e1f49e5517294bdf848cd957777b95e7a2e8
                    MATRIX: 871->3|907->31|946->33|1008->60|1081->112|1139->136|1178->154
                    LINES: 29->2|29->2|29->2|32->5|32->5|35->8|35->8
                    -- GENERATED --
                */
            