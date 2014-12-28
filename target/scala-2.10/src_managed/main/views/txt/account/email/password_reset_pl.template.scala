
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
object password_reset_pl extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""Cześć """),_display_(Seq[Any](/*1.66*/name)),format.raw/*1.70*/(""",


Poproszono o zmianę hasła dla Twojego konta.
Jeśli to nie Ty, zrelaksuj się i zignoruj tę wiadomość.

Jeśli jednak naprawdę chcesz zmienić hasło skorzystaj z tego linku aby to zrobić:
"""),_display_(Seq[Any](/*8.2*/url)),format.raw/*8.5*/("""

Pozdrawiamy,
Ekipa PlayAuthenticate"""))}
    }
    
    def render(url:String,token:String,name:String,email:String): play.api.templates.TxtFormat.Appendable = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/email/password_reset_pl.scala.txt
                    HASH: aaca0bc1f0446afa4acea84c2fd487fdc89f7a4d
                    MATRIX: 815->1|965->58|1007->65|1032->69|1262->265|1285->268
                    LINES: 26->1|29->1|29->1|29->1|36->8|36->8
                    -- GENERATED --
                */
            