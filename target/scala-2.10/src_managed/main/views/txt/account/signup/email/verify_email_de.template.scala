
package views.txt.account.signup.email

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
object verify_email_de extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""Hey """),_display_(Seq[Any](/*1.76*/name)),format.raw/*1.80*/(""",


Du hast dich kürzlich bei PlayAuthenticate registriert.

Folge diesem Link um dein Konto jetzt zu aktivieren:

"""),_display_(Seq[Any](/*8.2*/verificationUrl)),format.raw/*8.17*/("""

Grüße,
Das PlayAuthenticate-Team"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.TxtFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/signup/email/verify_email_de.scala.txt
                    HASH: 8efaf2f04e84484830fe05e46efe0392f50b5c95
                    MATRIX: 820->1|982->70|1022->75|1047->79|1204->202|1240->217
                    LINES: 26->1|29->1|29->1|29->1|36->8|36->8
                    -- GENERATED --
                */
            