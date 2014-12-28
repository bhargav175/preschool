
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
object admin_profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[String,String,Html,Html,Html,Html,play.api.templates.HtmlFormat.Appendable] {

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
            <!-- Le scripts -->

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

        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(Seq[Any](/*52.52*/routes/*52.58*/.Application.index())),format.raw/*52.78*/("""">Play! Authenticate</a>

                </div>

                <div class="navbar-collapse collapse">
                    <form class="navbar-form navbar-right">
                        <div class="btn-group ">
                        """),_display_(Seq[Any](/*59.26*/subjectPresentOr()/*59.44*/ {_display_(Seq[Any](format.raw/*59.46*/("""
                            """),_display_(Seq[Any](/*60.30*/defining(Application.getLocalUser(session()))/*60.75*/ { user =>_display_(Seq[Any](format.raw/*60.85*/("""
                                <a class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#">
                                    <i class="icon-user"></i> """),_display_(Seq[Any](/*62.64*/user/*62.68*/.name)),format.raw/*62.73*/("""
                                <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a href=""""),_display_(Seq[Any](/*66.51*/routes/*66.57*/.Application.profile(user.name))),format.raw/*66.88*/("""">"""),_display_(Seq[Any](/*66.91*/Messages("playauthenticate.navigation.user_account"))),format.raw/*66.143*/("""</a></li>
                                    <li><a href=""""),_display_(Seq[Any](/*67.51*/routes/*67.57*/.Account.link())),format.raw/*67.72*/("""">"""),_display_(Seq[Any](/*67.75*/Messages("playauthenticate.navigation.link_more"))),format.raw/*67.124*/("""</a></li>
                                    <li class="divider"></li>
                                    <li><a href=""""),_display_(Seq[Any](/*69.51*/com/*69.54*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*69.115*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*69.143*/Messages("playauthenticate.navigation.logout"))),format.raw/*69.189*/("""</a></li>
                                </ul>
                            """)))})),format.raw/*71.30*/("""
                        """)))}/*72.26*/{_display_(Seq[Any](format.raw/*72.27*/("""
                            <a href=""""),_display_(Seq[Any](/*73.39*/routes/*73.45*/.Application.login())),format.raw/*73.65*/("""" class="btn btn-primary btn-mini """),_display_(Seq[Any](/*73.100*/("disabled".when(nav == "login")))),format.raw/*73.133*/("""">"""),_display_(Seq[Any](/*73.136*/Messages("playauthenticate.navigation.login"))),format.raw/*73.181*/("""</a>
                        """)))})),format.raw/*74.26*/("""
                    </form>
                </div>


                <ul class="nav navbar-nav">
                    <li class=""""),_display_(Seq[Any](/*80.33*/("active".when(nav == "home")))),format.raw/*80.63*/(""""><a href=""""),_display_(Seq[Any](/*80.75*/routes/*80.81*/.Application.index())),format.raw/*80.101*/("""">"""),_display_(Seq[Any](/*80.104*/Messages("playauthenticate.navigation.home"))),format.raw/*80.148*/("""</a></li>

                    """),_display_(Seq[Any](/*82.22*/subjectNotPresent()/*82.41*/ {_display_(Seq[Any](format.raw/*82.43*/("""
                        <li class=""""),_display_(Seq[Any](/*83.37*/("active".when(nav == "signup")))),format.raw/*83.69*/(""""><a href=""""),_display_(Seq[Any](/*83.81*/routes/*83.87*/.Application.signup())),format.raw/*83.108*/("""">"""),_display_(Seq[Any](/*83.111*/Messages("playauthenticate.navigation.signup"))),format.raw/*83.157*/("""</a></li>
                    """)))})),format.raw/*84.22*/("""
                </ul>

            </div>
        </div>
        </div>

        <div class="container-fluid" >
            """),_display_(Seq[Any](/*92.14*/if(flash.contains(Application.FLASH_ERROR_KEY))/*92.61*/ {_display_(Seq[Any](format.raw/*92.63*/("""
                <div class="alert alert-error">
                """),_display_(Seq[Any](/*94.18*/flash()/*94.25*/.get(Application.FLASH_ERROR_KEY))),format.raw/*94.58*/("""
                </div>
            """)))})),format.raw/*96.14*/("""
            """),_display_(Seq[Any](/*97.14*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*97.63*/ {_display_(Seq[Any](format.raw/*97.65*/("""
                <div class="alert alert-success">
                """),_display_(Seq[Any](/*99.18*/flash()/*99.25*/.get(Application.FLASH_MESSAGE_KEY))),format.raw/*99.60*/("""
                </div>
            """)))})),format.raw/*101.14*/("""
            <div class="wrapper">
                <div class="col-md-3  animated fadeInLeft">
                    <div class="sidebar">
                        <div class="container-fluid">
                        </div>
                    </div>

                </div>

                <div class="col-md-9 animated fadeInUp">
                    <div class="main-content">
                        <div class="container-fluid">

                        """),_display_(Seq[Any](/*115.26*/content)),format.raw/*115.33*/("""
                        </div>

                    </div>


                </div>


            </div>
            <hr>

            <footer>
                <p>&copy; 2012-2013 Play! Authenticate. Licensed under Apache License, Version 2.0. View details <a href="https://github.com/joscha/play-authenticate/blob/master/LICENSE">here</a>.</p>
                <p>
                    <small>Styles by <a href="http://twitter.github.com/bootstrap/index.html" target="_blank">Twitter Bootstrap</a> &middot; Provider icons by <a href="https://github.com/paulrobertlloyd/socialmediaicons/" target="_blank">Paul Robert Lloyd</a></small></p>
            </footer>
        </div> <!-- /container -->

        """),_display_(Seq[Any](/*134.10*/scripts)),format.raw/*134.17*/("""
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
                    DATE: Sun Dec 28 16:26:41 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_profile.scala.html
                    HASH: aaa7152c0951c22cad9c1bff2bb907dc7f72b3bb
                    MATRIX: 815->1|1101->89|1129->196|1194->226|1208->232|1236->239|1301->269|1327->274|1751->662|1766->668|1826->706|1903->747|1918->753|1971->784|2048->825|2063->831|2118->864|2195->905|2210->911|2258->937|2369->1012|2384->1018|2427->1039|2603->1179|2618->1185|2669->1214|2726->1235|2753->1240|2799->1250|2831->1260|3679->2072|3694->2078|3736->2098|4011->2337|4038->2355|4078->2357|4144->2387|4198->2432|4246->2442|4454->2614|4467->2618|4494->2623|4737->2830|4752->2836|4805->2867|4844->2870|4919->2922|5015->2982|5030->2988|5067->3003|5106->3006|5178->3055|5336->3177|5348->3180|5432->3241|5497->3269|5566->3315|5675->3392|5720->3418|5759->3419|5834->3458|5849->3464|5891->3484|5963->3519|6019->3552|6059->3555|6127->3600|6189->3630|6355->3760|6407->3790|6455->3802|6470->3808|6513->3828|6553->3831|6620->3875|6688->3907|6716->3926|6756->3928|6829->3965|6883->3997|6931->4009|6946->4015|6990->4036|7030->4039|7099->4085|7162->4116|7324->4242|7380->4289|7420->4291|7522->4357|7538->4364|7593->4397|7662->4434|7712->4448|7770->4497|7810->4499|7914->4567|7930->4574|7987->4609|8057->4646|8552->5104|8582->5111|9324->5816|9354->5823
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->9|38->9|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|56->27|56->27|56->27|58->29|58->29|58->29|59->30|59->30|60->31|60->31|81->52|81->52|81->52|88->59|88->59|88->59|89->60|89->60|89->60|91->62|91->62|91->62|95->66|95->66|95->66|95->66|95->66|96->67|96->67|96->67|96->67|96->67|98->69|98->69|98->69|98->69|98->69|100->71|101->72|101->72|102->73|102->73|102->73|102->73|102->73|102->73|102->73|103->74|109->80|109->80|109->80|109->80|109->80|109->80|109->80|111->82|111->82|111->82|112->83|112->83|112->83|112->83|112->83|112->83|112->83|113->84|121->92|121->92|121->92|123->94|123->94|123->94|125->96|126->97|126->97|126->97|128->99|128->99|128->99|130->101|144->115|144->115|163->134|163->134
                    -- GENERATED --
                */
            