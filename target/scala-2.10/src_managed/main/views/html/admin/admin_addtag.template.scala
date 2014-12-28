
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
object admin_addtag extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.Tag,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null,tag:models.content.Tag=null):play.api.templates.HtmlFormat.Appendable = {
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
        <script src='"""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*15.72*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*16.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("js/angularapps/admin-dashboard.js"))),format.raw/*17.76*/("""'></script>
    """)))};def /*19.6*/scriptsTop/*19.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.18*/("""

    """)))};def /*22.6*/links/*22.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.13*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*26.39*/routes/*26.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*26.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*27.39*/routes/*27.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*27.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.61*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*18.6*/("""
    """),format.raw/*21.6*/("""
    """),format.raw/*28.6*/("""
"""),_display_(Seq[Any](/*29.2*/template_admin_dashboard(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*29.105*/ {_display_(Seq[Any](format.raw/*29.107*/("""


<div ng-app="adminDashboard"  class="shortNoteWrapper">
    <div class="">
        <h1 class="page-header"> Add Tag</h1>
    </div>
    <div class="container-fluid"  ng-controller="subjectController" ng-init="init()">

      <div class="col-md-8">
          <div class="well whiteWell" style="margin-top:0;padding-top:0;border-color:transparent">
              <form   ng-submit="addTag()" action="" name="newTag" id="add-tag-form" class="form-horizontal">

                  <div class=" ">
                      <fieldset>



                          <div class="form-group">
                              <div class="">
                                  <input id="tag-name"  name="tag-name" ng-model="tagName" type="text" placeholder="tag name" class="form-control" required>
                              </div>
                          </div>

                          <div class="form-group">
                              <div class="">
                                  <input id="tag-slug"  name="tagSlug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/" ng-model="tagSlug" type="text" placeholder="tag Slug" class="form-control" duplicate="tagSlugs" required>
                                  <p class="help-block text-danger" ng-show="newTag.tagSlug.$error.duplicate && newTag.tagSlug.$dirty">This slug already exists</p>

                              </div>
                          </div>

                          <div class="form-group"  >
                              <button class="btn btn-primary" type="button" data-toggle="modal" data-target="#media-modal" >
                                  Add Media</button>
                          </div>

                          <div class="modal fade fixed-modal" id="media-modal" ng-controller="imageLoadController" ng-init="selectImagesInit()" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                              <div class="modal-dialog modal-full-width">
                                  <div class="modal-content">
                                      <div class="modal-side">

                                      </div>
                                      <div class="modal-header">
                                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                          <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                                      </div>
                                      <div class="modal-body">


                                          <div class="modal-tab-nav">
                                              <ul class="nav nav-tabs">
                                                  <li class="active"><a data-target="#upload" data-toggle="tab">
                                                      Upload</a></li>
                                                  <li><a  data-target="#viewImages" data-toggle="tab" ng-click="selectImagesInit()">
                                                      Available Media</a></li>

                                              </ul>
                                          </div>
                                          <div class="modal-tab-content">
                                                  <!-- Tab panes -->
                                              <div class="tab-content">
                                                  <div class="tab-pane active" id="upload">
                                                      <div class="full-height-upload-div" ng-show="!uploadInProgress">


                                                          <div ng-show="uploader.isHTML5">
                                                                  <!-- 3. ng-file-over | ng-file-over="className" -->

                                                                  <!-- Example: ng-file-drop | ng-file-drop="options" -->
                                                              <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*99.108*/("""{"""),format.raw/*99.109*/(""" url: '/file/upload' """),format.raw/*99.130*/("""}"""),format.raw/*99.131*/("""" >
                                                                  <div class="at-center">
                                                                      <h4> Drop Image Here</h4>


                                                                      <button type="button" class="btn btn-success" id="new-file-button">
                                                                          Select Picture</button>
                                                                      <input id="file-button" ng-file-select type="file" name="picture" />
                                                                      <script>
                                                                      $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*108.125*/("""{"""),format.raw/*108.126*/("""
                                                                      $ ( '#file-button' ).click ( ) ;
                                                                      """),format.raw/*110.71*/("""}"""),format.raw/*110.72*/(""" ) ;
                                                                      </script>
                                                                  </div>
                                                              </div>
                                                          </div>


                                                      </div>

                                                      <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                          <h3>Upload queue</h3>
                                                          <p>Queue length: """),format.raw/*122.76*/("""{"""),format.raw/*122.77*/("""{"""),format.raw/*122.78*/(""" uploader.queue.length """),format.raw/*122.101*/("""}"""),format.raw/*122.102*/("""}"""),format.raw/*122.103*/("""</p>

                                                          <table class="table">
                                                              <thead>
                                                                  <tr>
                                                                      <th width="50%">Name</th>
                                                                      <th ng-show="uploader.isHTML5">Size</th>
                                                                      <th ng-show="uploader.isHTML5">
                                                                          Progress</th>
                                                                      <th>Status</th>
                                                                      <th>Actions</th>
                                                                  </tr>
                                                              </thead>
                                                              <tbody>
                                                                  <tr ng-repeat="item in uploader.queue">
                                                                      <td><strong>
                                                                          """),format.raw/*138.75*/("""{"""),format.raw/*138.76*/("""{"""),format.raw/*138.77*/(""" item.file.name """),format.raw/*138.93*/("""}"""),format.raw/*138.94*/("""}"""),format.raw/*138.95*/("""</strong></td>
                                                                      <td ng-show="uploader.isHTML5" nowrap>
                                                                          """),format.raw/*140.75*/("""{"""),format.raw/*140.76*/("""{"""),format.raw/*140.77*/(""" item.file.size/1024/1024|number:2 """),format.raw/*140.112*/("""}"""),format.raw/*140.113*/("""}"""),format.raw/*140.114*/(""" MB</td>
                                                                      <td ng-show="uploader.isHTML5">
                                                                          <div class="progress" style="margin-bottom : 0 ;">
                                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*143.134*/("""{"""),format.raw/*143.135*/(""" 'width': item.progress + '%' """),format.raw/*143.165*/("""}"""),format.raw/*143.166*/(""""></div>
                                                                          </div>
                                                                      </td>
                                                                      <td class="text-center">
                                                                          <span ng-show="item.isSuccess"><i class="fa fa-check"></i></span>
                                                                          <span ng-show="item.isCancel"><i class="fa fa-ban"></i></span>
                                                                          <span ng-show="item.isError"><i class="fa fa-times"></i></span>
                                                                      </td>
                                                                      <td nowrap>
                                                                          <button type="button" class="btn btn-success btn-xs" ng-click="item.upload()" ng-disabled="item.isReady || item.isUploading || item.isSuccess">
                                                                              <span class="glyphicon glyphicon-upload"></span>
                                                                              Upload
                                                                          </button>
                                                                          <button type="button" class="btn btn-warning btn-xs" ng-click="item.cancel()" ng-disabled="!item.isUploading">
                                                                              <span class="glyphicon glyphicon-ban-circle"></span>
                                                                              Cancel
                                                                          </button>
                                                                          <button type="button" class="btn btn-danger btn-xs" ng-click="item.remove()">
                                                                              <span class="glyphicon glyphicon-trash"></span>
                                                                              Remove
                                                                          </button>
                                                                      </td>
                                                                  </tr>
                                                              </tbody>
                                                          </table>

                                                          <div>
                                                              <p>
                                                                  Queue progress:
                                                          <div class="progress" style="">
                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*173.118*/("""{"""),format.raw/*173.119*/(""" 'width': uploader.progress + '%' """),format.raw/*173.153*/("""}"""),format.raw/*173.154*/(""""></div>
                                                          </div>
                                                              </p>
                                                              <button type="button" class="btn btn-success btn-s" ng-click="uploader.uploadAll()" ng-disabled="!uploader.getNotUploadedItems().length">
                                                                  <span class="glyphicon glyphicon-upload"></span>
                                                                  Upload all
                                                              </button>
                                                              <button type="button" class="btn btn-warning btn-s" ng-click="uploader.cancelAll()" ng-disabled="!uploader.isUploading">
                                                                  <span class="glyphicon glyphicon-ban-circle"></span>
                                                                  Cancel all
                                                              </button>
                                                              <button type="button" class="btn btn-danger btn-s" ng-click="uploader.clearQueue()" ng-disabled="!uploader.queue.length">
                                                                  <span class="glyphicon glyphicon-trash"></span>
                                                                  Remove all
                                                              </button>
                                                          </div>

                                                      </div>

                                                  </div>
                                                  <div class="tab-pane" id="viewImages">
                                                      <div class="media-container">
                                                          <div class="image-selection-container">

                                                              <div class="img-container" ng-repeat="image in userImages">
                                                                  <img id="img"""),format.raw/*198.79*/("""{"""),format.raw/*198.80*/("""{"""),format.raw/*198.81*/("""image.id"""),format.raw/*198.89*/("""}"""),format.raw/*198.90*/("""}"""),format.raw/*198.91*/("""" ng-src="/assets/"""),format.raw/*198.109*/("""{"""),format.raw/*198.110*/("""{"""),format.raw/*198.111*/("""image.path.substring(7)"""),format.raw/*198.134*/("""}"""),format.raw/*198.135*/("""}"""),format.raw/*198.136*/("""" height=""""),format.raw/*198.146*/("""{"""),format.raw/*198.147*/("""{"""),format.raw/*198.148*/("""image.height"""),format.raw/*198.160*/("""}"""),format.raw/*198.161*/("""}"""),format.raw/*198.162*/("""" width=""""),format.raw/*198.171*/("""{"""),format.raw/*198.172*/("""{"""),format.raw/*198.173*/("""image.width"""),format.raw/*198.184*/("""}"""),format.raw/*198.185*/("""}"""),format.raw/*198.186*/("""" alt=""""),format.raw/*198.193*/("""{"""),format.raw/*198.194*/("""{"""),format.raw/*198.195*/("""image.alt"""),format.raw/*198.204*/("""}"""),format.raw/*198.205*/("""}"""),format.raw/*198.206*/("""" title=""""),format.raw/*198.215*/("""{"""),format.raw/*198.216*/("""{"""),format.raw/*198.217*/("""image.title"""),format.raw/*198.228*/("""}"""),format.raw/*198.229*/("""}"""),format.raw/*198.230*/("""" ng-click="selectImage($event)">
                                                                  <div class="selected-icon">
                                                                      <i class="fa fa-check fa-green fa-2x"></i>
                                                                  </div>
                                                              </div>

                                                          </div>
                                                          <div class="image-details-container">
                                                              <div class="container-fluid" ng-if="image">
                                                                  <legend>Image Details</legend>
                                                                  <img ng-src=""""),format.raw/*208.80*/("""{"""),format.raw/*208.81*/("""{"""),format.raw/*208.82*/("""imageSrc"""),format.raw/*208.90*/("""}"""),format.raw/*208.91*/("""}"""),format.raw/*208.92*/("""">
                                                                  <p class="small">FullName: """),format.raw/*209.94*/("""{"""),format.raw/*209.95*/("""{"""),format.raw/*209.96*/("""imageName"""),format.raw/*209.105*/("""}"""),format.raw/*209.106*/("""}"""),format.raw/*209.107*/("""</p>
                                                                  <p ng-show="imageAlt">Alt: """),format.raw/*210.94*/("""{"""),format.raw/*210.95*/("""{"""),format.raw/*210.96*/("""imageAlt"""),format.raw/*210.104*/("""}"""),format.raw/*210.105*/("""}"""),format.raw/*210.106*/("""</p>

                                                                  <div class="form-group">

                                                                  </div>
                                                                  <legend>Image Size Settings</legend>

                                                                  <div class="form-group">
                                                                      <select class="form-control"
                                                                      ng-model="data.imageOption"
                                                                      ng-options="opt.label for opt in imageOptions">
                                                                      </select>
                                                                  </div>
                                                                  <div>
                                                                      <div class="form-group">
                                                                          <input type="text" ng-blur="updateImage()" class="form-control" ng-model="image.title" id="titleInput" placeholder="Title">
                                                                      </div>
                                                                      <div class="form-group">
                                                                          <input type="text" ng-blur="updateImage()" class="form-control" ng-model="image.alt" id="altInput" placeholder="Alt">
                                                                      </div>
                                                                      <div class="form-group">
                                                                          <input type="text" ng-blur="updateImage()" class="form-control" ng-model="image.caption" id="captionInput" placeholder="Caption">
                                                                      </div>
                                                                      <div class="form-group">
                                                                          <input type="text" ng-blur="updateImage()" class="form-control" ng-model="image.description" id="descriptionInput" placeholder="Description">
                                                                      </div>
                                                                  </div>
                                                              </div>


                                                          </div>

                                                      </div>

                                                  </div>

                                              </div>
                                          </div>


                                      </div>
                                      <div class="modal-footer">
                                          <span class="selectedImagesCount">
                                              <span>Selected Images: """),format.raw/*253.70*/("""{"""),format.raw/*253.71*/("""{"""),format.raw/*253.72*/("""selectedImagesCount"""),format.raw/*253.91*/("""}"""),format.raw/*253.92*/("""}"""),format.raw/*253.93*/(""" </span>
                                          </span>
                                          <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                              Insert Into Post</button>
                                      </div>
                                  </div>
                              </div>
                          </div>


                          <div class="form-group">
                              <script type="text/javascript" src=""""),_display_(Seq[Any](/*264.68*/routes/*264.74*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*264.113*/(""""></script>

                              <script type="text/javascript">
                              tinymce.init ( """),format.raw/*267.46*/("""{"""),format.raw/*267.47*/("""
                              menubar : false,
                              selector : "#textmax",
                              height : "300px",
                              plugins :[
                              "advlist autolink lists link image charmap print preview anchor",
                              "searchreplace visualblocks code fullscreen",
                              "insertdatetime media table contextmenu paste"
                              ],
                              toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
                              """),format.raw/*277.31*/("""}"""),format.raw/*277.32*/(""" ) ;
                              </script>

                              <textarea id="textmax" class="editor" name="content" style="width : 100%"></textarea>
                          </div>




                          <div class="form-group">
                              <label class="col-md-3 control-label" for="tag-chapter">Add Chapter</label>
                              <div class="col-md-9">
                                  <input class="form-control" type="text" id="tag-chapter-input"  ng-model="tagChapter" name="tag-chapter" typeahead-on-select="addChapterToTag($item)" typeahead="chapter.slug for chapter in chaptersList | filter:$viewValue"  >
                              </div>
                          </div>

                          <div class="form-group">
                              <label class="col-md-3 control-label" for="tag-chapter">Added Chapters</label>
                              <div class="col-md-9">
                                  <div class="well chapters-well">

                                  </div>
                              </div>
                          </div>

                          <div class="form-group">
                              <div class="col-md-9 col-md-offset-3">
                                  <button type="submit" ng-hide="newTag.$valid" class="btn btn-success disabled btn-lg">Update</button>
                                  <button type="submit" ng-show="newTag.$valid" class="btn btn-success btn-lg">Update</button>
                                  <button type="reset"  class="btn btn-warning btn-lg">Cancel</button>
                              </div>
                          </div>
                      </fieldset>
                  </div>



              </form>
          </div>








    </div>
        <div class="col-md-4"  ng-controller="featuredImageController">

            <div class="form-group">
                <button type="button" class="btn btn-default" data-toggle="modal" ng-hide="featuredImageId" data-target="#featuredImageModal" ng-click="selectImagesInit()">Set Featured Image</button>
                <button type="button" class="btn btn-default"  ng-show="featuredImageId" ng-click="removeFeaturedImage()">Remove Featured Image</button>

            </div>
            <div class="well">
                <div class="featured-image-holder" id="featuredImage">

                </div>
            </div>
            <div class="modal fade fixed-modal" id="featuredImageModal" ng-init="selectImagesInit()" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-full-width">
                    <div class="modal-content">
                        <div class="modal-side">

                        </div>
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="myModalLabel">Set Featured Image</h4>
                        </div>
                        <div class="modal-body">


                            <div class="modal-tab-nav">
                                <ul class="nav nav-tabs">
                                    <li class="active"><a  data-target="#featupload" data-toggle="tab">
                                        Upload</a></li>
                                    <li><a  data-target="#featviewImages" data-toggle="tab">
                                        Available Media</a></li>

                                </ul>
                            </div>
                            <div class="modal-tab-content">
                                    <!-- Tab panes -->
                                <div class="tab-content">
                                    <div class="tab-pane active" id="featupload">
                                        <div class="full-height-upload-div" ng-show="!uploadInProgress">


                                            <div ng-show="uploader.isHTML5">
                                                    <!-- 3. ng-file-over | ng-file-over="className" -->

                                                    <!-- Example: ng-file-drop | ng-file-drop="options" -->
                                                <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*370.94*/("""{"""),format.raw/*370.95*/(""" url: '/file/upload' """),format.raw/*370.116*/("""}"""),format.raw/*370.117*/("""" >
                                                    <div class="at-center">
                                                        <h4> Drop Image Here</h4>


                                                        <button type="button" class="btn btn-success" id="new-file-button">
                                                            Select Picture</button>
                                                        <input id="file-button" ng-file-select type="file" name="picture" />
                                                        <script>
                                                        $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*379.111*/("""{"""),format.raw/*379.112*/("""
                                                        $ ( '#file-button' ).click ( ) ;
                                                        """),format.raw/*381.57*/("""}"""),format.raw/*381.58*/(""" ) ;
                                                        </script>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>

                                        <div class="full-height-upload-div" style="margin-bottom : 40px" ng-show="uploadInProgress">

                                            <h3>Upload queue</h3>
                                            <p>Queue length: """),format.raw/*393.62*/("""{"""),format.raw/*393.63*/("""{"""),format.raw/*393.64*/(""" uploader.queue.length """),format.raw/*393.87*/("""}"""),format.raw/*393.88*/("""}"""),format.raw/*393.89*/("""</p>

                                            <table class="table">
                                                <thead>
                                                    <tr>
                                                        <th width="50%">Name</th>
                                                        <th ng-show="uploader.isHTML5">Size</th>
                                                        <th ng-show="uploader.isHTML5">
                                                            Progress</th>
                                                        <th>Status</th>
                                                        <th>Actions</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr ng-repeat="item in uploader.queue">
                                                        <td><strong>
                                                            """),format.raw/*409.61*/("""{"""),format.raw/*409.62*/("""{"""),format.raw/*409.63*/(""" item.file.name """),format.raw/*409.79*/("""}"""),format.raw/*409.80*/("""}"""),format.raw/*409.81*/("""</strong></td>
                                                        <td ng-show="uploader.isHTML5" nowrap>
                                                            """),format.raw/*411.61*/("""{"""),format.raw/*411.62*/("""{"""),format.raw/*411.63*/(""" item.file.size/1024/1024|number:2 """),format.raw/*411.98*/("""}"""),format.raw/*411.99*/("""}"""),format.raw/*411.100*/(""" MB</td>
                                                        <td ng-show="uploader.isHTML5">
                                                            <div class="progress" style="margin-bottom : 0 ;">
                                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*414.120*/("""{"""),format.raw/*414.121*/(""" 'width': item.progress + '%' """),format.raw/*414.151*/("""}"""),format.raw/*414.152*/(""""></div>
                                                            </div>
                                                        </td>
                                                        <td class="text-center">
                                                            <span ng-show="item.isSuccess"><i class="fa fa-check"></i></span>
                                                            <span ng-show="item.isCancel"><i class="fa fa-ban"></i></span>
                                                            <span ng-show="item.isError"><i class="fa fa-times"></i></span>
                                                        </td>
                                                        <td nowrap>
                                                            <button type="button" class="btn btn-success btn-xs" ng-click="item.upload()" ng-disabled="item.isReady || item.isUploading || item.isSuccess">
                                                                <span class="glyphicon glyphicon-upload"></span>
                                                                Upload
                                                            </button>
                                                            <button type="button" class="btn btn-warning btn-xs" ng-click="item.cancel()" ng-disabled="!item.isUploading">
                                                                <span class="glyphicon glyphicon-ban-circle"></span>
                                                                Cancel
                                                            </button>
                                                            <button type="button" class="btn btn-danger btn-xs" ng-click="item.remove()">
                                                                <span class="glyphicon glyphicon-trash"></span>
                                                                Remove
                                                            </button>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>

                                            <div>
                                                <p>
                                                    Queue progress:
                                            <div class="progress" style="">
                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*444.104*/("""{"""),format.raw/*444.105*/(""" 'width': uploader.progress + '%' """),format.raw/*444.139*/("""}"""),format.raw/*444.140*/(""""></div>
                                            </div>
                                                </p>
                                                <button type="button" class="btn btn-success btn-s" ng-click="uploader.uploadAll()" ng-disabled="!uploader.getNotUploadedItems().length">
                                                    <span class="glyphicon glyphicon-upload"></span>
                                                    Upload all
                                                </button>
                                                <button type="button" class="btn btn-warning btn-s" ng-click="uploader.cancelAll()" ng-disabled="!uploader.isUploading">
                                                    <span class="glyphicon glyphicon-ban-circle"></span>
                                                    Cancel all
                                                </button>
                                                <button type="button" class="btn btn-danger btn-s" ng-click="uploader.clearQueue()" ng-disabled="!uploader.queue.length">
                                                    <span class="glyphicon glyphicon-trash"></span>
                                                    Remove all
                                                </button>
                                            </div>

                                        </div>

                                    </div>
                                    <div class="tab-pane" id="featviewImages">
                                        <div class="media-container">
                                            <div class="image-selection-container">

                                                <div class="img-container" ng-repeat="image in userImages">
                                                    <img id="img"""),format.raw/*469.65*/("""{"""),format.raw/*469.66*/("""{"""),format.raw/*469.67*/("""image.id"""),format.raw/*469.75*/("""}"""),format.raw/*469.76*/("""}"""),format.raw/*469.77*/("""" ng-src="/assets/"""),format.raw/*469.95*/("""{"""),format.raw/*469.96*/("""{"""),format.raw/*469.97*/("""image.path.substring(7)"""),format.raw/*469.120*/("""}"""),format.raw/*469.121*/("""}"""),format.raw/*469.122*/("""" height=""""),format.raw/*469.132*/("""{"""),format.raw/*469.133*/("""{"""),format.raw/*469.134*/("""image.height"""),format.raw/*469.146*/("""}"""),format.raw/*469.147*/("""}"""),format.raw/*469.148*/("""" width=""""),format.raw/*469.157*/("""{"""),format.raw/*469.158*/("""{"""),format.raw/*469.159*/("""image.width"""),format.raw/*469.170*/("""}"""),format.raw/*469.171*/("""}"""),format.raw/*469.172*/("""" alt=""""),format.raw/*469.179*/("""{"""),format.raw/*469.180*/("""{"""),format.raw/*469.181*/("""image.alt"""),format.raw/*469.190*/("""}"""),format.raw/*469.191*/("""}"""),format.raw/*469.192*/("""" title=""""),format.raw/*469.201*/("""{"""),format.raw/*469.202*/("""{"""),format.raw/*469.203*/("""image.title"""),format.raw/*469.214*/("""}"""),format.raw/*469.215*/("""}"""),format.raw/*469.216*/("""" ng-click="selectImage($event)">
                                                    <div class="selected-icon">
                                                        <i class="fa fa-check fa-green fa-2x"></i>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="image-details-container">
                                                <div class="container-fluid" ng-if="image">
                                                    <legend>Image Details</legend>
                                                    <img ng-src=""""),format.raw/*479.66*/("""{"""),format.raw/*479.67*/("""{"""),format.raw/*479.68*/("""imageSrc"""),format.raw/*479.76*/("""}"""),format.raw/*479.77*/("""}"""),format.raw/*479.78*/("""">
                                                    <p class="small">FullName: """),format.raw/*480.80*/("""{"""),format.raw/*480.81*/("""{"""),format.raw/*480.82*/("""imageName"""),format.raw/*480.91*/("""}"""),format.raw/*480.92*/("""}"""),format.raw/*480.93*/("""</p>
                                                    <p ng-show="imageAlt">Alt: """),format.raw/*481.80*/("""{"""),format.raw/*481.81*/("""{"""),format.raw/*481.82*/("""imageAlt"""),format.raw/*481.90*/("""}"""),format.raw/*481.91*/("""}"""),format.raw/*481.92*/("""</p>

                                                    <div class="form-group">

                                                    </div>
                                                    <legend>Image Size Settings</legend>

                                                    <div class="form-group">
                                                        <select class="form-control"
                                                        ng-model="data.imageOption"
                                                        ng-options="opt.label for opt in imageOptions">
                                                        </select>
                                                    </div>
                                                    <div>
                                                        <div class="form-group">
                                                            <input type="text" ng-keyup="updateImage()" class="form-control" ng-model="image.title" id="titleInput" placeholder="Title">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" ng-keyup="updateImage()" class="form-control" ng-model="image.alt" id="altInput" placeholder="Alt">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" ng-keyup="updateImage()" class="form-control" ng-model="image.caption" id="captionInput" placeholder="Caption">
                                                        </div>
                                                        <div class="form-group">
                                                            <input type="text" ng-keyup="updateImage()" class="form-control" ng-model="image.description" id="descriptionInput" placeholder="Description">
                                                        </div>
                                                    </div>
                                                </div>


                                            </div>

                                        </div>

                                    </div>

                                </div>
                            </div>


                        </div>
                        <div class="modal-footer">
                            <span class="selectedImagesCount">
                                <span>Selected Images: """),format.raw/*524.56*/("""{"""),format.raw/*524.57*/("""{"""),format.raw/*524.58*/("""selectedImagesCount"""),format.raw/*524.77*/("""}"""),format.raw/*524.78*/("""}"""),format.raw/*524.79*/(""" </span>
                            </span>
                            <button type="button" id="addSelectedImagesToPost" ng-click="setFeaturedImage()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                Set As Featured Image</button>
                        </div>
                    </div>
                </div>
            </div>




        </div>



    </div>
</div>


""")))})))}
    }
    
    def render(localUser:models.User,tag:models.content.Tag): play.api.templates.HtmlFormat.Appendable = apply(localUser,tag)
    
    def f:((models.User,models.content.Tag) => play.api.templates.HtmlFormat.Appendable) = (localUser,tag) => apply(localUser,tag)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:35 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_addtag.scala.html
                    HASH: c051fc0ac25f9431651ae99fad5b34afd33c574d
                    MATRIX: 811->1|982->102|997->109|1081->111|1139->134|1153->140|1208->174|1277->208|1291->214|1356->258|1425->292|1439->298|1497->335|1566->369|1580->375|1628->402|1697->436|1711->442|1769->479|1838->513|1852->519|1913->559|2114->724|2129->730|2199->778|2271->814|2286->820|2339->851|2409->885|2424->891|2489->934|2559->968|2574->974|2640->1018|2710->1052|2725->1058|2794->1105|2834->1128|2853->1138|2938->1140|2968->1153|2982->1158|3067->1160|3445->1502|3460->1508|3521->1547|3598->1588|3613->1594|3681->1640|3728->60|3755->97|3786->1122|3818->1147|3850->1648|3887->1650|4000->1753|4041->1755|8136->5821|8166->5822|8216->5843|8246->5844|9046->6614|9077->6615|9280->6789|9310->6790|9999->7450|10029->7451|10059->7452|10112->7475|10143->7476|10174->7477|11476->8750|11506->8751|11536->8752|11581->8768|11611->8769|11641->8770|11868->8968|11898->8969|11928->8970|11993->9005|12024->9006|12055->9007|12454->9376|12485->9377|12545->9407|12576->9408|15592->12394|15623->12395|15687->12429|15718->12430|17907->14590|17937->14591|17967->14592|18004->14600|18034->14601|18064->14602|18112->14620|18143->14621|18174->14622|18227->14645|18258->14646|18289->14647|18329->14657|18360->14658|18391->14659|18433->14671|18464->14672|18495->14673|18534->14682|18565->14683|18596->14684|18637->14695|18668->14696|18699->14697|18736->14704|18767->14705|18798->14706|18837->14715|18868->14716|18899->14717|18938->14726|18969->14727|19000->14728|19041->14739|19072->14740|19103->14741|19959->15568|19989->15569|20019->15570|20056->15578|20086->15579|20116->15580|20241->15676|20271->15677|20301->15678|20340->15687|20371->15688|20402->15689|20529->15787|20559->15788|20589->15789|20627->15797|20658->15798|20689->15799|23812->18893|23842->18894|23872->18895|23920->18914|23950->18915|23980->18916|24672->19571|24688->19577|24751->19616|24900->19736|24930->19737|25640->20418|25670->20419|30104->24824|30134->24825|30185->24846|30216->24847|30918->25519|30949->25520|31124->25666|31154->25667|31730->26214|31760->26215|31790->26216|31842->26239|31872->26240|31902->26241|32994->27304|33024->27305|33054->27306|33099->27322|33129->27323|33159->27324|33358->27494|33388->27495|33418->27496|33482->27531|33512->27532|33543->27533|33900->27860|33931->27861|33991->27891|34022->27892|36632->30472|36663->30473|36727->30507|36758->30508|38643->32364|38673->32365|38703->32366|38740->32374|38770->32375|38800->32376|38847->32394|38877->32395|38907->32396|38960->32419|38991->32420|39022->32421|39062->32431|39093->32432|39124->32433|39166->32445|39197->32446|39228->32447|39267->32456|39298->32457|39329->32458|39370->32469|39401->32470|39432->32471|39469->32478|39500->32479|39531->32480|39570->32489|39601->32490|39632->32491|39671->32500|39702->32501|39733->32502|39774->32513|39805->32514|39836->32515|40566->33216|40596->33217|40626->33218|40663->33226|40693->33227|40723->33228|40834->33310|40864->33311|40894->33312|40932->33321|40962->33322|40992->33323|41105->33407|41135->33408|41165->33409|41202->33417|41232->33418|41262->33419|43927->36055|43957->36056|43987->36057|44035->36076|44065->36077|44095->36078
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->19|46->19|48->19|50->22|50->22|52->22|56->26|56->26|56->26|57->27|57->27|57->27|59->1|60->3|60->18|61->21|62->28|63->29|63->29|63->29|133->99|133->99|133->99|133->99|142->108|142->108|144->110|144->110|156->122|156->122|156->122|156->122|156->122|156->122|172->138|172->138|172->138|172->138|172->138|172->138|174->140|174->140|174->140|174->140|174->140|174->140|177->143|177->143|177->143|177->143|207->173|207->173|207->173|207->173|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|232->198|242->208|242->208|242->208|242->208|242->208|242->208|243->209|243->209|243->209|243->209|243->209|243->209|244->210|244->210|244->210|244->210|244->210|244->210|287->253|287->253|287->253|287->253|287->253|287->253|298->264|298->264|298->264|301->267|301->267|311->277|311->277|404->370|404->370|404->370|404->370|413->379|413->379|415->381|415->381|427->393|427->393|427->393|427->393|427->393|427->393|443->409|443->409|443->409|443->409|443->409|443->409|445->411|445->411|445->411|445->411|445->411|445->411|448->414|448->414|448->414|448->414|478->444|478->444|478->444|478->444|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|503->469|513->479|513->479|513->479|513->479|513->479|513->479|514->480|514->480|514->480|514->480|514->480|514->480|515->481|515->481|515->481|515->481|515->481|515->481|558->524|558->524|558->524|558->524|558->524|558->524
                    -- GENERATED --
                */
            