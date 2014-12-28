
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
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[_]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.6*/scripts/*6.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.17*/("""

    """)))};def /*9.6*/scriptsTop/*9.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.20*/("""

    """)))};def /*12.6*/links/*12.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.15*/("""

        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

    """)))};
Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*4.1*/("""

    """),format.raw/*8.6*/("""
    """),format.raw/*11.6*/("""
    """),format.raw/*16.6*/("""
    """),_display_(Seq[Any](/*17.6*/template_user_account_info(Messages("playauthenticate.signup.title"), "signup", scriptsTop, scripts, links)/*17.113*/ {_display_(Seq[Any](format.raw/*17.115*/("""



        <div class="uauth col-md-offset-2 col-md-8">
            <div class="modal-content animated fadeInLeft">
                <div class="modal-header">
                    <div class="col-md-12">
                        <h3><a href="home">GyanPub</a></h3>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>



            <div class="modal-content animated fadeInRight">
                <div id="signup" >

                    <div class="modal-body" style="overflow : hidden">

                        <div class="container-fluid modal-body-container">
                            <div class="col-md-8">
                                <legend>Sign Up</legend>
                                """),format.raw/*41.69*/("""
                                """),_display_(Seq[Any](/*42.34*/helper/*42.40*/.form(routes.Application.doSignup)/*42.74*/ {_display_(Seq[Any](format.raw/*42.76*/("""

                                    """),_display_(Seq[Any](/*44.38*/if(signupForm.hasGlobalErrors)/*44.68*/ {_display_(Seq[Any](format.raw/*44.70*/("""
                                        <p class="error">
                                            <span class="label label-important">"""),_display_(Seq[Any](/*46.82*/signupForm/*46.92*/.globalError.message)),format.raw/*46.112*/("""</span>
                                        </p>
                                    """)))})),format.raw/*48.38*/("""

                                    """),_display_(Seq[Any](/*50.38*/inputText(
                                        signupForm("name"),
                                        'class -> "form-control",
                                        '_label -> "",
                                        '_showConstraints -> false,
                                        'placeholder -> "Name"
                                    ))),format.raw/*56.38*/("""
                                    """),_display_(Seq[Any](/*57.38*/inputText(
                                        signupForm("email"),
                                        'class -> "form-control",
                                        '_label -> "",
                                        '_showConstraints -> false,
                                        'placeholder -> "Email Address"
                                    ))),format.raw/*63.38*/("""

                                    """),_display_(Seq[Any](/*65.38*/inputPassword(
                                        signupForm("password"),
                                        'class -> "form-control",
                                        '_label -> "",
                                        '_showConstraints -> false,
                                        'placeholder -> "Password"
                                    ))),format.raw/*71.38*/("""

                                    """),_display_(Seq[Any](/*73.38*/inputPassword(
                                        signupForm("repeatPassword"),
                                        'class -> "form-control",
                                        '_label -> "",
                                        '_showConstraints -> false,
                                        'placeholder -> "Repeat Password",
                                        '_error -> signupForm.error("password")
                                    ))),format.raw/*80.38*/("""

                                    <div class="clearfix">
                                        <input type="submit" value="Get Started!" class=" btn btn-success btn-lg" style="margin-top:15px"> <br/>
                                    </div>
                                    <br/>


                                """)))})),format.raw/*88.34*/("""
                            </div>
                            <div class="col-md-4">

                                <legend>Sign Up With</legend>
                                """),format.raw/*93.74*/("""
                                """),_display_(Seq[Any](/*94.34*/_providerPartial(skipCurrent = false))),format.raw/*94.71*/("""
                            </div>
                        </div>

                    </div>
                </div>
            </div>


        </div>






""")))})))}
    }
    
    def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:22 IST 2014
                    SOURCE: W:/Pre School/app/views/signup.scala.html
                    HASH: 60f482735d45b4f43ac06b17f82ccfc6e8e194ef
                    MATRIX: 849->1|999->86|1014->93|1098->97|1129->113|1147->123|1231->127|1263->143|1277->148|1362->152|1518->22|1546->77|1580->106|1613->136|1646->269|1688->276|1805->383|1846->385|2667->1214|2738->1249|2753->1255|2796->1289|2836->1291|2913->1332|2952->1362|2992->1364|3170->1506|3189->1516|3232->1536|3356->1628|3433->1669|3821->2035|3896->2074|4294->2450|4371->2491|4771->2869|4848->2910|5343->3383|5709->3717|5924->3945|5995->3980|6054->4017
                    LINES: 28->1|33->6|33->6|35->6|37->9|37->9|39->9|41->12|41->12|43->12|48->1|49->4|51->8|52->11|53->16|54->17|54->17|54->17|78->41|79->42|79->42|79->42|79->42|81->44|81->44|81->44|83->46|83->46|83->46|85->48|87->50|93->56|94->57|100->63|102->65|108->71|110->73|117->80|125->88|130->93|131->94|131->94
                    -- GENERATED --
                */
            