
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
object template_user_dashboard_semantic extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

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
                """),_display_(Seq[Any](/*58.18*/subjectPresentOr()/*58.36*/{_display_(Seq[Any](format.raw/*58.37*/("""
                    """),_display_(Seq[Any](/*59.22*/defining(Application.getLocalUser(session()))/*59.67*/ { user =>_display_(Seq[Any](format.raw/*59.77*/("""
                <ul class="nav navbar-nav">
                    <li>
                        <a href="/home"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
                    </li>
                    <li>
                        <a href="/profile/"""),_display_(Seq[Any](/*65.44*/user/*65.48*/.name)),format.raw/*65.53*/(""""><i class="fa fa-table fa-fw"></i> Profile</a>
                    </li>
                    <li>
                        <a href="/discover"><i class="fa fa-table fa-fw"></i> Discover</a>
                    </li>
                    <li>
                        <a href="/tags"><i class="fa fa-table fa-fw"></i> Tags</a>
                    </li>
                    <li>
                        <a href="/shortnote/new">ShortNote</a>
                    </li>


                </ul>

                    """)))})),format.raw/*80.22*/("""
                """)))}/*81.18*/{_display_(Seq[Any](format.raw/*81.19*/("""

                """)))})),format.raw/*83.18*/("""

                <ul class="nav navbar-top-links navbar-right">

                """),_display_(Seq[Any](/*87.18*/subjectPresentOr()/*87.36*/ {_display_(Seq[Any](format.raw/*87.38*/("""
                    """),_display_(Seq[Any](/*88.22*/defining(Application.getLocalUser(session()))/*88.67*/ { user =>_display_(Seq[Any](format.raw/*88.77*/("""

                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href=""""),_display_(Seq[Any](/*95.43*/routes/*95.49*/.Application.profile(user.name))),format.raw/*95.80*/(""""><i class="fa fa-user fa-fw"></i> <span style="text-transform: capitalize">"""),_display_(Seq[Any](/*95.157*/user/*95.161*/.name)),format.raw/*95.166*/("""</span>'s Profile</a>
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
                    """)))})),format.raw/*106.22*/("""
                """)))}/*107.18*/{_display_(Seq[Any](format.raw/*107.19*/("""
                    <li><a href="/signup">Signup</a></li>
                    <li><a href="/login">Login</a></li>
                """)))})),format.raw/*110.18*/("""
                </ul>
                    <!-- /.navbar-top-links -->

                    <!-- /.navbar-static-side -->
            </nav>

            <div class=" content-wrapper">

                    <!-- /.row -->

                    """),_display_(Seq[Any](/*121.22*/content)),format.raw/*121.29*/("""


                    <!-- /.row -->
            </div>
                <!-- /#page-wrapper -->

        </div>
            <!-- /#wrapper -->

            <!-- Core Scripts - Include with every page -->


            <!-- Page-Level Plugin Scripts - Dashboard -->

            <!-- SB Admin Scripts - Include with every page -->
        <script src=""""),_display_(Seq[Any](/*137.23*/routes/*137.29*/.Assets.at("js/sbadmin/sb-admin.js"))),format.raw/*137.65*/(""""></script>

            <!-- Page-Level Demo Scripts - Dashboard - Use for reference -->


        """),_display_(Seq[Any](/*142.10*/scripts)),format.raw/*142.17*/("""

        <script src=""""),_display_(Seq[Any](/*144.23*/routes/*144.29*/.Assets.at("js/sbadmin/plugins/metisMenu/jquery.metisMenu.js"))),format.raw/*144.91*/(""""></script>

            <!-- Page-Level Plugin Scripts - Dashboard -->
        <script src=""""),_display_(Seq[Any](/*147.23*/routes/*147.29*/.Assets.at("js/sbadmin/plugins/morris/raphael-2.1.0.min.js"))),format.raw/*147.89*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*148.23*/routes/*148.29*/.Assets.at("js/sbadmin/plugins/morris/morris.js"))),format.raw/*148.78*/(""""></script>


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
                    SOURCE: W:/Pre School/app/views/template_user_dashboard_semantic.scala.html
                    HASH: 82e12d8ab574c565a8fa8d106e847029d918e241
                    MATRIX: 828->1|1114->89|1142->196|1207->226|1221->232|1249->239|1314->269|1340->274|1764->662|1779->668|1839->706|1916->747|1931->753|1984->784|2061->825|2076->831|2131->864|2208->905|2223->911|2271->937|2348->978|2363->984|2423->1022|2535->1098|2550->1104|2593->1125|2769->1265|2784->1271|2835->1300|2892->1321|2919->1326|2965->1336|2997->1346|3986->2299|4013->2317|4052->2318|4110->2340|4164->2385|4212->2395|4504->2651|4517->2655|4544->2660|5086->3170|5123->3188|5162->3189|5213->3208|5332->3291|5359->3309|5399->3311|5457->3333|5511->3378|5559->3388|5954->3747|5969->3753|6022->3784|6136->3861|6150->3865|6178->3870|6751->4410|6789->4428|6829->4429|6994->4561|7274->4804|7304->4811|7694->5164|7710->5170|7769->5206|7907->5307|7937->5314|7998->5338|8014->5344|8099->5406|8230->5500|8246->5506|8329->5566|8400->5600|8416->5606|8488->5655
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->9|38->9|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|58->29|58->29|58->29|60->31|60->31|60->31|61->32|61->32|62->33|62->33|87->58|87->58|87->58|88->59|88->59|88->59|94->65|94->65|94->65|109->80|110->81|110->81|112->83|116->87|116->87|116->87|117->88|117->88|117->88|124->95|124->95|124->95|124->95|124->95|124->95|135->106|136->107|136->107|139->110|150->121|150->121|166->137|166->137|166->137|171->142|171->142|173->144|173->144|173->144|176->147|176->147|176->147|177->148|177->148|177->148
                    -- GENERATED --
                */
            