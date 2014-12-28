
package views.html.account.email

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
object verify_email_de extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""
Hey """),_display_(Seq[Any](/*2.6*/name)),format.raw/*2.10*/(""",
<br />
<br />
<p>
	um deine E-Mail-Adresse zu bestätigen, <a href=""""),_display_(Seq[Any](/*6.51*/verificationUrl)),format.raw/*6.66*/("""">folge einfach diesem Link</a>.
</p>
<br />
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/email/verify_email_de.scala.html
                    HASH: 0777727e7df7027c326cdd53ff649c11bb1054c6
                    MATRIX: 819->1|982->70|1023->77|1048->81|1157->155|1193->170
                    LINES: 26->1|29->1|30->2|30->2|34->6|34->6
                    -- GENERATED --
                */
            