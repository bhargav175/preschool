
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
object editForumThread extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,models.Forum.ForumThread,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser:User,forumThread:models.Forum.ForumThread):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.helper.form

import models.Forum._

import views.html.templates._

def /*7.6*/scripts/*7.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.15*/("""
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*8.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*9.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*10.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/angular.js"))),format.raw/*11.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*12.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*13.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*15.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("js/restangular.js"))),format.raw/*18.60*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*19.72*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*20.23*/routes/*20.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*20.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*21.23*/routes/*21.29*/.Assets.at("js/angularapps/forum.js"))),format.raw/*21.66*/("""'></script>


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
"""),format.raw/*3.1*/("""
"""),format.raw/*6.1*/("""
    """),format.raw/*24.6*/("""
    """),format.raw/*27.6*/("""
    """),format.raw/*34.6*/("""
"""),_display_(Seq[Any](/*35.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*35.117*/ {_display_(Seq[Any](format.raw/*35.119*/("""

<div class="row" ng-app="forum">
    <div ng-controller="editThreadController" ng-init="init()">
    <h1 class="page-header" >Add a New Question</h1>

    """),_display_(Seq[Any](/*41.6*/form(action = controllers.Forum.routes.Forum.saveEditedForumThread(), args = 'id -> "editQuestionForm")/*41.109*/{_display_(Seq[Any](format.raw/*41.110*/("""
        <div class="form-group">

        <input type="text" class="form-control" placeholder="Question Title" name="title" value=""""),_display_(Seq[Any](/*44.99*/forumThread/*44.110*/.title)),format.raw/*44.116*/("""">
</div>
            <div class="form-group">

            <textarea class="form-control" rows="3" placeholder="Question Content" name="text" >"""),_display_(Seq[Any](/*48.98*/forumThread/*48.109*/.text)),format.raw/*48.114*/("""</textarea>
      </div>
        <input type="hidden" value=""""),_display_(Seq[Any](/*50.38*/forumThread/*50.49*/.slug)),format.raw/*50.54*/("""" id="forumThreadSlug" name="forumThreadSlug"/>
        <div class="form-group clearfix">
            <label class="col-md-3 control-label" for="thread-tag-input">Add tag</label>
            <div class="col-md-9">

                <input class="form-control" type="text" id="thread-tag-input" autocomplete="off"  ng-model="threadTag" typeahead-on-select="addTagToThread($item)" typeahead="tag.name for tag in tagsList | filter:$viewValue" >
            </div>
        </div>

        <div class="form-group clearfix">
            <label class="col-md-3 control-label" for="tag-thread">Added Tags</label>
            <div class="col-md-9">
                <div class="well tags-well">

                </div>
            </div>
        </div>

        <div class="form-control" style="display:none" id="hidden-tags">

        </div>

        <div class="form-group">
            <button class="btn btn-success" type="submit">Update</button>

        </div>
    """)))})),format.raw/*76.6*/("""
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
                    DATE: Sun Dec 28 16:26:42 IST 2014
                    SOURCE: W:/Pre School/app/views/forum/editForumThread.scala.html
                    HASH: d1801d04a9168d005995ec78857cfdc768b2ef42
                    MATRIX: 813->1|1027->147|1042->154|1126->156|1184->179|1198->185|1253->219|1322->253|1336->259|1401->303|1471->337|1486->343|1545->380|1615->414|1630->420|1679->447|1749->481|1764->487|1823->524|1893->558|1908->564|1970->604|2171->769|2186->775|2256->823|2328->859|2343->865|2396->896|2466->930|2481->936|2546->979|2616->1013|2631->1019|2697->1063|2767->1097|2782->1103|2841->1140|2883->1165|2902->1175|2987->1177|3017->1190|3031->1195|3116->1197|3494->1539|3509->1545|3570->1584|3647->1625|3662->1631|3730->1677|3777->54|3804->86|3831->141|3863->1159|3895->1184|3927->1685|3964->1687|4089->1802|4130->1804|4323->1962|4436->2065|4476->2066|4645->2199|4666->2210|4695->2216|4876->2361|4897->2372|4925->2377|5023->2439|5043->2450|5070->2455|6062->3416
                    LINES: 26->1|33->7|33->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|52->25|52->25|54->25|56->28|56->28|58->28|62->32|62->32|62->32|63->33|63->33|63->33|65->1|66->3|67->6|68->24|69->27|70->34|71->35|71->35|71->35|77->41|77->41|77->41|80->44|80->44|80->44|84->48|84->48|84->48|86->50|86->50|86->50|112->76
                    -- GENERATED --
                */
            