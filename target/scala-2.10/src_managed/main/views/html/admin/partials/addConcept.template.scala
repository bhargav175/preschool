
package views.html.admin.partials

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
object addConcept extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""
<button class="btn btn-success btn-block"  ng-hide="showAddConceptForm==true" ng-click="showAddConceptForm=true"><i class="fa fa-plus"></i>Add Concept</button>
<form ng-show="showAddConceptForm==true"   ng-submit="addCon()" action="" name="newConcept" id="add-concept-form" class="form-horizontal">

    <div class="well well-sm">
        <fieldset>

            <legend class="text-center"><h1>Add a Concept</h1>
                <p>Indian Nationalism?</p></legend>

            <div class="form-group">
                <label class="col-md-3 control-label" for="concept-name">concept Name</label>
                <div class="col-md-9">
                    <input id="concept-name" required name="concept-name" ng-model="conceptName" type="text" placeholder="concept name" class="form-control">
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-3 control-label" for="concept-slug">concept Slug </label>
                <div class="col-md-9">
                    <input id="concept-slug" required name="conceptslug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/" ng-model="conceptSlug" type="text" placeholder="concept Slug" class="form-control" duplicate="conceptSlugs">
                    <p class="help-block text-danger" ng-show="newConcept.conceptSlug.$error.duplicate && newConcept.conceptSlug.$dirty">This slug already exists</p>

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

                <div class="editor">
                                  Go ahead&hellip;

                              </div>




            </div>




            <div class="form-group">
                <label class="col-md-3 control-label" for="concept-chapter">Parent Chapter</label>
                <div class="col-md-9">
                    <select class="form-control" id="concept-subject"  ng-model="conceptChapter" name="concept-chapter"  ng-options="chapter.slug for chapter in chaptersList" required></select>

                </div>
            </div>

            <div class="form-group">
                <div class="col-md-9 col-md-offset-3">
                    <button type="submit" ng-hide="newConcept.$valid" class="btn btn-success disabled btn-lg">Submit</button>
                    <button type="submit" ng-show="newConcept.$valid" class="btn btn-success btn-lg">Submit</button>
                    <button type="reset" ng-click="showAddConceptForm=false" class="btn btn-warning btn-lg">Cancel</button>
                </div>
            </div>
        </fieldset>
    </div>



</form>
         """))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:42 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/partials/addConcept.scala.html
                    HASH: 64c2b4c08990d235b914fbe99d25261b222e9771
                    MATRIX: 787->1|882->3
                    LINES: 26->1|29->1
                    -- GENERATED --
                */
            