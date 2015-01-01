
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
	<script type='text/javascript' src='"""),_display_(Seq[Any](/*4.39*/routes/*4.45*/.Assets.at("javascripts/index.js"))),format.raw/*4.79*/("""'></script>

""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:55 IST 2015
                    SOURCE: W:/Pre School/app/views/index.scala.html
                    HASH: 762339a7db5aad722742df1b7b8cbe61923a7008
                    MATRIX: 767->1|862->3|899->6|930->29|969->31|1043->70|1057->76|1112->110|1156->124
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|34->6
                    -- GENERATED --
                */
            