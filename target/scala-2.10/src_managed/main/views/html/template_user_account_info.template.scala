
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
object template_user_account_info extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

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

    <body class="body-with-padding" style="background:#3FC380">



        <div class="container">
        """),_display_(Seq[Any](/*45.10*/content)),format.raw/*45.17*/("""
        </div>

        <script src=""""),_display_(Seq[Any](/*48.23*/routes/*48.29*/.Application.jsRoutes)),format.raw/*48.50*/("""" defer="defer"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.0/jquery.min.js"></script>
        <script src=""""),_display_(Seq[Any](/*50.23*/routes/*50.29*/.Assets.at("js/bootstrap.js"))),format.raw/*50.58*/(""""></script>


        """),_display_(Seq[Any](/*53.10*/scripts)),format.raw/*53.17*/("""


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
                    SOURCE: W:/Pre School/app/views/template_user_account_info.scala.html
                    HASH: 46ad4311efc0ef313d3d2fbbb27494a33ed49ee4
                    MATRIX: 822->1|1108->89|1136->196|1201->226|1215->232|1243->239|1308->269|1334->274|1758->662|1773->668|1826->699|1903->740|1918->746|1973->779|2050->820|2065->826|2113->852|2190->893|2205->899|2273->945|2373->1009|2400->1014|2446->1024|2478->1034|2839->1359|2868->1366|2943->1405|2958->1411|3001->1432|3177->1572|3192->1578|3243->1607|3302->1630|3331->1637
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->9|38->9|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|58->29|58->29|59->30|59->30|74->45|74->45|77->48|77->48|77->48|79->50|79->50|79->50|82->53|82->53
                    -- GENERATED --
                */
            