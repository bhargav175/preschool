
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
object admin_editShortNote extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.ShortNote,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null,shortNote:models.content.ShortNote):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.admin._

def /*4.6*/scripts/*4.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.15*/("""

        <script src='"""),_display_(Seq[Any](/*6.23*/routes/*6.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*6.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*7.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*8.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/angular.js"))),format.raw/*9.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*10.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*11.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*13.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/restangular.js"))),format.raw/*16.60*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("js/angularapps/admin-dashboard.js"))),format.raw/*19.76*/("""'></script>


    <script src='"""),_display_(Seq[Any](/*22.19*/routes/*22.25*/.Assets.at("js/angularapps/admin-editdata.js"))),format.raw/*22.71*/("""'></script>

""")))};def /*25.2*/scriptsTop/*25.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*25.14*/("""

""")))};def /*28.2*/links/*28.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*28.9*/("""
    <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
    <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*32.35*/routes/*32.41*/.Assets.at("/css/bootstrap-wysiwyg.css"))),format.raw/*32.81*/("""'>
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*33.35*/routes/*33.41*/.Assets.at("/css/google-prettify/prettify.css"))),format.raw/*33.88*/("""'>
""")))};
Seq[Any](format.raw/*1.68*/("""
"""),format.raw/*3.1*/("""
    """),format.raw/*24.2*/("""
"""),format.raw/*27.2*/("""
"""),format.raw/*34.2*/("""
"""),_display_(Seq[Any](/*35.2*/template_admin_dashboard(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*35.105*/ {_display_(Seq[Any](format.raw/*35.107*/("""
    


    <div class="container-fluid" ng-app="adminEditData">

        <div class="" ng-controller="adminEditShortNoteController" ng-init="init()">
            <div class="col-md-8">
                <div class="well well-sm">
        <hr/>
            <form   ng-submit="editNote()" action="" name="newNote" id="add-note-form" class="form-horizontal">

                <div class="well well-sm">
                    <fieldset>

                        <legend class="text-center"><h1>Add a note</h1>
                            <p>#President?</p></legend>

                        <div class="form-group">
                            <label class="col-md-3 control-label" for="note-name">note title</label>
                            <div class="col-md-9">
                                <input id="note-title"  name="note-title" ng-model="noteTitle" type="text" placeholder="note title" class="form-control" required>
                            </div>
                        </div>



                        <div class="form-group">
                            <div id="alerts"></div>
                            <div class="btn-toolbar well" data-role="editor-toolbar" data-target="#editor">
                                <div class="btn-group">
                                    <a class="btn btn-default dropdown-toggle" data-toggle="dropdown" title="Font"><i class="fa fa-font"></i><b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                    </ul>
                                </div>
                                <div class="btn-group">
                                    <a class="btn btn-default dropdown-toggle" data-toggle="dropdown" title="Font Size"><i class="fa fa-text-height"></i>&nbsp;<b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a data-edit="fontSize 5"><font size="5">Huge</font></a></li>
                                        <li><a data-edit="fontSize 3"><font size="3">Normal</font></a></li>
                                        <li><a data-edit="fontSize 1"><font size="1">Small</font></a></li>
                                    </ul>
                                </div>
                                <div class="btn-group">
                                    <a class="btn btn-default" data-edit="bold" title="Bold (Ctrl/Cmd+B)"><i class="fa fa-bold"></i></a>
                                    <a class="btn btn-default" data-edit="italic" title="Italic (Ctrl/Cmd+I)"><i class="fa fa-italic"></i></a>
                                    <a class="btn btn-default" data-edit="strikethrough" title="Strikethrough"><i class="fa fa-strikethrough"></i></a>
                                    <a class="btn btn-default" data-edit="underline" title="Underline (Ctrl/Cmd+U)"><i class="fa fa-underline"></i></a>
                                </div>
                                <div class="btn-group">
                                    <a class="btn btn-default" data-edit="insertunorderedlist" title="Bullet list"><i class="fa fa-list-ul"></i></a>
                                    <a class="btn btn-default" data-edit="insertorderedlist" title="Number list"><i class="fa fa-list-ol"></i></a>
                                    <a class="btn btn-default" data-edit="outdent" title="Reduce indent (Shift+Tab)"><i class="fa fa-outdent"></i></a>
                                    <a class="btn btn-default" data-edit="indent" title="Indent (Tab)"><i class="fa fa-indent"></i></a>
                                </div>
                                <div class="btn-group">
                                    <a class="btn btn-default" data-edit="justifyleft" title="Align Left (Ctrl/Cmd+L)"><i class="fa fa-align-left"></i></a>
                                    <a class="btn btn-default" data-edit="justifycenter" title="Center (Ctrl/Cmd+E)"><i class="fa fa-align-center"></i></a>
                                    <a class="btn btn-default" data-edit="justifyright" title="Align Right (Ctrl/Cmd+R)"><i class="fa fa-align-right"></i></a>
                                    <a class="btn btn-default" data-edit="justifyfull" title="Justify (Ctrl/Cmd+J)"><i class="fa fa-align-justify"></i></a>
                                </div>
                                <div class="btn-group">
                                    <a class="btn  btn-default dropdown-toggle" data-toggle="dropdown" title="Hyperlink"><i class="fa fa-link"></i></a>
                                    <div class="dropdown-menu input-append">
                                        <input class="col-md-8" placeholder="URL" type="text" data-edit="createLink"/>
                                        <button class="col-md-4 btn btn-default" type="button">Add</button>
                                    </div>
                                    <a class="btn btn-default" data-edit="unlink" title="Remove Hyperlink"><i class="fa fa-cut"></i></a>

                                </div>

                                <div class="btn-group">
                                    <a class="btn btn-default" title="Insert picture (or just drag & drop)" id="pictureBtn"><i class="fa fa-picture-o"></i></a>
                                    <input type="file" data-role="magic-overlay" data-target="#pictureBtn" data-edit="insertImage" />
                                </div>
                                <div class="btn-group">
                                    <a class="btn btn-default" data-edit="undo" title="Undo (Ctrl/Cmd+Z)"><i class="fa fa-undo"></i></a>
                                    <a class="btn btn-default" data-edit="redo" title="Redo (Ctrl/Cmd+Y)"><i class="fa fa-repeat"></i></a>
                                </div>
                                <input type="text" data-edit="inserttext" id="voiceBtn" x-webkit-speech="">
                            </div>

                            <div class="editor" ng-bind-html="noteHtml">


                            </div>




                        </div>




                        <div class="form-group">
                            <label class="col-md-3 control-label" for="note-tag">Add tag</label>
                            <div class="col-md-9">
                                <input class="form-control" type="text" id="note-tag-input"  ng-model="noteTag" name="note-tag" typeahead-on-select="addTagToNote($item)" typeahead="tag.name for tag in tagsList | filter:$viewValue"  >
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-md-3 control-label" for="tag-chapter">Added Tags</label>
                            <div class="col-md-9">
                                <div class="well tags-well">

                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-9 col-md-offset-3">
                                <button type="submit" ng-hide="newNote.$valid" class="btn btn-success disabled btn-lg">Submit</button>
                                <button type="submit" ng-show="newNote.$valid" class="btn btn-success btn-lg">Submit</button>
                                <button type="reset"  class="btn btn-warning btn-lg">Cancel</button>
                            </div>
                        </div>
                    </fieldset>
                </div>



            </form>
</div>
                </div>


        </div>
    </div>



""")))})))}
    }
    
    def render(localUser:models.User,shortNote:models.content.ShortNote): play.api.templates.HtmlFormat.Appendable = apply(localUser,shortNote)
    
    def f:((models.User,models.content.ShortNote) => play.api.templates.HtmlFormat.Appendable) = (localUser,shortNote) => apply(localUser,shortNote)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:39 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_editShortNote.scala.html
                    HASH: 52221747772da03c35edb6fe90ff87fc8880cb03
                    MATRIX: 824->1|994->104|1009->111|1093->113|1154->139|1168->145|1223->179|1293->214|1307->220|1372->264|1442->299|1456->305|1514->342|1584->377|1598->383|1646->410|1717->445|1732->451|1791->488|1862->523|1877->529|1939->569|2142->736|2157->742|2227->790|2302->829|2317->835|2370->866|2445->905|2460->911|2529->958|2600->993|2615->999|2683->1045|2722->1064|2741->1074|2826->1076|2854->1084|2867->1089|2951->1091|3317->1421|3332->1427|3394->1467|3468->1505|3483->1511|3552->1558|3596->67|3624->97|3657->1061|3686->1081|3715->1563|3753->1566|3866->1669|3907->1671
                    LINES: 26->1|29->4|29->4|31->4|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|40->13|40->13|40->13|43->16|43->16|43->16|46->19|46->19|46->19|49->22|49->22|49->22|51->25|51->25|53->25|55->28|55->28|57->28|61->32|61->32|61->32|62->33|62->33|62->33|64->1|65->3|66->24|67->27|68->34|69->35|69->35|69->35
                    -- GENERATED --
                */
            