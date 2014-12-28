
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
def /*2.6*/scripts/*2.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.15*/("""
    <script src='"""),_display_(Seq[Any](/*3.19*/routes/*3.25*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*3.59*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*4.19*/routes/*4.25*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*4.69*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*5.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*6.19*/routes/*6.25*/.Assets.at("js/angular.js"))),format.raw/*6.52*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*7.19*/routes/*7.25*/.Assets.at("js/angular-route.min.js"))),format.raw/*7.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*8.19*/routes/*8.25*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*8.65*/("""'></script>
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
    <script src='"""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*10.73*/("""'></script>


    <script src='"""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("js/restangular.js"))),format.raw/*13.56*/("""'></script>

""")))};def /*16.2*/scriptsTop/*16.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.14*/("""

""")))};def /*19.2*/links/*19.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.9*/("""
    <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
    <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*23.35*/routes/*23.41*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*23.80*/("""'>
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*24.35*/routes/*24.41*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*24.87*/("""'>
""")))};
Seq[Any](format.raw/*1.20*/("""
    """),format.raw/*15.2*/("""
"""),format.raw/*18.2*/("""
"""),format.raw/*25.2*/("""
"""),_display_(Seq[Any](/*26.2*/template_user_dashboard_semantic(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*26.113*/ {_display_(Seq[Any](format.raw/*26.115*/("""


Requested """),_display_(Seq[Any](/*29.12*/exception)),format.raw/*29.21*/(""" Not Found

""")))})))}
    }
    
    def render(exception:String): play.api.templates.HtmlFormat.Appendable = apply(exception)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (exception) => apply(exception)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:21 IST 2014
                    SOURCE: W:/Pre School/app/views/errorPage.scala.html
                    HASH: 4513dbe9893dc2c3446319761cd9aa6a2cf5e55a
                    MATRIX: 778->1|873->26|888->33|972->35|1027->55|1041->61|1096->95|1162->126|1176->132|1241->176|1307->207|1321->213|1379->250|1445->281|1459->287|1507->314|1573->345|1587->351|1645->388|1711->419|1725->425|1786->465|1981->624|1996->630|2066->678|2137->713|2152->719|2205->750|2244->769|2263->779|2348->781|2376->789|2389->794|2473->796|2839->1126|2854->1132|2915->1171|2989->1209|3004->1215|3072->1261|3116->19|3149->766|3178->786|3207->1266|3245->1269|3366->1380|3407->1382|3460->1399|3491->1408
                    LINES: 26->1|28->2|28->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|43->16|43->16|45->16|47->19|47->19|49->19|53->23|53->23|53->23|54->24|54->24|54->24|56->1|57->15|58->18|59->25|60->26|60->26|60->26|63->29|63->29
                    -- GENERATED --
                */
            