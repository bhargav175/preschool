
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
object _providerIcon extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(providerKey: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""
<img alt=""""),_display_(Seq[Any](/*2.12*/providerKey)),format.raw/*2.23*/(""" icon" title=""""),_display_(Seq[Any](/*2.38*/providerKey)),format.raw/*2.49*/("""" src=""""),_display_(Seq[Any](/*2.57*/routes/*2.63*/.Assets.at("icons/"+providerKey+"-24x24.png"))),format.raw/*2.108*/("""">"""))}
    }
    
    def render(providerKey:String): play.api.templates.HtmlFormat.Appendable = apply(providerKey)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (providerKey) => apply(providerKey)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:29 IST 2014
                    SOURCE: W:/Pre School/app/views/_providerIcon.scala.html
                    HASH: 1ec635dc1af3b5428880891b2539a78d72ab2758
                    MATRIX: 782->1|897->22|945->35|977->46|1027->61|1059->72|1102->80|1116->86|1183->131
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|30->2|30->2|30->2
                    -- GENERATED --
                */
            