
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
object password_reset_de extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""
Hey """),_display_(Seq[Any](/*2.6*/name)),format.raw/*2.10*/(""",
<br />
<br />
<p>
	du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.<br />
	Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.<br />
</p>
<p>
	Falls du dein Passwort zurücksetzen möchtest, <a href=""""),_display_(Seq[Any](/*10.58*/url)),format.raw/*10.61*/("""">musst du nur diesem Link folgen</a>.
</p>
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
</p>"""))}
    }
    
    def render(url:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/email/password_reset_de.scala.html
                    HASH: 9bc9f8608c8b5b8247d8690b0c3c1f24ce77f340
                    MATRIX: 821->1|972->58|1013->65|1038->69|1363->358|1388->361
                    LINES: 26->1|29->1|30->2|30->2|38->10|38->10
                    -- GENERATED --
                */
            