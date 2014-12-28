
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
object concept_view extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.content.Concept,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(concept:models.content.Concept):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.34*/("""
    """),format.raw/*3.1*/("""



    """),format.raw/*21.2*/("""
"""),format.raw/*24.2*/("""
"""),format.raw/*31.2*/("""
"""),_display_(Seq[Any](/*32.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*32.117*/ {_display_(Seq[Any](format.raw/*32.119*/("""


<div ng-app="siteContent">
    <div ng-controller="conceptContentController">
    <div class="row">
        <div class="col-md-12">
        """),_display_(Seq[Any](/*39.10*/metaCard("Concept",concept.name,Html(concept.description),concept.featuredImage))),format.raw/*39.90*/("""
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row"  >

</div>
</div>
</div>
""")))})))}
    }
    
    def render(concept:models.content.Concept): play.api.templates.HtmlFormat.Appendable = apply(concept)
    
    def f:((models.content.Concept) => play.api.templates.HtmlFormat.Appendable) = (concept) => apply(concept)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:21 IST 2014
                    SOURCE: W:/Pre School/app/views/concept_view.scala.html
                    HASH: ace25c48405e3cc9320bf215a049ad52c81d5654
                    MATRIX: 797->1|937->84|952->91|1036->93|1091->113|1105->119|1160->153|1226->184|1240->190|1305->234|1372->265|1387->271|1446->308|1513->339|1528->345|1577->372|1644->403|1659->409|1718->446|1785->477|1800->483|1862->523|2057->682|2072->688|2142->736|2213->771|2228->777|2281->808|2322->829|2341->839|2426->841|2454->849|2467->854|2551->856|2917->1186|2932->1192|2993->1231|3067->1269|3082->1275|3150->1321|3194->33|3226->71|3265->826|3294->846|3323->1326|3361->1329|3486->1444|3527->1446|3714->1597|3816->1677
                    LINES: 26->1|29->7|29->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|39->15|42->18|42->18|42->18|45->22|45->22|47->22|49->25|49->25|51->25|55->29|55->29|55->29|56->30|56->30|56->30|58->1|59->3|63->21|64->24|65->31|66->32|66->32|66->32|73->39|73->39
                    -- GENERATED --
                */
            