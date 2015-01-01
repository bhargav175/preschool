
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
object errorPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(exception:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""
    """),_display_(Seq[Any](/*2.6*/main("link")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""

Requested """),_display_(Seq[Any](/*4.12*/exception)),format.raw/*4.21*/(""" Not Found

""")))})))}
    }
    
    def render(exception:String): play.api.templates.HtmlFormat.Appendable = apply(exception)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (exception) => apply(exception)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:55 IST 2015
                    SOURCE: W:/Pre School/app/views/errorPage.scala.html
                    HASH: 7db300b2598b4bcd93d0b28bb21cdb8c6e84add3
                    MATRIX: 778->1|890->19|931->26|951->38|990->40|1040->55|1070->64
                    LINES: 26->1|29->1|30->2|30->2|30->2|32->4|32->4
                    -- GENERATED --
                */
            