
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
object template_user_dashboard_semantic_new extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "",scriptsTop:Html,scripts:Html,links:Html)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*6.14*/lang()/*6.20*/.code())),format.raw/*6.27*/("""">
    <head>
        <title>"""),_display_(Seq[Any](/*8.17*/title)),format.raw/*8.22*/("""</title>

            <!-- Le meta -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
        <meta name="author" content="The Play Authenticate Team">




            <!-- Le styles -->


        <link href=""""),_display_(Seq[Any](/*22.22*/routes/*22.28*/.Assets.at("css/bootstrap.css"))),format.raw/*22.59*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*23.22*/routes/*23.28*/.Assets.at("css/animate.min.css"))),format.raw/*23.61*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*24.22*/routes/*24.28*/.Assets.at("css/apprise-v2.css"))),format.raw/*24.60*/("""" rel="stylesheet">


        <script src=""""),_display_(Seq[Any](/*27.23*/routes/*27.29*/.Application.jsRoutes)),format.raw/*27.50*/("""" defer="defer"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.0/jquery.min.js"></script>
        <script src=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Assets.at("js/bootstrap.js"))),format.raw/*29.58*/(""""></script>
        """),_display_(Seq[Any](/*30.10*/links)),format.raw/*30.15*/("""
        """),_display_(Seq[Any](/*31.10*/scriptsTop)),format.raw/*31.20*/("""


            <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
            <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    </head>

    <body>


            <!-- Static navbar -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Gyanpub</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">

                        """),_display_(Seq[Any](/*59.26*/subjectPresentOr()/*59.44*/{_display_(Seq[Any](format.raw/*59.45*/("""
                            """),_display_(Seq[Any](/*60.30*/defining(Application.getLocalUser(session()))/*60.75*/ { user =>_display_(Seq[Any](format.raw/*60.85*/("""



                            """)))})),format.raw/*64.30*/("""


                        """)))}/*67.26*/{_display_(Seq[Any](format.raw/*67.27*/("""
                            <li class="dropdown">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#"  aria-expanded="true">
                                    <i class="fa fa-angle-down fa-fw"></i>
                                </a>
                                <ul class="dropdown-menu ">
                                    <li><a href="/signup">Signup</a></li>
                                    <li><a href="/login">Login</a></li>
                                </ul>
                            </li>
                        """)))})),format.raw/*77.26*/("""

                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        """),_display_(Seq[Any](/*81.26*/subjectPresentOr()/*81.44*/{_display_(Seq[Any](format.raw/*81.45*/("""
                            """),_display_(Seq[Any](/*82.30*/defining(Application.getLocalUser(session()))/*82.75*/ { user =>_display_(Seq[Any](format.raw/*82.85*/("""
                                <li class="dropdown" >

                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="true"> More <span class="caret"></span></a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href=""""),_display_(Seq[Any](/*87.55*/routes/*87.61*/.Application.settings())),format.raw/*87.84*/(""""><i class="fa fa-gear fa-fw"></i> Settings</a>
                                        </li>
                                        <li class="divider"></li>
                                        <li class="dropdown-header">More</li>

                                        <li class="divider"></li>
                                        <li><a href="/logout"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                                        </li>
                                    </ul>
                                </li>

                                <li class="dropdown" id="notificationUpdatesHolder" >
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" id="notificationLink">
                                        <span class="fa-stack">
                                            <i class="fa fa-bell-o fa-stack"  id="notificationIcon"></i>
                                        </span>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user notification-list">

                                        <li class="seeAllUpdates">
                                            <a href=""""),_display_(Seq[Any](/*107.55*/controllers/*107.66*/.Information.routes.Notification.updatesPage())),format.raw/*107.112*/("""">See All Updates</a>
                                        </li>

                                    </ul>
                                </li>
                            """)))})),format.raw/*112.30*/("""
                        """)))}/*113.26*/{_display_(Seq[Any](format.raw/*113.27*/("""

                        """)))})),format.raw/*115.26*/("""
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>



        <div class="container">



            <div class="col-md-3">
             """),_display_(Seq[Any](/*128.15*/subjectPresentOr()/*128.33*/ {_display_(Seq[Any](format.raw/*128.35*/("""
                 """),_display_(Seq[Any](/*129.19*/defining(Application.getLocalUser(session()))/*129.64*/ { user =>_display_(Seq[Any](format.raw/*129.74*/("""



                     <div class="list-group">

                         <a href="/home" class="list-group-item active"><i class="fa fa-dashboard fa-fw"></i>
                             Dashboard</a>

                         <a href=""""),_display_(Seq[Any](/*138.36*/routes/*138.42*/.Application.profile(user.name))),format.raw/*138.73*/("""" class="list-group-item"><i class="fa fa-paperclip fa-fw"></i>
                             Profile</a>

                         <a href="/discover" class="list-group-item"><i class="fa fa-eye fa-fw"></i> Discover</a>

                         <a href="/tags" class="list-group-item"><i class="fa fa-tag fa-fw"></i> Tags</a>
                         <a href=""""),_display_(Seq[Any](/*144.36*/controllers/*144.47*/.Forum.routes.Forum.ForumPage())),format.raw/*144.78*/("""" class="list-group-item"><i class="fa fa-group fa-fw"></i> Forum</a>

                         <a href="/shortnote/new" class="list-group-item"><i class="fa fa-pencil fa-fw"></i>ShortNote</a>

                     </div>
                 """)))})),format.raw/*149.19*/("""
             """)))}/*150.15*/{_display_(Seq[Any](format.raw/*150.16*/("""

                """)))})),format.raw/*152.18*/("""

            </div>
            <div class="col-md-9">
            """),_display_(Seq[Any](/*156.14*/content)),format.raw/*156.21*/("""
            </div>


        </div>




            <!-- Page-Level Demo Scripts - Dashboard - Use for reference -->


        """),_display_(Seq[Any](/*168.10*/scripts)),format.raw/*168.17*/("""
        <script src=""""),_display_(Seq[Any](/*169.23*/routes/*169.29*/.Assets.at("js/sbadmin/plugins/metisMenu/jquery.metisMenu.js"))),format.raw/*169.91*/(""""></script>

            <!-- Page-Level Plugin Scripts - Dashboard -->

        <script src=""""),_display_(Seq[Any](/*173.23*/routes/*173.29*/.Assets.at("js/apprise-v2.js"))),format.raw/*173.59*/(""""></script>

        """),_display_(Seq[Any](/*175.10*/subjectPresentOr()/*175.28*/{_display_(Seq[Any](format.raw/*175.29*/("""
            <script src=""""),_display_(Seq[Any](/*176.27*/routes/*176.33*/.Assets.at("js/notification.js"))),format.raw/*176.65*/(""""></script>
        """)))}/*177.10*/{_display_(Seq[Any](format.raw/*177.11*/("""

        """)))})),format.raw/*179.10*/("""


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
                    DATE: Sun Dec 28 16:26:24 IST 2014
                    SOURCE: W:/Pre School/app/views/template_user_dashboard_semantic_new.scala.html
                    HASH: 5ec0c4952439880ca5042d201270b79aca3c6306
                    MATRIX: 832->1|1120->89|1150->200|1215->230|1229->236|1257->243|1324->275|1350->280|1790->684|1805->690|1858->721|1936->763|1951->769|2006->802|2084->844|2099->850|2153->882|2236->929|2251->935|2294->956|2472->1098|2487->1104|2538->1133|2596->1155|2623->1160|2670->1171|2702->1181|3851->2294|3878->2312|3917->2313|3984->2344|4038->2389|4086->2399|4155->2436|4205->2467|4244->2468|4866->3058|5020->3176|5047->3194|5086->3195|5153->3226|5207->3271|5255->3281|5650->3640|5665->3646|5710->3669|6988->4910|7009->4921|7079->4967|7295->5150|7342->5177|7382->5178|7444->5207|7687->5413|7715->5431|7756->5433|7813->5453|7868->5498|7917->5508|8203->5757|8219->5763|8273->5794|8678->6162|8699->6173|8753->6204|9031->6449|9067->6465|9107->6466|9161->6487|9271->6560|9301->6567|9479->6708|9509->6715|9570->6739|9586->6745|9671->6807|9807->6906|9823->6912|9876->6942|9937->6966|9965->6984|10005->6985|10070->7013|10086->7019|10141->7051|10183->7073|10223->7074|10269->7087
                    LINES: 26->1|32->1|34->5|35->6|35->6|35->6|37->8|37->8|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|56->27|56->27|56->27|58->29|58->29|58->29|59->30|59->30|60->31|60->31|88->59|88->59|88->59|89->60|89->60|89->60|93->64|96->67|96->67|106->77|110->81|110->81|110->81|111->82|111->82|111->82|116->87|116->87|116->87|136->107|136->107|136->107|141->112|142->113|142->113|144->115|157->128|157->128|157->128|158->129|158->129|158->129|167->138|167->138|167->138|173->144|173->144|173->144|178->149|179->150|179->150|181->152|185->156|185->156|197->168|197->168|198->169|198->169|198->169|202->173|202->173|202->173|204->175|204->175|204->175|205->176|205->176|205->176|206->177|206->177|208->179
                    -- GENERATED --
                */
            