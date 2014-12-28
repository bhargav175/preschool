
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
object admin_addsubject extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.Tag,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null,tag:models.content.Tag=null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.admin.partials._

def /*3.6*/scripts/*3.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.15*/("""
        <script src='"""),_display_(Seq[Any](/*4.23*/routes/*4.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*4.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*5.23*/routes/*5.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*5.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*6.23*/routes/*6.29*/.Assets.at("js/angular.js"))),format.raw/*6.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*7.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*8.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*10.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/restangular.js"))),format.raw/*13.60*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*14.72*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*15.73*/("""'></script>

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
        <h1 class="page-header"> Add Subject</h1>
    </div>
    <div class="row">
    <div class="container-fluid"  ng-controller="subjectController" ng-init="init()">

      <div class="col-md-8">
          <div class="well whiteWell" style="margin-top:0;padding-top:0;border-color:transparent">


              <form   ng-submit="addSub()" action="" name="newSubject" id="add-subject-form" class="form-horizontal">

                  <div class=" ">
                      <fieldset>


                          <div class="form-group">
                              <div class="">
                                  <input id="subject-name" required name="subject-name" ng-model="subjectName" type="text" placeholder="Subject name" class="form-control">
                              </div>
                          </div>




                          <div class="form-group">

                              <div class="">
                                  <input id="subject-slug" required name="subjectSlug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/" ng-model="subjectSlug" type="text" placeholder="Subject Slug" class="form-control" duplicate="subjectSlugs">
                                  <p class="help-block text-danger" ng-show="newSubject.subjectSlug.$error.duplicate && newSubject.subjectSlug.$dirty">This slug already exists</p>

                              </div>
                          </div>
                          <div class="form-group">
                              <div class="">
                                  <input id="video-url" required name="video-url" ng-model="videoUrl" type="text" placeholder="Video Url" class="form-control">
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
                                                              <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*111.108*/("""{"""),format.raw/*111.109*/(""" url: '/file/upload' """),format.raw/*111.130*/("""}"""),format.raw/*111.131*/("""" >
                                                                  <div class="at-center">
                                                                      <h4> Drop Image Here</h4>


                                                                      <button type="button" class="btn btn-success" id="new-file-button">
                                                                          Select Picture</button>
                                                                      <input id="file-button" ng-file-select type="file" name="picture" />
                                                                      <script>
                                                                      $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*120.125*/("""{"""),format.raw/*120.126*/("""
                                                                      $ ( '#file-button' ).click ( ) ;
                                                                      """),format.raw/*122.71*/("""}"""),format.raw/*122.72*/(""" ) ;
                                                                      </script>
                                                                  </div>
                                                              </div>
                                                          </div>


                                                      </div>

                                                      <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                          <h3>Upload queue</h3>
                                                          <p>Queue length: """),format.raw/*134.76*/("""{"""),format.raw/*134.77*/("""{"""),format.raw/*134.78*/(""" uploader.queue.length """),format.raw/*134.101*/("""}"""),format.raw/*134.102*/("""}"""),format.raw/*134.103*/("""</p>

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
                                                                          """),format.raw/*150.75*/("""{"""),format.raw/*150.76*/("""{"""),format.raw/*150.77*/(""" item.file.name """),format.raw/*150.93*/("""}"""),format.raw/*150.94*/("""}"""),format.raw/*150.95*/("""</strong></td>
                                                                      <td ng-show="uploader.isHTML5" nowrap>
                                                                          """),format.raw/*152.75*/("""{"""),format.raw/*152.76*/("""{"""),format.raw/*152.77*/(""" item.file.size/1024/1024|number:2 """),format.raw/*152.112*/("""}"""),format.raw/*152.113*/("""}"""),format.raw/*152.114*/(""" MB</td>
                                                                      <td ng-show="uploader.isHTML5">
                                                                          <div class="progress" style="margin-bottom : 0 ;">
                                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*155.134*/("""{"""),format.raw/*155.135*/(""" 'width': item.progress + '%' """),format.raw/*155.165*/("""}"""),format.raw/*155.166*/(""""></div>
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
                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*185.118*/("""{"""),format.raw/*185.119*/(""" 'width': uploader.progress + '%' """),format.raw/*185.153*/("""}"""),format.raw/*185.154*/(""""></div>
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
                                                                  <img id="img"""),format.raw/*210.79*/("""{"""),format.raw/*210.80*/("""{"""),format.raw/*210.81*/("""image.id"""),format.raw/*210.89*/("""}"""),format.raw/*210.90*/("""}"""),format.raw/*210.91*/("""" ng-src="/assets/"""),format.raw/*210.109*/("""{"""),format.raw/*210.110*/("""{"""),format.raw/*210.111*/("""image.path.substring(7)"""),format.raw/*210.134*/("""}"""),format.raw/*210.135*/("""}"""),format.raw/*210.136*/("""" height=""""),format.raw/*210.146*/("""{"""),format.raw/*210.147*/("""{"""),format.raw/*210.148*/("""image.height"""),format.raw/*210.160*/("""}"""),format.raw/*210.161*/("""}"""),format.raw/*210.162*/("""" width=""""),format.raw/*210.171*/("""{"""),format.raw/*210.172*/("""{"""),format.raw/*210.173*/("""image.width"""),format.raw/*210.184*/("""}"""),format.raw/*210.185*/("""}"""),format.raw/*210.186*/("""" alt=""""),format.raw/*210.193*/("""{"""),format.raw/*210.194*/("""{"""),format.raw/*210.195*/("""image.alt"""),format.raw/*210.204*/("""}"""),format.raw/*210.205*/("""}"""),format.raw/*210.206*/("""" title=""""),format.raw/*210.215*/("""{"""),format.raw/*210.216*/("""{"""),format.raw/*210.217*/("""image.title"""),format.raw/*210.228*/("""}"""),format.raw/*210.229*/("""}"""),format.raw/*210.230*/("""" ng-click="selectImage($event)">
                                                                  <div class="selected-icon">
                                                                      <i class="fa fa-check fa-green fa-2x"></i>
                                                                  </div>
                                                              </div>

                                                          </div>
                                                          <div class="image-details-container">
                                                              <div class="container-fluid" ng-if="image">
                                                                  <legend>Image Details</legend>
                                                                  <img ng-src=""""),format.raw/*220.80*/("""{"""),format.raw/*220.81*/("""{"""),format.raw/*220.82*/("""imageSrc"""),format.raw/*220.90*/("""}"""),format.raw/*220.91*/("""}"""),format.raw/*220.92*/("""">
                                                                  <p class="small">FullName: """),format.raw/*221.94*/("""{"""),format.raw/*221.95*/("""{"""),format.raw/*221.96*/("""imageName"""),format.raw/*221.105*/("""}"""),format.raw/*221.106*/("""}"""),format.raw/*221.107*/("""</p>
                                                                  <p ng-show="imageAlt">Alt: """),format.raw/*222.94*/("""{"""),format.raw/*222.95*/("""{"""),format.raw/*222.96*/("""imageAlt"""),format.raw/*222.104*/("""}"""),format.raw/*222.105*/("""}"""),format.raw/*222.106*/("""</p>

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
                                              <span>Selected Images: """),format.raw/*265.70*/("""{"""),format.raw/*265.71*/("""{"""),format.raw/*265.72*/("""selectedImagesCount"""),format.raw/*265.91*/("""}"""),format.raw/*265.92*/("""}"""),format.raw/*265.93*/(""" </span>
                                          </span>
                                          <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                              Insert Into Post</button>
                                      </div>
                                  </div>
                              </div>
                          </div>


                          <div class="form-group">
                              <script type="text/javascript" src=""""),_display_(Seq[Any](/*276.68*/routes/*276.74*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*276.113*/(""""></script>

                              <script type="text/javascript">
                              tinymce.init ( """),format.raw/*279.46*/("""{"""),format.raw/*279.47*/("""
                              menubar : false,
                              selector : "#textmax",
                              height : "300px",
                              plugins :[
                              "advlist autolink lists link image charmap print preview anchor",
                              "searchreplace visualblocks code fullscreen",
                              "insertdatetime media table contextmenu paste"
                              ],
                              toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
                              """),format.raw/*289.31*/("""}"""),format.raw/*289.32*/(""" ) ;
                              </script>

                              <textarea id="textmax" class="editor" name="content" style="width : 100%"></textarea>
                          </div>




                          <div class="form-group">
                              <div class="col-md-9 col-md-offset-3">
                                  <button type="submit" ng-hide="newSubject.$valid" class="btn btn-success disabled btn-lg">Update</button>
                                  <button type="submit" ng-show="newSubject.$valid" class="btn btn-success btn-lg">Update</button>
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
                                                <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*368.94*/("""{"""),format.raw/*368.95*/(""" url: '/file/upload' """),format.raw/*368.116*/("""}"""),format.raw/*368.117*/("""" >
                                                    <div class="at-center">
                                                        <h4> Drop Image Here</h4>


                                                        <button type="button" class="btn btn-success" id="new-file-button">
                                                            Select Picture</button>
                                                        <input id="file-button" ng-file-select type="file" name="picture" />
                                                        <script>
                                                        $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*377.111*/("""{"""),format.raw/*377.112*/("""
                                                        $ ( '#file-button' ).click ( ) ;
                                                        """),format.raw/*379.57*/("""}"""),format.raw/*379.58*/(""" ) ;
                                                        </script>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>

                                        <div class="full-height-upload-div" style="margin-bottom : 40px" ng-show="uploadInProgress">

                                            <h3>Upload queue</h3>
                                            <p>Queue length: """),format.raw/*391.62*/("""{"""),format.raw/*391.63*/("""{"""),format.raw/*391.64*/(""" uploader.queue.length """),format.raw/*391.87*/("""}"""),format.raw/*391.88*/("""}"""),format.raw/*391.89*/("""</p>

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
                                                            """),format.raw/*407.61*/("""{"""),format.raw/*407.62*/("""{"""),format.raw/*407.63*/(""" item.file.name """),format.raw/*407.79*/("""}"""),format.raw/*407.80*/("""}"""),format.raw/*407.81*/("""</strong></td>
                                                        <td ng-show="uploader.isHTML5" nowrap>
                                                            """),format.raw/*409.61*/("""{"""),format.raw/*409.62*/("""{"""),format.raw/*409.63*/(""" item.file.size/1024/1024|number:2 """),format.raw/*409.98*/("""}"""),format.raw/*409.99*/("""}"""),format.raw/*409.100*/(""" MB</td>
                                                        <td ng-show="uploader.isHTML5">
                                                            <div class="progress" style="margin-bottom : 0 ;">
                                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*412.120*/("""{"""),format.raw/*412.121*/(""" 'width': item.progress + '%' """),format.raw/*412.151*/("""}"""),format.raw/*412.152*/(""""></div>
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
                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*442.104*/("""{"""),format.raw/*442.105*/(""" 'width': uploader.progress + '%' """),format.raw/*442.139*/("""}"""),format.raw/*442.140*/(""""></div>
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
                                                    <img id="img"""),format.raw/*467.65*/("""{"""),format.raw/*467.66*/("""{"""),format.raw/*467.67*/("""image.id"""),format.raw/*467.75*/("""}"""),format.raw/*467.76*/("""}"""),format.raw/*467.77*/("""" ng-src="/assets/"""),format.raw/*467.95*/("""{"""),format.raw/*467.96*/("""{"""),format.raw/*467.97*/("""image.path.substring(7)"""),format.raw/*467.120*/("""}"""),format.raw/*467.121*/("""}"""),format.raw/*467.122*/("""" height=""""),format.raw/*467.132*/("""{"""),format.raw/*467.133*/("""{"""),format.raw/*467.134*/("""image.height"""),format.raw/*467.146*/("""}"""),format.raw/*467.147*/("""}"""),format.raw/*467.148*/("""" width=""""),format.raw/*467.157*/("""{"""),format.raw/*467.158*/("""{"""),format.raw/*467.159*/("""image.width"""),format.raw/*467.170*/("""}"""),format.raw/*467.171*/("""}"""),format.raw/*467.172*/("""" alt=""""),format.raw/*467.179*/("""{"""),format.raw/*467.180*/("""{"""),format.raw/*467.181*/("""image.alt"""),format.raw/*467.190*/("""}"""),format.raw/*467.191*/("""}"""),format.raw/*467.192*/("""" title=""""),format.raw/*467.201*/("""{"""),format.raw/*467.202*/("""{"""),format.raw/*467.203*/("""image.title"""),format.raw/*467.214*/("""}"""),format.raw/*467.215*/("""}"""),format.raw/*467.216*/("""" ng-click="selectImage($event)">
                                                    <div class="selected-icon">
                                                        <i class="fa fa-check fa-green fa-2x"></i>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="image-details-container">
                                                <div class="container-fluid" ng-if="image">
                                                    <legend>Image Details</legend>
                                                    <img ng-src=""""),format.raw/*477.66*/("""{"""),format.raw/*477.67*/("""{"""),format.raw/*477.68*/("""imageSrc"""),format.raw/*477.76*/("""}"""),format.raw/*477.77*/("""}"""),format.raw/*477.78*/("""">
                                                    <p class="small">FullName: """),format.raw/*478.80*/("""{"""),format.raw/*478.81*/("""{"""),format.raw/*478.82*/("""imageName"""),format.raw/*478.91*/("""}"""),format.raw/*478.92*/("""}"""),format.raw/*478.93*/("""</p>
                                                    <p ng-show="imageAlt">Alt: """),format.raw/*479.80*/("""{"""),format.raw/*479.81*/("""{"""),format.raw/*479.82*/("""imageAlt"""),format.raw/*479.90*/("""}"""),format.raw/*479.91*/("""}"""),format.raw/*479.92*/("""</p>

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
                                <span>Selected Images: """),format.raw/*522.56*/("""{"""),format.raw/*522.57*/("""{"""),format.raw/*522.58*/("""selectedImagesCount"""),format.raw/*522.77*/("""}"""),format.raw/*522.78*/("""}"""),format.raw/*522.79*/(""" </span>
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



    <div>

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
                    DATE: Sun Dec 28 16:26:34 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_addsubject.scala.html
                    HASH: 1115e14f473f17c63763860689407a1a22275f93
                    MATRIX: 815->1|986->102|1001->109|1085->111|1143->134|1157->140|1212->174|1281->208|1295->214|1360->258|1429->292|1443->298|1491->325|1560->359|1574->365|1632->402|1701->436|1715->442|1776->482|1977->647|1992->653|2062->701|2134->737|2149->743|2202->774|2272->808|2287->814|2352->857|2422->891|2437->897|2503->941|2574->976|2589->982|2658->1029|2698->1052|2717->1062|2802->1064|2832->1077|2846->1082|2931->1084|3309->1426|3324->1432|3385->1471|3462->1512|3477->1518|3545->1564|3592->60|3619->97|3650->1046|3682->1071|3714->1572|3751->1574|3864->1677|3905->1679|8416->6160|8447->6161|8498->6182|8529->6183|9329->6953|9360->6954|9563->7128|9593->7129|10282->7789|10312->7790|10342->7791|10395->7814|10426->7815|10457->7816|11759->9089|11789->9090|11819->9091|11864->9107|11894->9108|11924->9109|12151->9307|12181->9308|12211->9309|12276->9344|12307->9345|12338->9346|12737->9715|12768->9716|12828->9746|12859->9747|15875->12733|15906->12734|15970->12768|16001->12769|18190->14929|18220->14930|18250->14931|18287->14939|18317->14940|18347->14941|18395->14959|18426->14960|18457->14961|18510->14984|18541->14985|18572->14986|18612->14996|18643->14997|18674->14998|18716->15010|18747->15011|18778->15012|18817->15021|18848->15022|18879->15023|18920->15034|18951->15035|18982->15036|19019->15043|19050->15044|19081->15045|19120->15054|19151->15055|19182->15056|19221->15065|19252->15066|19283->15067|19324->15078|19355->15079|19386->15080|20242->15907|20272->15908|20302->15909|20339->15917|20369->15918|20399->15919|20524->16015|20554->16016|20584->16017|20623->16026|20654->16027|20685->16028|20812->16126|20842->16127|20872->16128|20910->16136|20941->16137|20972->16138|24095->19232|24125->19233|24155->19234|24203->19253|24233->19254|24263->19255|24955->19910|24971->19916|25034->19955|25183->20075|25213->20076|25923->20757|25953->20758|29463->24239|29493->24240|29544->24261|29575->24262|30277->24934|30308->24935|30483->25081|30513->25082|31089->25629|31119->25630|31149->25631|31201->25654|31231->25655|31261->25656|32353->26719|32383->26720|32413->26721|32458->26737|32488->26738|32518->26739|32717->26909|32747->26910|32777->26911|32841->26946|32871->26947|32902->26948|33259->27275|33290->27276|33350->27306|33381->27307|35991->29887|36022->29888|36086->29922|36117->29923|38002->31779|38032->31780|38062->31781|38099->31789|38129->31790|38159->31791|38206->31809|38236->31810|38266->31811|38319->31834|38350->31835|38381->31836|38421->31846|38452->31847|38483->31848|38525->31860|38556->31861|38587->31862|38626->31871|38657->31872|38688->31873|38729->31884|38760->31885|38791->31886|38828->31893|38859->31894|38890->31895|38929->31904|38960->31905|38991->31906|39030->31915|39061->31916|39092->31917|39133->31928|39164->31929|39195->31930|39925->32631|39955->32632|39985->32633|40022->32641|40052->32642|40082->32643|40193->32725|40223->32726|40253->32727|40291->32736|40321->32737|40351->32738|40464->32822|40494->32823|40524->32824|40561->32832|40591->32833|40621->32834|43286->35470|43316->35471|43346->35472|43394->35491|43424->35492|43454->35493
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|45->17|45->17|45->17|46->19|46->19|48->19|50->22|50->22|52->22|56->26|56->26|56->26|57->27|57->27|57->27|59->1|60->3|60->18|61->21|62->28|63->29|63->29|63->29|145->111|145->111|145->111|145->111|154->120|154->120|156->122|156->122|168->134|168->134|168->134|168->134|168->134|168->134|184->150|184->150|184->150|184->150|184->150|184->150|186->152|186->152|186->152|186->152|186->152|186->152|189->155|189->155|189->155|189->155|219->185|219->185|219->185|219->185|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|254->220|254->220|254->220|254->220|254->220|254->220|255->221|255->221|255->221|255->221|255->221|255->221|256->222|256->222|256->222|256->222|256->222|256->222|299->265|299->265|299->265|299->265|299->265|299->265|310->276|310->276|310->276|313->279|313->279|323->289|323->289|402->368|402->368|402->368|402->368|411->377|411->377|413->379|413->379|425->391|425->391|425->391|425->391|425->391|425->391|441->407|441->407|441->407|441->407|441->407|441->407|443->409|443->409|443->409|443->409|443->409|443->409|446->412|446->412|446->412|446->412|476->442|476->442|476->442|476->442|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|501->467|511->477|511->477|511->477|511->477|511->477|511->477|512->478|512->478|512->478|512->478|512->478|512->478|513->479|513->479|513->479|513->479|513->479|513->479|556->522|556->522|556->522|556->522|556->522|556->522
                    -- GENERATED --
                */
            