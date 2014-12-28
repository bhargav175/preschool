
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
object template_landing_page extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

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
        <link href=""""),_display_(Seq[Any](/*21.22*/routes/*21.28*/.Assets.at("css/bootstrap.css"))),format.raw/*21.59*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*22.22*/routes/*22.28*/.Assets.at("css/animate.min.css"))),format.raw/*22.61*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*23.22*/routes/*23.28*/.Assets.at("css/temp.css"))),format.raw/*23.54*/("""" rel="stylesheet">
        <link href=""""),_display_(Seq[Any](/*24.22*/routes/*24.28*/.Assets.at("css/landingpage/landing-page.css"))),format.raw/*24.74*/("""" rel="stylesheet">

            <!-- Le scripts -->


        """),_display_(Seq[Any](/*29.10*/links)),format.raw/*29.15*/("""
        """),_display_(Seq[Any](/*30.10*/scriptsTop)),format.raw/*30.20*/("""


            <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
            <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    </head>

    <body>



            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="/home">The Civil Servant</a>
                    </div>

                        <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse navbar-right navbar-ex1-collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="#about">About</a>
                            </li>

                        </ul>
                    </div>
                        <!-- /.navbar-collapse -->
                </div>
                    <!-- /.container -->
            </nav>

            <div class="intro-header">

                <div class="container">

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="intro-message">
                                <h1 class="animated fadeInLeft">The Civil Servant</h1>
                                <h3>Educating ourselves and India <span style="font-style: italic"><b>Together</b></span></h3>
                                <hr class="intro-divider">
                                <ul class="list-inline intro-social-buttons">
                                    <li><a href="/signup" class="btn btn-success btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Sign Up</span></a>
                                    </li>
                                    <li><a href="/login" class="btn btn-info btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Log In</span></a>
                                    </li>

                                </ul>
                            </div>
                        </div>
                    </div>

                </div>
                    <!-- /.container -->

            </div>
                <!-- /.intro-header -->

            """),format.raw/*96.48*/("""

                """),format.raw/*98.44*/("""

                    """),format.raw/*100.42*/("""
                        """),format.raw/*101.60*/("""
                            """),format.raw/*102.68*/("""
                            """),format.raw/*103.61*/("""
                            """),format.raw/*104.86*/("""
                                """),format.raw/*105.60*/("""
                            """),format.raw/*106.266*/("""
                        """),format.raw/*107.35*/("""
                        """),format.raw/*108.76*/("""
                            """),format.raw/*109.120*/("""
                        """),format.raw/*110.35*/("""
                    """),format.raw/*111.31*/("""

                """),format.raw/*113.27*/("""
                    """),format.raw/*114.45*/("""

            """),format.raw/*116.23*/("""
                """),format.raw/*117.49*/("""

            """),format.raw/*119.48*/("""

                """),format.raw/*121.44*/("""

                    """),format.raw/*123.42*/("""
                        """),format.raw/*124.91*/("""
                            """),format.raw/*125.68*/("""
                            """),format.raw/*126.61*/("""
                            """),format.raw/*127.78*/("""
                                """),format.raw/*128.58*/("""
                            """),format.raw/*129.298*/("""
                        """),format.raw/*130.35*/("""
                        """),format.raw/*131.75*/("""
                            """),format.raw/*132.120*/("""
                        """),format.raw/*133.35*/("""
                    """),format.raw/*134.31*/("""

                """),format.raw/*136.27*/("""
                    """),format.raw/*137.45*/("""

            """),format.raw/*139.23*/("""
                """),format.raw/*140.49*/("""

            """),format.raw/*142.48*/("""

                """),format.raw/*144.44*/("""

                    """),format.raw/*146.42*/("""
                        """),format.raw/*147.60*/("""
                            """),format.raw/*148.68*/("""
                            """),format.raw/*149.61*/("""
                            """),format.raw/*150.81*/("""
                                """),format.raw/*151.64*/("""
                            """),format.raw/*152.275*/("""
                        """),format.raw/*153.35*/("""
                        """),format.raw/*154.76*/("""
                            """),format.raw/*155.123*/("""
                        """),format.raw/*156.35*/("""
                    """),format.raw/*157.31*/("""

                """),format.raw/*159.27*/("""
                    """),format.raw/*160.45*/("""

            """),format.raw/*162.23*/("""
                """),format.raw/*163.49*/("""

            <div class="banner">

                <div class="container">

                    <div class="row">
                        <div class="col-lg-6">
                            <h2>Connect to TCivilS:</h2>
                        </div>
                        <div class="col-lg-6">
                            <ul class="list-inline banner-social-buttons">
                                <li><a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg disabled"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                                </li>
                                <li><a href="#" class="btn btn-default btn-lg disabled"><i class="fa fa-linkedin fa-fw"></i> <span class="network-name">Linkedin</span></a>
                                </li>
                            </ul>
                        </div>
                    </div>

                </div>
                    <!-- /.container -->

            </div>
                <!-- /.banner -->

            <footer>
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12">
                            <ul class="list-inline">
                                <li><a href="#home">Home</a>
                                </li>
                                <li class="footer-menu-divider">&sdot;</li>
                                <li><a href="#about">About</a>
                                </li>

                            </ul>
                            <p class="copyright text-muted small">Copyright &copy; The Civil Servant 2013. All Rights Reserved</p>
                        </div>
                    </div>
                </div>
            </footer>


             <!-- /#wrapper -->

        <script src=""""),_display_(Seq[Any](/*210.23*/routes/*210.29*/.Application.jsRoutes)),format.raw/*210.50*/("""" defer="defer"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.0/jquery.min.js"></script>
        <script src=""""),_display_(Seq[Any](/*212.23*/routes/*212.29*/.Assets.at("js/bootstrap.js"))),format.raw/*212.58*/(""""></script>


        """),_display_(Seq[Any](/*215.10*/scripts)),format.raw/*215.17*/("""


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
                    SOURCE: W:/Pre School/app/views/template_landing_page.scala.html
                    HASH: 18975a7d3a978ef3cfe3997f480c4cf0acbd3270
                    MATRIX: 817->1|1105->89|1135->200|1202->232|1216->238|1244->245|1311->277|1337->282|1773->682|1788->688|1841->719|1919->761|1934->767|1989->800|2067->842|2082->848|2130->874|2208->916|2223->922|2291->968|2396->1037|2423->1042|2470->1053|2502->1063|5336->3904|5384->3951|5437->3996|5492->4057|5551->4126|5610->4188|5669->4275|5732->4336|5792->4603|5847->4639|5902->4716|5962->4837|6017->4873|6068->4905|6117->4935|6168->4981|6213->5007|6260->5057|6305->5108|6354->5155|6407->5200|6462->5292|6521->5361|6580->5423|6639->5502|6702->5561|6762->5860|6817->5896|6872->5972|6932->6093|6987->6129|7038->6161|7087->6191|7138->6237|7183->6263|7230->6313|7275->6364|7324->6411|7377->6456|7432->6517|7491->6586|7550->6648|7609->6730|7672->6795|7732->7071|7787->7107|7842->7184|7902->7308|7957->7344|8008->7376|8057->7406|8108->7452|8153->7478|8200->7528|10117->9408|10133->9414|10177->9435|10356->9577|10372->9583|10424->9612|10487->9638|10517->9645
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->9|38->9|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|58->29|58->29|59->30|59->30|125->96|127->98|129->100|130->101|131->102|132->103|133->104|134->105|135->106|136->107|137->108|138->109|139->110|140->111|142->113|143->114|145->116|146->117|148->119|150->121|152->123|153->124|154->125|155->126|156->127|157->128|158->129|159->130|160->131|161->132|162->133|163->134|165->136|166->137|168->139|169->140|171->142|173->144|175->146|176->147|177->148|178->149|179->150|180->151|181->152|182->153|183->154|184->155|185->156|186->157|188->159|189->160|191->162|192->163|239->210|239->210|239->210|241->212|241->212|241->212|244->215|244->215
                    -- GENERATED --
                */
            