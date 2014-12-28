
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
object template_admin_dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "",scriptsTop:Html,scripts:Html,links:Html)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*5.1*/("""
<!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*7.14*/lang()/*7.20*/.code())),format.raw/*7.27*/("""">
    <head>
        <base href="/">
        <title>"""),_display_(Seq[Any](/*10.17*/title)),format.raw/*10.22*/("""</title>

            <!-- Le meta -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
        <meta name="author" content="The Play Authenticate Team">




            <!-- Le styles -->
        <link href=""""),_display_(Seq[Any](/*22.22*/routes/*22.28*/.Assets.at("stylesheets/main.min.css"))),format.raw/*22.66*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*23.22*/routes/*23.28*/.Assets.at("css/bootstrap.css"))),format.raw/*23.59*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*24.22*/routes/*24.28*/.Assets.at("css/animate.min.css"))),format.raw/*24.61*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*25.22*/routes/*25.28*/.Assets.at("css/temp.css"))),format.raw/*25.54*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*26.22*/routes/*26.28*/.Assets.at("css/sbadmin/sb-admin.css"))),format.raw/*26.66*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*27.22*/routes/*27.28*/.Assets.at("css/apprise-v2.css"))),format.raw/*27.60*/("""" rel="stylesheet">

            <!-- Le scripts -->

        <script src=""""),_display_(Seq[Any](/*31.23*/routes/*31.29*/.Application.jsRoutes)),format.raw/*31.50*/("""" defer="defer"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.0/jquery.min.js"></script>
        <script src=""""),_display_(Seq[Any](/*33.23*/routes/*33.29*/.Assets.at("js/bootstrap.js"))),format.raw/*33.58*/(""""></script>
        """),_display_(Seq[Any](/*34.10*/links)),format.raw/*34.15*/("""
        """),_display_(Seq[Any](/*35.10*/scriptsTop)),format.raw/*35.20*/("""


            <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
            <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    </head>

    <body>

        <div id="wrapper">

            <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/home">Edify India</a>
                </div>
                    <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">

                """),_display_(Seq[Any](/*63.18*/subjectPresentOr()/*63.36*/ {_display_(Seq[Any](format.raw/*63.38*/("""
                    """),_display_(Seq[Any](/*64.22*/defining(Application.getLocalUser(session()))/*64.67*/ { user =>_display_(Seq[Any](format.raw/*64.77*/("""
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-messages animated bounceIn">
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>John Smith</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>Read All Messages</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                            <!-- /.dropdown-messages -->
                    </li>
                        <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-tasks">
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Task 1</strong>
                                            <span class="pull-right text-muted">40% Complete</span>
                                        </p>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                                <span class="sr-only">40% Complete (success)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Task 2</strong>
                                            <span class="pull-right text-muted">20% Complete</span>
                                        </p>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                                <span class="sr-only">20% Complete</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Task 3</strong>
                                            <span class="pull-right text-muted">60% Complete</span>
                                        </p>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                                <span class="sr-only">60% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <p>
                                            <strong>Task 4</strong>
                                            <span class="pull-right text-muted">80% Complete</span>
                                        </p>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                                <span class="sr-only">80% Complete (danger)</span>
                                            </div>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>See All Tasks</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                            <!-- /.dropdown-tasks -->
                    </li>
                        <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-comment fa-fw"></i> New Comment
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                        <span class="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-envelope fa-fw"></i> Message Sent
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-tasks fa-fw"></i> New Task
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                        <span class="pull-right text-muted small">4 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>See All Alerts</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                            <!-- /.dropdown-alerts -->
                    </li>
                        <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="#"><i class="fa fa-user fa-fw"></i> <span style="text-transform: capitalize">"""),_display_(Seq[Any](/*260.120*/user/*260.124*/.name)),format.raw/*260.129*/("""</span>'s Profile</a>
                            </li>
                            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href=""""),_display_(Seq[Any](/*265.43*/com/*265.46*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*265.107*/(""""><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                            </li>
                        </ul>
                            <!-- /.dropdown-user -->
                    </li>
                        <!-- /.dropdown -->
                    """)))})),format.raw/*271.22*/("""
                """)))}/*272.18*/{_display_(Seq[Any](format.raw/*272.19*/("""
                    <li><a href="/signup">Signup</a></li>
                    <li><a href="/login">Login</a></li>
                """)))})),format.raw/*275.18*/("""
                </ul>
                    <!-- /.navbar-top-links -->

                <div class="navbar-default navbar-static-side" role="navigation">
                    <div class="sidebar-collapse">
                        <ul class="nav" id="side-menu">
                            <li class="sidebar-search">
                                <div class="input-group custom-search-form">
                                    <input type="text" class="form-control" placeholder="Search...">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button">
                                            <i class="fa fa-search"></i>
                                        </button>
                                    </span>
                                </div>
                                    <!-- /input-group -->
                            </li>
                            <li>
                                <a href=""""),_display_(Seq[Any](/*294.43*/routes/*294.49*/.Application.home())),format.raw/*294.68*/(""""><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                            </li>
                            <li>
                                <a href=""""),_display_(Seq[Any](/*297.43*/controllers/*297.54*/.Admin.routes.AdminApplication.getAdminData())),format.raw/*297.99*/(""""><i class="fa fa-table fa-fw"></i> Data</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-plus"></i> Add <span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href=""""),_display_(Seq[Any](/*303.51*/controllers/*303.62*/.Admin.routes.AdminApplication.newSubject())),format.raw/*303.105*/("""">Add Subject</a>
                                    </li>
                                    <li>
                                        <a href=""""),_display_(Seq[Any](/*306.51*/controllers/*306.62*/.Admin.routes.AdminApplication.newChapter())),format.raw/*306.105*/("""">Add Chapter</a>
                                    </li>

                                    <li>
                                        <a href=""""),_display_(Seq[Any](/*310.51*/controllers/*310.62*/.Admin.routes.AdminApplication.newConcept())),format.raw/*310.105*/("""">Add Concept</a>
                                    </li>

                                    <li>
                                        <a href=""""),_display_(Seq[Any](/*314.51*/controllers/*314.62*/.Admin.routes.AdminApplication.newTag())),format.raw/*314.101*/("""">Add Tag</a>
                                    </li>

                                </ul>
                                    <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href=""""),_display_(Seq[Any](/*321.43*/controllers/*321.54*/.Admin.routes.AdminApplication.getUsers())),format.raw/*321.95*/(""""><i class="fa fa-dashboard fa-fw"></i> Users</a>
                            </li>

                        </ul>
                            <!-- /#side-menu -->
                    </div>
                        <!-- /.sidebar-collapse -->
                </div>
                    <!-- /.navbar-static-side -->
            </nav>

            <div id="page-wrapper">
                <div style="height:40px">

                </div>
                    <!-- /.row -->
                <div class="row">
                    """),_display_(Seq[Any](/*338.22*/content)),format.raw/*338.29*/("""

                </div>
                    <!-- /.row -->
            </div>
                <!-- /#page-wrapper -->

        </div>
            <!-- /#wrapper -->

            <!-- Core Scripts - Include with every page -->
        <script src=""""),_display_(Seq[Any](/*349.23*/routes/*349.29*/.Assets.at("js/sbadmin/sb-admin.js"))),format.raw/*349.65*/(""""></script>


        <script src=""""),_display_(Seq[Any](/*352.23*/routes/*352.29*/.Assets.at("js/apprise-v2.js"))),format.raw/*352.59*/(""""></script>

        """),_display_(Seq[Any](/*354.10*/scripts)),format.raw/*354.17*/("""


        <script src=""""),_display_(Seq[Any](/*357.23*/routes/*357.29*/.Assets.at("js/sbadmin/plugins/metisMenu/jquery.metisMenu.js"))),format.raw/*357.91*/(""""></script>

            <!-- Page-Level Plugin Scripts - Dashboard -->
        <script src=""""),_display_(Seq[Any](/*360.23*/routes/*360.29*/.Assets.at("js/sbadmin/plugins/morris/raphael-2.1.0.min.js"))),format.raw/*360.89*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*361.23*/routes/*361.29*/.Assets.at("js/sbadmin/plugins/morris/morris.js"))),format.raw/*361.78*/(""""></script>

            <!-- SB Admin Scripts - Include with every page -->

            <!-- Page-Level Demo Scripts - Dashboard - Use for reference -->



    </body>
</html>
"""))}
    }
    
    def render(title:String,nav:String,scriptsTop:Html,scripts:Html,links:Html,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav,scriptsTop,scripts,links)(content)
    
    def f:((String,String,Html,Html,Html) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav,scriptsTop,scripts,links) => (content) => apply(title,nav,scriptsTop,scripts,links)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:42 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/template_admin_dashboard.scala.html
                    HASH: ad4960a16bb7ced73e7657660cdb547869b89ef7
                    MATRIX: 826->1|1112->89|1140->196|1205->226|1219->232|1247->239|1337->293|1364->298|1788->686|1803->692|1863->730|1940->771|1955->777|2008->808|2085->849|2100->855|2155->888|2232->929|2247->935|2295->961|2372->1002|2387->1008|2447->1046|2524->1087|2539->1093|2593->1125|2705->1201|2720->1207|2763->1228|2939->1368|2954->1374|3005->1403|3062->1424|3089->1429|3135->1439|3167->1449|4221->2467|4248->2485|4288->2487|4346->2509|4400->2554|4448->2564|15757->13835|15772->13839|15801->13844|16114->14120|16127->14123|16212->14184|16503->14442|16541->14460|16581->14461|16746->14593|17805->15615|17821->15621|17863->15640|18063->15803|18084->15814|18152->15859|18568->16238|18589->16249|18656->16292|18844->16443|18865->16454|18932->16497|19121->16649|19142->16660|19209->16703|19398->16855|19419->16866|19482->16905|19787->17173|19808->17184|19872->17225|20437->17753|20467->17760|20753->18009|20769->18015|20828->18051|20901->18087|20917->18093|20970->18123|21029->18145|21059->18152|21121->18177|21137->18183|21222->18245|21353->18339|21369->18345|21452->18405|21523->18439|21539->18445|21611->18494
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|39->10|39->10|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|56->27|56->27|60->31|60->31|60->31|62->33|62->33|62->33|63->34|63->34|64->35|64->35|92->63|92->63|92->63|93->64|93->64|93->64|289->260|289->260|289->260|294->265|294->265|294->265|300->271|301->272|301->272|304->275|323->294|323->294|323->294|326->297|326->297|326->297|332->303|332->303|332->303|335->306|335->306|335->306|339->310|339->310|339->310|343->314|343->314|343->314|350->321|350->321|350->321|367->338|367->338|378->349|378->349|378->349|381->352|381->352|381->352|383->354|383->354|386->357|386->357|386->357|389->360|389->360|389->360|390->361|390->361|390->361
                    -- GENERATED --
                */
            