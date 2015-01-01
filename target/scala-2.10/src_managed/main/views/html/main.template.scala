
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



        <div class="container">
                        <!-- Example row of columns -->
                    <div class="row">
                        <div class="col-md-4">
                            <h2>Heading</h2>
                            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div>
                        <div class="col-md-4">
                            <h2>Heading</h2>
                            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div>
                        <div class="col-md-4">
                            <h2>Heading</h2>
                            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                        </div>
                    </div>

                    <hr>

                    <footer>
                        <p>&copy; Company 2014</p>
                    </footer>
                </div> <!-- /container -->


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
                    DATE: Fri Jan 02 04:02:07 IST 2015
                    SOURCE: W:/Pre School/app/views/main.scala.html
                    HASH: be751fb74755c013b6a853ac2f9e3cbf9acd00dc
                    MATRIX: 778->1|1006->31|1034->138|1122->190|1149->195|1252->262|1267->268|1321->300|1398->341|1413->347|1470->382|1531->407|1546->413|1614->459|1707->516|1722->522|1786->564|3244->1986|3271->2004|3310->2005|3431->2107|3470->2108|3683->2289|3999->2569|4028->2576
                    LINES: 26->1|32->1|34->5|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|70->41|70->41|70->41|74->45|74->45|78->49|89->60|89->60
                    -- GENERATED --
                */
            