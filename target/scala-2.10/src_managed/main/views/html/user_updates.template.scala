
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
object user_updates extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,List[models.Information.Notification_Info],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser:User,notification_infos:List[models.Information.Notification_Info]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import org.joda.time.format.ISODateTimeFormat

import views.html.templates._

def /*6.6*/scripts/*6.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.17*/("""
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/angular.js"))),format.raw/*7.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*8.69*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*9.66*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>

        <script src='"""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("js/restangular.js"))),format.raw/*12.60*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*13.77*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*14.72*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*15.73*/("""'></script>


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
Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*5.1*/("""
    """),format.raw/*18.6*/("""
    """),format.raw/*25.6*/("""
    """),format.raw/*34.6*/("""
"""),_display_(Seq[Any](/*35.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "profile", scriptsTop, scripts, links)/*35.123*/ {_display_(Seq[Any](format.raw/*35.125*/("""
    <div class="" style="height:40px">

    </div>
    <ul class="list-group">
    """),_display_(Seq[Any](/*40.6*/for(notification_info<-notification_infos) yield /*40.48*/{_display_(Seq[Any](format.raw/*40.49*/("""
        """),_display_(Seq[Any](/*41.10*/if(notification_info.notification_object.objectType.equals("shortNote"))/*41.82*/{_display_(Seq[Any](format.raw/*41.83*/("""
            <li class="list-group-item">"""),_display_(Seq[Any](/*42.42*/notification_info/*42.59*/.acted.name)),format.raw/*42.70*/(""" """),_display_(Seq[Any](/*42.72*/notification_info/*42.89*/.verb)),format.raw/*42.94*/(""" <a href=""""),_display_(Seq[Any](/*42.105*/routes/*42.111*/.Application.getShortNote(notification_info.notification_object.identifier))),format.raw/*42.186*/("""">"""),_display_(Seq[Any](/*42.189*/notification_info/*42.206*/.notification_object.objectType)),format.raw/*42.237*/("""</a> <span class="label label-primary">"""),_display_(Seq[Any](/*42.277*/notification_info/*42.294*/.isSeen)),format.raw/*42.301*/("""</span></li>
        """)))})),format.raw/*43.10*/("""
        """),_display_(Seq[Any](/*44.10*/if((notification_info.notification_object.objectType.equals("forumThread")))/*44.86*/{_display_(Seq[Any](format.raw/*44.87*/("""
            <li class="list-group-item">"""),_display_(Seq[Any](/*45.42*/notification_info/*45.59*/.acted.name)),format.raw/*45.70*/(""" """),_display_(Seq[Any](/*45.72*/notification_info/*45.89*/.verb)),format.raw/*45.94*/(""" <a href=""""),_display_(Seq[Any](/*45.105*/models/*45.111*/.Forum.ForumThread.getForumBySlug(notification_info.notification_object.identifier))),format.raw/*45.194*/("""">"""),_display_(Seq[Any](/*45.197*/notification_info/*45.214*/.notification_object.objectType)),format.raw/*45.245*/("""</a> <span class="label label-primary">"""),_display_(Seq[Any](/*45.285*/notification_info/*45.302*/.isSeen)),format.raw/*45.309*/("""</span></li>

        """)))})),format.raw/*47.10*/("""
        """),_display_(Seq[Any](/*48.10*/if((notification_info.notification_object.objectType.equals("forumAnswer")))/*48.86*/{_display_(Seq[Any](format.raw/*48.87*/("""
            <li class="list-group-item">"""),_display_(Seq[Any](/*49.42*/notification_info/*49.59*/.acted.name)),format.raw/*49.70*/(""" """),_display_(Seq[Any](/*49.72*/notification_info/*49.89*/.verb)),format.raw/*49.94*/(""" <a href=""""),_display_(Seq[Any](/*49.105*/models/*49.111*/.Forum.ForumAnswer.getForumAnswerBySlug(notification_info.notification_object.identifier))),format.raw/*49.200*/("""">"""),_display_(Seq[Any](/*49.203*/notification_info/*49.220*/.notification_object.objectType)),format.raw/*49.251*/("""</a> <span class="label label-primary">"""),_display_(Seq[Any](/*49.291*/notification_info/*49.308*/.isSeen)),format.raw/*49.315*/("""</span></li>

        """)))})),format.raw/*51.10*/("""

    """)))})),format.raw/*53.6*/("""
    </ul>

""")))})))}
    }
    
    def render(localUser:User,notification_infos:List[models.Information.Notification_Info]): play.api.templates.HtmlFormat.Appendable = apply(localUser,notification_infos)
    
    def f:((User,List[models.Information.Notification_Info]) => play.api.templates.HtmlFormat.Appendable) = (localUser,notification_infos) => apply(localUser,notification_infos)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:28 IST 2014
                    SOURCE: W:/Pre School/app/views/user_updates.scala.html
                    HASH: 2a599df6d9dba55665070434cc4532d726a15eef
                    MATRIX: 822->1|1054->165|1069->172|1153->176|1211->199|1225->205|1273->232|1342->266|1356->272|1417->312|1486->346|1500->352|1558->389|1760->555|1775->561|1828->592|1898->626|1913->632|1983->680|2053->714|2068->720|2133->763|2203->797|2218->803|2284->847|2326->872|2345->882|2430->886|2489->909|2504->915|2560->949|2630->983|2645->989|2711->1033|2781->1067|2796->1073|2855->1110|2897->1135|2911->1140|2996->1144|3374->1486|3389->1492|3436->1517|3514->1559|3529->1565|3590->1604|3667->1645|3682->1651|3750->1697|3797->79|3825->159|3857->866|3889->1129|3921->1705|3958->1707|4089->1828|4130->1830|4250->1915|4308->1957|4347->1958|4393->1968|4474->2040|4513->2041|4591->2083|4617->2100|4650->2111|4688->2113|4714->2130|4741->2135|4789->2146|4805->2152|4903->2227|4943->2230|4970->2247|5024->2278|5101->2318|5128->2335|5158->2342|5212->2364|5258->2374|5343->2450|5382->2451|5460->2493|5486->2510|5519->2521|5557->2523|5583->2540|5610->2545|5658->2556|5674->2562|5780->2645|5820->2648|5847->2665|5901->2696|5978->2736|6005->2753|6035->2760|6090->2783|6136->2793|6221->2869|6260->2870|6338->2912|6364->2929|6397->2940|6435->2942|6461->2959|6488->2964|6536->2975|6552->2981|6664->3070|6704->3073|6731->3090|6785->3121|6862->3161|6889->3178|6919->3185|6974->3208|7012->3215
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|45->19|45->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|53->26|53->26|55->26|59->30|59->30|59->30|61->32|61->32|61->32|62->33|62->33|62->33|64->1|66->5|67->18|68->25|69->34|70->35|70->35|70->35|75->40|75->40|75->40|76->41|76->41|76->41|77->42|77->42|77->42|77->42|77->42|77->42|77->42|77->42|77->42|77->42|77->42|77->42|77->42|77->42|77->42|78->43|79->44|79->44|79->44|80->45|80->45|80->45|80->45|80->45|80->45|80->45|80->45|80->45|80->45|80->45|80->45|80->45|80->45|80->45|82->47|83->48|83->48|83->48|84->49|84->49|84->49|84->49|84->49|84->49|84->49|84->49|84->49|84->49|84->49|84->49|84->49|84->49|84->49|86->51|88->53
                    -- GENERATED --
                */
            