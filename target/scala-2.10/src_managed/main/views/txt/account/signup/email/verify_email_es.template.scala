
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
object verify_email_es extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""Hola """),_display_(Seq[Any](/*1.77*/name)),format.raw/*1.81*/(""",


Se acaba de apuntar a PlayAuthenticate.

Siga el siguiente enlace para activar su cuenta:
"""),_display_(Seq[Any](/*7.2*/verificationUrl)),format.raw/*7.17*/("""

Saludos,
El equipo de PlayAuthenticate.
"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.TxtFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/signup/email/verify_email_es.scala.txt
                    HASH: f95afc6c75f677333e3ff0d1989b814182928ae9
                    MATRIX: 820->1|982->70|1023->76|1048->80|1183->181|1219->196
                    LINES: 26->1|29->1|29->1|29->1|35->7|35->7
                    -- GENERATED --
                */
            