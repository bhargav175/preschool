
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
object admin_addchapter extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.Tag,play.api.templates.HtmlFormat.Appendable] {

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


<div ng-app="adminDashboard" class="shortNoteWrapper">
    <div class="">
        <h1 class="page-header"> Add Chapter</h1>
    </div>
    <div class="container-fluid"  ng-controller="subjectController" ng-init="init()">

      <div class="col-md-8">
          <div class="well whiteWell" style="margin-top:0;padding-top:0;border-color:transparent">
              <form  ng-submit="addChap()" action="" name="newChapter" id="add-chapter-form" class="form-horizontal">

                  <div >
                      <fieldset>


                          <div class="form-group">
                              <div >
                                  <input id="chapter-name" required name="chapter-name" ng-model="chapterName" type="text" placeholder="chapter name" class="form-control">
                              </div>
                          </div>

                          <div class="form-group">
                              <div >
                                  <input id="chapter-slug" required name="chapterSlug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/" ng-model="chapterSlug"  type="text" placeholder="chapter Slug" class="form-control" duplicate="chapterSlugs">
                                  <p class="help-block text-danger" ng-show="newChapter.chapterSlug.$error.duplicate && newChapter.chapterSlug.$dirty">This slug already exists</p>
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
                                                              <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*96.108*/("""{"""),format.raw/*96.109*/(""" url: '/file/upload' """),format.raw/*96.130*/("""}"""),format.raw/*96.131*/("""" >
                                                                  <div class="at-center">
                                                                      <h4> Drop Image Here</h4>


                                                                      <button type="button" class="btn btn-success" id="new-file-button">
                                                                          Select Picture</button>
                                                                      <input id="file-button" ng-file-select type="file" name="picture" />
                                                                      <script>
                                                                      $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*105.125*/("""{"""),format.raw/*105.126*/("""
                                                                      $ ( '#file-button' ).click ( ) ;
                                                                      """),format.raw/*107.71*/("""}"""),format.raw/*107.72*/(""" ) ;
                                                                      </script>
                                                                  </div>
                                                              </div>
                                                          </div>


                                                      </div>

                                                      <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                          <h3>Upload queue</h3>
                                                          <p>Queue length: """),format.raw/*119.76*/("""{"""),format.raw/*119.77*/("""{"""),format.raw/*119.78*/(""" uploader.queue.length """),format.raw/*119.101*/("""}"""),format.raw/*119.102*/("""}"""),format.raw/*119.103*/("""</p>

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
                                                                          """),format.raw/*135.75*/("""{"""),format.raw/*135.76*/("""{"""),format.raw/*135.77*/(""" item.file.name """),format.raw/*135.93*/("""}"""),format.raw/*135.94*/("""}"""),format.raw/*135.95*/("""</strong></td>
                                                                      <td ng-show="uploader.isHTML5" nowrap>
                                                                          """),format.raw/*137.75*/("""{"""),format.raw/*137.76*/("""{"""),format.raw/*137.77*/(""" item.file.size/1024/1024|number:2 """),format.raw/*137.112*/("""}"""),format.raw/*137.113*/("""}"""),format.raw/*137.114*/(""" MB</td>
                                                                      <td ng-show="uploader.isHTML5">
                                                                          <div class="progress" style="margin-bottom : 0 ;">
                                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*140.134*/("""{"""),format.raw/*140.135*/(""" 'width': item.progress + '%' """),format.raw/*140.165*/("""}"""),format.raw/*140.166*/(""""></div>
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
                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*170.118*/("""{"""),format.raw/*170.119*/(""" 'width': uploader.progress + '%' """),format.raw/*170.153*/("""}"""),format.raw/*170.154*/(""""></div>
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
                                                                  <img id="img"""),format.raw/*195.79*/("""{"""),format.raw/*195.80*/("""{"""),format.raw/*195.81*/("""image.id"""),format.raw/*195.89*/("""}"""),format.raw/*195.90*/("""}"""),format.raw/*195.91*/("""" ng-src="/assets/"""),format.raw/*195.109*/("""{"""),format.raw/*195.110*/("""{"""),format.raw/*195.111*/("""image.path.substring(7)"""),format.raw/*195.134*/("""}"""),format.raw/*195.135*/("""}"""),format.raw/*195.136*/("""" height=""""),format.raw/*195.146*/("""{"""),format.raw/*195.147*/("""{"""),format.raw/*195.148*/("""image.height"""),format.raw/*195.160*/("""}"""),format.raw/*195.161*/("""}"""),format.raw/*195.162*/("""" width=""""),format.raw/*195.171*/("""{"""),format.raw/*195.172*/("""{"""),format.raw/*195.173*/("""image.width"""),format.raw/*195.184*/("""}"""),format.raw/*195.185*/("""}"""),format.raw/*195.186*/("""" alt=""""),format.raw/*195.193*/("""{"""),format.raw/*195.194*/("""{"""),format.raw/*195.195*/("""image.alt"""),format.raw/*195.204*/("""}"""),format.raw/*195.205*/("""}"""),format.raw/*195.206*/("""" title=""""),format.raw/*195.215*/("""{"""),format.raw/*195.216*/("""{"""),format.raw/*195.217*/("""image.title"""),format.raw/*195.228*/("""}"""),format.raw/*195.229*/("""}"""),format.raw/*195.230*/("""" ng-click="selectImage($event)">
                                                                  <div class="selected-icon">
                                                                      <i class="fa fa-check fa-green fa-2x"></i>
                                                                  </div>
                                                              </div>

                                                          </div>
                                                          <div class="image-details-container">
                                                              <div class="container-fluid" ng-if="image">
                                                                  <legend>Image Details</legend>
                                                                  <img ng-src=""""),format.raw/*205.80*/("""{"""),format.raw/*205.81*/("""{"""),format.raw/*205.82*/("""imageSrc"""),format.raw/*205.90*/("""}"""),format.raw/*205.91*/("""}"""),format.raw/*205.92*/("""">
                                                                  <p class="small">FullName: """),format.raw/*206.94*/("""{"""),format.raw/*206.95*/("""{"""),format.raw/*206.96*/("""imageName"""),format.raw/*206.105*/("""}"""),format.raw/*206.106*/("""}"""),format.raw/*206.107*/("""</p>
                                                                  <p ng-show="imageAlt">Alt: """),format.raw/*207.94*/("""{"""),format.raw/*207.95*/("""{"""),format.raw/*207.96*/("""imageAlt"""),format.raw/*207.104*/("""}"""),format.raw/*207.105*/("""}"""),format.raw/*207.106*/("""</p>

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
                                              <span>Selected Images: """),format.raw/*250.70*/("""{"""),format.raw/*250.71*/("""{"""),format.raw/*250.72*/("""selectedImagesCount"""),format.raw/*250.91*/("""}"""),format.raw/*250.92*/("""}"""),format.raw/*250.93*/(""" </span>
                                          </span>
                                          <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                              Insert Into Post</button>
                                      </div>
                                  </div>
                              </div>
                          </div>


                          <div class="form-group">
                              <script type="text/javascript" src=""""),_display_(Seq[Any](/*261.68*/routes/*261.74*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*261.113*/(""""></script>

                              <script type="text/javascript">
                              tinymce.init ( """),format.raw/*264.46*/("""{"""),format.raw/*264.47*/("""
                              menubar : false,
                              selector : "#textmax",
                              height : "300px",
                              plugins :[
                              "advlist autolink lists link image charmap print preview anchor",
                              "searchreplace visualblocks code fullscreen",
                              "insertdatetime media table contextmenu paste"
                              ],
                              toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
                              """),format.raw/*274.31*/("""}"""),format.raw/*274.32*/(""" ) ;
                              </script>

                              <textarea id="textmax" class="editor" name="content" style="width : 100%"></textarea>
                          </div>



                          <div class="form-group">
                              <label class="col-md-3 control-label" for="chapter-subject">Parent Subject</label>
                              <div class="col-md-9">
                                  <select class="form-control" id="chapter-subject"  ng-model="chapterSubject" name="chapter-subject"  ng-options="subject.slug for subject in subjectsList" required></select>
                              </div>
                          </div>




                          <div class="form-group">
                              <div class="col-md-9 col-md-offset-3">
                                  <button type="submit" ng-hide="newChapter.$valid" class="btn btn-success disabled btn-lg">Update</button>
                                  <button type="submit" ng-show="newChapter.$valid" class="btn btn-success btn-lg">Update</button>
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
                                                <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*362.94*/("""{"""),format.raw/*362.95*/(""" url: '/file/upload' """),format.raw/*362.116*/("""}"""),format.raw/*362.117*/("""" >
                                                    <div class="at-center">
                                                        <h4> Drop Image Here</h4>


                                                        <button type="button" class="btn btn-success" id="new-file-button">
                                                            Select Picture</button>
                                                        <input id="file-button" ng-file-select type="file" name="picture" />
                                                        <script>
                                                        $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*371.111*/("""{"""),format.raw/*371.112*/("""
                                                        $ ( '#file-button' ).click ( ) ;
                                                        """),format.raw/*373.57*/("""}"""),format.raw/*373.58*/(""" ) ;
                                                        </script>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>

                                        <div class="full-height-upload-div" style="margin-bottom : 40px" ng-show="uploadInProgress">

                                            <h3>Upload queue</h3>
                                            <p>Queue length: """),format.raw/*385.62*/("""{"""),format.raw/*385.63*/("""{"""),format.raw/*385.64*/(""" uploader.queue.length """),format.raw/*385.87*/("""}"""),format.raw/*385.88*/("""}"""),format.raw/*385.89*/("""</p>

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
                                                            """),format.raw/*401.61*/("""{"""),format.raw/*401.62*/("""{"""),format.raw/*401.63*/(""" item.file.name """),format.raw/*401.79*/("""}"""),format.raw/*401.80*/("""}"""),format.raw/*401.81*/("""</strong></td>
                                                        <td ng-show="uploader.isHTML5" nowrap>
                                                            """),format.raw/*403.61*/("""{"""),format.raw/*403.62*/("""{"""),format.raw/*403.63*/(""" item.file.size/1024/1024|number:2 """),format.raw/*403.98*/("""}"""),format.raw/*403.99*/("""}"""),format.raw/*403.100*/(""" MB</td>
                                                        <td ng-show="uploader.isHTML5">
                                                            <div class="progress" style="margin-bottom : 0 ;">
                                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*406.120*/("""{"""),format.raw/*406.121*/(""" 'width': item.progress + '%' """),format.raw/*406.151*/("""}"""),format.raw/*406.152*/(""""></div>
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
                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*436.104*/("""{"""),format.raw/*436.105*/(""" 'width': uploader.progress + '%' """),format.raw/*436.139*/("""}"""),format.raw/*436.140*/(""""></div>
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
                                                    <img id="img"""),format.raw/*461.65*/("""{"""),format.raw/*461.66*/("""{"""),format.raw/*461.67*/("""image.id"""),format.raw/*461.75*/("""}"""),format.raw/*461.76*/("""}"""),format.raw/*461.77*/("""" ng-src="/assets/"""),format.raw/*461.95*/("""{"""),format.raw/*461.96*/("""{"""),format.raw/*461.97*/("""image.path.substring(7)"""),format.raw/*461.120*/("""}"""),format.raw/*461.121*/("""}"""),format.raw/*461.122*/("""" height=""""),format.raw/*461.132*/("""{"""),format.raw/*461.133*/("""{"""),format.raw/*461.134*/("""image.height"""),format.raw/*461.146*/("""}"""),format.raw/*461.147*/("""}"""),format.raw/*461.148*/("""" width=""""),format.raw/*461.157*/("""{"""),format.raw/*461.158*/("""{"""),format.raw/*461.159*/("""image.width"""),format.raw/*461.170*/("""}"""),format.raw/*461.171*/("""}"""),format.raw/*461.172*/("""" alt=""""),format.raw/*461.179*/("""{"""),format.raw/*461.180*/("""{"""),format.raw/*461.181*/("""image.alt"""),format.raw/*461.190*/("""}"""),format.raw/*461.191*/("""}"""),format.raw/*461.192*/("""" title=""""),format.raw/*461.201*/("""{"""),format.raw/*461.202*/("""{"""),format.raw/*461.203*/("""image.title"""),format.raw/*461.214*/("""}"""),format.raw/*461.215*/("""}"""),format.raw/*461.216*/("""" ng-click="selectImage($event)">
                                                    <div class="selected-icon">
                                                        <i class="fa fa-check fa-green fa-2x"></i>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="image-details-container">
                                                <div class="container-fluid" ng-if="image">
                                                    <legend>Image Details</legend>
                                                    <img ng-src=""""),format.raw/*471.66*/("""{"""),format.raw/*471.67*/("""{"""),format.raw/*471.68*/("""imageSrc"""),format.raw/*471.76*/("""}"""),format.raw/*471.77*/("""}"""),format.raw/*471.78*/("""">
                                                    <p class="small">FullName: """),format.raw/*472.80*/("""{"""),format.raw/*472.81*/("""{"""),format.raw/*472.82*/("""imageName"""),format.raw/*472.91*/("""}"""),format.raw/*472.92*/("""}"""),format.raw/*472.93*/("""</p>
                                                    <p ng-show="imageAlt">Alt: """),format.raw/*473.80*/("""{"""),format.raw/*473.81*/("""{"""),format.raw/*473.82*/("""imageAlt"""),format.raw/*473.90*/("""}"""),format.raw/*473.91*/("""}"""),format.raw/*473.92*/("""</p>

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
                                <span>Selected Images: """),format.raw/*516.56*/("""{"""),format.raw/*516.57*/("""{"""),format.raw/*516.58*/("""selectedImagesCount"""),format.raw/*516.77*/("""}"""),format.raw/*516.78*/("""}"""),format.raw/*516.79*/(""" </span>
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
                    DATE: Sun Dec 28 16:26:32 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_addchapter.scala.html
                    HASH: 299d1457cbd4cd5d46a47caa9fbeaa4818e5e17e
                    MATRIX: 815->1|986->102|1001->109|1085->111|1143->134|1157->140|1212->174|1281->208|1295->214|1360->258|1429->292|1443->298|1501->335|1570->369|1584->375|1632->402|1701->436|1715->442|1773->479|1842->513|1856->519|1917->559|2118->724|2133->730|2203->778|2275->814|2290->820|2343->851|2413->885|2428->891|2493->934|2563->968|2578->974|2644->1018|2714->1052|2729->1058|2798->1105|2838->1128|2857->1138|2942->1140|2972->1153|2986->1158|3071->1160|3449->1502|3464->1508|3525->1547|3602->1588|3617->1594|3685->1640|3732->60|3759->97|3790->1122|3822->1147|3854->1648|3891->1650|4004->1753|4045->1755|8174->5855|8204->5856|8254->5877|8284->5878|9084->6648|9115->6649|9318->6823|9348->6824|10037->7484|10067->7485|10097->7486|10150->7509|10181->7510|10212->7511|11514->8784|11544->8785|11574->8786|11619->8802|11649->8803|11679->8804|11906->9002|11936->9003|11966->9004|12031->9039|12062->9040|12093->9041|12492->9410|12523->9411|12583->9441|12614->9442|15630->12428|15661->12429|15725->12463|15756->12464|17945->14624|17975->14625|18005->14626|18042->14634|18072->14635|18102->14636|18150->14654|18181->14655|18212->14656|18265->14679|18296->14680|18327->14681|18367->14691|18398->14692|18429->14693|18471->14705|18502->14706|18533->14707|18572->14716|18603->14717|18634->14718|18675->14729|18706->14730|18737->14731|18774->14738|18805->14739|18836->14740|18875->14749|18906->14750|18937->14751|18976->14760|19007->14761|19038->14762|19079->14773|19110->14774|19141->14775|19997->15602|20027->15603|20057->15604|20094->15612|20124->15613|20154->15614|20279->15710|20309->15711|20339->15712|20378->15721|20409->15722|20440->15723|20567->15821|20597->15822|20627->15823|20665->15831|20696->15832|20727->15833|23850->18927|23880->18928|23910->18929|23958->18948|23988->18949|24018->18950|24710->19605|24726->19611|24789->19650|24938->19770|24968->19771|25678->20452|25708->20453|29716->24432|29746->24433|29797->24454|29828->24455|30530->25127|30561->25128|30736->25274|30766->25275|31342->25822|31372->25823|31402->25824|31454->25847|31484->25848|31514->25849|32606->26912|32636->26913|32666->26914|32711->26930|32741->26931|32771->26932|32970->27102|33000->27103|33030->27104|33094->27139|33124->27140|33155->27141|33512->27468|33543->27469|33603->27499|33634->27500|36244->30080|36275->30081|36339->30115|36370->30116|38255->31972|38285->31973|38315->31974|38352->31982|38382->31983|38412->31984|38459->32002|38489->32003|38519->32004|38572->32027|38603->32028|38634->32029|38674->32039|38705->32040|38736->32041|38778->32053|38809->32054|38840->32055|38879->32064|38910->32065|38941->32066|38982->32077|39013->32078|39044->32079|39081->32086|39112->32087|39143->32088|39182->32097|39213->32098|39244->32099|39283->32108|39314->32109|39345->32110|39386->32121|39417->32122|39448->32123|40178->32824|40208->32825|40238->32826|40275->32834|40305->32835|40335->32836|40446->32918|40476->32919|40506->32920|40544->32929|40574->32930|40604->32931|40717->33015|40747->33016|40777->33017|40814->33025|40844->33026|40874->33027|43539->35663|43569->35664|43599->35665|43647->35684|43677->35685|43707->35686
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->19|46->19|48->19|50->22|50->22|52->22|56->26|56->26|56->26|57->27|57->27|57->27|59->1|60->3|60->18|61->21|62->28|63->29|63->29|63->29|130->96|130->96|130->96|130->96|139->105|139->105|141->107|141->107|153->119|153->119|153->119|153->119|153->119|153->119|169->135|169->135|169->135|169->135|169->135|169->135|171->137|171->137|171->137|171->137|171->137|171->137|174->140|174->140|174->140|174->140|204->170|204->170|204->170|204->170|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|239->205|239->205|239->205|239->205|239->205|239->205|240->206|240->206|240->206|240->206|240->206|240->206|241->207|241->207|241->207|241->207|241->207|241->207|284->250|284->250|284->250|284->250|284->250|284->250|295->261|295->261|295->261|298->264|298->264|308->274|308->274|396->362|396->362|396->362|396->362|405->371|405->371|407->373|407->373|419->385|419->385|419->385|419->385|419->385|419->385|435->401|435->401|435->401|435->401|435->401|435->401|437->403|437->403|437->403|437->403|437->403|437->403|440->406|440->406|440->406|440->406|470->436|470->436|470->436|470->436|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|505->471|505->471|505->471|505->471|505->471|505->471|506->472|506->472|506->472|506->472|506->472|506->472|507->473|507->473|507->473|507->473|507->473|507->473|550->516|550->516|550->516|550->516|550->516|550->516
                    -- GENERATED --
                */
            