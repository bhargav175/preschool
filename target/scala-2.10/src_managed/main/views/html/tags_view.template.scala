
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
object tags_view extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.content.Tag],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tags:List[models.content.Tag]):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.33*/("""
    """),format.raw/*3.1*/("""
"""),format.raw/*19.2*/("""
"""),format.raw/*22.2*/("""
"""),format.raw/*29.2*/("""
"""),_display_(Seq[Any](/*30.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.117*/ {_display_(Seq[Any](format.raw/*30.119*/("""


<div ng-app="siteContent">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Tags</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row">
        <div class="">
            <div class="panel-group" id="accordion">
            """),_display_(Seq[Any](/*43.14*/for((tag,index) <-tags.zipWithIndex) yield /*43.50*/{_display_(Seq[Any](format.raw/*43.51*/("""

                <a class="metr" href=""""),_display_(Seq[Any](/*45.40*/routes/*45.46*/.Application.tag(tag.slug))),format.raw/*45.72*/("""">"""),_display_(Seq[Any](/*45.75*/metroCard(tag.name,Html(tag.descriptionHtml),tag.featuredImage))),format.raw/*45.138*/("""</a>



            """)))})),format.raw/*49.14*/("""



            </div>


        </div>

</div>
</div>
""")))})))}
    }
    
    def render(tags:List[models.content.Tag]): play.api.templates.HtmlFormat.Appendable = apply(tags)
    
    def f:((List[models.content.Tag]) => play.api.templates.HtmlFormat.Appendable) = (tags) => apply(tags)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:22 IST 2014
                    SOURCE: W:/Pre School/app/views/tags_view.scala.html
                    HASH: 12b28fb0b9010a1982e6b29b2e0131d7fbea8eb2
                    MATRIX: 796->1|935->73|949->80|1033->82|1088->102|1102->108|1157->142|1223->173|1237->179|1302->223|1368->254|1382->260|1440->297|1506->328|1520->334|1568->361|1634->392|1648->398|1706->435|1773->466|1788->472|1850->512|2045->671|2060->677|2130->725|2201->760|2216->766|2269->797|2336->828|2351->834|2417->878|2458->899|2477->909|2562->911|2590->919|2603->924|2687->926|3053->1256|3068->1262|3129->1301|3203->1339|3218->1345|3286->1391|3330->32|3362->70|3391->896|3420->916|3449->1396|3487->1399|3612->1514|3653->1516|4002->1829|4054->1865|4093->1866|4172->1909|4187->1915|4235->1941|4274->1944|4360->2007|4417->2032
                    LINES: 26->1|29->4|29->4|31->4|32->5|32->5|32->5|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|39->12|39->12|39->12|42->15|42->15|42->15|43->16|43->16|43->16|46->20|46->20|48->20|50->23|50->23|52->23|56->27|56->27|56->27|57->28|57->28|57->28|59->1|60->3|61->19|62->22|63->29|64->30|64->30|64->30|77->43|77->43|77->43|79->45|79->45|79->45|79->45|79->45|83->49
                    -- GENERATED --
                */
            