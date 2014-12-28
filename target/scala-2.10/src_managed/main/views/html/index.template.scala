
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
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*2.2*/scripts/*2.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.11*/("""
""")))};def /*4.2*/scriptsTop/*4.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.14*/("""

""")))};def /*7.2*/links/*7.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.9*/("""
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
""")))};
Seq[Any](format.raw/*3.2*/("""
"""),format.raw/*6.2*/("""
"""),format.raw/*9.2*/("""
"""),_display_(Seq[Any](/*10.2*/template_landing_page(Messages("playauthenticate.index.title"), "home",scriptsTop,scripts,links)/*10.98*/ {_display_(Seq[Any](format.raw/*10.100*/("""
      <!-- Main hero unit for a primary marketing message or call to action -->

    """)))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:22 IST 2014
                    SOURCE: W:/Pre School/app/views/index.scala.html
                    HASH: 31a68d8832b16267739226c9b5aa75fccdd74c76
                    MATRIX: 839->3|853->10|937->12|962->18|980->28|1064->30|1091->38|1103->43|1186->45|1329->15|1357->35|1385->150|1423->153|1528->249|1569->251
                    LINES: 28->2|28->2|30->2|31->4|31->4|33->4|35->7|35->7|37->7|40->3|41->6|42->9|43->10|43->10|43->10
                    -- GENERATED --
                */
            