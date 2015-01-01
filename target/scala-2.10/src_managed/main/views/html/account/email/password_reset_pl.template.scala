
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
object password_reset_pl extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""
Cześć """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Poproszono o zmianę hasła dla Twojego konta.<br />
    Jeśli to nie Ty, zrelaksuj się i zignoruj tę wiadomość.<br />
</p>
<p>
    Jeśli jednak naprawdę chcesz zmienić hasło <a href=""""),_display_(Seq[Any](/*10.58*/url)),format.raw/*10.61*/("""">skorzystaj z tego linku aby to zrobić</a>.
</p>
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))}
    }
    
    def render(url:String,token:String,name:String,email:String): play.api.templates.HtmlFormat.Appendable = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/email/password_reset_pl.scala.html
                    HASH: 1c5b788869dc1538d05a79034411851e579322bf
                    MATRIX: 821->1|972->58|1015->67|1040->71|1291->286|1316->289
                    LINES: 26->1|29->1|30->2|30->2|38->10|38->10
                    -- GENERATED --
                */
            