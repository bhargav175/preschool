
package views.html.account.signup.email

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
object verify_email_pl extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""
Cześć """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Twoje konto w PlayAuthenticate zostało utworzone.<br />
    <br />
    Użyj ten link, <a href=""""),_display_(Seq[Any](/*8.30*/verificationUrl)),format.raw/*8.45*/("""">aby je aktywować</a> natychmiast.
</p>
<br />
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/signup/email/verify_email_pl.scala.html
                    HASH: b6e8a1d47e174a44c0dc9a89580a107302780b90
                    MATRIX: 826->1|989->70|1032->79|1057->83|1218->209|1254->224
                    LINES: 26->1|29->1|30->2|30->2|36->8|36->8
                    -- GENERATED --
                */
            