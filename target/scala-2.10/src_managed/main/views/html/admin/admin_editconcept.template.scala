
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
object admin_editconcept extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.Concept,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User,concept:models.content.Concept):play.api.templates.HtmlFormat.Appendable = {
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
            <h1 class="page-header"> Edit Concept</h1>
        </div>
    <div class="container-fluid"  ng-controller="editConceptController" ng-init="conceptInit()">

        <div class="col-md-8">
          <div class="well whiteWell" style="padding-top:0;margin-top:0;border-color:transparent">
              <form   ng-submit="editConcept()" action="" name="newConcept" id="add-concept-form" class="form-horizontal">
                  <div >
                      <fieldset>


                          <div class="form-group">
                              <div >
                                  <input id="concept-name" value=""""),_display_(Seq[Any](/*48.68*/concept/*48.75*/.name)),format.raw/*48.80*/(""""    name="concept-name" ng-model="conceptName" type="text" placeholder="concept name"  class="form-control" required>
                                  <input type="hidden" value=""""),_display_(Seq[Any](/*49.64*/concept/*49.71*/.slug)),format.raw/*49.76*/("""" id="nslug">

                              </div>
                          </div>

                          <div class="form-group">
                              <div >
                                  <input id="concept-slug"  name="conceptSlug" ng-maxlength="20" ng-pattern="/^[a-z]+(-[a-z]+)*$/"  ng-model="conceptSlug" type="text" placeholder="concept Slug" class="form-control" duplicate="conceptSlugs" required>
                                  <p class="help-block text-danger" ng-show="newconcept.tagSlug.$error.duplicate && newTag.ConceptSlug.$dirty">This slug already exists</p>

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
                                                              <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*102.108*/("""{"""),format.raw/*102.109*/(""" url: '/file/upload' """),format.raw/*102.130*/("""}"""),format.raw/*102.131*/("""" >
                                                                  <div class="at-center">
                                                                      <h4> Drop Image Here</h4>


                                                                      <button type="button" class="btn btn-success" id="new-file-button">
                                                                          Select Picture</button>
                                                                      <input id="file-button" ng-file-select type="file" name="picture" />
                                                                      <script>
                                                                      $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*111.125*/("""{"""),format.raw/*111.126*/("""
                                                                      $ ( '#file-button' ).click ( ) ;
                                                                      """),format.raw/*113.71*/("""}"""),format.raw/*113.72*/(""" ) ;
                                                                      </script>
                                                                  </div>
                                                              </div>
                                                          </div>


                                                      </div>

                                                      <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                          <h3>Upload queue</h3>
                                                          <p>Queue length: """),format.raw/*125.76*/("""{"""),format.raw/*125.77*/("""{"""),format.raw/*125.78*/(""" uploader.queue.length """),format.raw/*125.101*/("""}"""),format.raw/*125.102*/("""}"""),format.raw/*125.103*/("""</p>

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
                                                                          """),format.raw/*141.75*/("""{"""),format.raw/*141.76*/("""{"""),format.raw/*141.77*/(""" item.file.name """),format.raw/*141.93*/("""}"""),format.raw/*141.94*/("""}"""),format.raw/*141.95*/("""</strong></td>
                                                                      <td ng-show="uploader.isHTML5" nowrap>
                                                                          """),format.raw/*143.75*/("""{"""),format.raw/*143.76*/("""{"""),format.raw/*143.77*/(""" item.file.size/1024/1024|number:2 """),format.raw/*143.112*/("""}"""),format.raw/*143.113*/("""}"""),format.raw/*143.114*/(""" MB</td>
                                                                      <td ng-show="uploader.isHTML5">
                                                                          <div class="progress" style="margin-bottom : 0 ;">
                                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*146.134*/("""{"""),format.raw/*146.135*/(""" 'width': item.progress + '%' """),format.raw/*146.165*/("""}"""),format.raw/*146.166*/(""""></div>
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
                                                              <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*176.118*/("""{"""),format.raw/*176.119*/(""" 'width': uploader.progress + '%' """),format.raw/*176.153*/("""}"""),format.raw/*176.154*/(""""></div>
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
                                                                  <img id="img"""),format.raw/*201.79*/("""{"""),format.raw/*201.80*/("""{"""),format.raw/*201.81*/("""image.id"""),format.raw/*201.89*/("""}"""),format.raw/*201.90*/("""}"""),format.raw/*201.91*/("""" ng-src="/assets/"""),format.raw/*201.109*/("""{"""),format.raw/*201.110*/("""{"""),format.raw/*201.111*/("""image.path.substring(7)"""),format.raw/*201.134*/("""}"""),format.raw/*201.135*/("""}"""),format.raw/*201.136*/("""" height=""""),format.raw/*201.146*/("""{"""),format.raw/*201.147*/("""{"""),format.raw/*201.148*/("""image.height"""),format.raw/*201.160*/("""}"""),format.raw/*201.161*/("""}"""),format.raw/*201.162*/("""" width=""""),format.raw/*201.171*/("""{"""),format.raw/*201.172*/("""{"""),format.raw/*201.173*/("""image.width"""),format.raw/*201.184*/("""}"""),format.raw/*201.185*/("""}"""),format.raw/*201.186*/("""" alt=""""),format.raw/*201.193*/("""{"""),format.raw/*201.194*/("""{"""),format.raw/*201.195*/("""image.alt"""),format.raw/*201.204*/("""}"""),format.raw/*201.205*/("""}"""),format.raw/*201.206*/("""" title=""""),format.raw/*201.215*/("""{"""),format.raw/*201.216*/("""{"""),format.raw/*201.217*/("""image.title"""),format.raw/*201.228*/("""}"""),format.raw/*201.229*/("""}"""),format.raw/*201.230*/("""" ng-click="selectImage($event)">
                                                                  <div class="selected-icon">
                                                                      <i class="fa fa-check fa-green fa-2x"></i>
                                                                  </div>
                                                              </div>

                                                          </div>
                                                          <div class="image-details-container">
                                                              <div class="container-fluid" ng-if="image">
                                                                  <legend>Image Details</legend>
                                                                  <img ng-src=""""),format.raw/*211.80*/("""{"""),format.raw/*211.81*/("""{"""),format.raw/*211.82*/("""imageSrc"""),format.raw/*211.90*/("""}"""),format.raw/*211.91*/("""}"""),format.raw/*211.92*/("""">
                                                                  <p class="small">FullName: """),format.raw/*212.94*/("""{"""),format.raw/*212.95*/("""{"""),format.raw/*212.96*/("""imageName"""),format.raw/*212.105*/("""}"""),format.raw/*212.106*/("""}"""),format.raw/*212.107*/("""</p>
                                                                  <p ng-show="imageAlt">Alt: """),format.raw/*213.94*/("""{"""),format.raw/*213.95*/("""{"""),format.raw/*213.96*/("""imageAlt"""),format.raw/*213.104*/("""}"""),format.raw/*213.105*/("""}"""),format.raw/*213.106*/("""</p>

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
                                              <span>Selected Images: """),format.raw/*256.70*/("""{"""),format.raw/*256.71*/("""{"""),format.raw/*256.72*/("""selectedImagesCount"""),format.raw/*256.91*/("""}"""),format.raw/*256.92*/("""}"""),format.raw/*256.93*/(""" </span>
                                          </span>
                                          <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                              Insert Into Post</button>
                                      </div>
                                  </div>
                              </div>
                          </div>


                          <div class="form-group">
                              <script type="text/javascript" src=""""),_display_(Seq[Any](/*267.68*/routes/*267.74*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*267.113*/(""""></script>

                              <script type="text/javascript">
                              tinymce.init ( """),format.raw/*270.46*/("""{"""),format.raw/*270.47*/("""
                              menubar : false,
                              selector : "#textmax",
                              height : "300px",
                              plugins :[
                              "advlist autolink lists link image charmap print preview anchor",
                              "searchreplace visualblocks code fullscreen",
                              "insertdatetime media table contextmenu paste"
                              ],
                              toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
                              """),format.raw/*280.31*/("""}"""),format.raw/*280.32*/(""" ) ;
                              </script>

                              <textarea id="textmax" class="editor" name="content" style="width : 100%">"""),_display_(Seq[Any](/*283.106*/concept/*283.113*/.descriptionHtml)),format.raw/*283.129*/("""</textarea>
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
                                                <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*365.94*/("""{"""),format.raw/*365.95*/(""" url: '/file/upload' """),format.raw/*365.116*/("""}"""),format.raw/*365.117*/("""" >
                                                    <div class="at-center">
                                                        <h4> Drop Image Here</h4>


                                                        <button type="button" class="btn btn-success" id="new-file-button">
                                                            Select Picture</button>
                                                        <input id="file-button" ng-file-select type="file" name="picture" />
                                                        <script>
                                                        $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*374.111*/("""{"""),format.raw/*374.112*/("""
                                                        $ ( '#file-button' ).click ( ) ;
                                                        """),format.raw/*376.57*/("""}"""),format.raw/*376.58*/(""" ) ;
                                                        </script>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>

                                        <div class="full-height-upload-div" style="margin-bottom : 40px" ng-show="uploadInProgress">

                                            <h3>Upload queue</h3>
                                            <p>Queue length: """),format.raw/*388.62*/("""{"""),format.raw/*388.63*/("""{"""),format.raw/*388.64*/(""" uploader.queue.length """),format.raw/*388.87*/("""}"""),format.raw/*388.88*/("""}"""),format.raw/*388.89*/("""</p>

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
                                                            """),format.raw/*404.61*/("""{"""),format.raw/*404.62*/("""{"""),format.raw/*404.63*/(""" item.file.name """),format.raw/*404.79*/("""}"""),format.raw/*404.80*/("""}"""),format.raw/*404.81*/("""</strong></td>
                                                        <td ng-show="uploader.isHTML5" nowrap>
                                                            """),format.raw/*406.61*/("""{"""),format.raw/*406.62*/("""{"""),format.raw/*406.63*/(""" item.file.size/1024/1024|number:2 """),format.raw/*406.98*/("""}"""),format.raw/*406.99*/("""}"""),format.raw/*406.100*/(""" MB</td>
                                                        <td ng-show="uploader.isHTML5">
                                                            <div class="progress" style="margin-bottom : 0 ;">
                                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*409.120*/("""{"""),format.raw/*409.121*/(""" 'width': item.progress + '%' """),format.raw/*409.151*/("""}"""),format.raw/*409.152*/(""""></div>
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
                                                <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*439.104*/("""{"""),format.raw/*439.105*/(""" 'width': uploader.progress + '%' """),format.raw/*439.139*/("""}"""),format.raw/*439.140*/(""""></div>
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
                                                    <img id="img"""),format.raw/*464.65*/("""{"""),format.raw/*464.66*/("""{"""),format.raw/*464.67*/("""image.id"""),format.raw/*464.75*/("""}"""),format.raw/*464.76*/("""}"""),format.raw/*464.77*/("""" ng-src="/assets/"""),format.raw/*464.95*/("""{"""),format.raw/*464.96*/("""{"""),format.raw/*464.97*/("""image.path.substring(7)"""),format.raw/*464.120*/("""}"""),format.raw/*464.121*/("""}"""),format.raw/*464.122*/("""" height=""""),format.raw/*464.132*/("""{"""),format.raw/*464.133*/("""{"""),format.raw/*464.134*/("""image.height"""),format.raw/*464.146*/("""}"""),format.raw/*464.147*/("""}"""),format.raw/*464.148*/("""" width=""""),format.raw/*464.157*/("""{"""),format.raw/*464.158*/("""{"""),format.raw/*464.159*/("""image.width"""),format.raw/*464.170*/("""}"""),format.raw/*464.171*/("""}"""),format.raw/*464.172*/("""" alt=""""),format.raw/*464.179*/("""{"""),format.raw/*464.180*/("""{"""),format.raw/*464.181*/("""image.alt"""),format.raw/*464.190*/("""}"""),format.raw/*464.191*/("""}"""),format.raw/*464.192*/("""" title=""""),format.raw/*464.201*/("""{"""),format.raw/*464.202*/("""{"""),format.raw/*464.203*/("""image.title"""),format.raw/*464.214*/("""}"""),format.raw/*464.215*/("""}"""),format.raw/*464.216*/("""" ng-click="selectImage($event)">
                                                    <div class="selected-icon">
                                                        <i class="fa fa-check fa-green fa-2x"></i>
                                                    </div>
                                                </div>

                                            </div>
                                            <div class="image-details-container">
                                                <div class="container-fluid" ng-if="image">
                                                    <legend>Image Details</legend>
                                                    <img ng-src=""""),format.raw/*474.66*/("""{"""),format.raw/*474.67*/("""{"""),format.raw/*474.68*/("""imageSrc"""),format.raw/*474.76*/("""}"""),format.raw/*474.77*/("""}"""),format.raw/*474.78*/("""">
                                                    <p class="small">FullName: """),format.raw/*475.80*/("""{"""),format.raw/*475.81*/("""{"""),format.raw/*475.82*/("""imageName"""),format.raw/*475.91*/("""}"""),format.raw/*475.92*/("""}"""),format.raw/*475.93*/("""</p>
                                                    <p ng-show="imageAlt">Alt: """),format.raw/*476.80*/("""{"""),format.raw/*476.81*/("""{"""),format.raw/*476.82*/("""imageAlt"""),format.raw/*476.90*/("""}"""),format.raw/*476.91*/("""}"""),format.raw/*476.92*/("""</p>

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
                                <span>Selected Images: """),format.raw/*519.56*/("""{"""),format.raw/*519.57*/("""{"""),format.raw/*519.58*/("""selectedImagesCount"""),format.raw/*519.77*/("""}"""),format.raw/*519.78*/("""}"""),format.raw/*519.79*/(""" </span>
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
    
    def render(localUser:models.User,concept:models.content.Concept): play.api.templates.HtmlFormat.Appendable = apply(localUser,concept)
    
    def f:((models.User,models.content.Concept) => play.api.templates.HtmlFormat.Appendable) = (localUser,concept) => apply(localUser,concept)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:39 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_editconcept.scala.html
                    HASH: 4855f767181cf766feec00f346ab676bad5f39da
                    MATRIX: 820->1|987->98|1002->105|1086->107|1144->130|1158->136|1213->170|1282->204|1296->210|1361->254|1430->288|1444->294|1502->331|1571->365|1585->371|1633->398|1702->432|1716->438|1774->475|1843->509|1857->515|1918->555|2119->720|2134->726|2204->774|2276->810|2291->816|2344->847|2414->881|2429->887|2494->930|2564->964|2579->970|2645->1014|2715->1048|2730->1054|2799->1101|2869->1135|2884->1141|2952->1187|2992->1210|3011->1220|3096->1222|3126->1235|3140->1240|3225->1242|3603->1584|3618->1590|3679->1629|3756->1670|3771->1676|3839->1722|3886->56|3913->93|3944->1204|3976->1229|4008->1730|4045->1732|4158->1835|4199->1837|4955->2557|4971->2564|4998->2569|5216->2751|5232->2758|5259->2763|8609->6083|8640->6084|8691->6105|8722->6106|9522->6876|9553->6877|9756->7051|9786->7052|10475->7712|10505->7713|10535->7714|10588->7737|10619->7738|10650->7739|11952->9012|11982->9013|12012->9014|12057->9030|12087->9031|12117->9032|12344->9230|12374->9231|12404->9232|12469->9267|12500->9268|12531->9269|12930->9638|12961->9639|13021->9669|13052->9670|16068->12656|16099->12657|16163->12691|16194->12692|18383->14852|18413->14853|18443->14854|18480->14862|18510->14863|18540->14864|18588->14882|18619->14883|18650->14884|18703->14907|18734->14908|18765->14909|18805->14919|18836->14920|18867->14921|18909->14933|18940->14934|18971->14935|19010->14944|19041->14945|19072->14946|19113->14957|19144->14958|19175->14959|19212->14966|19243->14967|19274->14968|19313->14977|19344->14978|19375->14979|19414->14988|19445->14989|19476->14990|19517->15001|19548->15002|19579->15003|20435->15830|20465->15831|20495->15832|20532->15840|20562->15841|20592->15842|20717->15938|20747->15939|20777->15940|20816->15949|20847->15950|20878->15951|21005->16049|21035->16050|21065->16051|21103->16059|21134->16060|21165->16061|24288->19155|24318->19156|24348->19157|24396->19176|24426->19177|24456->19178|25148->19833|25164->19839|25227->19878|25376->19998|25406->19999|26116->20680|26146->20681|26335->20832|26353->20839|26393->20855|30248->24681|30278->24682|30329->24703|30360->24704|31062->25376|31093->25377|31268->25523|31298->25524|31874->26071|31904->26072|31934->26073|31986->26096|32016->26097|32046->26098|33138->27161|33168->27162|33198->27163|33243->27179|33273->27180|33303->27181|33502->27351|33532->27352|33562->27353|33626->27388|33656->27389|33687->27390|34044->27717|34075->27718|34135->27748|34166->27749|36776->30329|36807->30330|36871->30364|36902->30365|38787->32221|38817->32222|38847->32223|38884->32231|38914->32232|38944->32233|38991->32251|39021->32252|39051->32253|39104->32276|39135->32277|39166->32278|39206->32288|39237->32289|39268->32290|39310->32302|39341->32303|39372->32304|39411->32313|39442->32314|39473->32315|39514->32326|39545->32327|39576->32328|39613->32335|39644->32336|39675->32337|39714->32346|39745->32347|39776->32348|39815->32357|39846->32358|39877->32359|39918->32370|39949->32371|39980->32372|40710->33073|40740->33074|40770->33075|40807->33083|40837->33084|40867->33085|40978->33167|41008->33168|41038->33169|41076->33178|41106->33179|41136->33180|41249->33264|41279->33265|41309->33266|41346->33274|41376->33275|41406->33276|44071->35912|44101->35913|44131->35914|44179->35933|44209->35934|44239->35935
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->20|47->20|49->20|51->23|51->23|53->23|57->27|57->27|57->27|58->28|58->28|58->28|60->1|61->3|61->19|62->22|63->29|64->30|64->30|64->30|82->48|82->48|82->48|83->49|83->49|83->49|136->102|136->102|136->102|136->102|145->111|145->111|147->113|147->113|159->125|159->125|159->125|159->125|159->125|159->125|175->141|175->141|175->141|175->141|175->141|175->141|177->143|177->143|177->143|177->143|177->143|177->143|180->146|180->146|180->146|180->146|210->176|210->176|210->176|210->176|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|235->201|245->211|245->211|245->211|245->211|245->211|245->211|246->212|246->212|246->212|246->212|246->212|246->212|247->213|247->213|247->213|247->213|247->213|247->213|290->256|290->256|290->256|290->256|290->256|290->256|301->267|301->267|301->267|304->270|304->270|314->280|314->280|317->283|317->283|317->283|399->365|399->365|399->365|399->365|408->374|408->374|410->376|410->376|422->388|422->388|422->388|422->388|422->388|422->388|438->404|438->404|438->404|438->404|438->404|438->404|440->406|440->406|440->406|440->406|440->406|440->406|443->409|443->409|443->409|443->409|473->439|473->439|473->439|473->439|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|498->464|508->474|508->474|508->474|508->474|508->474|508->474|509->475|509->475|509->475|509->475|509->475|509->475|510->476|510->476|510->476|510->476|510->476|510->476|553->519|553->519|553->519|553->519|553->519|553->519
                    -- GENERATED --
                */
            