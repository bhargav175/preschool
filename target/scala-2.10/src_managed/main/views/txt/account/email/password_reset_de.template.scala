
package views.txt.account.email

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
import views.txt._
/**/
object password_reset_de extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""Hey """),_display_(Seq[Any](/*1.64*/name)),format.raw/*1.68*/(""",


du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.
Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.

Falls du dein Passwort zurücksetzen möchtest, musst du nur diesem Link folgen:

"""),_display_(Seq[Any](/*9.2*/url)),format.raw/*9.5*/("""

Grüße,
Das PlayAuthenticate-Team"""))}
    }
    
    def render(url:String,token:String,name:String,email:String): play.api.templates.TxtFormat.Appendable = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/email/password_reset_de.scala.txt
                    HASH: 10141f3469f5cdc82c89c79cd5367c7dcabc9560
                    MATRIX: 815->1|965->58|1005->63|1030->67|1339->342|1362->345
                    LINES: 26->1|29->1|29->1|29->1|37->9|37->9
                    -- GENERATED --
                */
            