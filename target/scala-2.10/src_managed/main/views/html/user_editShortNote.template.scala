
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
object user_editShortNote extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[models.User,models.content.ShortNote,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null, shortNote: models.content.ShortNote):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*2.6*/scripts/*2.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.17*/("""
        <script src='"""),_display_(Seq[Any](/*3.23*/routes/*3.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*3.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*4.23*/routes/*4.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*4.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*5.23*/routes/*5.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*5.66*/("""'></script>
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
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*20.46*/routes/*20.52*/.Assets.at("js/tinymce/tinymce.min.js"))),format.raw/*20.91*/(""""></script>

        <script type="text/javascript">
        tinymce.init ( """),format.raw/*23.24*/("""{"""),format.raw/*23.25*/("""
        menubar : false,
        selector : "#textmax",
        height : "300px",
        plugins :[
        "advlist autolink lists link image charmap print preview anchor",
        "searchreplace visualblocks code fullscreen",
        "insertdatetime media table contextmenu paste"
        ],
        toolbar : "insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link"
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/(""" ) ;
        </script>
    """)))};def /*36.6*/links/*36.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*36.15*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*40.39*/routes/*40.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*40.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*41.39*/routes/*41.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*41.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.70*/("""
    """),format.raw/*18.6*/("""
    """),format.raw/*35.6*/("""
    """),format.raw/*42.6*/("""
"""),_display_(Seq[Any](/*43.2*/template_user_dashboard_semantic_new(Messages("playauthenticate.navigation.home"), "home", scriptsTop, scripts, links)/*43.120*/ {_display_(Seq[Any](format.raw/*43.122*/("""

<div class="shortNoteWrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header" style="padding-left:30px">Edit Note</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row">
    <div class="container-fluid" ng-app="userProfile">

        <div class="" ng-controller="editShortNoteController" ng-init="init()">
            <div class="col-md-8">
                <div class="well whiteWell" style="padding-top:0;margin-top:0;border-color:transparent">

                    <form ng-submit="addNote()" action="" name="newNote" id="add-note-form" class="form-horizontal">

                        <div class="">
                            <fieldset>


                                <div class="form-group">
                                    <div class="">
                                        <input id="note-title" name="note-title" ng-model="noteTitle" type="text" placeholder="Note title" class="form-control" val=""""),_display_(Seq[Any](/*67.167*/shortNote/*67.176*/.title)),format.raw/*67.182*/("""" required>
                                        <input type="hidden" id="nslug" value=""""),_display_(Seq[Any](/*68.81*/shortNote/*68.90*/.slug)),format.raw/*68.95*/(""""/>
                                    </div>
                                </div>


                                <div class="form-group" >
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
                                                                    <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*111.114*/("""{"""),format.raw/*111.115*/(""" url: '/file/upload' """),format.raw/*111.136*/("""}"""),format.raw/*111.137*/("""" >
                                                                        <div class="at-center">
                                                                            <h4> Drop Image Here</h4>


                                                                            <button type="button" class="btn btn-success" id="new-file-button">
                                                                                Select Picture</button>
                                                                            <input id="file-button" ng-file-select type="file" name="picture" />
                                                                            <script>
                                                                            $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*120.131*/("""{"""),format.raw/*120.132*/("""
                                                                            $ ( '#file-button' ).click ( ) ;
                                                                            """),format.raw/*122.77*/("""}"""),format.raw/*122.78*/(""" ) ;
                                                                            </script>
                                                                        </div>
                                                                    </div>
                                                                </div>


                                                            </div>

                                                            <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                                <h3>Upload queue</h3>
                                                                <p>Queue length: """),format.raw/*134.82*/("""{"""),format.raw/*134.83*/("""{"""),format.raw/*134.84*/(""" uploader.queue.length """),format.raw/*134.107*/("""}"""),format.raw/*134.108*/("""}"""),format.raw/*134.109*/("""</p>

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
                                                                                """),format.raw/*150.81*/("""{"""),format.raw/*150.82*/("""{"""),format.raw/*150.83*/(""" item.file.name """),format.raw/*150.99*/("""}"""),format.raw/*150.100*/("""}"""),format.raw/*150.101*/("""</strong></td>
                                                                            <td ng-show="uploader.isHTML5" nowrap>
                                                                                """),format.raw/*152.81*/("""{"""),format.raw/*152.82*/("""{"""),format.raw/*152.83*/(""" item.file.size/1024/1024|number:2 """),format.raw/*152.118*/("""}"""),format.raw/*152.119*/("""}"""),format.raw/*152.120*/(""" MB</td>
                                                                            <td ng-show="uploader.isHTML5">
                                                                                <div class="progress" style="margin-bottom : 0 ;">
                                                                                    <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*155.140*/("""{"""),format.raw/*155.141*/(""" 'width': item.progress + '%' """),format.raw/*155.171*/("""}"""),format.raw/*155.172*/(""""></div>
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
                                                                    <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*185.124*/("""{"""),format.raw/*185.125*/(""" 'width': uploader.progress + '%' """),format.raw/*185.159*/("""}"""),format.raw/*185.160*/(""""></div>
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
                                                                        <img id="img"""),format.raw/*210.85*/("""{"""),format.raw/*210.86*/("""{"""),format.raw/*210.87*/("""image.id"""),format.raw/*210.95*/("""}"""),format.raw/*210.96*/("""}"""),format.raw/*210.97*/("""" ng-src="/assets/"""),format.raw/*210.115*/("""{"""),format.raw/*210.116*/("""{"""),format.raw/*210.117*/("""image.path.substring(7)"""),format.raw/*210.140*/("""}"""),format.raw/*210.141*/("""}"""),format.raw/*210.142*/("""" height=""""),format.raw/*210.152*/("""{"""),format.raw/*210.153*/("""{"""),format.raw/*210.154*/("""image.height"""),format.raw/*210.166*/("""}"""),format.raw/*210.167*/("""}"""),format.raw/*210.168*/("""" width=""""),format.raw/*210.177*/("""{"""),format.raw/*210.178*/("""{"""),format.raw/*210.179*/("""image.width"""),format.raw/*210.190*/("""}"""),format.raw/*210.191*/("""}"""),format.raw/*210.192*/("""" alt=""""),format.raw/*210.199*/("""{"""),format.raw/*210.200*/("""{"""),format.raw/*210.201*/("""image.alt"""),format.raw/*210.210*/("""}"""),format.raw/*210.211*/("""}"""),format.raw/*210.212*/("""" title=""""),format.raw/*210.221*/("""{"""),format.raw/*210.222*/("""{"""),format.raw/*210.223*/("""image.title"""),format.raw/*210.234*/("""}"""),format.raw/*210.235*/("""}"""),format.raw/*210.236*/("""" ng-click="selectImage($event)">
                                                                        <div class="selected-icon">
                                                                            <i class="fa fa-check fa-green fa-2x"></i>
                                                                        </div>
                                                                    </div>

                                                                </div>
                                                                <div class="image-details-container">
                                                                    <div class="container-fluid" ng-if="image">
                                                                        <legend>Image Details</legend>
                                                                        <img ng-src=""""),format.raw/*220.86*/("""{"""),format.raw/*220.87*/("""{"""),format.raw/*220.88*/("""imageSrc"""),format.raw/*220.96*/("""}"""),format.raw/*220.97*/("""}"""),format.raw/*220.98*/("""">
                                                                        <p class="small">FullName: """),format.raw/*221.100*/("""{"""),format.raw/*221.101*/("""{"""),format.raw/*221.102*/("""imageName"""),format.raw/*221.111*/("""}"""),format.raw/*221.112*/("""}"""),format.raw/*221.113*/("""</p>
                                                                        <p ng-show="imageAlt">Alt: """),format.raw/*222.100*/("""{"""),format.raw/*222.101*/("""{"""),format.raw/*222.102*/("""imageAlt"""),format.raw/*222.110*/("""}"""),format.raw/*222.111*/("""}"""),format.raw/*222.112*/("""</p>

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
                                                    <span>Selected Images: """),format.raw/*265.76*/("""{"""),format.raw/*265.77*/("""{"""),format.raw/*265.78*/("""selectedImagesCount"""),format.raw/*265.97*/("""}"""),format.raw/*265.98*/("""}"""),format.raw/*265.99*/(""" </span>
                                                </span>
                                                <button type="button" id="addSelectedImagesToPost" ng-click="addSelectedImagesToPost()" data-dismiss="modal" data-ng-disabled="!selectedImagesCount" ng-init="checkSelectedImages()" class="btn btn-primary">
                                                    Insert Into Post</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>


                                <div class="form-group">


                                    <textarea id="textmax" class="editor" name="content" style="width : 100 %">"""),_display_(Seq[Any](/*278.113*/shortNote/*278.122*/.html)),format.raw/*278.127*/("""</textarea>
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
                                        <button type="submit" ng-hide="newNote.$valid" class="btn btn-success disabled btn-lg">
                                            Update</button>
                                        <button type="submit" ng-show="newNote.$valid" class="btn btn-success btn-lg">
                                            Update</button>
                                        <button type="reset" class="btn btn-warning btn-lg">Cancel</button>
                                    </div>
                                </div>
                            </fieldset>
                        </div>


                    </form>
                </div>
            </div>
            <div class="col-md-4" ng-controller="featuredImageController">

                <div class="form-group">
                    <button type="button" class="btn btn-default" data-toggle="modal" ng-hide="featuredImageId" data-target="#featuredImageModal" ng-click="selectImagesInit()">
                        Set Featured Image</button>
                    <button type="button" class="btn btn-default" ng-show="featuredImageId" ng-click="removeFeaturedImage()">
                        Remove Featured Image</button>

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
                                                    <div class="well my-drop-zone" ng-file-drop=""""),format.raw/*361.98*/("""{"""),format.raw/*361.99*/(""" url: '/file/upload' """),format.raw/*361.120*/("""}"""),format.raw/*361.121*/("""" >
                                                        <div class="at-center">
                                                            <h4> Drop Image Here</h4>


                                                            <button type="button" class="btn btn-success" id="new-file-button">
                                                                Select Picture</button>
                                                            <input id="file-button" ng-file-select type="file" name="picture" />
                                                            <script>
                                                            $ ( '#new-file-button' ).bind ( "click", function ( ) """),format.raw/*370.115*/("""{"""),format.raw/*370.116*/("""
                                                            $ ( '#file-button' ).click ( ) ;
                                                            """),format.raw/*372.61*/("""}"""),format.raw/*372.62*/(""" ) ;
                                                            </script>
                                                        </div>
                                                    </div>
                                                </div>


                                            </div>

                                            <div class="full-height-upload-div" style="margin-bottom : 40 px" ng-show="uploadInProgress">

                                                <h3>Upload queue</h3>
                                                <p>Queue length: """),format.raw/*384.66*/("""{"""),format.raw/*384.67*/("""{"""),format.raw/*384.68*/(""" uploader.queue.length """),format.raw/*384.91*/("""}"""),format.raw/*384.92*/("""}"""),format.raw/*384.93*/("""</p>

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
                                                                """),format.raw/*400.65*/("""{"""),format.raw/*400.66*/("""{"""),format.raw/*400.67*/(""" item.file.name """),format.raw/*400.83*/("""}"""),format.raw/*400.84*/("""}"""),format.raw/*400.85*/("""</strong></td>
                                                            <td ng-show="uploader.isHTML5" nowrap>
                                                                """),format.raw/*402.65*/("""{"""),format.raw/*402.66*/("""{"""),format.raw/*402.67*/(""" item.file.size/1024/1024|number:2 """),format.raw/*402.102*/("""}"""),format.raw/*402.103*/("""}"""),format.raw/*402.104*/(""" MB</td>
                                                            <td ng-show="uploader.isHTML5">
                                                                <div class="progress" style="margin-bottom : 0 ;">
                                                                    <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*405.124*/("""{"""),format.raw/*405.125*/(""" 'width': item.progress + '%' """),format.raw/*405.155*/("""}"""),format.raw/*405.156*/(""""></div>
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
                                                    <div class="progress-bar" role="progressbar" ng-style=""""),format.raw/*435.108*/("""{"""),format.raw/*435.109*/(""" 'width': uploader.progress + '%' """),format.raw/*435.143*/("""}"""),format.raw/*435.144*/(""""></div>
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
                                                        <img id="img"""),format.raw/*460.69*/("""{"""),format.raw/*460.70*/("""{"""),format.raw/*460.71*/("""image.id"""),format.raw/*460.79*/("""}"""),format.raw/*460.80*/("""}"""),format.raw/*460.81*/("""" ng-src="/assets/"""),format.raw/*460.99*/("""{"""),format.raw/*460.100*/("""{"""),format.raw/*460.101*/("""image.path.substring(7)"""),format.raw/*460.124*/("""}"""),format.raw/*460.125*/("""}"""),format.raw/*460.126*/("""" height=""""),format.raw/*460.136*/("""{"""),format.raw/*460.137*/("""{"""),format.raw/*460.138*/("""image.height"""),format.raw/*460.150*/("""}"""),format.raw/*460.151*/("""}"""),format.raw/*460.152*/("""" width=""""),format.raw/*460.161*/("""{"""),format.raw/*460.162*/("""{"""),format.raw/*460.163*/("""image.width"""),format.raw/*460.174*/("""}"""),format.raw/*460.175*/("""}"""),format.raw/*460.176*/("""" alt=""""),format.raw/*460.183*/("""{"""),format.raw/*460.184*/("""{"""),format.raw/*460.185*/("""image.alt"""),format.raw/*460.194*/("""}"""),format.raw/*460.195*/("""}"""),format.raw/*460.196*/("""" title=""""),format.raw/*460.205*/("""{"""),format.raw/*460.206*/("""{"""),format.raw/*460.207*/("""image.title"""),format.raw/*460.218*/("""}"""),format.raw/*460.219*/("""}"""),format.raw/*460.220*/("""" ng-click="selectImage($event)">
                                                        <div class="selected-icon">
                                                            <i class="fa fa-check fa-green fa-2x"></i>
                                                        </div>
                                                    </div>

                                                </div>
                                                <div class="image-details-container">
                                                    <div class="container-fluid" ng-if="image">
                                                        <legend>Image Details</legend>
                                                        <img ng-src=""""),format.raw/*470.70*/("""{"""),format.raw/*470.71*/("""{"""),format.raw/*470.72*/("""imageSrc"""),format.raw/*470.80*/("""}"""),format.raw/*470.81*/("""}"""),format.raw/*470.82*/("""">
                                                        <p class="small">FullName: """),format.raw/*471.84*/("""{"""),format.raw/*471.85*/("""{"""),format.raw/*471.86*/("""imageName"""),format.raw/*471.95*/("""}"""),format.raw/*471.96*/("""}"""),format.raw/*471.97*/("""</p>
                                                        <p ng-show="imageAlt">Alt: """),format.raw/*472.84*/("""{"""),format.raw/*472.85*/("""{"""),format.raw/*472.86*/("""imageAlt"""),format.raw/*472.94*/("""}"""),format.raw/*472.95*/("""}"""),format.raw/*472.96*/("""</p>

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
                                    <span>Selected Images: """),format.raw/*515.60*/("""{"""),format.raw/*515.61*/("""{"""),format.raw/*515.62*/("""selectedImagesCount"""),format.raw/*515.81*/("""}"""),format.raw/*515.82*/("""}"""),format.raw/*515.83*/(""" </span>
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
    
    def render(localUser:models.User,shortNote:models.content.ShortNote): play.api.templates.HtmlFormat.Appendable = apply(localUser,shortNote)
    
    def f:((models.User,models.content.ShortNote) => play.api.templates.HtmlFormat.Appendable) = (localUser,shortNote) => apply(localUser,shortNote)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:28 IST 2014
                    SOURCE: W:/Pre School/app/views/user_editShortNote.scala.html
                    HASH: 38cf23386a83747b3f5405b9f068b88cee0a6e89
                    MATRIX: 817->1|962->76|977->83|1061->87|1120->111|1134->117|1189->151|1259->186|1273->192|1338->236|1408->271|1422->277|1480->314|1550->349|1564->355|1612->382|1682->417|1696->423|1754->460|1824->495|1838->501|1899->541|2102->708|2117->714|2187->762|2262->801|2277->807|2330->838|2401->873|2416->879|2481->922|2554->959|2569->965|2635->1009|2678->1036|2697->1046|2782->1050|2865->1097|2880->1103|2941->1142|3048->1221|3077->1222|3575->1693|3604->1694|3657->1731|3671->1736|3756->1740|4138->2086|4153->2092|4214->2131|4292->2173|4307->2179|4375->2225|4423->69|4456->1029|4489->1724|4522->2234|4560->2237|4688->2355|4729->2357|5784->3375|5803->3384|5832->3390|5961->3483|5979->3492|6006->3497|8987->6448|9018->6449|9069->6470|9100->6471|9951->7292|9982->7293|10199->7481|10229->7482|10978->8202|11008->8203|11038->8204|11091->8227|11122->8228|11153->8229|12561->9608|12591->9609|12621->9610|12666->9626|12697->9627|12728->9628|12969->9840|12999->9841|13029->9842|13094->9877|13125->9878|13156->9879|13576->10269|13607->10270|13667->10300|13698->10301|16918->13491|16949->13492|17013->13526|17044->13527|19390->15844|19420->15845|19450->15846|19487->15854|19517->15855|19547->15856|19595->15874|19626->15875|19657->15876|19710->15899|19741->15900|19772->15901|19812->15911|19843->15912|19874->15913|19916->15925|19947->15926|19978->15927|20017->15936|20048->15937|20079->15938|20120->15949|20151->15950|20182->15951|20219->15958|20250->15959|20281->15960|20320->15969|20351->15970|20382->15971|20421->15980|20452->15981|20483->15982|20524->15993|20555->15994|20586->15995|21506->16886|21536->16887|21566->16888|21603->16896|21633->16897|21663->16898|21796->17001|21827->17002|21858->17003|21897->17012|21928->17013|21959->17014|22094->17119|22125->17120|22156->17121|22194->17129|22225->17130|22256->17131|25620->20466|25650->20467|25680->20468|25728->20487|25758->20488|25788->20489|26589->21252|26609->21261|26638->21266|31378->25977|31408->25978|31459->25999|31490->26000|32229->26709|32260->26710|32445->26866|32475->26867|33096->27459|33126->27460|33156->27461|33208->27484|33238->27485|33268->27486|34436->28625|34466->28626|34496->28627|34541->28643|34571->28644|34601->28645|34810->28825|34840->28826|34870->28827|34935->28862|34966->28863|34997->28864|35369->29206|35400->29207|35460->29237|35491->29238|38247->31964|38278->31965|38342->31999|38373->32000|40371->33969|40401->33970|40431->33971|40468->33979|40498->33980|40528->33981|40575->33999|40606->34000|40637->34001|40690->34024|40721->34025|40752->34026|40792->34036|40823->34037|40854->34038|40896->34050|40927->34051|40958->34052|40997->34061|41028->34062|41059->34063|41100->34074|41131->34075|41162->34076|41199->34083|41230->34084|41261->34085|41300->34094|41331->34095|41362->34096|41401->34105|41432->34106|41463->34107|41504->34118|41535->34119|41566->34120|42342->34867|42372->34868|42402->34869|42439->34877|42469->34878|42499->34879|42615->34966|42645->34967|42675->34968|42713->34977|42743->34978|42773->34979|42891->35068|42921->35069|42951->35070|42988->35078|43018->35079|43048->35080|45888->37891|45918->37892|45948->37893|45996->37912|46026->37913|46056->37914
                    LINES: 26->1|28->2|28->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|46->19|46->19|48->19|49->20|49->20|49->20|52->23|52->23|62->33|62->33|64->36|64->36|66->36|70->40|70->40|70->40|71->41|71->41|71->41|73->1|74->18|75->35|76->42|77->43|77->43|77->43|101->67|101->67|101->67|102->68|102->68|102->68|145->111|145->111|145->111|145->111|154->120|154->120|156->122|156->122|168->134|168->134|168->134|168->134|168->134|168->134|184->150|184->150|184->150|184->150|184->150|184->150|186->152|186->152|186->152|186->152|186->152|186->152|189->155|189->155|189->155|189->155|219->185|219->185|219->185|219->185|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|244->210|254->220|254->220|254->220|254->220|254->220|254->220|255->221|255->221|255->221|255->221|255->221|255->221|256->222|256->222|256->222|256->222|256->222|256->222|299->265|299->265|299->265|299->265|299->265|299->265|312->278|312->278|312->278|395->361|395->361|395->361|395->361|404->370|404->370|406->372|406->372|418->384|418->384|418->384|418->384|418->384|418->384|434->400|434->400|434->400|434->400|434->400|434->400|436->402|436->402|436->402|436->402|436->402|436->402|439->405|439->405|439->405|439->405|469->435|469->435|469->435|469->435|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|494->460|504->470|504->470|504->470|504->470|504->470|504->470|505->471|505->471|505->471|505->471|505->471|505->471|506->472|506->472|506->472|506->472|506->472|506->472|549->515|549->515|549->515|549->515|549->515|549->515
                    -- GENERATED --
                */
            