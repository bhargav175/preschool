
package views.html.forum

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
object forumPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.Forum.ForumThread],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(forumThreads:List[models.Forum.ForumThread]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import models.Forum._

import views.html.templates._

def /*5.6*/scripts/*5.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.15*/("""
        <script src='"""),_display_(Seq[Any](/*6.23*/routes/*6.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*6.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*7.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*8.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/angular.js"))),format.raw/*9.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*10.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*11.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*13.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/restangular.js"))),format.raw/*16.60*/("""'></script>


    """)))};def /*20.6*/scriptsTop/*20.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.18*/("""

    """)))};def /*23.6*/links/*23.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.13*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*27.39*/routes/*27.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*27.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*28.39*/routes/*28.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*28.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*4.1*/("""
    """),format.raw/*19.6*/("""
    """),format.raw/*22.6*/("""
    """),format.raw/*29.6*/("""
"""),_display_(Seq[Any](/*30.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.117*/ {_display_(Seq[Any](format.raw/*30.119*/("""

<div class="well whiteWell">
    <a class="btn btn-primary" href=""""),_display_(Seq[Any](/*33.39*/controllers/*33.50*/.Forum.routes.Forum.addForumThread())),format.raw/*33.86*/("""">Add Question</a>
</div>
<ul class="list-group">
"""),_display_(Seq[Any](/*36.2*/for(forumThread<-forumThreads) yield /*36.32*/{_display_(Seq[Any](format.raw/*36.33*/("""

    <li class="list-group-item capitalize clearfix"><div class="col-md-1"><span class="badge">"""),_display_(Seq[Any](/*38.96*/forumThread/*38.107*/.threadLikes.size())),format.raw/*38.126*/("""</span></div><div class="col-md-11"><a href=""""),_display_(Seq[Any](/*38.172*/controllers/*38.183*/.Forum.routes.Forum.getForumThread(forumThread.slug))),format.raw/*38.235*/("""">"""),_display_(Seq[Any](/*38.238*/forumThread/*38.249*/.text)),format.raw/*38.254*/("""</a></div></li>
""")))})),format.raw/*39.2*/("""
</ul>
""")))})),format.raw/*41.2*/("""
"""))}
    }
    
    def render(forumThreads:List[models.Forum.ForumThread]): play.api.templates.HtmlFormat.Appendable = apply(forumThreads)
    
    def f:((List[models.Forum.ForumThread]) => play.api.templates.HtmlFormat.Appendable) = (forumThreads) => apply(forumThreads)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:43 IST 2014
                    SOURCE: W:/Pre School/app/views/forum/forumPage.scala.html
                    HASH: 1a2ec1c329bf1cb44fc385e163a8d9e350465728
                    MATRIX: 808->1|983->107|998->114|1082->116|1140->139|1154->145|1209->179|1278->213|1292->219|1357->263|1426->297|1440->303|1498->340|1567->374|1581->380|1629->407|1699->441|1714->447|1773->484|1843->518|1858->524|1920->564|2121->729|2136->735|2206->783|2278->819|2293->825|2346->856|2388->881|2407->891|2492->893|2522->906|2536->911|2621->913|2999->1255|3014->1261|3075->1300|3152->1341|3167->1347|3235->1393|3282->46|3309->101|3341->875|3373->900|3405->1401|3442->1403|3567->1518|3608->1520|3713->1589|3733->1600|3791->1636|3877->1687|3923->1717|3962->1718|4095->1815|4116->1826|4158->1845|4241->1891|4262->1902|4337->1954|4377->1957|4398->1968|4426->1973|4474->1990|4513->1998
                    LINES: 26->1|31->5|31->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|44->16|44->16|44->16|47->20|47->20|49->20|51->23|51->23|53->23|57->27|57->27|57->27|58->28|58->28|58->28|60->1|61->4|62->19|63->22|64->29|65->30|65->30|65->30|68->33|68->33|68->33|71->36|71->36|71->36|73->38|73->38|73->38|73->38|73->38|73->38|73->38|73->38|73->38|74->39|76->41
                    -- GENERATED --
                */
            