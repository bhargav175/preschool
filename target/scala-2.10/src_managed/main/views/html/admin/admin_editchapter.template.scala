
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
object admin_editchapter extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.Chapter,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User,chapter:models.content.Chapter):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*19.6*/("""
    """),format.raw/*22.6*/("""
    """),format.raw/*29.6*/("""
"""),_display_(Seq[Any](/*30.2*/template_admin_dashboard(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.105*/ {_display_(Seq[Any](format.raw/*30.107*/("""


    <div ng-app="adminEditData"  class="shortNoteWrapper">
        <div class="">
            <h1 class="page-header"> Edit Chapter</h1>
        </div>
    <div class="container-fluid"  ng-controller="editChapterController" ng-init="chapterInit()">

        <div class="col-md-8">
            <div class="well whiteWell" style="padding-top:0;margin-top:0;border-color:transparent">
              <form   ng-submit="editChapter()" action="" name="newChapter" id="add-chapter-form" class="form-horizontal">
                  <div >
                      <fieldset>

                          <legend class="text-center"><h1>Add a Chapter</h1>
                              <p>#President?</p></legend>

                          <div class="form-group">
                              <div >
                                  <input id="chapter-name"  name="chapter-name" ng-model="chapterName" type="text" placeholder="chapter name"  class="form-control" required value=""""),_display_(Seq[Any](/*50.182*/chapter/*50.189*/.name)),format.raw/*50.194*/("""">
                                  <input type="hidden" value=""""),_display_(Seq[Any](/*51.64*/chapter/*51.71*/.slug)),format.raw/*51.76*/("""" id="nslug">
                              </div>
                          </div>

                          <div class="form-group">
                              <div >
                                  <input id="chapter-slug" value=""""),_display_(Seq[Any](/*57.68*/chapter/*57.75*/.slug)),format.raw/*57.80*/(""""  name="chapterSlug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/"  ng-model="chapterSlug" type="text" placeholder="chapter Slug" class="form-control" duplicate="chapterSlugs" required>
                                  <p class="help-block text-danger" ng-show="newChapter.ChapterSlug.$error.duplicate && newChapter.chapterSlug.$dirty">This slug already exists</p>

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

                              <textarea id="textmax" class="editor" name="content" style="width : 100%">"""),_display_(Seq[Any](/*281.106*/chapter/*281.113*/.descriptionHtml)),format.raw/*281.129*/("""</textarea>
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
                                                <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*364.94*/("""{"""),format.raw/*364.95*/(""" url: '/file/upload' """),format.raw/*364.116*/("""}"""),format.raw/*364.117*/("""" >
                                                    <div class="at-center">
                                                        <h4> Drop Image Here</h4>


                                                        <button type="button" class="btn btn-success" id="new-file-button">
                                                            Select Picture</button>
                                                        <input id="file-button" ng-file-select type="file" name="picture" />
                                                        <script>
                                                        $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*373.111*/("""{"""),format.raw/*373.112*/("""
                                                        $ ( '#file-button' ).click ( ) ;
                                                        """),format.raw/*375.57*/("""}"""),format.raw/*375.58*/(""" ) ;
                                                        </script>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>

                                        <div class="full-height-upload-div" style="margin-bottom : 40px" ng-show="uploadInProgress">

                                            <h3>Upload queue</h3>
                                            <p>Queue length: """),format.raw/*387.62*/("""{"""),format.raw/*387.63*/("""{"""),format.raw/*387.64*/(""" uploader.queue.length """),format.raw/*387.87*/("""}"""),format.raw/*387.88*/("""}"""),format.raw/*387.89*/("""</p>

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
                                                            """),format.raw/*403.61*/("""{"""),format.raw/*403.62*/("""{"""),format.raw/*403.63*/(""" item.file.name """),format.raw/*403.79*/("""}"""),format.raw/*403.80*/("""}"""),format.raw/*403.81*/("""</strong></td>
                                                        <td ng-show="uploader.isHTML5" nowrap>
                                                            """),format.raw/*405.61*/("""{"""),format.raw/*405.62*/("""{"""),format.raw/*405.63*/(""" item.file.size/1024/1024|number:2 """),format.raw/*405.98*/("""}"""),format.raw/*405.99*/("""}"""),format.raw/*405.100*/(""" MB</td>
                                                        <td ng-show="uploader.isHTML5">
                                                            <div class="progress" style="margin-bottom : 0 ;">
                                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*408.120*/("""{"""),format.raw/*408.121*/(""" 'width': item.progress + '%' """),format.raw/*408.151*/("""}"""),format.raw/*408.152*/(""""></div>
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
                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*438.104*/("""{"""),format.raw/*438.105*/(""" 'width': uploader.progress + '%' """),format.raw/*438.139*/("""}"""),format.raw/*438.140*/(""""></div>
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
                                                    <img id="img"""),format.raw/*463.65*/("""{"""),format.raw/*463.66*/("""{"""),format.raw/*463.67*/("""image.id"""),format.raw/*463.75*/("""}"""),format.raw/*463.76*/("""}"""),format.raw/*463.77*/("""" ng-src="/assets/"""),format.raw/*463.95*/("""{"""),format.raw/*463.96*/("""{"""),format.raw/*463.97*/("""image.path.substring(7)"""),format.raw/*463.120*/("""}"""),format.raw/*463.121*/("""}"""),format.raw/*463.122*/("""" height=""""),format.raw/*463.132*/("""{"""),format.raw/*463.133*/("""{"""),format.raw/*463.134*/("""image.height"""),format.raw/*463.146*/("""}"""),format.raw/*463.147*/("""}"""),format.raw/*463.148*/("""" width=""""),format.raw/*463.157*/("""{"""),format.raw/*463.158*/("""{"""),format.raw/*463.159*/("""image.width"""),format.raw/*463.170*/("""}"""),format.raw/*463.171*/("""}"""),format.raw/*463.172*/("""" alt=""""),format.raw/*463.179*/("""{"""),format.raw/*463.180*/("""{"""),format.raw/*463.181*/("""image.alt"""),format.raw/*463.190*/("""}"""),format.raw/*463.191*/("""}"""),format.raw/*463.192*/("""" title=""""),format.raw/*463.201*/("""{"""),format.raw/*463.202*/("""{"""),format.raw/*463.203*/("""image.title"""),format.raw/*463.214*/("""}"""),format.raw/*463.215*/("""}"""),format.raw/*463.216*/("""" ng-click="selectImage($event)">
                                                    <div class="selected-icon">
                                                        <i class="fa fa-check fa-green fa-2x"></i>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="image-details-container">
                                                <div class="container-fluid" ng-if="image">
                                                    <legend>Image Details</legend>
                                                    <img ng-src=""""),format.raw/*473.66*/("""{"""),format.raw/*473.67*/("""{"""),format.raw/*473.68*/("""imageSrc"""),format.raw/*473.76*/("""}"""),format.raw/*473.77*/("""}"""),format.raw/*473.78*/("""">
                                                    <p class="small">FullName: """),format.raw/*474.80*/("""{"""),format.raw/*474.81*/("""{"""),format.raw/*474.82*/("""imageName"""),format.raw/*474.91*/("""}"""),format.raw/*474.92*/("""}"""),format.raw/*474.93*/("""</p>
                                                    <p ng-show="imageAlt">Alt: """),format.raw/*475.80*/("""{"""),format.raw/*475.81*/("""{"""),format.raw/*475.82*/("""imageAlt"""),format.raw/*475.90*/("""}"""),format.raw/*475.91*/("""}"""),format.raw/*475.92*/("""</p>

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
                                <span>Selected Images: """),format.raw/*518.56*/("""{"""),format.raw/*518.57*/("""{"""),format.raw/*518.58*/("""selectedImagesCount"""),format.raw/*518.77*/("""}"""),format.raw/*518.78*/("""}"""),format.raw/*518.79*/(""" </span>
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
    
    def render(localUser:models.User,chapter:models.content.Chapter): play.api.templates.HtmlFormat.Appendable = apply(localUser,chapter)
    
    def f:((models.User,models.content.Chapter) => play.api.templates.HtmlFormat.Appendable) = (localUser,chapter) => apply(localUser,chapter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:38 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_editchapter.scala.html
                    HASH: bda8414f262a00278ba6cd710dd3c108887824e8
                    MATRIX: 820->1|987->98|1002->105|1086->107|1144->130|1158->136|1213->170|1282->204|1296->210|1361->254|1430->288|1444->294|1502->331|1571->365|1585->371|1633->398|1702->432|1716->438|1774->475|1843->509|1857->515|1918->555|2119->720|2134->726|2204->774|2276->810|2291->816|2344->847|2414->881|2429->887|2494->930|2564->964|2579->970|2645->1014|2715->1048|2730->1054|2799->1101|2869->1135|2884->1141|2952->1187|2992->1210|3011->1220|3096->1222|3126->1235|3140->1240|3225->1242|3603->1584|3618->1590|3679->1629|3756->1670|3771->1676|3839->1722|3886->56|3913->93|3944->1204|3976->1229|4008->1730|4045->1732|4158->1835|4199->1837|5208->2809|5225->2816|5253->2821|5355->2887|5371->2894|5398->2899|5674->3139|5690->3146|5717->3151|8841->6245|8872->6246|8923->6267|8954->6268|9754->7038|9785->7039|9988->7213|10018->7214|10707->7874|10737->7875|10767->7876|10820->7899|10851->7900|10882->7901|12184->9174|12214->9175|12244->9176|12289->9192|12319->9193|12349->9194|12576->9392|12606->9393|12636->9394|12701->9429|12732->9430|12763->9431|13162->9800|13193->9801|13253->9831|13284->9832|16300->12818|16331->12819|16395->12853|16426->12854|18615->15014|18645->15015|18675->15016|18712->15024|18742->15025|18772->15026|18820->15044|18851->15045|18882->15046|18935->15069|18966->15070|18997->15071|19037->15081|19068->15082|19099->15083|19141->15095|19172->15096|19203->15097|19242->15106|19273->15107|19304->15108|19345->15119|19376->15120|19407->15121|19444->15128|19475->15129|19506->15130|19545->15139|19576->15140|19607->15141|19646->15150|19677->15151|19708->15152|19749->15163|19780->15164|19811->15165|20667->15992|20697->15993|20727->15994|20764->16002|20794->16003|20824->16004|20949->16100|20979->16101|21009->16102|21048->16111|21079->16112|21110->16113|21237->16211|21267->16212|21297->16213|21335->16221|21366->16222|21397->16223|24520->19317|24550->19318|24580->19319|24628->19338|24658->19339|24688->19340|25380->19995|25396->20001|25459->20040|25608->20160|25638->20161|26348->20842|26378->20843|26567->20994|26585->21001|26625->21017|30481->24844|30511->24845|30562->24866|30593->24867|31295->25539|31326->25540|31501->25686|31531->25687|32107->26234|32137->26235|32167->26236|32219->26259|32249->26260|32279->26261|33371->27324|33401->27325|33431->27326|33476->27342|33506->27343|33536->27344|33735->27514|33765->27515|33795->27516|33859->27551|33889->27552|33920->27553|34277->27880|34308->27881|34368->27911|34399->27912|37009->30492|37040->30493|37104->30527|37135->30528|39020->32384|39050->32385|39080->32386|39117->32394|39147->32395|39177->32396|39224->32414|39254->32415|39284->32416|39337->32439|39368->32440|39399->32441|39439->32451|39470->32452|39501->32453|39543->32465|39574->32466|39605->32467|39644->32476|39675->32477|39706->32478|39747->32489|39778->32490|39809->32491|39846->32498|39877->32499|39908->32500|39947->32509|39978->32510|40009->32511|40048->32520|40079->32521|40110->32522|40151->32533|40182->32534|40213->32535|40943->33236|40973->33237|41003->33238|41040->33246|41070->33247|41100->33248|41211->33330|41241->33331|41271->33332|41309->33341|41339->33342|41369->33343|41482->33427|41512->33428|41542->33429|41579->33437|41609->33438|41639->33439|44304->36075|44334->36076|44364->36077|44412->36096|44442->36097|44472->36098
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->20|47->20|49->20|51->23|51->23|53->23|57->27|57->27|57->27|58->28|58->28|58->28|60->1|61->3|61->19|62->22|63->29|64->30|64->30|64->30|84->50|84->50|84->50|85->51|85->51|85->51|91->57|91->57|91->57|134->100|134->100|134->100|134->100|143->109|143->109|145->111|145->111|157->123|157->123|157->123|157->123|157->123|157->123|173->139|173->139|173->139|173->139|173->139|173->139|175->141|175->141|175->141|175->141|175->141|175->141|178->144|178->144|178->144|178->144|208->174|208->174|208->174|208->174|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|233->199|243->209|243->209|243->209|243->209|243->209|243->209|244->210|244->210|244->210|244->210|244->210|244->210|245->211|245->211|245->211|245->211|245->211|245->211|288->254|288->254|288->254|288->254|288->254|288->254|299->265|299->265|299->265|302->268|302->268|312->278|312->278|315->281|315->281|315->281|398->364|398->364|398->364|398->364|407->373|407->373|409->375|409->375|421->387|421->387|421->387|421->387|421->387|421->387|437->403|437->403|437->403|437->403|437->403|437->403|439->405|439->405|439->405|439->405|439->405|439->405|442->408|442->408|442->408|442->408|472->438|472->438|472->438|472->438|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|497->463|507->473|507->473|507->473|507->473|507->473|507->473|508->474|508->474|508->474|508->474|508->474|508->474|509->475|509->475|509->475|509->475|509->475|509->475|552->518|552->518|552->518|552->518|552->518|552->518
                    -- GENERATED --
                */
            