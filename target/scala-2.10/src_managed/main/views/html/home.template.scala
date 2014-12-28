
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,List[models.content.ShortNote],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null,shortNoteList:List[models.content.ShortNote]):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*19.2*/("""
"""),format.raw/*22.2*/("""
"""),format.raw/*29.2*/("""
"""),_display_(Seq[Any](/*30.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.117*/ {_display_(Seq[Any](format.raw/*30.119*/("""


<div ng-app="userHome">

    <div class="row">
    <div class="container-fluid" ng-controller="shortNoteFeedController">
        <div class="">
        """),_display_(Seq[Any](/*38.10*/if(shortNoteList!=null)/*38.33*/{_display_(Seq[Any](format.raw/*38.34*/("""
            """),_display_(Seq[Any](/*39.14*/for((shortNote,index) <-shortNoteList.zipWithIndex) yield /*39.65*/{_display_(Seq[Any](format.raw/*39.66*/("""


                    """),_display_(Seq[Any](/*42.22*/shortListItemNew(shortNote))),format.raw/*42.49*/("""


            """)))})),format.raw/*45.14*/("""

        """)))})),format.raw/*47.10*/("""


            """),format.raw/*50.110*/("""
                   """),format.raw/*51.46*/("""
                       """),format.raw/*52.63*/("""
                       """),format.raw/*53.73*/("""
                   """),format.raw/*54.30*/("""
                    """),format.raw/*55.48*/("""
                        """),format.raw/*56.52*/("""
                        """),format.raw/*57.51*/("""
                        """),format.raw/*58.61*/("""
                    """),format.raw/*59.31*/("""
"""),format.raw/*60.9*/("""




                """),format.raw/*65.27*/("""


        </div>


    </div>

</div>
</div>
""")))})))}
    }
    
    def render(localUser:models.User,shortNoteList:List[models.content.ShortNote]): play.api.templates.HtmlFormat.Appendable = apply(localUser,shortNoteList)
    
    def f:((models.User,List[models.content.ShortNote]) => play.api.templates.HtmlFormat.Appendable) = (localUser,shortNoteList) => apply(localUser,shortNoteList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:22 IST 2014
                    SOURCE: W:/Pre School/app/views/home.scala.html
                    HASH: 511bb2a4370d91466ce11458fc3bbe3ba94f9838
                    MATRIX: 809->1|993->114|1007->121|1091->123|1146->143|1160->149|1215->183|1281->214|1295->220|1360->264|1426->295|1440->301|1498->338|1564->369|1578->375|1626->402|1692->433|1706->439|1764->476|1831->507|1846->513|1908->553|2103->712|2118->718|2188->766|2259->801|2274->807|2327->838|2394->869|2409->875|2472->916|2513->937|2532->947|2617->949|2645->957|2658->962|2742->964|3108->1294|3123->1300|3184->1339|3258->1377|3273->1383|3341->1429|3385->77|3413->111|3442->934|3471->954|3500->1434|3538->1437|3663->1552|3704->1554|3904->1718|3936->1741|3975->1742|4026->1757|4093->1808|4132->1809|4195->1836|4244->1863|4295->1882|4340->1895|4387->2010|4436->2057|4489->2121|4542->2195|4591->2226|4641->2275|4695->2328|4749->2380|4803->2442|4853->2474|4882->2484|4936->2520
                    LINES: 26->1|29->4|29->4|31->4|32->5|32->5|32->5|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|39->12|39->12|39->12|42->15|42->15|42->15|43->16|43->16|43->16|46->20|46->20|48->20|50->23|50->23|52->23|56->27|56->27|56->27|57->28|57->28|57->28|59->1|60->3|61->19|62->22|63->29|64->30|64->30|64->30|72->38|72->38|72->38|73->39|73->39|73->39|76->42|76->42|79->45|81->47|84->50|85->51|86->52|87->53|88->54|89->55|90->56|91->57|92->58|93->59|94->60|99->65
                    -- GENERATED --
                */
            