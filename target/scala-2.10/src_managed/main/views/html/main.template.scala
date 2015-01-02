
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
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/jquery-1.11.1.min.js"))),format.raw/*13.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*14.71*/("""" type="text/javascript"></script>


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

                                """),_display_(Seq[Any](/*41.34*/subjectPresentOr()/*41.52*/{_display_(Seq[Any](format.raw/*41.53*/("""


                                <li><a href="/logout">Logout</a></li>
                            """)))}/*45.30*/{_display_(Seq[Any](format.raw/*45.31*/("""
                                    <li><a href="/login">Login</a></li>
                                    <li><a href="/signup">Signup</a></li>

                                """)))})),format.raw/*49.34*/("""
                            </ul>

                        </div><!--/.navbar-collapse -->
                    </div>
                </nav>

                    <!-- Main jumbotron for a primary marketing message or call to action -->


        <div class="container">
        """),_display_(Seq[Any](/*60.10*/content)),format.raw/*60.17*/("""
        </div>



        <div class="container">
            <div class="divider" style="clear:both;padding-bottom:56px;border-bottom:1px solid #888">

            </div>

        </div>



        """),format.raw/*74.36*/("""
                        """),format.raw/*75.60*/("""
                    """),format.raw/*76.42*/("""
                        """),format.raw/*77.51*/("""
                            """),format.raw/*78.49*/("""
                            """),format.raw/*79.272*/("""
                            """),format.raw/*80.114*/("""
                        """),format.raw/*81.35*/("""
                        """),format.raw/*82.51*/("""
                            """),format.raw/*83.49*/("""
                            """),format.raw/*84.272*/("""
                            """),format.raw/*85.114*/("""
                        """),format.raw/*86.35*/("""
                        """),format.raw/*87.51*/("""
                            """),format.raw/*88.49*/("""
                            """),format.raw/*89.283*/("""
                            """),format.raw/*90.114*/("""
                        """),format.raw/*91.35*/("""
                    """),format.raw/*92.31*/("""

                    """),format.raw/*94.29*/("""

                    """),format.raw/*96.33*/("""
                        """),format.raw/*97.55*/("""
                    """),format.raw/*98.34*/("""
                """),format.raw/*99.47*/("""


                <!-- Bootstrap core JavaScript
    ================================================== -->
                <!-- Placed at the end of the document so the pages load faster -->
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
                <script src="../../dist/js/bootstrap.min.js"></script>
                    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
                <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>



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
                    DATE: Fri Jan 02 09:33:06 IST 2015
                    SOURCE: W:/Pre School/app/views/main.scala.html
                    HASH: f285013d8712f6ae268205d1748a568cac0d3299
                    MATRIX: 778->1|1006->31|1034->138|1122->190|1149->195|1252->262|1267->268|1321->300|1398->341|1413->347|1470->382|1531->407|1546->413|1614->459|1707->516|1722->522|1786->564|3244->1986|3271->2004|3310->2005|3431->2107|3470->2108|3683->2289|3999->2569|4028->2576|4256->2803|4309->2863|4358->2905|4411->2956|4468->3005|4526->3277|4584->3391|4637->3426|4690->3477|4747->3526|4805->3798|4863->3912|4916->3947|4969->3998|5026->4047|5084->4330|5142->4444|5195->4479|5244->4510|5294->4540|5344->4574|5397->4629|5446->4663|5491->4710
                    LINES: 26->1|32->1|34->5|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|70->41|70->41|70->41|74->45|74->45|78->49|89->60|89->60|103->74|104->75|105->76|106->77|107->78|108->79|109->80|110->81|111->82|112->83|113->84|114->85|115->86|116->87|117->88|118->89|119->90|120->91|121->92|123->94|125->96|126->97|127->98|128->99
                    -- GENERATED --
                */
            