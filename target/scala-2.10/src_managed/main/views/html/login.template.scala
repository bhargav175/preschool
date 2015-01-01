
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[_]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.22*/("""

"""),_display_(Seq[Any](/*5.2*/main("login")/*5.15*/{_display_(Seq[Any](format.raw/*5.16*/("""

                        """),format.raw/*7.61*/("""
                        """),_display_(Seq[Any](/*8.26*/helper/*8.32*/.form(routes.Application.doLogin)/*8.65*/ {_display_(Seq[Any](format.raw/*8.67*/("""

                            """),_display_(Seq[Any](/*10.30*/if(loginForm.hasGlobalErrors)/*10.59*/ {_display_(Seq[Any](format.raw/*10.61*/("""
                                <p class="error">
                                    <span class="label label-important">"""),_display_(Seq[Any](/*12.74*/loginForm/*12.83*/.globalError.message)),format.raw/*12.103*/("""</span>
                                </p>
                            """)))})),format.raw/*14.30*/("""

                            """),_display_(Seq[Any](/*16.30*/inputText(
                                loginForm("email"),
                                'class -> "form-control",
                                '_label -> "",
                                '_showConstraints -> false,
                                'placeholder -> "Email Address"
                            ))),format.raw/*22.30*/("""

                            """),_display_(Seq[Any](/*24.30*/inputPassword(
                                loginForm("password"),
                                '_showConstraints -> false,
                                '_label -> "",
                                'class -> "form-control",
                                'placeholder -> "Password"


                            ))),format.raw/*32.30*/("""

                            <div class="clearfix">
                                <input type="submit" value=""""),_display_(Seq[Any](/*35.62*/Messages("playauthenticate.login.now"))),format.raw/*35.100*/("""" class=" btn btn-primary" style="margin-top:15px"> <br/>
                            </div>
                            <br/>


                        """)))})),format.raw/*40.26*/("""


""")))})))}
    }
    
    def render(loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jan 02 03:08:03 IST 2015
                    SOURCE: W:/Pre School/app/views/login.scala.html
                    HASH: 0e55ed84bb24771a67ba5b7f895554c87b35cb69
                    MATRIX: 848->1|1014->21|1053->79|1074->92|1112->93|1167->157|1229->184|1243->190|1284->223|1323->225|1392->258|1430->287|1470->289|1632->415|1650->424|1693->444|1801->520|1870->553|2219->880|2288->913|2643->1246|2796->1363|2857->1401|3048->1560
                    LINES: 28->1|34->1|36->5|36->5|36->5|38->7|39->8|39->8|39->8|39->8|41->10|41->10|41->10|43->12|43->12|43->12|45->14|47->16|53->22|55->24|63->32|66->35|66->35|71->40
                    -- GENERATED --
                */
            