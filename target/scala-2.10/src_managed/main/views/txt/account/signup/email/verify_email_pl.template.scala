
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
object verify_email_pl extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""Cześć """),_display_(Seq[Any](/*1.78*/name)),format.raw/*1.82*/(""",


Twoje konto w PlayAuthenticate zostało utworzone.

Aby je aktywować, użyj ten link
"""),_display_(Seq[Any](/*7.2*/verificationUrl)),format.raw/*7.17*/("""

Pozdrawiamy,
Ekipa PlayAuthenticate"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.TxtFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/signup/email/verify_email_pl.scala.txt
                    HASH: c276c7cd60428b03492e1ae39088bb55e2e417be
                    MATRIX: 820->1|982->70|1024->77|1049->81|1177->175|1213->190
                    LINES: 26->1|29->1|29->1|29->1|35->7|35->7
                    -- GENERATED --
                */
            