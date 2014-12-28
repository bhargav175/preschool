
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
object addForumThread extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser:User):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.1*/("""
    """),format.raw/*24.6*/("""
    """),format.raw/*27.6*/("""
    """),format.raw/*34.6*/("""
"""),_display_(Seq[Any](/*35.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*35.117*/ {_display_(Seq[Any](format.raw/*35.119*/("""

<div class="row" ng-app="forum">
    <div ng-controller="addThreadController" ng-init="init()">
    <h1 class="page-header" >Add a New Question</h1>

    """),_display_(Seq[Any](/*41.6*/form(action = controllers.Forum.routes.Forum.saveQuestion(), args = 'id -> "addQuestionForm")/*41.99*/{_display_(Seq[Any](format.raw/*41.100*/("""
        <div class="form-group">
        <input type="text" class="form-control" placeholder="Question Title" name="title">
            </div>
        <div class="form-group">
        <textarea class="form-control" rows="3" placeholder="Question Content" name="text"></textarea>
</div>
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
            <button class="btn btn-success" type="submit">Submit</button>

        </div>
    """)))})),format.raw/*73.6*/("""
    </div>

</div>

""")))})))}
    }
    
    def render(localUser:User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:42 IST 2014
                    SOURCE: W:/Pre School/app/views/forum/addForumThread.scala.html
                    HASH: cb0372c829be99c8e4285621e59f95eb022ee37b
                    MATRIX: 787->1|964->110|979->117|1063->119|1121->142|1135->148|1190->182|1259->216|1273->222|1338->266|1408->300|1423->306|1482->343|1552->377|1567->383|1616->410|1686->444|1701->450|1760->487|1830->521|1845->527|1907->567|2108->732|2123->738|2193->786|2265->822|2280->828|2333->859|2403->893|2418->899|2483->942|2553->976|2568->982|2634->1026|2704->1060|2719->1066|2778->1103|2820->1128|2839->1138|2924->1140|2954->1153|2968->1158|3053->1160|3431->1502|3446->1508|3507->1547|3584->1588|3599->1594|3667->1640|3714->17|3741->49|3768->104|3800->1122|3832->1147|3864->1648|3901->1650|4026->1765|4067->1767|4259->1924|4361->2017|4401->2018|5632->3218
                    LINES: 26->1|33->7|33->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|52->25|52->25|54->25|56->28|56->28|58->28|62->32|62->32|62->32|63->33|63->33|63->33|65->1|66->3|67->6|68->24|69->27|70->34|71->35|71->35|71->35|77->41|77->41|77->41|109->73
                    -- GENERATED --
                */
            