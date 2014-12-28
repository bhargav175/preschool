
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
object password_reset_es extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""Hola """),_display_(Seq[Any](/*1.65*/name)),format.raw/*1.69*/(""",


Alguien ha solicitado restablecer la contraseña de su cuenta.
Si no ha sido Usted o si no ha sido esta su intención, relájese e ignore este email.

Si lo que quiere es cambiar su contraseña, lo único que necesita hacer es seguir el siguiente enlace:
"""),_display_(Seq[Any](/*8.2*/url)),format.raw/*8.5*/("""

Atentamente,
El equipo de PlayAuthenticate
"""))}
    }
    
    def render(url:String,token:String,name:String,email:String): play.api.templates.TxtFormat.Appendable = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/email/password_reset_es.scala.txt
                    HASH: 2c3551b66b9d56c45c063e7fdf772d2d274dcf68
                    MATRIX: 815->1|965->58|1006->64|1031->68|1327->330|1350->333
                    LINES: 26->1|29->1|29->1|29->1|36->8|36->8
                    -- GENERATED --
                */
            