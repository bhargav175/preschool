
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
object template_user_dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "",scriptsTop:Html,scripts:Html,links:Html)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*5.1*/("""
<!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*7.14*/lang()/*7.20*/.code())),format.raw/*7.27*/("""">
    <head>
        <title>"""),_display_(Seq[Any](/*9.17*/title)),format.raw/*9.22*/("""</title>

            <!-- Le meta -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
        <meta name="author" content="The Play Authenticate Team">




            <!-- Le styles -->
        <link href=""""),_display_(Seq[Any](/*21.22*/routes/*21.28*/.Assets.at("stylesheets/main.min.css"))),format.raw/*21.66*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*22.22*/routes/*22.28*/.Assets.at("css/bootstrap.css"))),format.raw/*22.59*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*23.22*/routes/*23.28*/.Assets.at("css/animate.min.css"))),format.raw/*23.61*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*24.22*/routes/*24.28*/.Assets.at("css/temp.css"))),format.raw/*24.54*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*25.22*/routes/*25.28*/.Assets.at("css/sbadmin/sb-admin.css"))),format.raw/*25.66*/("""" rel="stylesheet">

            <!-- Le scripts -->

        <script src=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Application.jsRoutes)),format.raw/*29.50*/("""" defer="defer"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.0/jquery.min.js"></script>
        <script src=""""),_display_(Seq[Any](/*31.23*/routes/*31.29*/.Assets.at("js/bootstrap.js"))),format.raw/*31.58*/(""""></script>
        """),_display_(Seq[Any](/*32.10*/links)),format.raw/*32.15*/("""
        """),_display_(Seq[Any](/*33.10*/scriptsTop)),format.raw/*33.20*/("""


            <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
            <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    </head>

    <body>

        <div class="wrapper">

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

                """),_display_(Seq[Any](/*61.18*/subjectPresentOr()/*61.36*/ {_display_(Seq[Any](format.raw/*61.38*/("""
                    """),_display_(Seq[Any](/*62.22*/defining(Application.getLocalUser(session()))/*62.67*/ { user =>_display_(Seq[Any](format.raw/*62.77*/("""
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-messages">
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
                            <li><a href="#"><i class="fa fa-user fa-fw"></i> <span style="text-transform: capitalize">"""),_display_(Seq[Any](/*258.120*/user/*258.124*/.name)),format.raw/*258.129*/("""</span>'s Profile</a>
                            </li>
                            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="/logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                            </li>
                        </ul>
                            <!-- /.dropdown-user -->
                    </li>
                        <!-- /.dropdown -->
                    """)))})),format.raw/*269.22*/("""
                """)))}/*270.18*/{_display_(Seq[Any](format.raw/*270.19*/("""
                    <li><a href="/signup">Signup</a></li>
                    <li><a href="/login">Login</a></li>
                """)))})),format.raw/*273.18*/("""
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
                                <a href="/home"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                            </li>
                            <li>
                                <a href="/profile"><i class="fa fa-table fa-fw"></i> Profile</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Add<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="flot.html">ShortNote</a>
                                    </li>

                                </ul>
                                    <!-- /.nav-second-level -->
                            </li>


                            <li>
                                <a href="#"><i class="fa fa-wrench fa-fw"></i>Settings<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="panels-wells.html">Account Settings</a>
                                    </li>
                                    <li>
                                        <a href="buttons.html">Reader Settings</a>
                                    </li>
                                    <li>
                                        <a href="notifications.html">Notifications</a>
                                    </li>

                                </ul>
                                    <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-sitemap fa-fw"></i> Multi-Level Dropdown<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="#">Second Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Second Level Item</a>
                                    </li>
                                    <li>
                                        <a href="#">Third Level <span class="fa arrow"></span></a>
                                        <ul class="nav nav-third-level">
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                            <li>
                                                <a href="#">Third Level Item</a>
                                            </li>
                                        </ul>
                                            <!-- /.nav-third-level -->
                                    </li>
                                </ul>
                                    <!-- /.nav-second-level -->
                            </li>

                        </ul>
                            <!-- /#side-menu -->
                    </div>
                        <!-- /.sidebar-collapse -->
                </div>
                    <!-- /.navbar-static-side -->
            </nav>

            <div id="page-wrapper">

                    <!-- /.row -->

                    """),_display_(Seq[Any](/*368.22*/content)),format.raw/*368.29*/("""


                    <!-- /.row -->
            </div>
                <!-- /#page-wrapper -->

        </div>
            <!-- /#wrapper -->

            <!-- Core Scripts - Include with every page -->


            <!-- Page-Level Plugin Scripts - Dashboard -->

            <!-- SB Admin Scripts - Include with every page -->
        <script src=""""),_display_(Seq[Any](/*384.23*/routes/*384.29*/.Assets.at("js/sbadmin/sb-admin.js"))),format.raw/*384.65*/(""""></script>

            <!-- Page-Level Demo Scripts - Dashboard - Use for reference -->


        """),_display_(Seq[Any](/*389.10*/scripts)),format.raw/*389.17*/("""

        <script src=""""),_display_(Seq[Any](/*391.23*/routes/*391.29*/.Assets.at("js/sbadmin/plugins/metisMenu/jquery.metisMenu.js"))),format.raw/*391.91*/(""""></script>

            <!-- Page-Level Plugin Scripts - Dashboard -->
        <script src=""""),_display_(Seq[Any](/*394.23*/routes/*394.29*/.Assets.at("js/sbadmin/plugins/morris/raphael-2.1.0.min.js"))),format.raw/*394.89*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*395.23*/routes/*395.29*/.Assets.at("js/sbadmin/plugins/morris/morris.js"))),format.raw/*395.78*/(""""></script>


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
                    DATE: Sun Dec 28 16:26:23 IST 2014
                    SOURCE: W:/Pre School/app/views/template_user_dashboard.scala.html
                    HASH: fac061d11455562e5f07ea3010741b7c85583f80
                    MATRIX: 819->1|1105->89|1133->196|1198->226|1212->232|1240->239|1305->269|1331->274|1755->662|1770->668|1830->706|1907->747|1922->753|1975->784|2052->825|2067->831|2122->864|2199->905|2214->911|2262->937|2339->978|2354->984|2414->1022|2526->1098|2541->1104|2584->1125|2760->1265|2775->1271|2826->1300|2883->1321|2910->1326|2956->1336|2988->1346|4045->2367|4072->2385|4112->2387|4170->2409|4224->2454|4272->2464|15563->13717|15578->13721|15607->13726|16180->14266|16218->14284|16258->14285|16423->14417|21242->19199|21272->19206|21662->19559|21678->19565|21737->19601|21875->19702|21905->19709|21966->19733|21982->19739|22067->19801|22198->19895|22214->19901|22297->19961|22368->19995|22384->20001|22456->20050
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->9|38->9|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|58->29|58->29|58->29|60->31|60->31|60->31|61->32|61->32|62->33|62->33|90->61|90->61|90->61|91->62|91->62|91->62|287->258|287->258|287->258|298->269|299->270|299->270|302->273|397->368|397->368|413->384|413->384|413->384|418->389|418->389|420->391|420->391|420->391|423->394|423->394|423->394|424->395|424->395|424->395
                    -- GENERATED --
                */
            