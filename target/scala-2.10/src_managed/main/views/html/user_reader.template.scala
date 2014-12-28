
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
object user_reader extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*2.2*/scripts/*2.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.11*/("""
    <script src='"""),_display_(Seq[Any](/*3.19*/routes/*3.25*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*3.59*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*4.19*/routes/*4.25*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*4.69*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*5.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*6.19*/routes/*6.25*/.Assets.at("js/angular.js"))),format.raw/*6.52*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*7.19*/routes/*7.25*/.Assets.at("js/angular-route.min.js"))),format.raw/*7.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*8.19*/routes/*8.25*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*8.65*/("""'></script>
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
    <script src='"""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*10.73*/("""'></script>


    <script src='"""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("js/restangular.js"))),format.raw/*13.56*/("""'></script>
    <script src=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Assets.at("js/modules/user_home.js"))),format.raw/*14.62*/(""""></script>

    <script src='"""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*16.69*/("""'></script>

""")))};def /*19.2*/scriptsTop/*19.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.14*/("""

""")))};def /*22.2*/links/*22.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.9*/("""
    <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
    <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*26.35*/routes/*26.41*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*26.80*/("""'>
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*27.35*/routes/*27.41*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*27.87*/("""'>
""")))};
Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*18.2*/("""
"""),format.raw/*21.2*/("""
"""),format.raw/*28.2*/("""
"""),_display_(Seq[Any](/*29.2*/template_user_dashboard_semantic(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*29.113*/ {_display_(Seq[Any](format.raw/*29.115*/("""



    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Reader</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row">
    <div class="container-fluid" >


    </div>

</div>

""")))})))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:28 IST 2014
                    SOURCE: W:/Pre School/app/views/user_reader.scala.html
                    HASH: 01d5570deb156484599bb8d58da527970ab2c32f
                    MATRIX: 785->1|893->35|907->42|991->44|1046->64|1060->70|1115->104|1181->135|1195->141|1260->185|1326->216|1340->222|1398->259|1464->290|1478->296|1526->323|1592->354|1606->360|1664->397|1730->428|1744->434|1805->474|2000->633|2015->639|2085->687|2156->722|2171->728|2224->759|2291->790|2306->796|2365->833|2434->866|2449->872|2515->916|2554->935|2573->945|2658->947|2686->955|2699->960|2783->962|3149->1292|3164->1298|3225->1337|3299->1375|3314->1381|3382->1427|3426->32|3455->932|3484->952|3513->1432|3551->1435|3672->1546|3713->1548
                    LINES: 26->1|28->2|28->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|46->19|46->19|48->19|50->22|50->22|52->22|56->26|56->26|56->26|57->27|57->27|57->27|59->1|60->18|61->21|62->28|63->29|63->29|63->29
                    -- GENERATED --
                */
            