
package views.html

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
object notFoundPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(string:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""


Requested """),_display_(Seq[Any](/*4.12*/string)),format.raw/*4.18*/(""" Not Found

"""))}
    }
    
    def render(string:String): play.api.templates.HtmlFormat.Appendable = apply(string)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (string) => apply(string)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:55 IST 2015
                    SOURCE: W:/Pre School/app/views/notFoundPage.scala.html
                    HASH: 5e2c4ca179ae46909fec6c06a825edb7ab683b03
                    MATRIX: 781->1|890->16|942->33|969->39
                    LINES: 26->1|29->1|32->4|32->4
                    -- GENERATED --
                */
            