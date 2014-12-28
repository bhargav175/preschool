
package views.html

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
object user_settings extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*3.2*/(user: models.User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*3.21*/("""

"""),_display_(Seq[Any](/*5.2*/template_user_settings(user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""
General Settings


""")))})))}
    }
    
    def render(user:models.User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:28 IST 2014
                    SOURCE: W:/Pre School/app/views/user_settings.scala.html
                    HASH: ebbdaa4c11a6ac8497542b771b7da6217a1dd2c5
                    MATRIX: 787->3|900->22|937->25|973->53|1012->55
                    LINES: 26->3|29->3|31->5|31->5|31->5
                    -- GENERATED --
                */
            