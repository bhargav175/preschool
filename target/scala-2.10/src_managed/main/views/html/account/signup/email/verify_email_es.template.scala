
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
object verify_email_es extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""
Hola """),_display_(Seq[Any](/*2.7*/name)),format.raw/*2.11*/(""",
<br />
<br />
<p>
	Se acaba de apuntar a PlayAuthenticate.<br />
	<br />
	Siga el siguiente enlace para <a href=""""),_display_(Seq[Any](/*8.42*/verificationUrl)),format.raw/*8.57*/("""">activar su cuenta</a>.
</p>
<br />
<p>
	Saludos,<br /> 
	<i>El equipo de PlayAuthenticate</i>
</p>
"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/signup/email/verify_email_es.scala.html
                    HASH: 8f6f8f25fc9704eb1f07074a9ee5c06cba716c67
                    MATRIX: 826->1|989->70|1031->78|1056->82|1213->204|1249->219
                    LINES: 26->1|29->1|30->2|30->2|36->8|36->8
                    -- GENERATED --
                */
            