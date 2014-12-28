
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
object verify_email_de extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""Hey """),_display_(Seq[Any](/*1.76*/name)),format.raw/*1.80*/(""", 


um deine E-Mail-Adresse zu bestätigen, folge einfach diesem Link:

"""),_display_(Seq[Any](/*6.2*/verificationUrl)),format.raw/*6.17*/("""

Grüße,
Das PlayAuthenticate-Team"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String): play.api.templates.TxtFormat.Appendable = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.TxtFormat.Appendable) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/email/verify_email_de.scala.txt
                    HASH: b0112eb7880f2ff918aeb9f9dba63ad64bd2542b
                    MATRIX: 813->1|975->70|1015->75|1040->79|1152->157|1188->172
                    LINES: 26->1|29->1|29->1|29->1|34->6|34->6
                    -- GENERATED --
                */
            