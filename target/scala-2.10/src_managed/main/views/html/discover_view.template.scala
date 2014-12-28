
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
object discover_view extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.content.Subject],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(subjects:List[models.content.Subject]):play.api.templates.HtmlFormat.Appendable = {
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
    <script src=""""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("js/angularapps/site-content.js"))),format.raw/*16.69*/(""""></script>


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
Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*19.2*/("""
"""),format.raw/*22.2*/("""
"""),format.raw/*29.2*/("""
"""),_display_(Seq[Any](/*30.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.117*/ {_display_(Seq[Any](format.raw/*30.119*/("""


<div ng-app="siteContent">
    <div class="row">
        <div class="col-lg-12">
            <h3 class="page-header">Discover</h3>
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row">
    <div class="container-fluid" ng-controller="siteContentController">
        <div class="">

        """),_display_(Seq[Any](/*44.10*/for(subject<-subjects) yield /*44.32*/{_display_(Seq[Any](format.raw/*44.33*/("""
           <a class="metr" href=""""),_display_(Seq[Any](/*45.35*/routes/*45.41*/.Application.subject(subject.slug))),format.raw/*45.75*/("""">"""),_display_(Seq[Any](/*45.78*/metroCard(subject.name,Html(subject.descriptionHtml),subject.featuredImage))),format.raw/*45.153*/("""</a>
        """)))})),format.raw/*46.10*/("""


        </div>


    </div>

</div>
</div>
""")))})))}
    }
    
    def render(subjects:List[models.content.Subject]): play.api.templates.HtmlFormat.Appendable = apply(subjects)
    
    def f:((List[models.content.Subject]) => play.api.templates.HtmlFormat.Appendable) = (subjects) => apply(subjects)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:21 IST 2014
                    SOURCE: W:/Pre School/app/views/discover_view.scala.html
                    HASH: b162a3b7893b4f082f71745af4112bca77bdd787
                    MATRIX: 804->1|951->77|965->84|1049->86|1104->106|1118->112|1173->146|1239->177|1253->183|1318->227|1384->258|1398->264|1456->301|1522->332|1536->338|1584->365|1650->396|1664->402|1722->439|1789->470|1804->476|1866->516|2061->675|2076->681|2146->729|2217->764|2232->770|2285->801|2352->832|2367->838|2433->882|2474->903|2493->913|2578->915|2606->923|2619->928|2703->930|3069->1260|3084->1266|3145->1305|3219->1343|3234->1349|3302->1395|3346->40|3374->74|3403->900|3432->920|3461->1400|3499->1403|3624->1518|3665->1520|4035->1854|4073->1876|4112->1877|4184->1913|4199->1919|4255->1953|4294->1956|4392->2031|4439->2046
                    LINES: 26->1|29->4|29->4|31->4|32->5|32->5|32->5|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|39->12|39->12|39->12|42->15|42->15|42->15|43->16|43->16|43->16|46->20|46->20|48->20|50->23|50->23|52->23|56->27|56->27|56->27|57->28|57->28|57->28|59->1|60->3|61->19|62->22|63->29|64->30|64->30|64->30|78->44|78->44|78->44|79->45|79->45|79->45|79->45|79->45|80->46
                    -- GENERATED --
                */
            