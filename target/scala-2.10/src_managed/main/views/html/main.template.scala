
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._

import be.objectify.deadbolt.core.utils.TemplateUtils._


Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*5.1*/("""
<!DOCTYPE html>
<html lang=""""),_display_(Seq[Any](/*7.14*/lang()/*7.20*/.code())),format.raw/*7.27*/("""">
  <head>
    <title>"""),_display_(Seq[Any](/*9.13*/title)),format.raw/*9.18*/("""</title>
    
    <!-- Le meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
    <meta name="author" content="The Play Authenticate Team">
    
    <!-- Le scripts -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src=""""),_display_(Seq[Any](/*19.16*/routes/*19.22*/.Assets.at("js/bootstrap.js"))),format.raw/*19.51*/(""""></script>
	<script src=""""),_display_(Seq[Any](/*20.16*/routes/*20.22*/.Application.jsRoutes)),format.raw/*20.43*/("""" defer="defer"></script>
	
    <!-- Le styles -->
    <link href=""""),_display_(Seq[Any](/*23.18*/routes/*23.24*/.Assets.at("stylesheets/main.min.css"))),format.raw/*23.62*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*24.18*/routes/*24.24*/.Assets.at("css/bootstrap.css"))),format.raw/*24.55*/("""" rel="stylesheet">
    <link href=""""),_display_(Seq[Any](/*25.18*/routes/*25.24*/.Assets.at("css/animate.min.css"))),format.raw/*25.57*/("""" rel="stylesheet">
      <link href=""""),_display_(Seq[Any](/*26.20*/routes/*26.26*/.Assets.at("css/temp.css"))),format.raw/*26.52*/("""" rel="stylesheet">



      <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

  <body>
      <div class="navbar navbar-inverse navbar-fixed-top">
          <div class="container">
              <div class="navbar-header">
                  <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                      <span class="sr-only">Toggle navigation</span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                      <span class="icon-bar"></span>
                  </button>
                  <a class="navbar-brand" href=""""),_display_(Seq[Any](/*47.50*/routes/*47.56*/.Application.index())),format.raw/*47.76*/("""">Play! Authenticate</a>

              </div>

              <div class="navbar-collapse collapse">
                  <form class="navbar-form navbar-right">
                      <div class="btn-group ">
                      """),_display_(Seq[Any](/*54.24*/subjectPresentOr()/*54.42*/ {_display_(Seq[Any](format.raw/*54.44*/("""
                          """),_display_(Seq[Any](/*55.28*/defining(Application.getLocalUser(session()))/*55.73*/ { user =>_display_(Seq[Any](format.raw/*55.83*/("""
                              <a class="btn btn-default dropdown-toggle" data-toggle="dropdown" href="#">
                                  <i class="icon-user"></i> """),_display_(Seq[Any](/*57.62*/user/*57.66*/.name)),format.raw/*57.71*/("""
                              <span class="caret"></span>
                              </a>
                              <ul class="dropdown-menu">
                                  <li><a href=""""),_display_(Seq[Any](/*61.49*/routes/*61.55*/.Application.profile(user.name))),format.raw/*61.86*/("""">"""),_display_(Seq[Any](/*61.89*/Messages("playauthenticate.navigation.user_account"))),format.raw/*61.141*/("""</a></li>
                                  <li><a href=""""),_display_(Seq[Any](/*62.49*/routes/*62.55*/.Account.link())),format.raw/*62.70*/("""">"""),_display_(Seq[Any](/*62.73*/Messages("playauthenticate.navigation.link_more"))),format.raw/*62.122*/("""</a></li>
                                  <li class="divider"></li>
                                  <li><a href=""""),_display_(Seq[Any](/*64.49*/com/*64.52*/.feth.play.module.pa.controllers.routes.Authenticate.logout())),format.raw/*64.113*/(""""><i class="icon-off"></i> """),_display_(Seq[Any](/*64.141*/Messages("playauthenticate.navigation.logout"))),format.raw/*64.187*/("""</a></li>
                              </ul>
                          """)))})),format.raw/*66.28*/("""
                      """)))}/*67.24*/{_display_(Seq[Any](format.raw/*67.25*/("""
                          <a href=""""),_display_(Seq[Any](/*68.37*/routes/*68.43*/.Application.login())),format.raw/*68.63*/("""" class="btn btn-primary btn-mini """),_display_(Seq[Any](/*68.98*/("disabled".when(nav == "login")))),format.raw/*68.131*/("""">"""),_display_(Seq[Any](/*68.134*/Messages("playauthenticate.navigation.login"))),format.raw/*68.179*/("""</a>
                      """)))})),format.raw/*69.24*/("""
                  </form>
              </div>


              <ul class="nav navbar-nav">
                  <li class=""""),_display_(Seq[Any](/*75.31*/("active".when(nav == "home")))),format.raw/*75.61*/(""""><a href=""""),_display_(Seq[Any](/*75.73*/routes/*75.79*/.Application.index())),format.raw/*75.99*/("""">"""),_display_(Seq[Any](/*75.102*/Messages("playauthenticate.navigation.home"))),format.raw/*75.146*/("""</a></li>

                  """),_display_(Seq[Any](/*77.20*/subjectNotPresent()/*77.39*/ {_display_(Seq[Any](format.raw/*77.41*/("""
                      <li class=""""),_display_(Seq[Any](/*78.35*/("active".when(nav == "signup")))),format.raw/*78.67*/(""""><a href=""""),_display_(Seq[Any](/*78.79*/routes/*78.85*/.Application.signup())),format.raw/*78.106*/("""">"""),_display_(Seq[Any](/*78.109*/Messages("playauthenticate.navigation.signup"))),format.raw/*78.155*/("""</a></li>
                  """)))})),format.raw/*79.20*/("""
              </ul>

          </div>
      </div>
      </div>

    <div class="container" >
	    """),_display_(Seq[Any](/*87.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*87.54*/ {_display_(Seq[Any](format.raw/*87.56*/("""
	      <div class="alert alert-error">
	      	"""),_display_(Seq[Any](/*89.10*/flash()/*89.17*/.get(Application.FLASH_ERROR_KEY))),format.raw/*89.50*/("""
	      </div>
	    """)))})),format.raw/*91.7*/("""
	    """),_display_(Seq[Any](/*92.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*92.56*/ {_display_(Seq[Any](format.raw/*92.58*/("""
	      <div class="alert alert-success">
	      	"""),_display_(Seq[Any](/*94.10*/flash()/*94.17*/.get(Application.FLASH_MESSAGE_KEY))),format.raw/*94.52*/("""
	      </div>
	    """)))})),format.raw/*96.7*/("""
        <div class="animated fadeInUp">
		"""),_display_(Seq[Any](/*98.4*/content)),format.raw/*98.11*/("""
        </div>
		
    <hr>

      <footer>
        <p>&copy; 2012-2013 Play! Authenticate. Licensed under Apache License, Version 2.0. View details <a href="https://github.com/joscha/play-authenticate/blob/master/LICENSE">here</a>.</p>
        <p>
        <small>Styles by <a href="http://twitter.github.com/bootstrap/index.html" target="_blank">Twitter Bootstrap</a> &middot; Provider icons by <a href="https://github.com/paulrobertlloyd/socialmediaicons/" target="_blank">Paul Robert Lloyd</a></small></p>
      </footer>
    </div> <!-- /container -->

  </body>
</html>
"""))}
    }
    
    def render(title:String,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:22 IST 2014
                    SOURCE: W:/Pre School/app/views/main.scala.html
                    HASH: cd282de411eaef9d1c45bedaec37d5a47c95e94e
                    MATRIX: 785->1|1033->49|1063->160|1130->192|1144->198|1172->205|1233->231|1259->236|1745->686|1760->692|1811->721|1875->749|1890->755|1933->776|2040->847|2055->853|2115->891|2189->929|2204->935|2257->966|2331->1004|2346->1010|2401->1043|2477->1083|2492->1089|2540->1115|3384->1923|3399->1929|3441->1949|3713->2185|3740->2203|3780->2205|3845->2234|3899->2279|3947->2289|4153->2459|4166->2463|4193->2468|4432->2671|4447->2677|4500->2708|4539->2711|4614->2763|4709->2822|4724->2828|4761->2843|4800->2846|4872->2895|5028->3015|5040->3018|5124->3079|5189->3107|5258->3153|5365->3228|5409->3253|5448->3254|5522->3292|5537->3298|5579->3318|5650->3353|5706->3386|5746->3389|5814->3434|5875->3463|6039->3591|6091->3621|6139->3633|6154->3639|6196->3659|6236->3662|6303->3706|6371->3738|6399->3757|6439->3759|6511->3795|6565->3827|6613->3839|6628->3845|6672->3866|6712->3869|6781->3915|6843->3945|6987->4054|7043->4101|7083->4103|7170->4154|7186->4161|7241->4194|7295->4217|7338->4225|7396->4274|7436->4276|7525->4329|7541->4336|7598->4371|7652->4394|7733->4440|7762->4447
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|38->9|38->9|48->19|48->19|48->19|49->20|49->20|49->20|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|55->26|55->26|55->26|76->47|76->47|76->47|83->54|83->54|83->54|84->55|84->55|84->55|86->57|86->57|86->57|90->61|90->61|90->61|90->61|90->61|91->62|91->62|91->62|91->62|91->62|93->64|93->64|93->64|93->64|93->64|95->66|96->67|96->67|97->68|97->68|97->68|97->68|97->68|97->68|97->68|98->69|104->75|104->75|104->75|104->75|104->75|104->75|104->75|106->77|106->77|106->77|107->78|107->78|107->78|107->78|107->78|107->78|107->78|108->79|116->87|116->87|116->87|118->89|118->89|118->89|120->91|121->92|121->92|121->92|123->94|123->94|123->94|125->96|127->98|127->98
                    -- GENERATED --
                */
            