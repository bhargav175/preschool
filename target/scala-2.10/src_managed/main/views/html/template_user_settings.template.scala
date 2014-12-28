
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
object template_user_settings extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*3.2*/(user: models.User)(content:Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import org.joda.time.format.ISODateTimeFormat

import views.html.templates._

def /*7.6*/scripts/*7.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.17*/("""
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/angular.js"))),format.raw/*8.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*9.69*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*10.66*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>

        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/restangular.js"))),format.raw/*13.60*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*14.77*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*15.72*/("""'></script>


    """)))};def /*19.6*/scriptsTop/*19.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.20*/("""
        <script src='"""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*20.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*21.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*22.66*/("""'></script>


    """)))};def /*26.6*/links/*26.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.15*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*30.39*/routes/*30.45*/.Assets.at("css/box.css"))),format.raw/*30.70*/("""'>

        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*32.39*/routes/*32.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*32.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*33.39*/routes/*33.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*33.91*/("""'>
    """)))};
Seq[Any](format.raw/*3.35*/("""
"""),format.raw/*6.1*/("""
    """),format.raw/*18.6*/("""
    """),format.raw/*25.6*/("""
    """),format.raw/*34.6*/("""
"""),_display_(Seq[Any](/*35.2*/template_user_dashboard_semantic_new("Settings", "settings", scriptsTop, scripts, links)/*35.90*/ {_display_(Seq[Any](format.raw/*35.92*/("""
<div class="" style="height:40px">

</div>

    <div class="container-fluid">
     <div class="col-md-3">
        <ul class="list-group">
            <li class="list-group-item"><a href=""""),_display_(Seq[Any](/*43.51*/routes/*43.57*/.Application.settings())),format.raw/*43.80*/("""">General</a></li>
            <li class="list-group-item"><a href=""""),_display_(Seq[Any](/*44.51*/routes/*44.57*/.Account.changePassword())),format.raw/*44.82*/("""">Password Change</a></li>
            <li class="list-group-item"><a href=""""),_display_(Seq[Any](/*45.51*/routes/*45.57*/.Account.askLink())),format.raw/*45.75*/("""">Link Accounts</a></li>
        </ul>
     </div>
        <div class="col-md-9">
            """),_display_(Seq[Any](/*49.14*/content)),format.raw/*49.21*/("""
        </div>
    </div>



""")))})))}
    }
    
    def render(user:models.User,content:Html): play.api.templates.HtmlFormat.Appendable = apply(user)(content)
    
    def f:((models.User) => (Html) => play.api.templates.HtmlFormat.Appendable) = (user) => (content) => apply(user)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:24 IST 2014
                    SOURCE: W:/Pre School/app/views/template_user_settings.scala.html
                    HASH: c20d89691badb5275717fe951a920df59f1ab077
                    MATRIX: 801->3|988->121|1003->128|1087->132|1145->155|1159->161|1207->188|1276->222|1290->228|1351->268|1421->302|1436->308|1495->345|1697->511|1712->517|1765->548|1835->582|1850->588|1920->636|1990->670|2005->676|2070->719|2112->744|2131->754|2216->758|2275->781|2290->787|2346->821|2416->855|2431->861|2497->905|2567->939|2582->945|2641->982|2683->1007|2697->1012|2782->1016|3160->1358|3175->1364|3222->1389|3300->1431|3315->1437|3376->1476|3453->1517|3468->1523|3536->1569|3583->36|3610->115|3642->738|3674->1001|3706->1577|3743->1579|3840->1667|3880->1669|4105->1858|4120->1864|4165->1887|4270->1956|4285->1962|4332->1987|4445->2064|4460->2070|4500->2088|4631->2183|4660->2190
                    LINES: 26->3|31->7|31->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|39->13|39->13|39->13|40->14|40->14|40->14|41->15|41->15|41->15|44->19|44->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|52->26|52->26|54->26|58->30|58->30|58->30|60->32|60->32|60->32|61->33|61->33|61->33|63->3|64->6|65->18|66->25|67->34|68->35|68->35|68->35|76->43|76->43|76->43|77->44|77->44|77->44|78->45|78->45|78->45|82->49|82->49
                    -- GENERATED --
                */
            