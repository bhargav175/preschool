
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
object admin_data extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template8[models.User,List[models.content.Subject],List[models.content.Chapter],List[models.content.Concept],List[models.content.Tag],List[models.content.ShortNote],List[models.content.Report],List[models.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null,subjects:List[models.content.Subject],chapters:List[models.content.Chapter],concepts:List[models.content.Concept],tags:List[models.content.Tag],shortnotes:List[models.content.ShortNote],reports:List[models.content.Report],users:List[models.User]):play.api.templates.HtmlFormat.Appendable = {
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
        <script src='"""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("js/angularapps/admin-data.js"))),format.raw/*18.71*/("""'></script>
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
Seq[Any](format.raw/*1.279*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*19.6*/("""
    """),format.raw/*22.6*/("""
    """),format.raw/*29.6*/("""
"""),_display_(Seq[Any](/*30.2*/template_admin_dashboard(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.105*/ {_display_(Seq[Any](format.raw/*30.107*/("""


<div class="adminData" ng-app="adminData">
    <div class="container-fluid" ng-controller="dataController" ng-init="init()">



        <ul class="nav nav-tabs" role="tablist">
            <li class="active"><a href="#topics" role="tab" data-toggle="tab">Topics</a></li>
            <li><a href="#chapters" role="tab" data-toggle="tab">Chapters</a></li>
            <li><a href="#concepts" role="tab" data-toggle="tab">Concepts</a></li>
            <li><a href="#tags" role="tab" data-toggle="tab">Tags</a></li>
            <li><a href="#shortnotes" role="tab" data-toggle="tab">ShortNotes</a></li>
            <li><a href="#reports" role="tab" data-toggle="tab">Reports</a></li>
            <li><a href="#users" role="tab" data-toggle="tab">Users</a></li>

        </ul>




        <div class="col-md-12">


                <!-- Tab panes -->
            <div class="tab-content">
                <div class="tab-pane active" id="topics">
                    <legend>Subjects</legend>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Subject Name</th>
                                <th>Subject Slug</th>
                                <th>Subject Description</th>
                                <th>Edit</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*70.26*/for((subject,index) <-subjects.zipWithIndex) yield /*70.70*/{_display_(Seq[Any](format.raw/*70.71*/("""
                            <tr >
                                <td>"""),_display_(Seq[Any](/*72.38*/index)),format.raw/*72.43*/("""</td>
                                <td>"""),_display_(Seq[Any](/*73.38*/subject/*73.45*/.name)),format.raw/*73.50*/("""</td>
                                <td>"""),_display_(Seq[Any](/*74.38*/subject/*74.45*/.slug)),format.raw/*74.50*/("""</td>
                                <td>"""),_display_(Seq[Any](/*75.38*/Html(subject.descriptionHtml))),format.raw/*75.67*/("""</td>
                                <td><a href="/subject/edit?slug="""),_display_(Seq[Any](/*76.66*/subject/*76.73*/.slug)),format.raw/*76.78*/(""""><i class="fa fa-edit" style="color:#1abc9c"></i></a></td>

                            </tr>
                        """)))})),format.raw/*79.26*/("""

                        </tbody>


                    </table>


                </div>
                <div class="tab-pane" id="chapters">  <legend>Chapters</legend>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Chapter Name</th>
                                <th>Chapter Slug</th>
                                <th>Chapter Description</th>
                                <th>Parent Subject</th>
                                <th>Previous Chapter</th>
                                <th>Next Chapter</th>
                                <th>Move Up</th>
                                <th>Move Down</th>
                                <th>Edit</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*105.26*/for((chapter,index) <-chapters.zipWithIndex) yield /*105.70*/{_display_(Seq[Any](format.raw/*105.71*/("""

                            <tr id="ch"""),_display_(Seq[Any](/*107.40*/chapter/*107.47*/.id)),format.raw/*107.50*/("""">
                                <td>"""),_display_(Seq[Any](/*108.38*/index)),format.raw/*108.43*/("""</td>
                                <td>"""),_display_(Seq[Any](/*109.38*/chapter/*109.45*/.name)),format.raw/*109.50*/("""</td>
                                <td>"""),_display_(Seq[Any](/*110.38*/chapter/*110.45*/.slug)),format.raw/*110.50*/("""</td>
                                <td>"""),_display_(Seq[Any](/*111.38*/Html(chapter.descriptionHtml))),format.raw/*111.67*/("""</td>
                                <td>"""),_display_(Seq[Any](/*112.38*/chapter/*112.45*/.subject.slug)),format.raw/*112.58*/("""</td>

                                <td>"""),_display_(Seq[Any](/*114.38*/if(chapter.previousChapter!=null)/*114.71*/{_display_(Seq[Any](format.raw/*114.72*/("""
                                    """),_display_(Seq[Any](/*115.38*/chapter/*115.45*/.previousChapter.name)),format.raw/*115.66*/("""
                                """)))}/*116.34*/else/*116.38*/{_display_(Seq[Any](format.raw/*116.39*/("""
                                    -
                                """)))})),format.raw/*118.34*/("""</td>
                                <td>"""),_display_(Seq[Any](/*119.38*/if(chapter.nextChapter!=null)/*119.67*/{_display_(Seq[Any](format.raw/*119.68*/("""
                                    """),_display_(Seq[Any](/*120.38*/chapter/*120.45*/.nextChapter.name)),format.raw/*120.62*/("""
                                """)))}/*121.34*/else/*121.38*/{_display_(Seq[Any](format.raw/*121.39*/("""
                                    -
                                """)))})),format.raw/*123.34*/("""</td>
                                <td><button class="btn-info" ng-click="chapterMoveUp($event)"><i class="fa fa-toggle-up fa-2x"></i></button></td>
                                <td><button class="btn-info" ng-click="chapterMoveDown($event)"><i class="fa fa-toggle-down fa-2x"></i></button></td>
                                <td><a href="/chapter/edit?slug="""),_display_(Seq[Any](/*126.66*/chapter/*126.73*/.slug)),format.raw/*126.78*/(""""><i class="fa fa-edit" style="color:#1abc9c"></i></a></td>

                            </tr>
                        """)))})),format.raw/*129.26*/("""
                        </tbody>


                    </table>
                </div>
                <div class="tab-pane" id="concepts">    <legend>Concepts</legend>
                    <table class="table table-bordered">
                        <thead>

                            <tr>
                                <th>#</th>
                                <th>Concept Name</th>
                                <th>Concept Slug</th>
                                <th>Concept Description</th>
                                <th>Parent Chapter</th>
                                <th>Previous Concept</th>
                                <th>Next Concept</th>
                                <th>Move Up</th>
                                <th>Move Down</th>
                                <th>Edit</th>
                            </tr>

                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*154.26*/for((concept,index) <-concepts.zipWithIndex) yield /*154.70*/{_display_(Seq[Any](format.raw/*154.71*/("""

                            <tr id="cc"""),_display_(Seq[Any](/*156.40*/concept/*156.47*/.id)),format.raw/*156.50*/("""">
                                <td>"""),_display_(Seq[Any](/*157.38*/index)),format.raw/*157.43*/("""</td>
                                <td>"""),_display_(Seq[Any](/*158.38*/concept/*158.45*/.name)),format.raw/*158.50*/("""</td>
                                <td>"""),_display_(Seq[Any](/*159.38*/concept/*159.45*/.slug)),format.raw/*159.50*/("""</td>
                                <td>"""),_display_(Seq[Any](/*160.38*/Html(concept.descriptionHtml))),format.raw/*160.67*/("""</td>
                                <td>"""),_display_(Seq[Any](/*161.38*/concept/*161.45*/.chapter.slug)),format.raw/*161.58*/("""</td>
                                <td>"""),_display_(Seq[Any](/*162.38*/if(concept.previousConcept!=null)/*162.71*/{_display_(Seq[Any](format.raw/*162.72*/("""
                                    """),_display_(Seq[Any](/*163.38*/concept/*163.45*/.previousConcept.name)),format.raw/*163.66*/("""
                                """)))}/*164.34*/else/*164.38*/{_display_(Seq[Any](format.raw/*164.39*/("""
                                    -
                                """)))})),format.raw/*166.34*/("""</td>
                                <td>"""),_display_(Seq[Any](/*167.38*/if(concept.nextConcept!=null)/*167.67*/{_display_(Seq[Any](format.raw/*167.68*/("""
                                    """),_display_(Seq[Any](/*168.38*/concept/*168.45*/.nextConcept.name)),format.raw/*168.62*/("""
                                """)))}/*169.34*/else/*169.38*/{_display_(Seq[Any](format.raw/*169.39*/("""
                                    -
                                """)))})),format.raw/*171.34*/("""</td>
                                <td><button class="btn-info" ng-click="conceptMoveUp($event)"><i class="fa fa-toggle-up fa-2x"></i></button></td>
                                <td><button class="btn-info" ng-click="conceptMoveDown($event)"><i class="fa fa-toggle-down fa-2x"></i></button></td>
                                <td><a href="/concept/edit?slug="""),_display_(Seq[Any](/*174.66*/concept/*174.73*/.slug)),format.raw/*174.78*/(""""><i class="fa fa-edit" style="color:#1abc9c"></i></a></td>

                            </tr>
                        """)))})),format.raw/*177.26*/("""
                        </tbody>


                    </table></div>
                <div class="tab-pane" id="tags">
                    <legend>Tag</legend>
                    <table class="table table-bordered">
                        <thead>

                            <tr>
                                <th>#</th>
                                <th>Tag Name</th>
                                <th>Tag Slug</th>
                                <th>Tag Description</th>
                                <th>Tag Chapters</th>
                                <th>Edit</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*197.26*/for((tag,index) <-tags.zipWithIndex) yield /*197.62*/{_display_(Seq[Any](format.raw/*197.63*/("""

                            <tr >
                                <td>"""),_display_(Seq[Any](/*200.38*/index)),format.raw/*200.43*/("""</td>
                                <td>"""),_display_(Seq[Any](/*201.38*/tag/*201.41*/.name)),format.raw/*201.46*/("""</td>
                                <td>"""),_display_(Seq[Any](/*202.38*/tag/*202.41*/.slug)),format.raw/*202.46*/("""</td>
                                <td>"""),_display_(Seq[Any](/*203.38*/Html(tag.descriptionHtml))),format.raw/*203.63*/("""</td>
                                <td> """),_display_(Seq[Any](/*204.39*/for((chapter,index) <-tag.chapters.zipWithIndex) yield /*204.87*/{_display_(Seq[Any](format.raw/*204.88*/("""
                                    <span  >
                                        """),_display_(Seq[Any](/*206.42*/if(index>0)/*206.53*/{_display_(Seq[Any](format.raw/*206.54*/("""
                                            <span >,</span>
                                        """)))})),_display_(Seq[Any](/*208.43*/chapter/*208.50*/.slug)),format.raw/*208.55*/("""</span>
                                """)))})),format.raw/*209.34*/("""
                                </td>
                                <td><a href="/tag/edit?slug="""),_display_(Seq[Any](/*211.62*/tag/*211.65*/.slug)),format.raw/*211.70*/(""""><i class="fa fa-edit" style="color:#1abc9c"></i></a></td>

                            </tr>
                        """)))})),format.raw/*214.26*/("""
                        </tbody>


                    </table></div>
                <div class="tab-pane" id="shortnotes">
                    <legend>ShortNote</legend>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>ShortNote Name</th>
                                <th>ShortNote Slug</th>
                                <th>ShortNote Description</th>
                                <th>Edit</th>
                                <th>Flag:Duplicate</th>
                                <th>Flag:Inappropriate</th>
                                <th>Flag:Opinionistic</th>
                                <th>Flag:Spam</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*236.26*/for((shortnote,index) <-shortnotes.zipWithIndex) yield /*236.74*/{_display_(Seq[Any](format.raw/*236.75*/("""

                            <tr id="sn"""),_display_(Seq[Any](/*238.40*/shortnote/*238.49*/.id)),format.raw/*238.52*/("""">
                                <td>"""),_display_(Seq[Any](/*239.38*/index)),format.raw/*239.43*/("""</td>
                                <td>"""),_display_(Seq[Any](/*240.38*/shortnote/*240.47*/.title)),format.raw/*240.53*/("""</td>
                                <td>"""),_display_(Seq[Any](/*241.38*/shortnote/*241.47*/.slug)),format.raw/*241.52*/("""</td>
                                <td>"""),_display_(Seq[Any](/*242.38*/Html(shortnote.html))),format.raw/*242.58*/("""</td>

                                <td><a href="/shortnote/edit?slug="""),_display_(Seq[Any](/*244.68*/shortnote/*244.77*/.slug)),format.raw/*244.82*/(""""><i class="fa fa-edit" style="color:#1abc9c"></i></a></td>
                                <td>
                                """),_display_(Seq[Any](/*246.34*/if(models.content.Flag.doesShortNoteHasGivenFlag(shortnote,models.content.FlagType.DUPLICATE))/*246.128*/{_display_(Seq[Any](format.raw/*246.129*/("""
                                    <button class="btn btn-success" ng-click="flagAs($event,'duplicate')" >

                                        Duplicate <i class="fa fa-check"></i>
                                    </button>
                                """)))}/*251.34*/else/*251.38*/{_display_(Seq[Any](format.raw/*251.39*/("""
                                    <button class="btn btn-info" ng-click="flagAs($event,'duplicate')" >

                                        Duplicate </button>

                                """)))})),format.raw/*256.34*/("""
                                </td>



                                <td>
                                """),_display_(Seq[Any](/*262.34*/if(models.content.Flag.doesShortNoteHasGivenFlag(shortnote,models.content.FlagType.INAPPROPRIATE))/*262.132*/{_display_(Seq[Any](format.raw/*262.133*/("""
                                    <button class="btn btn-success"  ng-click="flagAs($event,'inappr')" >
                                        Inappropriate <i class="fa fa-check"></i>
                                    </button>
                                """)))}/*266.34*/else/*266.38*/{_display_(Seq[Any](format.raw/*266.39*/("""
                                    <button class="btn btn-info"  ng-click="flagAs($event,'inappr')" >Inappropriate</button>

                                """)))})),format.raw/*269.34*/("""
                                </td>



                                <td>
                                """),_display_(Seq[Any](/*275.34*/if(models.content.Flag.doesShortNoteHasGivenFlag(shortnote,models.content.FlagType.OPINIONISTIC))/*275.131*/{_display_(Seq[Any](format.raw/*275.132*/("""
                                    <button class="btn btn-success"  ng-click="flagAs($event,'opinion')" >
                                        Opinionistic<i class="fa fa-check"></i>
                                    </button>
                                """)))}/*279.34*/else/*279.38*/{_display_(Seq[Any](format.raw/*279.39*/("""
                                    <button class="btn btn-info"  ng-click="flagAs($event,'opinion')" >Opinionistic</button>

                                """)))})),format.raw/*282.34*/("""
                                </td>



                                <td>
                                """),_display_(Seq[Any](/*288.34*/if(models.content.Flag.doesShortNoteHasGivenFlag(shortnote,models.content.FlagType.SPAM))/*288.123*/{_display_(Seq[Any](format.raw/*288.124*/("""
                                    <button class="btn btn-success"  ng-click="flagAs($event,'spam')" >
                                        Spam <i class="fa fa-check"></i>
                                    </button>
                                """)))}/*292.34*/else/*292.38*/{_display_(Seq[Any](format.raw/*292.39*/("""
                                    <button class="btn btn-info"  ng-click="flagAs($event,'spam')" >Spam</button>

                                """)))})),format.raw/*295.34*/("""
                                </td>






                            </tr>
                        """)))})),format.raw/*304.26*/("""
                        </tbody>


                    </table>
                </div>
                <div class="tab-pane" id="reports">      <legend>Unresolved Reports</legend>

                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>Report ShortNote</th>
                                <th>Report User</th>
                                <th>Report Flag Type</th>
                                <th>Report Created Time</th>
                                <th>View  Post</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(Seq[Any](/*324.26*/for((report,index)<-reports.zipWithIndex) yield /*324.67*/{_display_(Seq[Any](format.raw/*324.68*/("""
                            <td>"""),_display_(Seq[Any](/*325.34*/index)),format.raw/*325.39*/("""</td>
                            <td>"""),_display_(Seq[Any](/*326.34*/report/*326.40*/.shortNote.title)),format.raw/*326.56*/("""</td>
                            <td>"""),_display_(Seq[Any](/*327.34*/report/*327.40*/.user.name)),format.raw/*327.50*/("""</td>
                            <td>"""),_display_(Seq[Any](/*328.34*/report/*328.40*/.flagType.name())),format.raw/*328.56*/("""</td>
                            <td>"""),_display_(Seq[Any](/*329.34*/report/*329.40*/.createdTime)),format.raw/*329.52*/("""</td>
                            <td>View Post</td>
                        """)))})),format.raw/*331.26*/("""


                        </tbody>
                    </table>

                </div>
                <div class="tab-pane" id="users">    <legend>Users</legend>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>#</th>
                                <th>User Name</th>
                                <th>User Email</th>
                                <th>User Role</th>
                                <th>User LastLogin</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-repeat="user in usersList">
                                <td>"""),format.raw/*351.37*/("""{"""),format.raw/*351.38*/("""{"""),format.raw/*351.39*/("""$index+1"""),format.raw/*351.47*/("""}"""),format.raw/*351.48*/("""}"""),format.raw/*351.49*/("""</td>
                                <td>"""),format.raw/*352.37*/("""{"""),format.raw/*352.38*/("""{"""),format.raw/*352.39*/("""user.name"""),format.raw/*352.48*/("""}"""),format.raw/*352.49*/("""}"""),format.raw/*352.50*/("""</td>
                                <td>"""),format.raw/*353.37*/("""{"""),format.raw/*353.38*/("""{"""),format.raw/*353.39*/("""user.email"""),format.raw/*353.49*/("""}"""),format.raw/*353.50*/("""}"""),format.raw/*353.51*/("""</td>
                                <td><span ng-repeat="role in user.roles">"""),format.raw/*354.74*/("""{"""),format.raw/*354.75*/("""{"""),format.raw/*354.76*/("""role.roleName"""),format.raw/*354.89*/("""}"""),format.raw/*354.90*/("""}"""),format.raw/*354.91*/("""</span></td>
                                <td><span ng-repeat="role in user.roles">"""),format.raw/*355.74*/("""{"""),format.raw/*355.75*/("""{"""),format.raw/*355.76*/("""role.roleName"""),format.raw/*355.89*/("""}"""),format.raw/*355.90*/("""}"""),format.raw/*355.91*/("""</span></td>
                                <td>"""),format.raw/*356.37*/("""{"""),format.raw/*356.38*/("""{"""),format.raw/*356.39*/("""user.lastLogin |date:'MMM d, y h:mm:ss a Z'"""),format.raw/*356.82*/("""}"""),format.raw/*356.83*/("""}"""),format.raw/*356.84*/("""</td>
                            </tr>
                        </tbody>


                    </table></div>
            </div>








        </div>
    </div>

</div>




""")))})))}
    }
    
    def render(localUser:models.User,subjects:List[models.content.Subject],chapters:List[models.content.Chapter],concepts:List[models.content.Concept],tags:List[models.content.Tag],shortnotes:List[models.content.ShortNote],reports:List[models.content.Report],users:List[models.User]): play.api.templates.HtmlFormat.Appendable = apply(localUser,subjects,chapters,concepts,tags,shortnotes,reports,users)
    
    def f:((models.User,List[models.content.Subject],List[models.content.Chapter],List[models.content.Concept],List[models.content.Tag],List[models.content.ShortNote],List[models.content.Report],List[models.User]) => play.api.templates.HtmlFormat.Appendable) = (localUser,subjects,chapters,concepts,tags,shortnotes,reports,users) => apply(localUser,subjects,chapters,concepts,tags,shortnotes,reports,users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:36 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_data.scala.html
                    HASH: 1389e00040396bc18233f9e89fad2cf017a89d62
                    MATRIX: 979->1|1368->320|1383->327|1467->329|1525->352|1539->358|1594->392|1663->426|1677->432|1742->476|1811->510|1825->516|1883->553|1952->587|1966->593|2014->620|2083->654|2097->660|2155->697|2224->731|2238->737|2299->777|2500->942|2515->948|2585->996|2657->1032|2672->1038|2725->1069|2795->1103|2810->1109|2875->1152|2945->1186|2960->1192|3026->1236|3096->1270|3111->1276|3180->1323|3250->1357|3265->1363|3329->1405|3369->1428|3388->1438|3473->1440|3503->1453|3517->1458|3602->1460|3980->1802|3995->1808|4056->1847|4133->1888|4148->1894|4216->1940|4264->278|4291->315|4322->1422|4354->1447|4386->1948|4423->1950|4536->2053|4577->2055|6107->3549|6167->3593|6206->3594|6314->3666|6341->3671|6420->3714|6436->3721|6463->3726|6542->3769|6558->3776|6585->3781|6664->3824|6715->3853|6822->3924|6838->3931|6865->3936|7017->4056|7997->4999|8058->5043|8098->5044|8176->5085|8193->5092|8219->5095|8296->5135|8324->5140|8404->5183|8421->5190|8449->5195|8529->5238|8546->5245|8574->5250|8654->5293|8706->5322|8786->5365|8803->5372|8839->5385|8920->5429|8963->5462|9003->5463|9078->5501|9095->5508|9139->5529|9193->5563|9207->5567|9247->5568|9352->5640|9432->5683|9471->5712|9511->5713|9586->5751|9603->5758|9643->5775|9697->5809|9711->5813|9751->5814|9856->5886|10260->6253|10277->6260|10305->6265|10458->6385|11439->7329|11500->7373|11540->7374|11618->7415|11635->7422|11661->7425|11738->7465|11766->7470|11846->7513|11863->7520|11891->7525|11971->7568|11988->7575|12016->7580|12096->7623|12148->7652|12228->7695|12245->7702|12281->7715|12361->7758|12404->7791|12444->7792|12519->7830|12536->7837|12580->7858|12634->7892|12648->7896|12688->7897|12793->7969|12873->8012|12912->8041|12952->8042|13027->8080|13044->8087|13084->8104|13138->8138|13152->8142|13192->8143|13297->8215|13701->8582|13718->8589|13746->8594|13899->8714|14644->9422|14697->9458|14737->9459|14847->9532|14875->9537|14955->9580|14968->9583|14996->9588|15076->9631|15089->9634|15117->9639|15197->9682|15245->9707|15326->9751|15391->9799|15431->9800|15555->9887|15576->9898|15616->9899|15760->10002|15777->10009|15805->10014|15879->10055|16016->10155|16029->10158|16057->10163|16210->10283|17156->11192|17221->11240|17261->11241|17339->11282|17358->11291|17384->11294|17461->11334|17489->11339|17569->11382|17588->11391|17617->11397|17697->11440|17716->11449|17744->11454|17824->11497|17867->11517|17978->11591|17997->11600|18025->11605|18192->11735|18297->11829|18338->11830|18625->12097|18639->12101|18679->12102|18913->12303|19062->12415|19171->12513|19212->12514|19500->12782|19514->12786|19554->12787|19747->12947|19896->13059|20004->13156|20045->13157|20332->13424|20346->13428|20386->13429|20579->13589|20728->13701|20828->13790|20869->13791|21146->14048|21160->14052|21200->14053|21382->14202|21519->14306|22309->15059|22367->15100|22407->15101|22478->15135|22506->15140|22582->15179|22598->15185|22637->15201|22713->15240|22729->15246|22762->15256|22838->15295|22854->15301|22893->15317|22969->15356|22985->15362|23020->15374|23131->15452|23898->16190|23928->16191|23958->16192|23995->16200|24025->16201|24055->16202|24126->16244|24156->16245|24186->16246|24224->16255|24254->16256|24284->16257|24355->16299|24385->16300|24415->16301|24454->16311|24484->16312|24514->16313|24622->16392|24652->16393|24682->16394|24724->16407|24754->16408|24784->16409|24899->16495|24929->16496|24959->16497|25001->16510|25031->16511|25061->16512|25139->16561|25169->16562|25199->16563|25271->16606|25301->16607|25331->16608
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->20|47->20|49->20|51->23|51->23|53->23|57->27|57->27|57->27|58->28|58->28|58->28|60->1|61->3|61->19|62->22|63->29|64->30|64->30|64->30|104->70|104->70|104->70|106->72|106->72|107->73|107->73|107->73|108->74|108->74|108->74|109->75|109->75|110->76|110->76|110->76|113->79|139->105|139->105|139->105|141->107|141->107|141->107|142->108|142->108|143->109|143->109|143->109|144->110|144->110|144->110|145->111|145->111|146->112|146->112|146->112|148->114|148->114|148->114|149->115|149->115|149->115|150->116|150->116|150->116|152->118|153->119|153->119|153->119|154->120|154->120|154->120|155->121|155->121|155->121|157->123|160->126|160->126|160->126|163->129|188->154|188->154|188->154|190->156|190->156|190->156|191->157|191->157|192->158|192->158|192->158|193->159|193->159|193->159|194->160|194->160|195->161|195->161|195->161|196->162|196->162|196->162|197->163|197->163|197->163|198->164|198->164|198->164|200->166|201->167|201->167|201->167|202->168|202->168|202->168|203->169|203->169|203->169|205->171|208->174|208->174|208->174|211->177|231->197|231->197|231->197|234->200|234->200|235->201|235->201|235->201|236->202|236->202|236->202|237->203|237->203|238->204|238->204|238->204|240->206|240->206|240->206|242->208|242->208|242->208|243->209|245->211|245->211|245->211|248->214|270->236|270->236|270->236|272->238|272->238|272->238|273->239|273->239|274->240|274->240|274->240|275->241|275->241|275->241|276->242|276->242|278->244|278->244|278->244|280->246|280->246|280->246|285->251|285->251|285->251|290->256|296->262|296->262|296->262|300->266|300->266|300->266|303->269|309->275|309->275|309->275|313->279|313->279|313->279|316->282|322->288|322->288|322->288|326->292|326->292|326->292|329->295|338->304|358->324|358->324|358->324|359->325|359->325|360->326|360->326|360->326|361->327|361->327|361->327|362->328|362->328|362->328|363->329|363->329|363->329|365->331|385->351|385->351|385->351|385->351|385->351|385->351|386->352|386->352|386->352|386->352|386->352|386->352|387->353|387->353|387->353|387->353|387->353|387->353|388->354|388->354|388->354|388->354|388->354|388->354|389->355|389->355|389->355|389->355|389->355|389->355|390->356|390->356|390->356|390->356|390->356|390->356
                    -- GENERATED --
                */
            