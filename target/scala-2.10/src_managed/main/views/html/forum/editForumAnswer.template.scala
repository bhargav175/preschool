
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
object editForumAnswer extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[User,models.Forum.ForumAnswer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser:User,forumAnswer:models.Forum.ForumAnswer):play.api.templates.HtmlFormat.Appendable = {
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



    """)))};def /*23.6*/scriptsTop/*23.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.18*/("""

    """)))};def /*26.6*/links/*26.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.13*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*30.39*/routes/*30.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*30.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*31.39*/routes/*31.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*31.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.55*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.1*/("""
    """),format.raw/*22.6*/("""
    """),format.raw/*25.6*/("""
    """),format.raw/*32.6*/("""
"""),_display_(Seq[Any](/*33.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*33.117*/ {_display_(Seq[Any](format.raw/*33.119*/("""

<div class="">
    <div >
    <h1 class="page-header" >Edit Answer</h1>

    """),_display_(Seq[Any](/*39.6*/form(action = controllers.Forum.routes.Forum.saveEditedAnswer(), args = 'id -> "editAnswerForm",'class->"form-horizontal")/*39.128*/{_display_(Seq[Any](format.raw/*39.129*/("""
        <div class="form-group">
        <textarea name="answerText" class="form-control" rows="3">"""),_display_(Seq[Any](/*41.68*/forumAnswer/*41.79*/.text)),format.raw/*41.84*/("""</textarea>
            </div>
        <input type="hidden" name="slug" value=""""),_display_(Seq[Any](/*43.50*/forumAnswer/*43.61*/.slug)),format.raw/*43.66*/("""">
        <div class="form-group">
            <button class="btn btn-success" type="submit">Update</button>

        </div>
    """)))})),format.raw/*48.6*/("""
    </div>

</div>

""")))})))}
    }
    
    def render(localUser:User,forumAnswer:models.Forum.ForumAnswer): play.api.templates.HtmlFormat.Appendable = apply(localUser,forumAnswer)
    
    def f:((User,models.Forum.ForumAnswer) => play.api.templates.HtmlFormat.Appendable) = (localUser,forumAnswer) => apply(localUser,forumAnswer)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:42 IST 2014
                    SOURCE: W:/Pre School/app/views/forum/editForumAnswer.scala.html
                    HASH: 9f68f961fefb4db96cbc9fd53d7f4a7613be553d
                    MATRIX: 813->1|1027->147|1042->154|1126->156|1184->179|1198->185|1253->219|1322->253|1336->259|1401->303|1471->337|1486->343|1545->380|1615->414|1630->420|1679->447|1749->481|1764->487|1823->524|1893->558|1908->564|1970->604|2171->769|2186->775|2256->823|2328->859|2343->865|2396->896|2439->922|2458->932|2543->934|2573->947|2587->952|2672->954|3050->1296|3065->1302|3126->1341|3203->1382|3218->1388|3286->1434|3333->54|3360->86|3387->141|3419->916|3451->941|3483->1442|3520->1444|3645->1559|3686->1561|3801->1641|3933->1763|3973->1764|4110->1865|4130->1876|4157->1881|4273->1961|4293->1972|4320->1977|4482->2108
                    LINES: 26->1|33->7|33->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|46->18|46->18|46->18|50->23|50->23|52->23|54->26|54->26|56->26|60->30|60->30|60->30|61->31|61->31|61->31|63->1|64->3|65->6|66->22|67->25|68->32|69->33|69->33|69->33|75->39|75->39|75->39|77->41|77->41|77->41|79->43|79->43|79->43|84->48
                    -- GENERATED --
                */
            