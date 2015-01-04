
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*5.1*/("""
<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*10.17*/title)),format.raw/*10.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <link rel="stylesheet" href=""""),_display_(Seq[Any](/*12.39*/routes/*12.45*/.Assets.at("css/bootstrap.min.css"))),format.raw/*12.80*/("""">


    </head>
    <body>


                <nav class="navbar navbar-inverse navbar-static-top">
                    <div class="container">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="/">Project name</a>
                        </div>
                        <div id="navbar" class="navbar-collapse collapse">
                            <ul class="nav navbar-nav">
                                <li><a href="/about">About</a></li>
                                <li><a href="/contact">Contact</a></li>
                                <li><a href="/enquiry">Enquiry</a></li>
                                <li><a href="/franchise">Franchise</a></li>
                                <li><a href="/career">Career</a></li>
                                <li><a href="/weeklyreport">Weekly Report</a></li>
                                <li><a href="/gallery">Gallery</a></li>

                                """),_display_(Seq[Any](/*40.34*/subjectPresentOr()/*40.52*/{_display_(Seq[Any](format.raw/*40.53*/("""


                                <li><a href="/logout">Logout</a></li>
                            """)))}/*44.30*/{_display_(Seq[Any](format.raw/*44.31*/("""
                                    <li><a href="/login">Login</a></li>
                                    <li><a href="/signup">Signup</a></li>

                                """)))})),format.raw/*48.34*/("""



                            </ul>

                            <ul class="nav navbar-nav navbar-right">

                            """),_display_(Seq[Any](/*56.30*/subjectPresentOr()/*56.48*/{_display_(Seq[Any](format.raw/*56.49*/("""


                                <li><a href="/account">Profile</a></li>
                            """)))}/*60.30*/{_display_(Seq[Any](format.raw/*60.31*/("""


                            """)))})),format.raw/*63.30*/("""

                            </ul>
                        </div><!--/.navbar-collapse -->
                    </div>
                </nav>

                    <!-- Main jumbotron for a primary marketing message or call to action -->


        <div class="container">
        """),_display_(Seq[Any](/*74.10*/content)),format.raw/*74.17*/("""
        </div>



        <div class="container">
            <div class="divider" style="clear:both;padding-bottom:56px;border-bottom:1px solid transparent">

            </div>

        </div>



        """),format.raw/*88.36*/("""
                        """),format.raw/*89.60*/("""
                    """),format.raw/*90.42*/("""
                        """),format.raw/*91.51*/("""
                            """),format.raw/*92.49*/("""
                            """),format.raw/*93.272*/("""
                            """),format.raw/*94.114*/("""
                        """),format.raw/*95.35*/("""
                        """),format.raw/*96.51*/("""
                            """),format.raw/*97.49*/("""
                            """),format.raw/*98.272*/("""
                            """),format.raw/*99.114*/("""
                        """),format.raw/*100.35*/("""
                        """),format.raw/*101.51*/("""
                            """),format.raw/*102.49*/("""
                            """),format.raw/*103.283*/("""
                            """),format.raw/*104.114*/("""
                        """),format.raw/*105.35*/("""
                    """),format.raw/*106.31*/("""

                    """),format.raw/*108.29*/("""

                    """),format.raw/*110.33*/("""
                        """),format.raw/*111.55*/("""
                    """),format.raw/*112.34*/("""
                """),format.raw/*113.47*/("""


                <!-- Bootstrap core JavaScript
    ================================================== -->
                <!-- Placed at the end of the document so the pages load faster -->
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src=""""),_display_(Seq[Any](/*120.23*/routes/*120.29*/.Assets.at("javascripts/jquery-1.11.1.min.js"))),format.raw/*120.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*121.23*/routes/*121.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*121.71*/("""" type="text/javascript"></script>
                    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->



    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 04 12:56:25 IST 2015
                    SOURCE: W:/Pre School/app/views/main.scala.html
                    HASH: 506d35b70632836d4c20e97fa543be6397863a80
                    MATRIX: 778->1|1006->31|1034->138|1122->190|1149->195|1252->262|1267->268|1321->300|1398->341|1413->347|1470->382|2968->1844|2995->1862|3034->1863|3155->1965|3194->1966|3407->2147|3581->2285|3608->2303|3647->2304|3770->2408|3809->2409|3873->2441|4189->2721|4218->2728|4453->2962|4506->3022|4555->3064|4608->3115|4665->3164|4723->3436|4781->3550|4834->3585|4887->3636|4944->3685|5002->3957|5060->4071|5114->4106|5168->4157|5226->4206|5285->4489|5344->4603|5398->4638|5448->4669|5499->4699|5550->4733|5604->4788|5654->4822|5700->4869|6058->5190|6074->5196|6143->5242|6237->5299|6253->5305|6318->5347
                    LINES: 26->1|32->1|34->5|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|69->40|69->40|69->40|73->44|73->44|77->48|85->56|85->56|85->56|89->60|89->60|92->63|103->74|103->74|117->88|118->89|119->90|120->91|121->92|122->93|123->94|124->95|125->96|126->97|127->98|128->99|129->100|130->101|131->102|132->103|133->104|134->105|135->106|137->108|139->110|140->111|141->112|142->113|149->120|149->120|149->120|150->121|150->121|150->121
                    -- GENERATED --
                */
            