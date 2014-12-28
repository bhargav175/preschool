
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
object admin_editsubject extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.Subject,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User,subject:models.content.Subject):play.api.templates.HtmlFormat.Appendable = {
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

    <div ng-app="adminEditData" class="shortNoteWrapper">

        <div class="">
            <h1 class="page-header"> Edit Subject</h1>
        </div>
    <div class="container-fluid"  ng-controller="editSubjectController" ng-init="subjectInit()">

        <div class="col-md-8">
            <div class="well whiteWell" style="padding-top:0;margin-top:0;border-color:transparent">
              <form   ng-submit="editSubject()" action="" name="newSubject" id="add-subject-form" class="form-horizontal">
                  <div >
                      <fieldset>


                          <div class="form-group">
                              <div >
                                  <input id="subject-name" value=""""),_display_(Seq[Any](/*48.68*/subject/*48.75*/.name)),format.raw/*48.80*/(""""  name="subject-name" ng-model="subjectName" type="text" placeholder="tag name"  class="form-control" required>
                                  <input type="hidden" value=""""),_display_(Seq[Any](/*49.64*/subject/*49.71*/.slug)),format.raw/*49.76*/("""" id="nslug">

                              </div>
                          </div>

                          <div class="form-group">
                              <div >
                                  <input id="subject-slug"  name="subjectSlug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/"  ng-model="subjectSlug" type="text" placeholder="subject Slug" class="form-control" duplicate="subjectSlugs" required>
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
                                                              <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*108.108*/("""{"""),format.raw/*108.109*/(""" url: '/file/upload' """),format.raw/*108.130*/("""}"""),format.raw/*108.131*/("""" >
                                                                  <div class="at-center">
                                                                      <h4> Drop Image Here</h4>


                                                                      <button type="button" class="btn btn-success" id="new-file-button">
                                                                          Select Picture</button>
                                                                      <input id="file-button" ng-file-select type="file" name="picture" />
                                                                      <script>
                                                                      $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*117.125*/("""{"""),format.raw/*117.126*/("""
                                                                      $ ( '#file-button' ).click ( ) ;
                                                                      """),format.raw/*119.71*/("""}"""),format.raw/*119.72*/(""" ) ;
                                                                      </script>
                                                                  </div>
                                                              </div>
                                                          </div>


                                                      </div>

                                                      <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                          <h3>Upload queue</h3>
                                                          <p>Queue length: """),format.raw/*131.76*/("""{"""),format.raw/*131.77*/("""{"""),format.raw/*131.78*/(""" uploader.queue.length """),format.raw/*131.101*/("""}"""),format.raw/*131.102*/("""}"""),format.raw/*131.103*/("""</p>

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
                                                                          """),format.raw/*147.75*/("""{"""),format.raw/*147.76*/("""{"""),format.raw/*147.77*/(""" item.file.name """),format.raw/*147.93*/("""}"""),format.raw/*147.94*/("""}"""),format.raw/*147.95*/("""</strong></td>
                                                                      <td ng-show="uploader.isHTML5" nowrap>
                                                                          """),format.raw/*149.75*/("""{"""),format.raw/*149.76*/("""{"""),format.raw/*149.77*/(""" item.file.size/1024/1024|number:2 """),format.raw/*149.112*/("""}"""),format.raw/*149.113*/("""}"""),format.raw/*149.114*/(""" MB</td>
                                                                      <td ng-show="uploader.isHTML5">
                                                                          <div class="progress" style="margin-bottom : 0 ;">
                                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*152.134*/("""{"""),format.raw/*152.135*/(""" 'width': item.progress + '%' """),format.raw/*152.165*/("""}"""),format.raw/*152.166*/(""""></div>
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
                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*182.118*/("""{"""),format.raw/*182.119*/(""" 'width': uploader.progress + '%' """),format.raw/*182.153*/("""}"""),format.raw/*182.154*/(""""></div>
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
                                                                  <img id="img"""),format.raw/*207.79*/("""{"""),format.raw/*207.80*/("""{"""),format.raw/*207.81*/("""image.id"""),format.raw/*207.89*/("""}"""),format.raw/*207.90*/("""}"""),format.raw/*207.91*/("""" ng-src="/assets/"""),format.raw/*207.109*/("""{"""),format.raw/*207.110*/("""{"""),format.raw/*207.111*/("""image.path.substring(7)"""),format.raw/*207.134*/("""}"""),format.raw/*207.135*/("""}"""),format.raw/*207.136*/("""" height=""""),format.raw/*207.146*/("""{"""),format.raw/*207.147*/("""{"""),format.raw/*207.148*/("""image.height"""),format.raw/*207.160*/("""}"""),format.raw/*207.161*/("""}"""),format.raw/*207.162*/("""" width=""""),format.raw/*207.171*/("""{"""),format.raw/*207.172*/("""{"""),format.raw/*207.173*/("""image.width"""),format.raw/*207.184*/("""}"""),format.raw/*207.185*/("""}"""),format.raw/*207.186*/("""" alt=""""),format.raw/*207.193*/("""{"""),format.raw/*207.194*/("""{"""),format.raw/*207.195*/("""image.alt"""),format.raw/*207.204*/("""}"""),format.raw/*207.205*/("""}"""),format.raw/*207.206*/("""" title=""""),format.raw/*207.215*/("""{"""),format.raw/*207.216*/("""{"""),format.raw/*207.217*/("""image.title"""),format.raw/*207.228*/("""}"""),format.raw/*207.229*/("""}"""),format.raw/*207.230*/("""" ng-click="selectImage($event)">
                                                                  <div class="selected-icon">
                                                                      <i class="fa fa-check fa-green fa-2x"></i>
                                                                  </div>
                                                              </div>

                                                          </div>
                                                          <div class="image-details-container">
                                                              <div class="container-fluid" ng-if="image">
                                                                  <legend>Image Details</legend>
                                                                  <img ng-src=""""),format.raw/*217.80*/("""{"""),format.raw/*217.81*/("""{"""),format.raw/*217.82*/("""imageSrc"""),format.raw/*217.90*/("""}"""),format.raw/*217.91*/("""}"""),format.raw/*217.92*/("""">
                                                                  <p class="small">FullName: """),format.raw/*218.94*/("""{"""),format.raw/*218.95*/("""{"""),format.raw/*218.96*/("""imageName"""),format.raw/*218.105*/("""}"""),format.raw/*218.106*/("""}"""),format.raw/*218.107*/("""</p>
                                                                  <p ng-show="imageAlt">Alt: """),format.raw/*219.94*/("""{"""),format.raw/*219.95*/("""{"""),format.raw/*219.96*/("""imageAlt"""),format.raw/*219.104*/("""}"""),format.raw/*219.105*/("""}"""),format.raw/*219.106*/("""</p>

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
                                              <span>Selected Images: """),format.raw/*262.70*/("""{"""),format.raw/*262.71*/("""{"""),format.raw/*262.72*/("""selectedImagesCount"""),format.raw/*262.91*/("""}"""),format.raw/*262.92*/("""}"""),format.raw/*262.93*/(""" </span>
                                          </span>
                                          <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                              Insert Into Post</button>
                                      </div>
                                  </div>
                              </div>
                          </div>


                          <div class="form-group">
                              <script type="text/javascript" src=""""),_display_(Seq[Any](/*273.68*/routes/*273.74*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*273.113*/(""""></script>

                              <script type="text/javascript">
                              tinymce.init ( """),format.raw/*276.46*/("""{"""),format.raw/*276.47*/("""
                              menubar : false,
                              selector : "#textmax",
                              height : "300px",
                              plugins :[
                              "advlist autolink lists link image charmap print preview anchor",
                              "searchreplace visualblocks code fullscreen",
                              "insertdatetime media table contextmenu paste"
                              ],
                              toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
                              """),format.raw/*286.31*/("""}"""),format.raw/*286.32*/(""" ) ;
                              </script>

                              <textarea id="textmax" class="editor" name="content" style="width : 100%">"""),_display_(Seq[Any](/*289.106*/subject/*289.113*/.descriptionHtml)),format.raw/*289.129*/("""</textarea>
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
    
    def render(localUser:models.User,subject:models.content.Subject): play.api.templates.HtmlFormat.Appendable = apply(localUser,subject)
    
    def f:((models.User,models.content.Subject) => play.api.templates.HtmlFormat.Appendable) = (localUser,subject) => apply(localUser,subject)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:40 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_editsubject.scala.html
                    HASH: 35dac1cdb6f8564a179f20e284f3e7186eece897
                    MATRIX: 820->1|987->98|1002->105|1086->107|1144->130|1158->136|1213->170|1282->204|1296->210|1361->254|1430->288|1444->294|1502->331|1571->365|1585->371|1633->398|1702->432|1716->438|1774->475|1843->509|1857->515|1918->555|2119->720|2134->726|2204->774|2276->810|2291->816|2344->847|2414->881|2429->887|2494->930|2564->964|2579->970|2645->1014|2715->1048|2730->1054|2799->1101|2869->1135|2884->1141|2952->1187|2992->1210|3011->1220|3096->1222|3126->1235|3140->1240|3225->1242|3603->1584|3618->1590|3679->1629|3756->1670|3771->1676|3839->1722|3886->56|3913->93|3944->1204|3976->1229|4008->1730|4045->1732|4158->1835|4199->1837|4957->2559|4973->2566|5000->2571|5212->2747|5228->2754|5255->2759|8940->6414|8971->6415|9022->6436|9053->6437|9853->7207|9884->7208|10087->7382|10117->7383|10806->8043|10836->8044|10866->8045|10919->8068|10950->8069|10981->8070|12283->9343|12313->9344|12343->9345|12388->9361|12418->9362|12448->9363|12675->9561|12705->9562|12735->9563|12800->9598|12831->9599|12862->9600|13261->9969|13292->9970|13352->10000|13383->10001|16399->12987|16430->12988|16494->13022|16525->13023|18714->15183|18744->15184|18774->15185|18811->15193|18841->15194|18871->15195|18919->15213|18950->15214|18981->15215|19034->15238|19065->15239|19096->15240|19136->15250|19167->15251|19198->15252|19240->15264|19271->15265|19302->15266|19341->15275|19372->15276|19403->15277|19444->15288|19475->15289|19506->15290|19543->15297|19574->15298|19605->15299|19644->15308|19675->15309|19706->15310|19745->15319|19776->15320|19807->15321|19848->15332|19879->15333|19910->15334|20766->16161|20796->16162|20826->16163|20863->16171|20893->16172|20923->16173|21048->16269|21078->16270|21108->16271|21147->16280|21178->16281|21209->16282|21336->16380|21366->16381|21396->16382|21434->16390|21465->16391|21496->16392|24619->19486|24649->19487|24679->19488|24727->19507|24757->19508|24787->19509|25479->20164|25495->20170|25558->20209|25707->20329|25737->20330|26447->21011|26477->21012|26666->21163|26684->21170|26724->21186|30081->24514|30111->24515|30162->24536|30193->24537|30895->25209|30926->25210|31101->25356|31131->25357|31707->25904|31737->25905|31767->25906|31819->25929|31849->25930|31879->25931|32971->26994|33001->26995|33031->26996|33076->27012|33106->27013|33136->27014|33335->27184|33365->27185|33395->27186|33459->27221|33489->27222|33520->27223|33877->27550|33908->27551|33968->27581|33999->27582|36609->30162|36640->30163|36704->30197|36735->30198|38620->32054|38650->32055|38680->32056|38717->32064|38747->32065|38777->32066|38824->32084|38854->32085|38884->32086|38937->32109|38968->32110|38999->32111|39039->32121|39070->32122|39101->32123|39143->32135|39174->32136|39205->32137|39244->32146|39275->32147|39306->32148|39347->32159|39378->32160|39409->32161|39446->32168|39477->32169|39508->32170|39547->32179|39578->32180|39609->32181|39648->32190|39679->32191|39710->32192|39751->32203|39782->32204|39813->32205|40543->32906|40573->32907|40603->32908|40640->32916|40670->32917|40700->32918|40811->33000|40841->33001|40871->33002|40909->33011|40939->33012|40969->33013|41082->33097|41112->33098|41142->33099|41179->33107|41209->33108|41239->33109|43904->35745|43934->35746|43964->35747|44012->35766|44042->35767|44072->35768
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->20|47->20|49->20|51->23|51->23|53->23|57->27|57->27|57->27|58->28|58->28|58->28|60->1|61->3|61->19|62->22|63->29|64->30|64->30|64->30|82->48|82->48|82->48|83->49|83->49|83->49|142->108|142->108|142->108|142->108|151->117|151->117|153->119|153->119|165->131|165->131|165->131|165->131|165->131|165->131|181->147|181->147|181->147|181->147|181->147|181->147|183->149|183->149|183->149|183->149|183->149|183->149|186->152|186->152|186->152|186->152|216->182|216->182|216->182|216->182|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|241->207|251->217|251->217|251->217|251->217|251->217|251->217|252->218|252->218|252->218|252->218|252->218|252->218|253->219|253->219|253->219|253->219|253->219|253->219|296->262|296->262|296->262|296->262|296->262|296->262|307->273|307->273|307->273|310->276|310->276|320->286|320->286|323->289|323->289|323->289|396->362|396->362|396->362|396->362|405->371|405->371|407->373|407->373|419->385|419->385|419->385|419->385|419->385|419->385|435->401|435->401|435->401|435->401|435->401|435->401|437->403|437->403|437->403|437->403|437->403|437->403|440->406|440->406|440->406|440->406|470->436|470->436|470->436|470->436|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|495->461|505->471|505->471|505->471|505->471|505->471|505->471|506->472|506->472|506->472|506->472|506->472|506->472|507->473|507->473|507->473|507->473|507->473|507->473|550->516|550->516|550->516|550->516|550->516|550->516
                    -- GENERATED --
                */
            