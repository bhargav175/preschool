
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
object admin_addconcept extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.Tag,play.api.templates.HtmlFormat.Appendable] {

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
        <h1 class="page-header"> Add Concept</h1>
    </div>
    <div class="container-fluid"  ng-controller="subjectController" ng-init="init()">

      <div class="col-md-8">
          <div class="well whiteWell" style="margin-top:0;padding-top:0;border-color:transparent">
              <form  ng-submit="addCon()" action="" name="newConcept" id="add-concept-form" class="form-horizontal">

                  <div class=" ">
                      <fieldset>



                          <div class="form-group">
                              <div >
                                  <input id="concept-name" required name="concept-name" ng-model="conceptName" type="text" placeholder="concept name" class="form-control">
                              </div>
                          </div>

                          <div class="form-group">
                              <div>
                                  <input id="concept-slug" required name="conceptslug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/" ng-model="conceptSlug" type="text" placeholder="concept Slug" class="form-control" duplicate="conceptSlugs">
                                  <p class="help-block text-danger" ng-show="newConcept.conceptSlug.$error.duplicate && newConcept.conceptSlug.$dirty">This slug already exists</p>

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
                                                              <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*100.108*/("""{"""),format.raw/*100.109*/(""" url: '/file/upload' """),format.raw/*100.130*/("""}"""),format.raw/*100.131*/("""" >
                                                                  <div class="at-center">
                                                                      <h4> Drop Image Here</h4>


                                                                      <button type="button" class="btn btn-success" id="new-file-button">
                                                                          Select Picture</button>
                                                                      <input id="file-button" ng-file-select type="file" name="picture" />
                                                                      <script>
                                                                      $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*109.125*/("""{"""),format.raw/*109.126*/("""
                                                                      $ ( '#file-button' ).click ( ) ;
                                                                      """),format.raw/*111.71*/("""}"""),format.raw/*111.72*/(""" ) ;
                                                                      </script>
                                                                  </div>
                                                              </div>
                                                          </div>


                                                      </div>

                                                      <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                          <h3>Upload queue</h3>
                                                          <p>Queue length: """),format.raw/*123.76*/("""{"""),format.raw/*123.77*/("""{"""),format.raw/*123.78*/(""" uploader.queue.length """),format.raw/*123.101*/("""}"""),format.raw/*123.102*/("""}"""),format.raw/*123.103*/("""</p>

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
                                                                          """),format.raw/*139.75*/("""{"""),format.raw/*139.76*/("""{"""),format.raw/*139.77*/(""" item.file.name """),format.raw/*139.93*/("""}"""),format.raw/*139.94*/("""}"""),format.raw/*139.95*/("""</strong></td>
                                                                      <td ng-show="uploader.isHTML5" nowrap>
                                                                          """),format.raw/*141.75*/("""{"""),format.raw/*141.76*/("""{"""),format.raw/*141.77*/(""" item.file.size/1024/1024|number:2 """),format.raw/*141.112*/("""}"""),format.raw/*141.113*/("""}"""),format.raw/*141.114*/(""" MB</td>
                                                                      <td ng-show="uploader.isHTML5">
                                                                          <div class="progress" style="margin-bottom : 0 ;">
                                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*144.134*/("""{"""),format.raw/*144.135*/(""" 'width': item.progress + '%' """),format.raw/*144.165*/("""}"""),format.raw/*144.166*/(""""></div>
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
                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*174.118*/("""{"""),format.raw/*174.119*/(""" 'width': uploader.progress + '%' """),format.raw/*174.153*/("""}"""),format.raw/*174.154*/(""""></div>
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
                                                                  <img id="img"""),format.raw/*199.79*/("""{"""),format.raw/*199.80*/("""{"""),format.raw/*199.81*/("""image.id"""),format.raw/*199.89*/("""}"""),format.raw/*199.90*/("""}"""),format.raw/*199.91*/("""" ng-src="/assets/"""),format.raw/*199.109*/("""{"""),format.raw/*199.110*/("""{"""),format.raw/*199.111*/("""image.path.substring(7)"""),format.raw/*199.134*/("""}"""),format.raw/*199.135*/("""}"""),format.raw/*199.136*/("""" height=""""),format.raw/*199.146*/("""{"""),format.raw/*199.147*/("""{"""),format.raw/*199.148*/("""image.height"""),format.raw/*199.160*/("""}"""),format.raw/*199.161*/("""}"""),format.raw/*199.162*/("""" width=""""),format.raw/*199.171*/("""{"""),format.raw/*199.172*/("""{"""),format.raw/*199.173*/("""image.width"""),format.raw/*199.184*/("""}"""),format.raw/*199.185*/("""}"""),format.raw/*199.186*/("""" alt=""""),format.raw/*199.193*/("""{"""),format.raw/*199.194*/("""{"""),format.raw/*199.195*/("""image.alt"""),format.raw/*199.204*/("""}"""),format.raw/*199.205*/("""}"""),format.raw/*199.206*/("""" title=""""),format.raw/*199.215*/("""{"""),format.raw/*199.216*/("""{"""),format.raw/*199.217*/("""image.title"""),format.raw/*199.228*/("""}"""),format.raw/*199.229*/("""}"""),format.raw/*199.230*/("""" ng-click="selectImage($event)">
                                                                  <div class="selected-icon">
                                                                      <i class="fa fa-check fa-green fa-2x"></i>
                                                                  </div>
                                                              </div>

                                                          </div>
                                                          <div class="image-details-container">
                                                              <div class="container-fluid" ng-if="image">
                                                                  <legend>Image Details</legend>
                                                                  <img ng-src=""""),format.raw/*209.80*/("""{"""),format.raw/*209.81*/("""{"""),format.raw/*209.82*/("""imageSrc"""),format.raw/*209.90*/("""}"""),format.raw/*209.91*/("""}"""),format.raw/*209.92*/("""">
                                                                  <p class="small">FullName: """),format.raw/*210.94*/("""{"""),format.raw/*210.95*/("""{"""),format.raw/*210.96*/("""imageName"""),format.raw/*210.105*/("""}"""),format.raw/*210.106*/("""}"""),format.raw/*210.107*/("""</p>
                                                                  <p ng-show="imageAlt">Alt: """),format.raw/*211.94*/("""{"""),format.raw/*211.95*/("""{"""),format.raw/*211.96*/("""imageAlt"""),format.raw/*211.104*/("""}"""),format.raw/*211.105*/("""}"""),format.raw/*211.106*/("""</p>

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
                                              <span>Selected Images: """),format.raw/*254.70*/("""{"""),format.raw/*254.71*/("""{"""),format.raw/*254.72*/("""selectedImagesCount"""),format.raw/*254.91*/("""}"""),format.raw/*254.92*/("""}"""),format.raw/*254.93*/(""" </span>
                                          </span>
                                          <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                              Insert Into Post</button>
                                      </div>
                                  </div>
                              </div>
                          </div>


                          <div class="form-group">
                              <script type="text/javascript" src=""""),_display_(Seq[Any](/*265.68*/routes/*265.74*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*265.113*/(""""></script>

                              <script type="text/javascript">
                              tinymce.init ( """),format.raw/*268.46*/("""{"""),format.raw/*268.47*/("""
                              menubar : false,
                              selector : "#textmax",
                              height : "300px",
                              plugins :[
                              "advlist autolink lists link image charmap print preview anchor",
                              "searchreplace visualblocks code fullscreen",
                              "insertdatetime media table contextmenu paste"
                              ],
                              toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
                              """),format.raw/*278.31*/("""}"""),format.raw/*278.32*/(""" ) ;
                              </script>

                              <textarea id="textmax" class="editor" name="content" style="width : 100%"></textarea>
                          </div>





                          <div class="form-group">
                              <label class="col-md-3 control-label" for="concept-chapter">Parent Chapter</label>
                              <div class="col-md-9">
                                  <select class="form-control" id="concept-subject"  ng-model="conceptChapter" name="concept-chapter"  ng-options="chapter.slug for chapter in chaptersList" required></select>

                              </div>
                          </div>

                          <div class="form-group">
                              <div class="col-md-9 col-md-offset-3">
                                  <button type="submit" ng-hide="newConcept.$valid" class="btn btn-success disabled btn-lg">Update</button>
                                  <button type="submit" ng-show="newConcept.$valid" class="btn btn-success btn-lg">Update</button>
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
                                                <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*366.94*/("""{"""),format.raw/*366.95*/(""" url: '/file/upload' """),format.raw/*366.116*/("""}"""),format.raw/*366.117*/("""" >
                                                    <div class="at-center">
                                                        <h4> Drop Image Here</h4>


                                                        <button type="button" class="btn btn-success" id="new-file-button">
                                                            Select Picture</button>
                                                        <input id="file-button" ng-file-select type="file" name="picture" />
                                                        <script>
                                                        $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*375.111*/("""{"""),format.raw/*375.112*/("""
                                                        $ ( '#file-button' ).click ( ) ;
                                                        """),format.raw/*377.57*/("""}"""),format.raw/*377.58*/(""" ) ;
                                                        </script>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>

                                        <div class="full-height-upload-div" style="margin-bottom : 40px" ng-show="uploadInProgress">

                                            <h3>Upload queue</h3>
                                            <p>Queue length: """),format.raw/*389.62*/("""{"""),format.raw/*389.63*/("""{"""),format.raw/*389.64*/(""" uploader.queue.length """),format.raw/*389.87*/("""}"""),format.raw/*389.88*/("""}"""),format.raw/*389.89*/("""</p>

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
                                                            """),format.raw/*405.61*/("""{"""),format.raw/*405.62*/("""{"""),format.raw/*405.63*/(""" item.file.name """),format.raw/*405.79*/("""}"""),format.raw/*405.80*/("""}"""),format.raw/*405.81*/("""</strong></td>
                                                        <td ng-show="uploader.isHTML5" nowrap>
                                                            """),format.raw/*407.61*/("""{"""),format.raw/*407.62*/("""{"""),format.raw/*407.63*/(""" item.file.size/1024/1024|number:2 """),format.raw/*407.98*/("""}"""),format.raw/*407.99*/("""}"""),format.raw/*407.100*/(""" MB</td>
                                                        <td ng-show="uploader.isHTML5">
                                                            <div class="progress" style="margin-bottom : 0 ;">
                                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*410.120*/("""{"""),format.raw/*410.121*/(""" 'width': item.progress + '%' """),format.raw/*410.151*/("""}"""),format.raw/*410.152*/(""""></div>
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
                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*440.104*/("""{"""),format.raw/*440.105*/(""" 'width': uploader.progress + '%' """),format.raw/*440.139*/("""}"""),format.raw/*440.140*/(""""></div>
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
                                                    <img id="img"""),format.raw/*465.65*/("""{"""),format.raw/*465.66*/("""{"""),format.raw/*465.67*/("""image.id"""),format.raw/*465.75*/("""}"""),format.raw/*465.76*/("""}"""),format.raw/*465.77*/("""" ng-src="/assets/"""),format.raw/*465.95*/("""{"""),format.raw/*465.96*/("""{"""),format.raw/*465.97*/("""image.path.substring(7)"""),format.raw/*465.120*/("""}"""),format.raw/*465.121*/("""}"""),format.raw/*465.122*/("""" height=""""),format.raw/*465.132*/("""{"""),format.raw/*465.133*/("""{"""),format.raw/*465.134*/("""image.height"""),format.raw/*465.146*/("""}"""),format.raw/*465.147*/("""}"""),format.raw/*465.148*/("""" width=""""),format.raw/*465.157*/("""{"""),format.raw/*465.158*/("""{"""),format.raw/*465.159*/("""image.width"""),format.raw/*465.170*/("""}"""),format.raw/*465.171*/("""}"""),format.raw/*465.172*/("""" alt=""""),format.raw/*465.179*/("""{"""),format.raw/*465.180*/("""{"""),format.raw/*465.181*/("""image.alt"""),format.raw/*465.190*/("""}"""),format.raw/*465.191*/("""}"""),format.raw/*465.192*/("""" title=""""),format.raw/*465.201*/("""{"""),format.raw/*465.202*/("""{"""),format.raw/*465.203*/("""image.title"""),format.raw/*465.214*/("""}"""),format.raw/*465.215*/("""}"""),format.raw/*465.216*/("""" ng-click="selectImage($event)">
                                                    <div class="selected-icon">
                                                        <i class="fa fa-check fa-green fa-2x"></i>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="image-details-container">
                                                <div class="container-fluid" ng-if="image">
                                                    <legend>Image Details</legend>
                                                    <img ng-src=""""),format.raw/*475.66*/("""{"""),format.raw/*475.67*/("""{"""),format.raw/*475.68*/("""imageSrc"""),format.raw/*475.76*/("""}"""),format.raw/*475.77*/("""}"""),format.raw/*475.78*/("""">
                                                    <p class="small">FullName: """),format.raw/*476.80*/("""{"""),format.raw/*476.81*/("""{"""),format.raw/*476.82*/("""imageName"""),format.raw/*476.91*/("""}"""),format.raw/*476.92*/("""}"""),format.raw/*476.93*/("""</p>
                                                    <p ng-show="imageAlt">Alt: """),format.raw/*477.80*/("""{"""),format.raw/*477.81*/("""{"""),format.raw/*477.82*/("""imageAlt"""),format.raw/*477.90*/("""}"""),format.raw/*477.91*/("""}"""),format.raw/*477.92*/("""</p>

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
                                <span>Selected Images: """),format.raw/*520.56*/("""{"""),format.raw/*520.57*/("""{"""),format.raw/*520.58*/("""selectedImagesCount"""),format.raw/*520.77*/("""}"""),format.raw/*520.78*/("""}"""),format.raw/*520.79*/(""" </span>
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
                    DATE: Sun Dec 28 16:26:33 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_addconcept.scala.html
                    HASH: 8808d2acea66a1bed19f9de60ebd0000e9098958
                    MATRIX: 815->1|986->102|1001->109|1085->111|1143->134|1157->140|1212->174|1281->208|1295->214|1360->258|1429->292|1443->298|1501->335|1570->369|1584->375|1632->402|1701->436|1715->442|1773->479|1842->513|1856->519|1917->559|2118->724|2133->730|2203->778|2275->814|2290->820|2343->851|2413->885|2428->891|2493->934|2563->968|2578->974|2644->1018|2714->1052|2729->1058|2798->1105|2838->1128|2857->1138|2942->1140|2972->1153|2986->1158|3071->1160|3449->1502|3464->1508|3525->1547|3602->1588|3617->1594|3685->1640|3732->60|3759->97|3790->1122|3822->1147|3854->1648|3891->1650|4004->1753|4045->1755|8186->5866|8217->5867|8268->5888|8299->5889|9099->6659|9130->6660|9333->6834|9363->6835|10052->7495|10082->7496|10112->7497|10165->7520|10196->7521|10227->7522|11529->8795|11559->8796|11589->8797|11634->8813|11664->8814|11694->8815|11921->9013|11951->9014|11981->9015|12046->9050|12077->9051|12108->9052|12507->9421|12538->9422|12598->9452|12629->9453|15645->12439|15676->12440|15740->12474|15771->12475|17960->14635|17990->14636|18020->14637|18057->14645|18087->14646|18117->14647|18165->14665|18196->14666|18227->14667|18280->14690|18311->14691|18342->14692|18382->14702|18413->14703|18444->14704|18486->14716|18517->14717|18548->14718|18587->14727|18618->14728|18649->14729|18690->14740|18721->14741|18752->14742|18789->14749|18820->14750|18851->14751|18890->14760|18921->14761|18952->14762|18991->14771|19022->14772|19053->14773|19094->14784|19125->14785|19156->14786|20012->15613|20042->15614|20072->15615|20109->15623|20139->15624|20169->15625|20294->15721|20324->15722|20354->15723|20393->15732|20424->15733|20455->15734|20582->15832|20612->15833|20642->15834|20680->15842|20711->15843|20742->15844|23865->18938|23895->18939|23925->18940|23973->18959|24003->18960|24033->18961|24725->19616|24741->19622|24804->19661|24953->19781|24983->19782|25693->20463|25723->20464|29731->24443|29761->24444|29812->24465|29843->24466|30545->25138|30576->25139|30751->25285|30781->25286|31357->25833|31387->25834|31417->25835|31469->25858|31499->25859|31529->25860|32621->26923|32651->26924|32681->26925|32726->26941|32756->26942|32786->26943|32985->27113|33015->27114|33045->27115|33109->27150|33139->27151|33170->27152|33527->27479|33558->27480|33618->27510|33649->27511|36259->30091|36290->30092|36354->30126|36385->30127|38270->31983|38300->31984|38330->31985|38367->31993|38397->31994|38427->31995|38474->32013|38504->32014|38534->32015|38587->32038|38618->32039|38649->32040|38689->32050|38720->32051|38751->32052|38793->32064|38824->32065|38855->32066|38894->32075|38925->32076|38956->32077|38997->32088|39028->32089|39059->32090|39096->32097|39127->32098|39158->32099|39197->32108|39228->32109|39259->32110|39298->32119|39329->32120|39360->32121|39401->32132|39432->32133|39463->32134|40193->32835|40223->32836|40253->32837|40290->32845|40320->32846|40350->32847|40461->32929|40491->32930|40521->32931|40559->32940|40589->32941|40619->32942|40732->33026|40762->33027|40792->33028|40829->33036|40859->33037|40889->33038|43554->35674|43584->35675|43614->35676|43662->35695|43692->35696|43722->35697
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->19|46->19|48->19|50->22|50->22|52->22|56->26|56->26|56->26|57->27|57->27|57->27|59->1|60->3|60->18|61->21|62->28|63->29|63->29|63->29|134->100|134->100|134->100|134->100|143->109|143->109|145->111|145->111|157->123|157->123|157->123|157->123|157->123|157->123|173->139|173->139|173->139|173->139|173->139|173->139|175->141|175->141|175->141|175->141|175->141|175->141|178->144|178->144|178->144|178->144|208->174|208->174|208->174|208->174|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|243->209|243->209|243->209|243->209|243->209|243->209|244->210|244->210|244->210|244->210|244->210|244->210|245->211|245->211|245->211|245->211|245->211|245->211|288->254|288->254|288->254|288->254|288->254|288->254|299->265|299->265|299->265|302->268|302->268|312->278|312->278|400->366|400->366|400->366|400->366|409->375|409->375|411->377|411->377|423->389|423->389|423->389|423->389|423->389|423->389|439->405|439->405|439->405|439->405|439->405|439->405|441->407|441->407|441->407|441->407|441->407|441->407|444->410|444->410|444->410|444->410|474->440|474->440|474->440|474->440|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|499->465|509->475|509->475|509->475|509->475|509->475|509->475|510->476|510->476|510->476|510->476|510->476|510->476|511->477|511->477|511->477|511->477|511->477|511->477|554->520|554->520|554->520|554->520|554->520|554->520
                    -- GENERATED --
                */
            