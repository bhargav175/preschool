
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
object user_profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,List[models.Information.Activity_Change],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*3.2*/(user: models.User = null,activity_changes:List[models.Information.Activity_Change]):play.api.templates.HtmlFormat.Appendable = {
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
        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*16.73*/("""'></script>


    """)))};def /*20.6*/scriptsTop/*20.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.20*/("""
        <script src='"""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*21.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*22.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*23.66*/("""'></script>


    """)))};def /*27.6*/links/*27.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*27.15*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*31.39*/routes/*31.45*/.Assets.at("css/box.css"))),format.raw/*31.70*/("""'>

        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*33.39*/routes/*33.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*33.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*34.39*/routes/*34.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*34.91*/("""'>
    """)))};
Seq[Any](format.raw/*3.86*/("""
"""),format.raw/*6.1*/("""
    """),format.raw/*19.6*/("""
    """),format.raw/*26.6*/("""
    """),format.raw/*35.6*/("""
    """),_display_(Seq[Any](/*36.6*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "profile", scriptsTop, scripts, links)/*36.127*/ {_display_(Seq[Any](format.raw/*36.129*/("""
    <div class="userProfileContainer" ng-app="userProfile">

        <div class="">
            <div class="userInfo">

            """),_display_(Seq[Any](/*42.14*/userInfoCard(user))),format.raw/*42.32*/("""
            </div>
        </div>
        <div class="">
            <div class="activityList">

                <ul class="list-group">




            """),_display_(Seq[Any](/*53.14*/for(activity_change<-activity_changes) yield /*53.52*/{_display_(Seq[Any](format.raw/*53.53*/("""
                <li class="list-group-item">

           <div class="activityListItem">
               """),_display_(Seq[Any](/*57.17*/if(activity_change.activityObject.objectType.equals("shortNote"))/*57.82*/{_display_(Seq[Any](format.raw/*57.83*/("""
                   <h4 class="capitalize">"""),_display_(Seq[Any](/*58.44*/user/*58.48*/.name)),format.raw/*58.53*/(""" """),_display_(Seq[Any](/*58.55*/activity_change/*58.70*/.verb)),format.raw/*58.75*/(""" """),_display_(Seq[Any](/*58.77*/activity_change/*58.92*/.activityObject.objectType)),format.raw/*58.118*/(""" <a href=""""),_display_(Seq[Any](/*58.129*/routes/*58.135*/.Application.getShortNote(models.content.ShortNote.findShortNoteBySlug(activity_change.activityObject.identifier).slug))),format.raw/*58.254*/(""""> """),_display_(Seq[Any](/*58.258*/models/*58.264*/.content.ShortNote.findShortNoteBySlug(activity_change.activityObject.identifier).title)),format.raw/*58.351*/("""</a> on <span style="font-style: italic;font-weight:bold"> """),_display_(Seq[Any](/*58.411*/{ISODateTimeFormat.dateTimeParser().parseDateTime(activity_change.eventTime).toString("MMM dd yy")})),format.raw/*58.510*/("""</span>   at  <span style="font-style: italic;font-weight:bold"> """),_display_(Seq[Any](/*58.576*/{ISODateTimeFormat.dateTimeParser().parseDateTime(activity_change.eventTime).toString("HH : mm").concat("hrs") })),format.raw/*58.688*/("""</span></h4>

                   """),_display_(Seq[Any](/*60.21*/if(activity_change.verb=="created")/*60.56*/{_display_(Seq[Any](format.raw/*60.57*/("""

                       """),_display_(Seq[Any](/*62.25*/shortListItemBlock(models.content.ShortNote.findShortNoteBySlug(activity_change.activityObject.identifier)))),format.raw/*62.132*/("""
                   """)))}/*63.21*/else/*63.25*/{_display_(Seq[Any](format.raw/*63.26*/("""

                   """)))})),format.raw/*65.21*/("""

               """)))}/*67.17*/else/*67.21*/{_display_(Seq[Any](format.raw/*67.22*/("""
                   """),_display_(Seq[Any](/*68.21*/if(activity_change.activityObject.objectType.equals("forumThread"))/*68.88*/{_display_(Seq[Any](format.raw/*68.89*/("""
                       <h4 class="capitalize">"""),_display_(Seq[Any](/*69.48*/user/*69.52*/.name)),format.raw/*69.57*/(""" """),_display_(Seq[Any](/*69.59*/activity_change/*69.74*/.verb)),format.raw/*69.79*/(""" """),_display_(Seq[Any](/*69.81*/activity_change/*69.96*/.activityObject.objectType)),format.raw/*69.122*/(""" <a href=""""),_display_(Seq[Any](/*69.133*/controllers/*69.144*/.Forum.routes.Forum.getForumThread(models.Forum.ForumThread.getForumBySlug(activity_change.activityObject.identifier).slug))),format.raw/*69.267*/("""">"""),_display_(Seq[Any](/*69.270*/models/*69.276*/.Forum.ForumThread.getForumBySlug(activity_change.activityObject.identifier).title)),format.raw/*69.358*/("""</a> on <span style="font-style: italic;font-weight:bold"> """),_display_(Seq[Any](/*69.418*/{ISODateTimeFormat.dateTimeParser().parseDateTime(activity_change.eventTime).toString("MMM dd yy")})),format.raw/*69.517*/("""</span>   at  <span style="font-style: italic;font-weight:bold"> """),_display_(Seq[Any](/*69.583*/{ISODateTimeFormat.dateTimeParser().parseDateTime(activity_change.eventTime).toString("HH : mm").concat("hrs") })),format.raw/*69.695*/("""</span></h4>

                   """)))})),format.raw/*71.21*/("""
                   """),_display_(Seq[Any](/*72.21*/if(activity_change.activityObject.objectType.equals("forumAnswer"))/*72.88*/{_display_(Seq[Any](format.raw/*72.89*/("""
                       <h4 class="capitalize">"""),_display_(Seq[Any](/*73.48*/user/*73.52*/.name)),format.raw/*73.57*/(""" """),_display_(Seq[Any](/*73.59*/activity_change/*73.74*/.verb)),format.raw/*73.79*/(""" """),_display_(Seq[Any](/*73.81*/activity_change/*73.96*/.activityObject.objectType)),format.raw/*73.122*/(""" <a href=""""),_display_(Seq[Any](/*73.133*/controllers/*73.144*/.Forum.routes.Forum.getForumThread(models.Forum.ForumAnswer.getForumAnswerBySlug(activity_change.activityObject.identifier).forumThread.slug))),format.raw/*73.285*/("""">"""),_display_(Seq[Any](/*73.288*/models/*73.294*/.Forum.ForumAnswer.getForumAnswerBySlug(activity_change.activityObject.identifier).slug)),format.raw/*73.381*/("""</a> on <span style="font-style: italic;font-weight:bold"> """),_display_(Seq[Any](/*73.441*/{ISODateTimeFormat.dateTimeParser().parseDateTime(activity_change.eventTime).toString("MMM dd yy")})),format.raw/*73.540*/("""</span>   at  <span style="font-style: italic;font-weight:bold"> """),_display_(Seq[Any](/*73.606*/{ISODateTimeFormat.dateTimeParser().parseDateTime(activity_change.eventTime).toString("HH : mm").concat("hrs") })),format.raw/*73.718*/("""</span></h4>

                   """)))})),format.raw/*75.21*/("""
               """)))})),format.raw/*76.17*/("""


           </div>
                </li>
        """)))})),format.raw/*81.10*/("""
                </ul>
            </div>

        </div>
    </div>

    """)))})))}
    }
    
    def render(user:models.User,activity_changes:List[models.Information.Activity_Change]): play.api.templates.HtmlFormat.Appendable = apply(user,activity_changes)
    
    def f:((models.User,List[models.Information.Activity_Change]) => play.api.templates.HtmlFormat.Appendable) = (user,activity_changes) => apply(user,activity_changes)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:28 IST 2014
                    SOURCE: W:/Pre School/app/views/user_profile.scala.html
                    HASH: 3e9050861104b5eaaa514cf68343987864bd7945
                    MATRIX: 827->5|1067->178|1082->185|1166->189|1225->213|1239->219|1287->246|1357->281|1371->287|1432->327|1503->362|1518->368|1577->405|1782->574|1797->580|1850->611|1921->646|1936->652|2006->700|2077->735|2092->741|2157->784|2228->819|2243->825|2309->869|2354->898|2373->908|2458->912|2518->936|2533->942|2589->976|2660->1011|2675->1017|2741->1061|2812->1096|2827->1102|2886->1139|2931->1168|2945->1173|3030->1177|3412->1523|3427->1529|3474->1554|3554->1598|3569->1604|3630->1643|3708->1685|3723->1691|3791->1737|3839->89|3867->171|3900->891|3933->1161|3966->1746|4008->1753|4139->1874|4180->1876|4356->2016|4396->2034|4598->2200|4652->2238|4691->2239|4836->2348|4910->2413|4949->2414|5030->2459|5043->2463|5070->2468|5108->2470|5132->2485|5159->2490|5197->2492|5221->2507|5270->2533|5318->2544|5334->2550|5476->2669|5517->2673|5533->2679|5643->2766|5740->2826|5862->2925|5965->2991|6100->3103|6172->3139|6216->3174|6255->3175|6319->3203|6449->3310|6490->3332|6503->3336|6542->3337|6598->3361|6637->3381|6650->3385|6689->3386|6747->3408|6823->3475|6862->3476|6947->3525|6960->3529|6987->3534|7025->3536|7049->3551|7076->3556|7114->3558|7138->3573|7187->3599|7235->3610|7256->3621|7402->3744|7442->3747|7458->3753|7563->3835|7660->3895|7782->3994|7885->4060|8020->4172|8088->4208|8146->4230|8222->4297|8261->4298|8346->4347|8359->4351|8386->4356|8424->4358|8448->4373|8475->4378|8513->4380|8537->4395|8586->4421|8634->4432|8655->4443|8819->4584|8859->4587|8875->4593|8985->4680|9082->4740|9204->4839|9307->4905|9442->5017|9510->5053|9560->5071|9649->5128
                    LINES: 26->3|31->7|31->7|33->7|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|39->13|39->13|39->13|40->14|40->14|40->14|41->15|41->15|41->15|42->16|42->16|42->16|45->20|45->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|50->23|50->23|50->23|53->27|53->27|55->27|59->31|59->31|59->31|61->33|61->33|61->33|62->34|62->34|62->34|64->3|65->6|66->19|67->26|68->35|69->36|69->36|69->36|75->42|75->42|86->53|86->53|86->53|90->57|90->57|90->57|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|91->58|93->60|93->60|93->60|95->62|95->62|96->63|96->63|96->63|98->65|100->67|100->67|100->67|101->68|101->68|101->68|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|102->69|104->71|105->72|105->72|105->72|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|106->73|108->75|109->76|114->81
                    -- GENERATED --
                */
            