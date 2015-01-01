
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
object password_reset_en extends BaseScalaTemplate[play.api.templates.TxtFormat.Appendable,Format[play.api.templates.TxtFormat.Appendable]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.TxtFormat.Appendable] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String, email: String):play.api.templates.TxtFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.59*/("""Howdy """),_display_(Seq[Any](/*1.66*/name)),format.raw/*1.70*/(""",


You or someone else requested a password reset for your account.
If this was not you or your intention, just relax and ignore this email.

If you wish to reset your password, all you need to do is follow this link to reset your password:
"""),_display_(Seq[Any](/*8.2*/url)),format.raw/*8.5*/("""

Cheers,
The PlayAuthenticate Team"""))}
    }
    
    def render(url:String,token:String,name:String,email:String): play.api.templates.TxtFormat.Appendable = apply(url,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.TxtFormat.Appendable) = (url,token,name,email) => apply(url,token,name,email)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/email/password_reset_en.scala.txt
                    HASH: 0dd6ea152080f6e13ebc71fa0c5c2697016658cf
                    MATRIX: 815->1|965->58|1007->65|1032->69|1316->319|1339->322
                    LINES: 26->1|29->1|29->1|29->1|36->8|36->8
                    -- GENERATED --
                */
            