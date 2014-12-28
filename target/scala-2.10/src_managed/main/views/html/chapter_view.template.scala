
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
object chapter_view extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[models.content.Chapter,List[models.content.Concept],List[models.content.ShortNote],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(chapter:models.content.Chapter,concepts:List[models.content.Concept],shortnotes:List[models.content.ShortNote]):play.api.templates.HtmlFormat.Appendable = {
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


""")))};def /*23.2*/scriptsTop/*23.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.14*/("""

""")))};def /*26.2*/links/*26.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.9*/("""
    <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
    <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*30.35*/routes/*30.41*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*30.80*/("""'>
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*31.35*/routes/*31.41*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*31.87*/("""'>
""")))};
Seq[Any](format.raw/*1.114*/("""
    """),format.raw/*3.1*/("""



    """),format.raw/*22.2*/("""
"""),format.raw/*25.2*/("""
"""),format.raw/*32.2*/("""
"""),_display_(Seq[Any](/*33.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*33.117*/ {_display_(Seq[Any](format.raw/*33.119*/("""


<div ng-app="siteContent">
    <div >
    <div class="row">
        <div class="col-md-12">

        """),_display_(Seq[Any](/*41.10*/metaCard("Chapter",chapter.name,Html(chapter.description),chapter.featuredImage))),format.raw/*41.90*/("""
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row"  >
    <div class="container-fluid"  >
        <div class="">
            <h3 class="page-header">Concepts in <span class="capitalize">"""),_display_(Seq[Any](/*48.75*/chapter/*48.82*/.name)),format.raw/*48.87*/("""</span></h3>
                """),_display_(Seq[Any](/*49.18*/for((concept,index) <-concepts.zipWithIndex) yield /*49.62*/{_display_(Seq[Any](format.raw/*49.63*/("""

                    <a class="metr" href=""""),_display_(Seq[Any](/*51.44*/routes/*51.50*/.Application.concept(concept.slug))),format.raw/*51.84*/("""">"""),_display_(Seq[Any](/*51.87*/metroCard(concept.name,Html(concept.descriptionHtml),concept.featuredImage))),format.raw/*51.162*/("""</a>



                """)))})),format.raw/*55.18*/("""





        </div>


    </div>

        <div class="container-fluid" >
            <h3 class="page-header">Notes in """"),_display_(Seq[Any](/*67.48*/chapter/*67.55*/.name)),format.raw/*67.60*/(""""</h3>
            """),_display_(Seq[Any](/*68.14*/for((shortnote,index) <-shortnotes.zipWithIndex) yield /*68.62*/{_display_(Seq[Any](format.raw/*68.63*/("""
                """),_display_(Seq[Any](/*69.18*/shortListItemNew(shortnote))),format.raw/*69.45*/("""

            """)))})),format.raw/*71.14*/("""
        </div>

</div>
</div>
</div>
""")))})))}
    }
    
    def render(chapter:models.content.Chapter,concepts:List[models.content.Concept],shortnotes:List[models.content.ShortNote]): play.api.templates.HtmlFormat.Appendable = apply(chapter,concepts,shortnotes)
    
    def f:((models.content.Chapter,List[models.content.Concept],List[models.content.ShortNote]) => play.api.templates.HtmlFormat.Appendable) = (chapter,concepts,shortnotes) => apply(chapter,concepts,shortnotes)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:21 IST 2014
                    SOURCE: W:/Pre School/app/views/chapter_view.scala.html
                    HASH: 4bc117f0b5ee136ca18de32658c9a4a3587d3a6a
                    MATRIX: 857->1|1077->164|1092->171|1176->173|1231->193|1245->199|1300->233|1366->264|1380->270|1445->314|1512->345|1527->351|1586->388|1653->419|1668->425|1717->452|1784->483|1799->489|1858->526|1925->557|1940->563|2002->603|2197->762|2212->768|2282->816|2353->851|2368->857|2421->888|2492->923|2507->929|2573->973|2614->994|2633->1004|2718->1006|2746->1014|2759->1019|2843->1021|3209->1351|3224->1357|3285->1396|3359->1434|3374->1440|3442->1486|3487->113|3519->151|3558->991|3587->1011|3616->1491|3654->1494|3779->1609|3820->1611|3969->1724|4071->1804|4331->2028|4347->2035|4374->2040|4441->2071|4501->2115|4540->2116|4623->2163|4638->2169|4694->2203|4733->2206|4831->2281|4892->2310|5061->2443|5077->2450|5104->2455|5161->2476|5225->2524|5264->2525|5319->2544|5368->2571|5417->2588
                    LINES: 26->1|29->7|29->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|39->15|42->18|42->18|42->18|43->19|43->19|43->19|46->23|46->23|48->23|50->26|50->26|52->26|56->30|56->30|56->30|57->31|57->31|57->31|59->1|60->3|64->22|65->25|66->32|67->33|67->33|67->33|75->41|75->41|82->48|82->48|82->48|83->49|83->49|83->49|85->51|85->51|85->51|85->51|85->51|89->55|101->67|101->67|101->67|102->68|102->68|102->68|103->69|103->69|105->71
                    -- GENERATED --
                */
            