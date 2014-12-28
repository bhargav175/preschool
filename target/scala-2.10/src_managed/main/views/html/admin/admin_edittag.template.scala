
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
object admin_edittag extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.Tag,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User,tag:models.content.Tag):play.api.templates.HtmlFormat.Appendable = {
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
        <script src='"""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("js/angularapps/admin-editdata.js"))),format.raw/*18.75*/("""'></script>
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
Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*19.6*/("""
    """),format.raw/*22.6*/("""
    """),format.raw/*29.6*/("""
"""),_display_(Seq[Any](/*30.2*/template_admin_dashboard(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.105*/ {_display_(Seq[Any](format.raw/*30.107*/("""

    <div ng-app="adminEditData" class="shortNoteWrapper">
        <div class="">
            <h1 class="page-header"> Edit Tag</h1>
        </div>
    <div class="container-fluid"  ng-controller="editTagController" ng-init="tagInit()">

        <div class="col-md-8">
            <div class="well whiteWell" style="padding-top:0;margin-top:0;border-color:transparent">
              <form   ng-submit="editTag()" action="" name="newTag" id="add-tag-form" class="form-horizontal">
                  <div class="">
                      <fieldset>



                          <div class="form-group">
                              <div >
                                  <input id="tag-name" value=""""),_display_(Seq[Any](/*48.64*/tag/*48.67*/.name)),format.raw/*48.72*/(""""    name="tag-name" ng-model="tagName" type="text" placeholder="tag name"  class="form-control" required>
                                  <input type="hidden" value=""""),_display_(Seq[Any](/*49.64*/tag/*49.67*/.slug)),format.raw/*49.72*/("""" id="nslug">

                              </div>
                          </div>

                          <div class="form-group">
                              <div>
                                  <input id="tag-slug"  name="tagSlug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/"  ng-model="tagSlug" type="text" placeholder="tag Slug" class="form-control" duplicate="tagSlugs" required>
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
                                                              <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*101.108*/("""{"""),format.raw/*101.109*/(""" url: '/file/upload' """),format.raw/*101.130*/("""}"""),format.raw/*101.131*/("""" >
                                                                  <div class="at-center">
                                                                      <h4> Drop Image Here</h4>


                                                                      <button type="button" class="btn btn-success" id="new-file-button">
                                                                          Select Picture</button>
                                                                      <input id="file-button" ng-file-select type="file" name="picture" />
                                                                      <script>
                                                                      $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*110.125*/("""{"""),format.raw/*110.126*/("""
                                                                      $ ( '#file-button' ).click ( ) ;
                                                                      """),format.raw/*112.71*/("""}"""),format.raw/*112.72*/(""" ) ;
                                                                      </script>
                                                                  </div>
                                                              </div>
                                                          </div>


                                                      </div>

                                                      <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                          <h3>Upload queue</h3>
                                                          <p>Queue length: """),format.raw/*124.76*/("""{"""),format.raw/*124.77*/("""{"""),format.raw/*124.78*/(""" uploader.queue.length """),format.raw/*124.101*/("""}"""),format.raw/*124.102*/("""}"""),format.raw/*124.103*/("""</p>

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
                                                                          """),format.raw/*140.75*/("""{"""),format.raw/*140.76*/("""{"""),format.raw/*140.77*/(""" item.file.name """),format.raw/*140.93*/("""}"""),format.raw/*140.94*/("""}"""),format.raw/*140.95*/("""</strong></td>
                                                                      <td ng-show="uploader.isHTML5" nowrap>
                                                                          """),format.raw/*142.75*/("""{"""),format.raw/*142.76*/("""{"""),format.raw/*142.77*/(""" item.file.size/1024/1024|number:2 """),format.raw/*142.112*/("""}"""),format.raw/*142.113*/("""}"""),format.raw/*142.114*/(""" MB</td>
                                                                      <td ng-show="uploader.isHTML5">
                                                                          <div class="progress" style="margin-bottom : 0 ;">
                                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*145.134*/("""{"""),format.raw/*145.135*/(""" 'width': item.progress + '%' """),format.raw/*145.165*/("""}"""),format.raw/*145.166*/(""""></div>
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
                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*175.118*/("""{"""),format.raw/*175.119*/(""" 'width': uploader.progress + '%' """),format.raw/*175.153*/("""}"""),format.raw/*175.154*/(""""></div>
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
                                                                  <img id="img"""),format.raw/*200.79*/("""{"""),format.raw/*200.80*/("""{"""),format.raw/*200.81*/("""image.id"""),format.raw/*200.89*/("""}"""),format.raw/*200.90*/("""}"""),format.raw/*200.91*/("""" ng-src="/assets/"""),format.raw/*200.109*/("""{"""),format.raw/*200.110*/("""{"""),format.raw/*200.111*/("""image.path.substring(7)"""),format.raw/*200.134*/("""}"""),format.raw/*200.135*/("""}"""),format.raw/*200.136*/("""" height=""""),format.raw/*200.146*/("""{"""),format.raw/*200.147*/("""{"""),format.raw/*200.148*/("""image.height"""),format.raw/*200.160*/("""}"""),format.raw/*200.161*/("""}"""),format.raw/*200.162*/("""" width=""""),format.raw/*200.171*/("""{"""),format.raw/*200.172*/("""{"""),format.raw/*200.173*/("""image.width"""),format.raw/*200.184*/("""}"""),format.raw/*200.185*/("""}"""),format.raw/*200.186*/("""" alt=""""),format.raw/*200.193*/("""{"""),format.raw/*200.194*/("""{"""),format.raw/*200.195*/("""image.alt"""),format.raw/*200.204*/("""}"""),format.raw/*200.205*/("""}"""),format.raw/*200.206*/("""" title=""""),format.raw/*200.215*/("""{"""),format.raw/*200.216*/("""{"""),format.raw/*200.217*/("""image.title"""),format.raw/*200.228*/("""}"""),format.raw/*200.229*/("""}"""),format.raw/*200.230*/("""" ng-click="selectImage($event)">
                                                                  <div class="selected-icon">
                                                                      <i class="fa fa-check fa-green fa-2x"></i>
                                                                  </div>
                                                              </div>

                                                          </div>
                                                          <div class="image-details-container">
                                                              <div class="container-fluid" ng-if="image">
                                                                  <legend>Image Details</legend>
                                                                  <img ng-src=""""),format.raw/*210.80*/("""{"""),format.raw/*210.81*/("""{"""),format.raw/*210.82*/("""imageSrc"""),format.raw/*210.90*/("""}"""),format.raw/*210.91*/("""}"""),format.raw/*210.92*/("""">
                                                                  <p class="small">FullName: """),format.raw/*211.94*/("""{"""),format.raw/*211.95*/("""{"""),format.raw/*211.96*/("""imageName"""),format.raw/*211.105*/("""}"""),format.raw/*211.106*/("""}"""),format.raw/*211.107*/("""</p>
                                                                  <p ng-show="imageAlt">Alt: """),format.raw/*212.94*/("""{"""),format.raw/*212.95*/("""{"""),format.raw/*212.96*/("""imageAlt"""),format.raw/*212.104*/("""}"""),format.raw/*212.105*/("""}"""),format.raw/*212.106*/("""</p>

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
                                              <span>Selected Images: """),format.raw/*255.70*/("""{"""),format.raw/*255.71*/("""{"""),format.raw/*255.72*/("""selectedImagesCount"""),format.raw/*255.91*/("""}"""),format.raw/*255.92*/("""}"""),format.raw/*255.93*/(""" </span>
                                          </span>
                                          <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                              Insert Into Post</button>
                                      </div>
                                  </div>
                              </div>
                          </div>


                          <div class="form-group">
                              <script type="text/javascript" src=""""),_display_(Seq[Any](/*266.68*/routes/*266.74*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*266.113*/(""""></script>

                              <script type="text/javascript">
                              tinymce.init ( """),format.raw/*269.46*/("""{"""),format.raw/*269.47*/("""
                              menubar : false,
                              selector : "#textmax",
                              height : "300px",
                              plugins :[
                              "advlist autolink lists link image charmap print preview anchor",
                              "searchreplace visualblocks code fullscreen",
                              "insertdatetime media table contextmenu paste"
                              ],
                              toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
                              """),format.raw/*279.31*/("""}"""),format.raw/*279.32*/(""" ) ;
                              </script>

                              <textarea id="textmax" class="editor" name="content" style="width : 100%">"""),_display_(Seq[Any](/*282.106*/tag/*282.109*/.descriptionHtml)),format.raw/*282.125*/("""</textarea>
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
                                                <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*371.94*/("""{"""),format.raw/*371.95*/(""" url: '/file/upload' """),format.raw/*371.116*/("""}"""),format.raw/*371.117*/("""" >
                                                    <div class="at-center">
                                                        <h4> Drop Image Here</h4>


                                                        <button type="button" class="btn btn-success" id="new-file-button">
                                                            Select Picture</button>
                                                        <input id="file-button" ng-file-select type="file" name="picture" />
                                                        <script>
                                                        $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*380.111*/("""{"""),format.raw/*380.112*/("""
                                                        $ ( '#file-button' ).click ( ) ;
                                                        """),format.raw/*382.57*/("""}"""),format.raw/*382.58*/(""" ) ;
                                                        </script>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>

                                        <div class="full-height-upload-div" style="margin-bottom : 40px" ng-show="uploadInProgress">

                                            <h3>Upload queue</h3>
                                            <p>Queue length: """),format.raw/*394.62*/("""{"""),format.raw/*394.63*/("""{"""),format.raw/*394.64*/(""" uploader.queue.length """),format.raw/*394.87*/("""}"""),format.raw/*394.88*/("""}"""),format.raw/*394.89*/("""</p>

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
                                                            """),format.raw/*410.61*/("""{"""),format.raw/*410.62*/("""{"""),format.raw/*410.63*/(""" item.file.name """),format.raw/*410.79*/("""}"""),format.raw/*410.80*/("""}"""),format.raw/*410.81*/("""</strong></td>
                                                        <td ng-show="uploader.isHTML5" nowrap>
                                                            """),format.raw/*412.61*/("""{"""),format.raw/*412.62*/("""{"""),format.raw/*412.63*/(""" item.file.size/1024/1024|number:2 """),format.raw/*412.98*/("""}"""),format.raw/*412.99*/("""}"""),format.raw/*412.100*/(""" MB</td>
                                                        <td ng-show="uploader.isHTML5">
                                                            <div class="progress" style="margin-bottom : 0 ;">
                                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*415.120*/("""{"""),format.raw/*415.121*/(""" 'width': item.progress + '%' """),format.raw/*415.151*/("""}"""),format.raw/*415.152*/(""""></div>
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
                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*445.104*/("""{"""),format.raw/*445.105*/(""" 'width': uploader.progress + '%' """),format.raw/*445.139*/("""}"""),format.raw/*445.140*/(""""></div>
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
                                                    <img id="img"""),format.raw/*470.65*/("""{"""),format.raw/*470.66*/("""{"""),format.raw/*470.67*/("""image.id"""),format.raw/*470.75*/("""}"""),format.raw/*470.76*/("""}"""),format.raw/*470.77*/("""" ng-src="/assets/"""),format.raw/*470.95*/("""{"""),format.raw/*470.96*/("""{"""),format.raw/*470.97*/("""image.path.substring(7)"""),format.raw/*470.120*/("""}"""),format.raw/*470.121*/("""}"""),format.raw/*470.122*/("""" height=""""),format.raw/*470.132*/("""{"""),format.raw/*470.133*/("""{"""),format.raw/*470.134*/("""image.height"""),format.raw/*470.146*/("""}"""),format.raw/*470.147*/("""}"""),format.raw/*470.148*/("""" width=""""),format.raw/*470.157*/("""{"""),format.raw/*470.158*/("""{"""),format.raw/*470.159*/("""image.width"""),format.raw/*470.170*/("""}"""),format.raw/*470.171*/("""}"""),format.raw/*470.172*/("""" alt=""""),format.raw/*470.179*/("""{"""),format.raw/*470.180*/("""{"""),format.raw/*470.181*/("""image.alt"""),format.raw/*470.190*/("""}"""),format.raw/*470.191*/("""}"""),format.raw/*470.192*/("""" title=""""),format.raw/*470.201*/("""{"""),format.raw/*470.202*/("""{"""),format.raw/*470.203*/("""image.title"""),format.raw/*470.214*/("""}"""),format.raw/*470.215*/("""}"""),format.raw/*470.216*/("""" ng-click="selectImage($event)">
                                                    <div class="selected-icon">
                                                        <i class="fa fa-check fa-green fa-2x"></i>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="image-details-container">
                                                <div class="container-fluid" ng-if="image">
                                                    <legend>Image Details</legend>
                                                    <img ng-src=""""),format.raw/*480.66*/("""{"""),format.raw/*480.67*/("""{"""),format.raw/*480.68*/("""imageSrc"""),format.raw/*480.76*/("""}"""),format.raw/*480.77*/("""}"""),format.raw/*480.78*/("""">
                                                    <p class="small">FullName: """),format.raw/*481.80*/("""{"""),format.raw/*481.81*/("""{"""),format.raw/*481.82*/("""imageName"""),format.raw/*481.91*/("""}"""),format.raw/*481.92*/("""}"""),format.raw/*481.93*/("""</p>
                                                    <p ng-show="imageAlt">Alt: """),format.raw/*482.80*/("""{"""),format.raw/*482.81*/("""{"""),format.raw/*482.82*/("""imageAlt"""),format.raw/*482.90*/("""}"""),format.raw/*482.91*/("""}"""),format.raw/*482.92*/("""</p>

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
                                <span>Selected Images: """),format.raw/*525.56*/("""{"""),format.raw/*525.57*/("""{"""),format.raw/*525.58*/("""selectedImagesCount"""),format.raw/*525.77*/("""}"""),format.raw/*525.78*/("""}"""),format.raw/*525.79*/(""" </span>
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
                    DATE: Sun Dec 28 16:26:41 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_edittag.scala.html
                    HASH: c98af4d92f64e0ebdec938e69af2813a54b1f093
                    MATRIX: 812->1|971->90|986->97|1070->99|1128->122|1142->128|1197->162|1266->196|1280->202|1345->246|1414->280|1428->286|1486->323|1555->357|1569->363|1617->390|1686->424|1700->430|1758->467|1827->501|1841->507|1902->547|2103->712|2118->718|2188->766|2260->802|2275->808|2328->839|2398->873|2413->879|2478->922|2548->956|2563->962|2629->1006|2699->1040|2714->1046|2783->1093|2853->1127|2868->1133|2936->1179|2976->1202|2995->1212|3080->1214|3110->1227|3124->1232|3209->1234|3587->1576|3602->1582|3663->1621|3740->1662|3755->1668|3823->1714|3870->48|3897->85|3928->1196|3960->1221|3992->1722|4029->1724|4142->1827|4183->1829|4921->2531|4933->2534|4960->2539|5166->2709|5178->2712|5205->2717|8525->6007|8556->6008|8607->6029|8638->6030|9438->6800|9469->6801|9672->6975|9702->6976|10391->7636|10421->7637|10451->7638|10504->7661|10535->7662|10566->7663|11868->8936|11898->8937|11928->8938|11973->8954|12003->8955|12033->8956|12260->9154|12290->9155|12320->9156|12385->9191|12416->9192|12447->9193|12846->9562|12877->9563|12937->9593|12968->9594|15984->12580|16015->12581|16079->12615|16110->12616|18299->14776|18329->14777|18359->14778|18396->14786|18426->14787|18456->14788|18504->14806|18535->14807|18566->14808|18619->14831|18650->14832|18681->14833|18721->14843|18752->14844|18783->14845|18825->14857|18856->14858|18887->14859|18926->14868|18957->14869|18988->14870|19029->14881|19060->14882|19091->14883|19128->14890|19159->14891|19190->14892|19229->14901|19260->14902|19291->14903|19330->14912|19361->14913|19392->14914|19433->14925|19464->14926|19495->14927|20351->15754|20381->15755|20411->15756|20448->15764|20478->15765|20508->15766|20633->15862|20663->15863|20693->15864|20732->15873|20763->15874|20794->15875|20921->15973|20951->15974|20981->15975|21019->15983|21050->15984|21081->15985|24204->19079|24234->19080|24264->19081|24312->19100|24342->19101|24372->19102|25064->19757|25080->19763|25143->19802|25292->19922|25322->19923|26032->20604|26062->20605|26251->20756|26265->20759|26305->20775|30588->25029|30618->25030|30669->25051|30700->25052|31402->25724|31433->25725|31608->25871|31638->25872|32214->26419|32244->26420|32274->26421|32326->26444|32356->26445|32386->26446|33478->27509|33508->27510|33538->27511|33583->27527|33613->27528|33643->27529|33842->27699|33872->27700|33902->27701|33966->27736|33996->27737|34027->27738|34384->28065|34415->28066|34475->28096|34506->28097|37116->30677|37147->30678|37211->30712|37242->30713|39127->32569|39157->32570|39187->32571|39224->32579|39254->32580|39284->32581|39331->32599|39361->32600|39391->32601|39444->32624|39475->32625|39506->32626|39546->32636|39577->32637|39608->32638|39650->32650|39681->32651|39712->32652|39751->32661|39782->32662|39813->32663|39854->32674|39885->32675|39916->32676|39953->32683|39984->32684|40015->32685|40054->32694|40085->32695|40116->32696|40155->32705|40186->32706|40217->32707|40258->32718|40289->32719|40320->32720|41050->33421|41080->33422|41110->33423|41147->33431|41177->33432|41207->33433|41318->33515|41348->33516|41378->33517|41416->33526|41446->33527|41476->33528|41589->33612|41619->33613|41649->33614|41686->33622|41716->33623|41746->33624|44411->36260|44441->36261|44471->36262|44519->36281|44549->36282|44579->36283
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->20|47->20|49->20|51->23|51->23|53->23|57->27|57->27|57->27|58->28|58->28|58->28|60->1|61->3|61->19|62->22|63->29|64->30|64->30|64->30|82->48|82->48|82->48|83->49|83->49|83->49|135->101|135->101|135->101|135->101|144->110|144->110|146->112|146->112|158->124|158->124|158->124|158->124|158->124|158->124|174->140|174->140|174->140|174->140|174->140|174->140|176->142|176->142|176->142|176->142|176->142|176->142|179->145|179->145|179->145|179->145|209->175|209->175|209->175|209->175|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|234->200|244->210|244->210|244->210|244->210|244->210|244->210|245->211|245->211|245->211|245->211|245->211|245->211|246->212|246->212|246->212|246->212|246->212|246->212|289->255|289->255|289->255|289->255|289->255|289->255|300->266|300->266|300->266|303->269|303->269|313->279|313->279|316->282|316->282|316->282|405->371|405->371|405->371|405->371|414->380|414->380|416->382|416->382|428->394|428->394|428->394|428->394|428->394|428->394|444->410|444->410|444->410|444->410|444->410|444->410|446->412|446->412|446->412|446->412|446->412|446->412|449->415|449->415|449->415|449->415|479->445|479->445|479->445|479->445|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|504->470|514->480|514->480|514->480|514->480|514->480|514->480|515->481|515->481|515->481|515->481|515->481|515->481|516->482|516->482|516->482|516->482|516->482|516->482|559->525|559->525|559->525|559->525|559->525|559->525
                    -- GENERATED --
                */
            