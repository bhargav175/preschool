
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
object shortNote_view extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[models.User,models.content.ShortNote,Boolean,Boolean,Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null,shortNote:models.content.ShortNote,hasUpvoted:Boolean,hasDownvoted:Boolean,hasReported:Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.templates._

def /*4.2*/scripts/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.11*/("""
    <script src='"""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*5.59*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*6.19*/routes/*6.25*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*6.69*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*7.19*/routes/*7.25*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*7.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*8.19*/routes/*8.25*/.Assets.at("js/angular.js"))),format.raw/*8.52*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*9.19*/routes/*9.25*/.Assets.at("js/angular-route.min.js"))),format.raw/*9.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*10.65*/("""'></script>
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
    <script src='"""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*12.73*/("""'></script>


    <script src='"""),_display_(Seq[Any](/*15.19*/routes/*15.25*/.Assets.at("js/restangular.js"))),format.raw/*15.56*/("""'></script>
    <script src=""""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("js/angularapps/user_home.js"))),format.raw/*16.66*/(""""></script>


""")))};def /*20.2*/scriptsTop/*20.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.14*/("""

""")))};def /*23.2*/links/*23.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.9*/("""
    <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
    <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*27.35*/routes/*27.41*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*27.80*/("""'>
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*28.35*/routes/*28.41*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*28.87*/("""'>
""")))};
Seq[Any](format.raw/*1.128*/("""
 """),format.raw/*3.1*/("""
"""),format.raw/*19.2*/("""
"""),format.raw/*22.2*/("""
"""),format.raw/*29.2*/("""
"""),_display_(Seq[Any](/*30.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.117*/ {_display_(Seq[Any](format.raw/*30.119*/("""


<div ng-app="userHome">

    <div class="container-fluid" ng-controller="shortNoteFeedController">
        <div class="">

    """),_display_(Seq[Any](/*38.6*/shortListCardNew(shortNote,hasUpvoted,hasDownvoted,hasReported))),format.raw/*38.69*/("""





            """),format.raw/*44.110*/("""
                   """),format.raw/*45.46*/("""
                       """),format.raw/*46.63*/("""
                       """),format.raw/*47.73*/("""
                   """),format.raw/*48.30*/("""
                    """),format.raw/*49.48*/("""
                        """),format.raw/*50.52*/("""
                        """),format.raw/*51.51*/("""
                        """),format.raw/*52.61*/("""
                    """),format.raw/*53.31*/("""
"""),format.raw/*54.9*/("""




                """),format.raw/*59.27*/("""


        </div>


    </div>

</div>
""")))})))}
    }
    
    def render(localUser:models.User,shortNote:models.content.ShortNote,hasUpvoted:Boolean,hasDownvoted:Boolean,hasReported:Boolean): play.api.templates.HtmlFormat.Appendable = apply(localUser,shortNote,hasUpvoted,hasDownvoted,hasReported)
    
    def f:((models.User,models.content.ShortNote,Boolean,Boolean,Boolean) => play.api.templates.HtmlFormat.Appendable) = (localUser,shortNote,hasUpvoted,hasDownvoted,hasReported) => apply(localUser,shortNote,hasUpvoted,hasDownvoted,hasReported)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:22 IST 2014
                    SOURCE: W:/Pre School/app/views/shortNote_view.scala.html
                    HASH: 14e64f0463ab9e162ebf10786910e9f1ebe9510b
                    MATRIX: 837->1|1071->165|1085->172|1169->174|1224->194|1238->200|1293->234|1359->265|1373->271|1438->315|1504->346|1518->352|1576->389|1642->420|1656->426|1704->453|1770->484|1784->490|1842->527|1909->558|1924->564|1986->604|2181->763|2196->769|2266->817|2337->852|2352->858|2405->889|2472->920|2487->926|2550->967|2591->988|2610->998|2695->1000|2723->1008|2736->1013|2820->1015|3186->1345|3201->1351|3262->1390|3336->1428|3351->1434|3419->1480|3464->127|3493->162|3522->985|3551->1005|3580->1485|3618->1488|3743->1603|3784->1605|3958->1744|4043->1807|4096->1928|4145->1975|4198->2039|4251->2113|4300->2144|4350->2193|4404->2246|4458->2298|4512->2360|4562->2392|4591->2402|4645->2438
                    LINES: 26->1|29->4|29->4|31->4|32->5|32->5|32->5|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|39->12|39->12|39->12|42->15|42->15|42->15|43->16|43->16|43->16|46->20|46->20|48->20|50->23|50->23|52->23|56->27|56->27|56->27|57->28|57->28|57->28|59->1|60->3|61->19|62->22|63->29|64->30|64->30|64->30|72->38|72->38|78->44|79->45|80->46|81->47|82->48|83->49|84->50|85->51|86->52|87->53|88->54|93->59
                    -- GENERATED --
                */
            