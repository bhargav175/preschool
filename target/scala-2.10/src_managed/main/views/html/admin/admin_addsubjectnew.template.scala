
package views.html.admin

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
object admin_addsubjectnew extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[models.User,models.content.Tag,Form[models.content.Subject],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null,tag:models.content.Tag=null,myForm:Form[models.content.Subject]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.admin.partials._

def /*3.6*/scripts/*3.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.15*/("""
        <script src='"""),_display_(Seq[Any](/*4.23*/routes/*4.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*4.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*5.23*/routes/*5.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*5.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*6.23*/routes/*6.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*6.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/angular.js"))),format.raw/*7.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*8.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*9.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*11.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("js/restangular.js"))),format.raw/*14.60*/("""'></script>

        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/angularapps/admin-dashboard.js"))),format.raw/*16.76*/("""'></script>
    """)))};def /*18.6*/scriptsTop/*18.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.18*/("""

    """)))};def /*21.6*/links/*21.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.13*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*25.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*26.39*/routes/*26.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*26.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.97*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*17.6*/("""
    """),format.raw/*20.6*/("""
    """),format.raw/*27.6*/("""
"""),_display_(Seq[Any](/*28.2*/template_admin_dashboard(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*28.105*/ {_display_(Seq[Any](format.raw/*28.107*/("""

"""),_display_(Seq[Any](/*30.2*/helper/*30.8*/.form(action=null)/*30.26*/{_display_(Seq[Any](format.raw/*30.27*/("""
    """),_display_(Seq[Any](/*31.6*/helper/*31.12*/.inputText(myForm("username")))),format.raw/*31.42*/("""

    """),_display_(Seq[Any](/*33.6*/helper/*33.12*/.inputPassword(myForm("password")))),format.raw/*33.46*/("""
""")))})),format.raw/*34.2*/("""


""")))})))}
    }
    
    def render(localUser:models.User,tag:models.content.Tag,myForm:Form[models.content.Subject]): play.api.templates.HtmlFormat.Appendable = apply(localUser,tag,myForm)
    
    def f:((models.User,models.content.Tag,Form[models.content.Subject]) => play.api.templates.HtmlFormat.Appendable) = (localUser,tag,myForm) => apply(localUser,tag,myForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:34 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_addsubjectnew.scala.html
                    HASH: 2613c4b19e96890cd1ef09e82974c2bc8693218f
                    MATRIX: 847->1|1054->138|1069->145|1153->147|1211->170|1225->176|1280->210|1349->244|1363->250|1428->294|1497->328|1511->334|1569->371|1638->405|1652->411|1700->438|1769->472|1783->478|1841->515|1910->549|1924->555|1985->595|2186->760|2201->766|2271->814|2343->850|2358->856|2411->887|2482->922|2497->928|2566->975|2606->998|2625->1008|2710->1010|2740->1023|2754->1028|2839->1030|3217->1372|3232->1378|3293->1417|3370->1458|3385->1464|3453->1510|3500->96|3527->133|3558->992|3590->1017|3622->1518|3659->1520|3772->1623|3813->1625|3851->1628|3865->1634|3892->1652|3931->1653|3972->1659|3987->1665|4039->1695|4081->1702|4096->1708|4152->1742|4185->1744
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|44->16|44->16|44->16|45->18|45->18|47->18|49->21|49->21|51->21|55->25|55->25|55->25|56->26|56->26|56->26|58->1|59->3|59->17|60->20|61->27|62->28|62->28|62->28|64->30|64->30|64->30|64->30|65->31|65->31|65->31|67->33|67->33|67->33|68->34
                    -- GENERATED --
                */
            