
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
object singleForumThread extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,models.Forum.ForumThread,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser:User,forumThread:models.Forum.ForumThread):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.helper.form

import models.Forum._

import views.html.templates._

def /*6.6*/scripts/*6.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.15*/("""
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*7.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*8.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*9.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/angular.js"))),format.raw/*10.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*11.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*12.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*14.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("js/restangular.js"))),format.raw/*17.60*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*18.72*/("""'></script>

        <script src='"""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*20.73*/("""'></script>

        <script src='"""),_display_(Seq[Any](/*22.23*/routes/*22.29*/.Assets.at("js/angularapps/forum.js"))),format.raw/*22.66*/("""'></script>

    """)))};def /*25.6*/scriptsTop/*25.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*25.18*/("""

    """)))};def /*28.6*/links/*28.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*28.13*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*32.39*/routes/*32.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*32.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*33.39*/routes/*33.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*33.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*5.1*/("""
    """),format.raw/*24.6*/("""
    """),format.raw/*27.6*/("""
    """),format.raw/*34.6*/("""
"""),_display_(Seq[Any](/*35.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*35.117*/ {_display_(Seq[Any](format.raw/*35.119*/("""
<div ng-app="forum">
    <div class="well whiteWell capitalize clearfix" ng-controller="addAnswerController" ng-init="init()">
        <div class="col-md-1 clearfix likeBox" ng-controller="likeThreadController">
            <p class="forumThreadLikesCount"><span class="badge">"""),_display_(Seq[Any](/*39.67*/forumThread/*39.78*/.threadLikes.size())),format.raw/*39.97*/("""</span></p><p   class="likeThread">
            <i ng-hide="isLiked" class="fa fa-heart-o fa-fw" ng-click="doLikeThread()"></i>
            <i ng-show="isLiked" style="color:pink;" class="fa fa-heart fa-fw" ng-click="doLikeThread()"></i></p>
            <input type="hidden" id="forumThreadSlug" value=""""),_display_(Seq[Any](/*42.63*/forumThread/*42.74*/.slug)),format.raw/*42.79*/("""">
        </div>
        <div class="col-md-11 clearfix">
    <h1 class="page-header">"""),_display_(Seq[Any](/*45.30*/forumThread/*45.41*/.title)),format.raw/*45.47*/("""</h1>
    <p>"""),_display_(Seq[Any](/*46.9*/forumThread/*46.20*/.text)),format.raw/*46.25*/("""</p>

    <hr>
    <p>
        """),_display_(Seq[Any](/*50.10*/for(tag<-forumThread.tags) yield /*50.36*/{_display_(Seq[Any](format.raw/*50.37*/("""
            <span class="badge">"""),_display_(Seq[Any](/*51.34*/tag/*51.37*/.name)),format.raw/*51.42*/("""</span>
        """)))})),format.raw/*52.10*/("""
    </p>
        <hr>
        <div class="form-group">
        <a class="btn btn-primary" ng-hide="addAnswerForm" ng-click="toggleAddAnswerForm()"> Add Answer</a>
        """),_display_(Seq[Any](/*57.10*/if(localUser!=null)/*57.29*/{_display_(Seq[Any](format.raw/*57.30*/("""
            """),_display_(Seq[Any](/*58.14*/if(forumThread.createdBy.equals(localUser))/*58.57*/{_display_(Seq[Any](format.raw/*58.58*/("""
                <a class="btn btn-warning pull-right" href=""""),_display_(Seq[Any](/*59.62*/controllers/*59.73*/.Forum.routes.Forum.editForumThread(forumThread.slug))),format.raw/*59.126*/(""""> Edit Question</a>

            """)))})),format.raw/*61.14*/("""
        """)))})),format.raw/*62.10*/("""
        </div>

        <div ng-show="addAnswerForm">
        """),_display_(Seq[Any](/*66.10*/form(action = controllers.Forum.routes.Forum.saveAnswer(), args = 'id -> "addAnswerForm")/*66.99*/{_display_(Seq[Any](format.raw/*66.100*/("""
            <div class="form-group">
            <textarea class="form-control" rows="3" placeholder="Answer Content" name="text"></textarea>
            </div>
            <input type="hidden" value=""""),_display_(Seq[Any](/*70.42*/forumThread/*70.53*/.slug)),format.raw/*70.58*/("""" name="questionSlug"/>
            <div class="form-group"><button class="btn btn-success" type="submit">Submit</button>
            <button class="btn btn-warning" type="reset" ng-click="toggleAddAnswerForm()">Cancel</button>
                </div>
        """)))})),format.raw/*74.10*/("""
        </div>
        </div>
    </div>
        <div class="">
        <ul class="list-group" ng-controller="likeAnswerController">
        """),_display_(Seq[Any](/*80.10*/for((forumAnswer,i)<-forumThread.answers.zipWithIndex) yield /*80.64*/{_display_(Seq[Any](format.raw/*80.65*/("""
            <li class="list-group-item capitalize clearfix forumAnswerListItem" id="answer"""),_display_(Seq[Any](/*81.92*/forumAnswer/*81.103*/.id)),format.raw/*81.106*/("""">
                <input type="hidden" class="answerSlug" value=""""),_display_(Seq[Any](/*82.65*/forumAnswer/*82.76*/.slug)),format.raw/*82.81*/("""">
                <div class="col-md-1 clearfix"><p class="forumAnswerLikesCount"><span class="badge">"""),_display_(Seq[Any](/*83.102*/forumAnswer/*83.113*/.answerLikes.size())),format.raw/*83.132*/("""</span></p><p class="likeAnswer" >
                    <i class="fa fa-heart-o fa-fw notLiked" ng-click="doLikeAnswer($event)" style="display:none"></i>
                    <i style="color:pink" class="fa fa-heart fa-fw liked" ng-click="doLikeAnswer($event)"  style="display:none"></i></p> </div>
                <div class="col-md-11 clearfix" >"""),_display_(Seq[Any](/*86.51*/forumAnswer/*86.62*/.text)),format.raw/*86.67*/("""
            """),_display_(Seq[Any](/*87.14*/if(forumAnswer.createdBy.equals(localUser))/*87.57*/{_display_(Seq[Any](format.raw/*87.58*/("""
                <hr>
               <p> <a href=""""),_display_(Seq[Any](/*89.30*/controllers/*89.41*/.Forum.routes.Forum.editAnswerThread(forumAnswer.slug))),format.raw/*89.95*/("""">Edit</a></p>
            """)))})),format.raw/*90.14*/("""
                    <hr>
                    <span class="capitalize"><a class="label label-info" href=""""),_display_(Seq[Any](/*92.81*/routes/*92.87*/.Application.profile(forumAnswer.createdBy.name))),format.raw/*92.135*/("""">"""),_display_(Seq[Any](/*92.138*/forumAnswer/*92.149*/.createdBy.name)),format.raw/*92.164*/("""</a></span>
                </div>
            </li>

    """)))})),format.raw/*96.6*/("""
        </ul>


    </div>
</div>

""")))})))}
    }
    
    def render(localUser:User,forumThread:models.Forum.ForumThread): play.api.templates.HtmlFormat.Appendable = apply(localUser,forumThread)
    
    def f:((User,models.Forum.ForumThread) => play.api.templates.HtmlFormat.Appendable) = (localUser,forumThread) => apply(localUser,forumThread)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:43 IST 2014
                    SOURCE: W:/Pre School/app/views/forum/singleForumThread.scala.html
                    HASH: 19b186445f04f4d94b9f3b9cb3e4cb9e14ee8722
                    MATRIX: 815->1|1029->146|1044->153|1128->155|1186->178|1200->184|1255->218|1324->252|1338->258|1403->302|1472->336|1486->342|1544->379|1614->413|1629->419|1678->446|1748->480|1763->486|1822->523|1892->557|1907->563|1969->603|2170->768|2185->774|2255->822|2327->858|2342->864|2395->895|2465->929|2480->935|2545->978|2616->1013|2631->1019|2697->1063|2768->1098|2783->1104|2842->1141|2883->1165|2902->1175|2987->1177|3017->1190|3031->1195|3116->1197|3494->1539|3509->1545|3570->1584|3647->1625|3662->1631|3730->1677|3777->54|3804->140|3836->1159|3868->1184|3900->1685|3937->1687|4062->1802|4103->1804|4418->2083|4438->2094|4479->2113|4819->2417|4839->2428|4866->2433|4990->2521|5010->2532|5038->2538|5087->2552|5107->2563|5134->2568|5202->2600|5244->2626|5283->2627|5353->2661|5365->2664|5392->2669|5441->2686|5650->2859|5678->2878|5717->2879|5767->2893|5819->2936|5858->2937|5956->2999|5976->3010|6052->3063|6119->3098|6161->3108|6261->3172|6359->3261|6399->3262|6638->3465|6658->3476|6685->3481|6977->3741|7156->3884|7226->3938|7265->3939|7393->4031|7414->4042|7440->4045|7543->4112|7563->4123|7590->4128|7731->4232|7752->4243|7794->4262|8177->4609|8197->4620|8224->4625|8274->4639|8326->4682|8365->4683|8452->4734|8472->4745|8548->4799|8608->4827|8750->4933|8765->4939|8836->4987|8876->4990|8897->5001|8935->5016|9025->5075
                    LINES: 26->1|33->6|33->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|43->14|43->14|43->14|46->17|46->17|46->17|47->18|47->18|47->18|49->20|49->20|49->20|51->22|51->22|51->22|53->25|53->25|55->25|57->28|57->28|59->28|63->32|63->32|63->32|64->33|64->33|64->33|66->1|67->5|68->24|69->27|70->34|71->35|71->35|71->35|75->39|75->39|75->39|78->42|78->42|78->42|81->45|81->45|81->45|82->46|82->46|82->46|86->50|86->50|86->50|87->51|87->51|87->51|88->52|93->57|93->57|93->57|94->58|94->58|94->58|95->59|95->59|95->59|97->61|98->62|102->66|102->66|102->66|106->70|106->70|106->70|110->74|116->80|116->80|116->80|117->81|117->81|117->81|118->82|118->82|118->82|119->83|119->83|119->83|122->86|122->86|122->86|123->87|123->87|123->87|125->89|125->89|125->89|126->90|128->92|128->92|128->92|128->92|128->92|128->92|132->96
                    -- GENERATED --
                */
            