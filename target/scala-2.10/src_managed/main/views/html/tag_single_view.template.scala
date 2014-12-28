
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
object tag_single_view extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.content.Tag,List[models.content.ShortNote],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tag: models.content.Tag, shortnotes: List[models.content.ShortNote]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.templates._

def /*7.6*/scripts/*7.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.17*/("""
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*8.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*9.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*10.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/angular.js"))),format.raw/*11.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*12.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*13.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*15.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("js/restangular.js"))),format.raw/*18.60*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("js/angularapps/site-content.js"))),format.raw/*19.73*/("""'></script>


    """)))};def /*23.6*/scriptsTop/*23.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.20*/("""

    """)))};def /*26.6*/links/*26.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.15*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*30.39*/routes/*30.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*30.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*31.39*/routes/*31.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*31.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.71*/("""
    """),format.raw/*3.1*/("""



    """),format.raw/*22.6*/("""
    """),format.raw/*25.6*/("""
    """),format.raw/*32.6*/("""
"""),_display_(Seq[Any](/*33.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home", scriptsTop, scripts, links)/*33.120*/ {_display_(Seq[Any](format.raw/*33.122*/("""


    <div ng-app="siteContent">
        <div ng-controller="tagContentController">
            <div class="row">
                <div class="col-md-12">
                """),_display_(Seq[Any](/*40.18*/metaCardTag(tag.name,tag.slug,Html(tag.description),tag.featuredImage))),format.raw/*40.88*/("""
                </div>
                    <!-- /.col-lg-12 -->
            </div>
            <div class="container-fluid" >
                <h3 class="page-header">Notes Tagged """"),_display_(Seq[Any](/*45.56*/tag/*45.59*/.name)),format.raw/*45.64*/(""""</h3>
            """),_display_(Seq[Any](/*46.14*/for((shortnote,index) <-shortnotes.zipWithIndex) yield /*46.62*/{_display_(Seq[Any](format.raw/*46.63*/("""
                """),_display_(Seq[Any](/*47.18*/shortListItemNew(shortnote))),format.raw/*47.45*/("""

            """)))})),format.raw/*49.14*/("""
            </div>
        </div>
    </div>
""")))})))}
    }
    
    def render(tag:models.content.Tag,shortnotes:List[models.content.ShortNote]): play.api.templates.HtmlFormat.Appendable = apply(tag,shortnotes)
    
    def f:((models.content.Tag,List[models.content.ShortNote]) => play.api.templates.HtmlFormat.Appendable) = (tag,shortnotes) => apply(tag,shortnotes)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:23 IST 2014
                    SOURCE: W:/Pre School/app/views/tag_single_view.scala.html
                    HASH: 63d8b998ce4e4d9383a55254dfa48bf35b4957e1
                    MATRIX: 827->1|1004->121|1019->128|1103->132|1162->156|1176->162|1231->196|1301->231|1315->237|1380->281|1451->316|1466->322|1525->359|1596->394|1611->400|1660->427|1731->462|1746->468|1805->505|1876->540|1891->546|1953->586|2156->753|2171->759|2241->807|2316->846|2331->852|2384->883|2455->918|2470->924|2536->968|2581->997|2600->1007|2685->1011|2717->1027|2731->1032|2816->1036|3198->1382|3213->1388|3274->1427|3352->1469|3367->1475|3435->1521|3483->70|3515->108|3554->990|3587->1020|3620->1530|3658->1533|3786->1651|3827->1653|4042->1832|4134->1902|4357->2089|4369->2092|4396->2097|4453->2118|4517->2166|4556->2167|4611->2186|4660->2213|4709->2230
                    LINES: 26->1|29->7|29->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|39->15|42->18|42->18|42->18|43->19|43->19|43->19|46->23|46->23|48->23|50->26|50->26|52->26|56->30|56->30|56->30|57->31|57->31|57->31|59->1|60->3|64->22|65->25|66->32|67->33|67->33|67->33|74->40|74->40|79->45|79->45|79->45|80->46|80->46|80->46|81->47|81->47|83->49
                    -- GENERATED --
                */
            