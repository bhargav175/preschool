
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
object password_reset_es extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""
Hola """),_display_(Seq[Any](/*2.7*/name)),format.raw/*2.11*/(""",
<br />
<br />
<p>
Alguien ha solicitado restablecer la contraseña de su cuenta.<br />
Si no ha sido Usted o si no ha sido esta su intención, relájese e ignore este email.<br />
</p>
<p>
Si lo que quiere es cambiar su contraseña, lo único que necesita hacer es seguir este <a href=""""),_display_(Seq[Any](/*10.97*/url)),format.raw/*10.100*/("""">enlace para restablecer su contraseña</a>.
</p>

<p>
Atentamente,<br /> 
<i>El equipo de PlayAuthenticate</i>
</p>
"""))}
    }
    
    def render(url:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/email/password_reset_es.scala.html
                    HASH: 3d90497d381df8e35ffe9b6b1b2f358d8ee627f6
                    MATRIX: 821->1|972->58|1014->66|1039->70|1367->362|1393->365
                    LINES: 26->1|29->1|30->2|30->2|38->10|38->10
                    -- GENERATED --
                */
            