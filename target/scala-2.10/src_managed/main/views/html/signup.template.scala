
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


Seq[Any](format.raw/*1.23*/("""
"""),_display_(Seq[Any](/*4.2*/main("link")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""



                                """),_display_(Seq[Any](/*8.34*/helper/*8.40*/.form(routes.Application.doSignup)/*8.74*/ {_display_(Seq[Any](format.raw/*8.76*/("""

                                    """),_display_(Seq[Any](/*10.38*/if(signupForm.hasGlobalErrors)/*10.68*/ {_display_(Seq[Any](format.raw/*10.70*/("""
                                        <p class="error">
                                            <span class="label label-important">"""),_display_(Seq[Any](/*12.82*/signupForm/*12.92*/.globalError.message)),format.raw/*12.112*/("""</span>
                                        </p>
                                    """)))})),format.raw/*14.38*/("""

                                    """),_display_(Seq[Any](/*16.38*/inputText(
                                        signupForm("name"),
                                        'class -> "form-control",
                                        '_label -> "",
                                        '_showConstraints -> false,
                                        'placeholder -> "Name"
                                    ))),format.raw/*22.38*/("""
                                    """),_display_(Seq[Any](/*23.38*/inputText(
                                        signupForm("email"),
                                        'class -> "form-control",
                                        '_label -> "",
                                        '_showConstraints -> false,
                                        'placeholder -> "Email Address"
                                    ))),format.raw/*29.38*/("""

                                    """),_display_(Seq[Any](/*31.38*/inputPassword(
                                        signupForm("password"),
                                        'class -> "form-control",
                                        '_label -> "",
                                        '_showConstraints -> false,
                                        'placeholder -> "Password"
                                    ))),format.raw/*37.38*/("""

                                    """),_display_(Seq[Any](/*39.38*/inputPassword(
                                        signupForm("repeatPassword"),
                                        'class -> "form-control",
                                        '_label -> "",
                                        '_showConstraints -> false,
                                        'placeholder -> "Repeat Password",
                                        '_error -> signupForm.error("password")
                                    ))),format.raw/*46.38*/("""

                                    <div class="clearfix">
                                        <input type="submit" value="Get Started!" class=" btn btn-success btn-lg" style="margin-top:15px"> <br/>
                                    </div>
                                    <br/>


                                """)))})),format.raw/*54.34*/("""

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
                    DATE: Fri Jan 02 03:08:03 IST 2015
                    SOURCE: W:/Pre School/app/views/signup.scala.html
                    HASH: 35bef454ea47d4c7d6589035c2a2881330f90435
                    MATRIX: 849->1|1016->22|1053->78|1073->90|1112->92|1188->133|1202->139|1244->173|1283->175|1360->216|1399->246|1439->248|1617->390|1636->400|1679->420|1803->512|1880->553|2268->919|2343->958|2741->1334|2818->1375|3218->1753|3295->1794|3790->2267|4156->2601
                    LINES: 28->1|34->1|35->4|35->4|35->4|39->8|39->8|39->8|39->8|41->10|41->10|41->10|43->12|43->12|43->12|45->14|47->16|53->22|54->23|60->29|62->31|68->37|70->39|77->46|85->54
                    -- GENERATED --
                */
            