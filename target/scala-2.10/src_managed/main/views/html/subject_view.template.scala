
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
object subject_view extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.content.Subject,List[models.content.Chapter],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(subject:models.content.Subject,chapters:List[models.content.Chapter]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.templates._

def /*7.6*/scripts/*7.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.15*/("""
    <script src='"""),_display_(Seq[Any](/*8.19*/routes/*8.25*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*8.59*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*9.19*/routes/*9.25*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*9.69*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*10.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*11.19*/routes/*11.25*/.Assets.at("js/angular.js"))),format.raw/*11.52*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Assets.at("js/angular-route.min.js"))),format.raw/*12.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*13.65*/("""'></script>
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
    <script src='"""),_display_(Seq[Any](/*15.19*/routes/*15.25*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*15.73*/("""'></script>


    <script src='"""),_display_(Seq[Any](/*18.19*/routes/*18.25*/.Assets.at("js/restangular.js"))),format.raw/*18.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("js/angularapps/site-content.js"))),format.raw/*19.73*/("""'></script>

""")))};def /*22.2*/scriptsTop/*22.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.14*/("""

""")))};def /*25.2*/links/*25.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*25.9*/("""
    <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
    <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*29.35*/routes/*29.41*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*29.80*/("""'>
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*30.35*/routes/*30.41*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*30.87*/("""'>
""")))};
Seq[Any](format.raw/*1.72*/("""

    """),format.raw/*4.1*/("""


    """),format.raw/*21.2*/("""
"""),format.raw/*24.2*/("""
"""),format.raw/*31.2*/("""
"""),_display_(Seq[Any](/*32.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*32.117*/ {_display_(Seq[Any](format.raw/*32.119*/("""


<div ng-app="siteContent">
    <div ng-controller="subjectContentController">
    <div class="row">
        <div class="col-md-12">
       """),_display_(Seq[Any](/*39.9*/metaCardNew("Subject",subject.name,Html(subject.description),subject.featuredImage,subject.videoUrl))),format.raw/*39.109*/("""
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row"  >
    <div class="container-fluid"  >
        <div class="">
            <h3 class="page-header">Chapters in <span class="capitalize">"""),_display_(Seq[Any](/*46.75*/subject/*46.82*/.name)),format.raw/*46.87*/("""</span></h3>
                """),_display_(Seq[Any](/*47.18*/for((chapter,index) <-chapters.zipWithIndex) yield /*47.62*/{_display_(Seq[Any](format.raw/*47.63*/("""

                    <a class="metr" href=""""),_display_(Seq[Any](/*49.44*/routes/*49.50*/.Application.chapter(chapter.slug))),format.raw/*49.84*/("""">"""),_display_(Seq[Any](/*49.87*/metroCard(chapter.name,Html(chapter.descriptionHtml),chapter.featuredImage))),format.raw/*49.162*/("""</a>


                """)))})),format.raw/*52.18*/("""





        </div>


    </div>

</div>
</div>
</div>
""")))})))}
    }
    
    def render(subject:models.content.Subject,chapters:List[models.content.Chapter]): play.api.templates.HtmlFormat.Appendable = apply(subject,chapters)
    
    def f:((models.content.Subject,List[models.content.Chapter]) => play.api.templates.HtmlFormat.Appendable) = (subject,chapters) => apply(subject,chapters)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:22 IST 2014
                    SOURCE: W:/Pre School/app/views/subject_view.scala.html
                    HASH: d5f8472f425307e87595f5c8e473a21a1b98018d
                    MATRIX: 826->1|1004->122|1019->129|1103->131|1158->151|1172->157|1227->191|1293->222|1307->228|1372->272|1439->303|1454->309|1513->346|1580->377|1595->383|1644->410|1711->441|1726->447|1785->484|1852->515|1867->521|1929->561|2124->720|2139->726|2209->774|2280->809|2295->815|2348->846|2419->881|2434->887|2500->931|2539->950|2558->960|2643->962|2671->970|2684->975|2768->977|3134->1307|3149->1313|3210->1352|3284->1390|3299->1396|3367->1442|3411->71|3445->111|3482->947|3511->967|3540->1447|3578->1450|3703->1565|3744->1567|3929->1717|4052->1817|4312->2041|4328->2048|4355->2053|4422->2084|4482->2128|4521->2129|4604->2176|4619->2182|4675->2216|4714->2219|4812->2294|4871->2321
                    LINES: 26->1|29->7|29->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|39->15|42->18|42->18|42->18|43->19|43->19|43->19|45->22|45->22|47->22|49->25|49->25|51->25|55->29|55->29|55->29|56->30|56->30|56->30|58->1|60->4|63->21|64->24|65->31|66->32|66->32|66->32|73->39|73->39|80->46|80->46|80->46|81->47|81->47|81->47|83->49|83->49|83->49|83->49|83->49|86->52
                    -- GENERATED --
                */
            