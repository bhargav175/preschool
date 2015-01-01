
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
object no_token_or_invalid extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.token.error.title"))/*2.54*/ {_display_(Seq[Any](format.raw/*2.56*/("""
	<h1>"""),_display_(Seq[Any](/*3.7*/Messages("playauthenticate.token.error.title"))),format.raw/*3.53*/("""</h1>
	<p>"""),_display_(Seq[Any](/*4.6*/Messages("playauthenticate.token.error.message"))),format.raw/*4.54*/("""</p>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/signup/no_token_or_invalid.scala.html
                    HASH: cee156c8fc26266d8fe3fae6577f3c9d435371f8
                    MATRIX: 893->3|953->55|992->57|1034->65|1101->111|1147->123|1216->171
                    LINES: 29->2|29->2|29->2|30->3|30->3|31->4|31->4
                    -- GENERATED --
                */
            