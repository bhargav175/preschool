
package views.html

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
object user_add_note extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.helper.form

def /*3.6*/scripts/*3.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.17*/("""
        <script src='"""),_display_(Seq[Any](/*4.23*/routes/*4.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*4.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*5.23*/routes/*5.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*5.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*6.23*/routes/*6.29*/.Assets.at("js/angular.js"))),format.raw/*6.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*7.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*8.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*10.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("js/restangular.js"))),format.raw/*13.60*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*14.72*/("""'></script>

        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*16.73*/("""'></script>

    """)))};def /*19.6*/scriptsTop/*19.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.20*/("""

    """)))};def /*22.6*/links/*22.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.15*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*26.39*/routes/*26.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*26.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*18.6*/("""
    """),format.raw/*21.6*/("""
    """),format.raw/*27.6*/("""
"""),_display_(Seq[Any](/*28.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home", scriptsTop, scripts, links)/*28.120*/ {_display_(Seq[Any](format.raw/*28.122*/("""

<div class="shortNoteWrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header" style="padding-left:30px">Add a note</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row">
        <div class="container-fluid" ng-app="userProfile">

            <div class="" ng-controller="saveShortNoteController" ng-init="init()">
                <div class="col-md-8">
                    <div class="well whiteWell" style="padding-top:0;margin-top:0;border-color:transparent">

                        <form ng-submit="addNote()" action="" name="newNote" id="add-note-form" class="form-horizontal">

                            <div class="" >
                                <fieldset>


                                    <div class="form-group">

                                        <div>
                                            <input id="note-title" name="note-title" ng-model="noteTitle" type="text" placeholder="Note title" class="form-control" required>
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
                                                            <li class="active"><a href="#upload" data-toggle="tab">
                                                                Upload</a></li>
                                                            <li><a href="#viewImages" data-toggle="tab" ng-click="selectImagesInit()">
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
                                                                        <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*96.118*/("""{"""),format.raw/*96.119*/(""" url: '/file/upload' """),format.raw/*96.140*/("""}"""),format.raw/*96.141*/("""" >
                                                                            <div class="at-center">
                                                                                <h4> Drop Image Here</h4>


                                                                                <button type="button" class="btn btn-success" id="new-file-button">
                                                                                    Select Picture</button>
                                                                                <input id="file-button" ng-file-select type="file" name="picture" />
                                                                                <script>
                                                                                $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*105.135*/("""{"""),format.raw/*105.136*/("""
                                                                                $ ( '#file-button' ).click ( ) ;
                                                                                """),format.raw/*107.81*/("""}"""),format.raw/*107.82*/(""" ) ;
                                                                                </script>
                                                                            </div>
                                                                        </div>
                                                                    </div>


                                                                </div>

                                                                <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                                    <h3>Upload queue</h3>
                                                                    <p>Queue length: """),format.raw/*119.86*/("""{"""),format.raw/*119.87*/("""{"""),format.raw/*119.88*/(""" uploader.queue.length """),format.raw/*119.111*/("""}"""),format.raw/*119.112*/("""}"""),format.raw/*119.113*/("""</p>

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
                                                                                    """),format.raw/*135.85*/("""{"""),format.raw/*135.86*/("""{"""),format.raw/*135.87*/(""" item.file.name """),format.raw/*135.103*/("""}"""),format.raw/*135.104*/("""}"""),format.raw/*135.105*/("""</strong></td>
                                                                                <td ng-show="uploader.isHTML5" nowrap>
                                                                                    """),format.raw/*137.85*/("""{"""),format.raw/*137.86*/("""{"""),format.raw/*137.87*/(""" item.file.size/1024/1024|number:2 """),format.raw/*137.122*/("""}"""),format.raw/*137.123*/("""}"""),format.raw/*137.124*/(""" MB</td>
                                                                                <td ng-show="uploader.isHTML5">
                                                                                    <div class="progress" style="margin-bottom : 0 ;">
                                                                                        <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*140.144*/("""{"""),format.raw/*140.145*/(""" 'width': item.progress + '%' """),format.raw/*140.175*/("""}"""),format.raw/*140.176*/(""""></div>
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
                                                                        <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*170.128*/("""{"""),format.raw/*170.129*/(""" 'width': uploader.progress + '%' """),format.raw/*170.163*/("""}"""),format.raw/*170.164*/(""""></div>
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
                                                                            <img id="img"""),format.raw/*195.89*/("""{"""),format.raw/*195.90*/("""{"""),format.raw/*195.91*/("""image.id"""),format.raw/*195.99*/("""}"""),format.raw/*195.100*/("""}"""),format.raw/*195.101*/("""" ng-src="/assets/"""),format.raw/*195.119*/("""{"""),format.raw/*195.120*/("""{"""),format.raw/*195.121*/("""image.path.substring(7)"""),format.raw/*195.144*/("""}"""),format.raw/*195.145*/("""}"""),format.raw/*195.146*/("""" height=""""),format.raw/*195.156*/("""{"""),format.raw/*195.157*/("""{"""),format.raw/*195.158*/("""image.height"""),format.raw/*195.170*/("""}"""),format.raw/*195.171*/("""}"""),format.raw/*195.172*/("""" width=""""),format.raw/*195.181*/("""{"""),format.raw/*195.182*/("""{"""),format.raw/*195.183*/("""image.width"""),format.raw/*195.194*/("""}"""),format.raw/*195.195*/("""}"""),format.raw/*195.196*/("""" alt=""""),format.raw/*195.203*/("""{"""),format.raw/*195.204*/("""{"""),format.raw/*195.205*/("""image.alt"""),format.raw/*195.214*/("""}"""),format.raw/*195.215*/("""}"""),format.raw/*195.216*/("""" title=""""),format.raw/*195.225*/("""{"""),format.raw/*195.226*/("""{"""),format.raw/*195.227*/("""image.title"""),format.raw/*195.238*/("""}"""),format.raw/*195.239*/("""}"""),format.raw/*195.240*/("""" ng-click="selectImage($event)">
                                                                            <div class="selected-icon">
                                                                                <i class="fa fa-check fa-green fa-2x"></i>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                    <div class="image-details-container">
                                                                        <div class="container-fluid" ng-if="image">
                                                                            <legend>Image Details</legend>
                                                                            <img ng-src=""""),format.raw/*205.90*/("""{"""),format.raw/*205.91*/("""{"""),format.raw/*205.92*/("""imageSrc"""),format.raw/*205.100*/("""}"""),format.raw/*205.101*/("""}"""),format.raw/*205.102*/("""">
                                                                            <p class="small">FullName: """),format.raw/*206.104*/("""{"""),format.raw/*206.105*/("""{"""),format.raw/*206.106*/("""imageName"""),format.raw/*206.115*/("""}"""),format.raw/*206.116*/("""}"""),format.raw/*206.117*/("""</p>
                                                                            <p ng-show="imageAlt">Alt: """),format.raw/*207.104*/("""{"""),format.raw/*207.105*/("""{"""),format.raw/*207.106*/("""imageAlt"""),format.raw/*207.114*/("""}"""),format.raw/*207.115*/("""}"""),format.raw/*207.116*/("""</p>

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
                                                        <span>Selected Images: """),format.raw/*250.80*/("""{"""),format.raw/*250.81*/("""{"""),format.raw/*250.82*/("""selectedImagesCount"""),format.raw/*250.101*/("""}"""),format.raw/*250.102*/("""}"""),format.raw/*250.103*/(""" </span>
                                                    </span>
                                                    <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                                        Insert Into Post</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                    <div class="form-group">
                                        <script type="text/javascript" src=""""),_display_(Seq[Any](/*261.78*/routes/*261.84*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*261.123*/(""""></script>

                                        <script type="text/javascript">
                                        tinymce.init ( """),format.raw/*264.56*/("""{"""),format.raw/*264.57*/("""
                                        menubar : false,
                                        selector : "#textmax",
                                        height : "300px",
                                        plugins :[
                                        "advlist autolink lists link image charmap print preview anchor",
                                        "searchreplace visualblocks code fullscreen",
                                        "insertdatetime media table contextmenu paste"
                                        ],
                                        toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
                                        """),format.raw/*274.41*/("""}"""),format.raw/*274.42*/(""" ) ;
                                        </script>

                                        <textarea id="textmax" class="editor" name="content" style="width : 100 %"></textarea>
                                    </div>


                                    <div class="form-group">
                                        <label class="col-md-3 control-label" for="note-tag">Add tag</label>
                                        <div class="col-md-9">
                                            <input class="form-control" type="text" id="note-tag-input" ng-model="noteTag" name="note-tag" typeahead-on-select="addTagToNote($item)" typeahead="tag.name for tag in tagsList | filter:$viewValue" >
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
                                            <button type="submit" ng-hide="newNote.$valid" class="btn btn-success disabled btn-lg" >
                                                Submit</button>
                                            <button type="submit" ng-show="newNote.$valid" class="btn btn-success btn-lg" id="submitButton">
                                                Submit</button>
                                            <button type="reset" class="btn btn-warning btn-lg">Cancel</button>
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
                                            <li class="active"><a href="#featupload" data-toggle="tab">
                                                Upload</a></li>
                                            <li><a href="#featviewImages" data-toggle="tab">
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
                                                        <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*360.102*/("""{"""),format.raw/*360.103*/(""" url: '/file/upload' """),format.raw/*360.124*/("""}"""),format.raw/*360.125*/("""" >
                                                            <div class="at-center">
                                                                <h4> Drop Image Here</h4>


                                                                <button type="button" class="btn btn-success" id="new-file-button">
                                                                    Select Picture</button>
                                                                <input id="file-button" ng-file-select type="file" name="picture" />
                                                                <script>
                                                                $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*369.119*/("""{"""),format.raw/*369.120*/("""
                                                                $ ( '#file-button' ).click ( ) ;
                                                                """),format.raw/*371.65*/("""}"""),format.raw/*371.66*/(""" ) ;
                                                                </script>
                                                            </div>
                                                        </div>
                                                    </div>


                                                </div>

                                                <div class="full-height-upload-div" style="margin-bottom : 40px" ng-show="uploadInProgress">

                                                    <h3>Upload queue</h3>
                                                    <p>Queue length: """),format.raw/*383.70*/("""{"""),format.raw/*383.71*/("""{"""),format.raw/*383.72*/(""" uploader.queue.length """),format.raw/*383.95*/("""}"""),format.raw/*383.96*/("""}"""),format.raw/*383.97*/("""</p>

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
                                                                    """),format.raw/*399.69*/("""{"""),format.raw/*399.70*/("""{"""),format.raw/*399.71*/(""" item.file.name """),format.raw/*399.87*/("""}"""),format.raw/*399.88*/("""}"""),format.raw/*399.89*/("""</strong></td>
                                                                <td ng-show="uploader.isHTML5" nowrap>
                                                                    """),format.raw/*401.69*/("""{"""),format.raw/*401.70*/("""{"""),format.raw/*401.71*/(""" item.file.size/1024/1024|number:2 """),format.raw/*401.106*/("""}"""),format.raw/*401.107*/("""}"""),format.raw/*401.108*/(""" MB</td>
                                                                <td ng-show="uploader.isHTML5">
                                                                    <div class="progress" style="margin-bottom : 0 ;">
                                                                        <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*404.128*/("""{"""),format.raw/*404.129*/(""" 'width': item.progress + '%' """),format.raw/*404.159*/("""}"""),format.raw/*404.160*/(""""></div>
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
                                                        <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*434.112*/("""{"""),format.raw/*434.113*/(""" 'width': uploader.progress + '%' """),format.raw/*434.147*/("""}"""),format.raw/*434.148*/(""""></div>
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
                                                            <img id="img"""),format.raw/*459.73*/("""{"""),format.raw/*459.74*/("""{"""),format.raw/*459.75*/("""image.id"""),format.raw/*459.83*/("""}"""),format.raw/*459.84*/("""}"""),format.raw/*459.85*/("""" ng-src="/assets/"""),format.raw/*459.103*/("""{"""),format.raw/*459.104*/("""{"""),format.raw/*459.105*/("""image.path.substring(7)"""),format.raw/*459.128*/("""}"""),format.raw/*459.129*/("""}"""),format.raw/*459.130*/("""" height=""""),format.raw/*459.140*/("""{"""),format.raw/*459.141*/("""{"""),format.raw/*459.142*/("""image.height"""),format.raw/*459.154*/("""}"""),format.raw/*459.155*/("""}"""),format.raw/*459.156*/("""" width=""""),format.raw/*459.165*/("""{"""),format.raw/*459.166*/("""{"""),format.raw/*459.167*/("""image.width"""),format.raw/*459.178*/("""}"""),format.raw/*459.179*/("""}"""),format.raw/*459.180*/("""" alt=""""),format.raw/*459.187*/("""{"""),format.raw/*459.188*/("""{"""),format.raw/*459.189*/("""image.alt"""),format.raw/*459.198*/("""}"""),format.raw/*459.199*/("""}"""),format.raw/*459.200*/("""" title=""""),format.raw/*459.209*/("""{"""),format.raw/*459.210*/("""{"""),format.raw/*459.211*/("""image.title"""),format.raw/*459.222*/("""}"""),format.raw/*459.223*/("""}"""),format.raw/*459.224*/("""" ng-click="selectImage($event)">
                                                            <div class="selected-icon">
                                                                <i class="fa fa-check fa-green fa-2x"></i>
                                                            </div>
                                                        </div>

                                                    </div>
                                                    <div class="image-details-container">
                                                        <div class="container-fluid" ng-if="image">
                                                            <legend>Image Details</legend>
                                                            <img ng-src=""""),format.raw/*469.74*/("""{"""),format.raw/*469.75*/("""{"""),format.raw/*469.76*/("""imageSrc"""),format.raw/*469.84*/("""}"""),format.raw/*469.85*/("""}"""),format.raw/*469.86*/("""">
                                                            <p class="small">FullName: """),format.raw/*470.88*/("""{"""),format.raw/*470.89*/("""{"""),format.raw/*470.90*/("""imageName"""),format.raw/*470.99*/("""}"""),format.raw/*470.100*/("""}"""),format.raw/*470.101*/("""</p>
                                                            <p ng-show="imageAlt">Alt: """),format.raw/*471.88*/("""{"""),format.raw/*471.89*/("""{"""),format.raw/*471.90*/("""imageAlt"""),format.raw/*471.98*/("""}"""),format.raw/*471.99*/("""}"""),format.raw/*471.100*/("""</p>

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
                                        <span>Selected Images: """),format.raw/*514.64*/("""{"""),format.raw/*514.65*/("""{"""),format.raw/*514.66*/("""selectedImagesCount"""),format.raw/*514.85*/("""}"""),format.raw/*514.86*/("""}"""),format.raw/*514.87*/(""" </span>
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

    </div>

</div>
""")))})))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:26 IST 2014
                    SOURCE: W:/Pre School/app/views/user_add_note.scala.html
                    HASH: 9bb0406f2e303c9f57c6e3ea133451632974ed3e
                    MATRIX: 787->1|926->71|941->78|1025->82|1084->106|1098->112|1153->146|1223->181|1237->187|1302->231|1372->266|1386->272|1434->299|1504->334|1518->340|1576->377|1646->412|1660->418|1721->458|1924->625|1939->631|2009->679|2084->718|2099->724|2152->755|2223->790|2238->796|2303->839|2376->876|2391->882|2457->926|2500->953|2519->963|2604->967|2636->983|2650->988|2735->992|3117->1338|3132->1344|3200->1390|3248->32|3276->66|3307->946|3340->976|3373->1399|3411->1402|3539->1520|3580->1522|7746->5659|7776->5660|7826->5681|7856->5682|8735->6531|8766->6532|8991->6728|9021->6729|9802->7481|9832->7482|9862->7483|9915->7506|9946->7507|9977->7508|11445->8947|11475->8948|11505->8949|11551->8965|11582->8966|11613->8967|11862->9187|11892->9188|11922->9189|11987->9224|12018->9225|12049->9226|12481->9628|12512->9629|12572->9659|12603->9660|15939->12966|15970->12967|16034->13001|16065->13002|18499->15407|18529->15408|18559->15409|18596->15417|18627->15418|18658->15419|18706->15437|18737->15438|18768->15439|18821->15462|18852->15463|18883->15464|18923->15474|18954->15475|18985->15476|19027->15488|19058->15489|19089->15490|19128->15499|19159->15500|19190->15501|19231->15512|19262->15513|19293->15514|19330->15521|19361->15522|19392->15523|19431->15532|19462->15533|19493->15534|19532->15543|19563->15544|19594->15545|19635->15556|19666->15557|19697->15558|20653->16485|20683->16486|20713->16487|20751->16495|20782->16496|20813->16497|20950->16604|20981->16605|21012->16606|21051->16615|21082->16616|21113->16617|21252->16726|21283->16727|21314->16728|21352->16736|21383->16737|21414->16738|24914->20209|24944->20210|24974->20211|25023->20230|25054->20231|25085->20232|25878->20988|25894->20994|25957->21033|26129->21176|26159->21177|26979->21968|27009->21969|32105->27035|32136->27036|32187->27057|32218->27058|32985->27795|33016->27796|33209->27960|33239->27961|33891->28584|33921->28585|33951->28586|34003->28609|34033->28610|34063->28611|35291->29810|35321->29811|35351->29812|35396->29828|35426->29829|35456->29830|35673->30018|35703->30019|35733->30020|35798->30055|35829->30056|35860->30057|36244->30411|36275->30412|36335->30442|36366->30443|39238->33285|39269->33286|39333->33320|39364->33321|41450->35378|41480->35379|41510->35380|41547->35388|41577->35389|41607->35390|41655->35408|41686->35409|41717->35410|41770->35433|41801->35434|41832->35435|41872->35445|41903->35446|41934->35447|41976->35459|42007->35460|42038->35461|42077->35470|42108->35471|42139->35472|42180->35483|42211->35484|42242->35485|42279->35492|42310->35493|42341->35494|42380->35503|42411->35504|42442->35505|42481->35514|42512->35515|42543->35516|42584->35527|42615->35528|42646->35529|43458->36312|43488->36313|43518->36314|43555->36322|43585->36323|43615->36324|43735->36415|43765->36416|43795->36417|43833->36426|43864->36427|43895->36428|44017->36521|44047->36522|44077->36523|44114->36531|44144->36532|44175->36533|47147->39476|47177->39477|47207->39478|47255->39497|47285->39498|47315->39499
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|46->19|46->19|48->19|50->22|50->22|52->22|56->26|56->26|56->26|58->1|59->3|59->18|60->21|61->27|62->28|62->28|62->28|130->96|130->96|130->96|130->96|139->105|139->105|141->107|141->107|153->119|153->119|153->119|153->119|153->119|153->119|169->135|169->135|169->135|169->135|169->135|169->135|171->137|171->137|171->137|171->137|171->137|171->137|174->140|174->140|174->140|174->140|204->170|204->170|204->170|204->170|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|229->195|239->205|239->205|239->205|239->205|239->205|239->205|240->206|240->206|240->206|240->206|240->206|240->206|241->207|241->207|241->207|241->207|241->207|241->207|284->250|284->250|284->250|284->250|284->250|284->250|295->261|295->261|295->261|298->264|298->264|308->274|308->274|394->360|394->360|394->360|394->360|403->369|403->369|405->371|405->371|417->383|417->383|417->383|417->383|417->383|417->383|433->399|433->399|433->399|433->399|433->399|433->399|435->401|435->401|435->401|435->401|435->401|435->401|438->404|438->404|438->404|438->404|468->434|468->434|468->434|468->434|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|493->459|503->469|503->469|503->469|503->469|503->469|503->469|504->470|504->470|504->470|504->470|504->470|504->470|505->471|505->471|505->471|505->471|505->471|505->471|548->514|548->514|548->514|548->514|548->514|548->514
                    -- GENERATED --
                */
            