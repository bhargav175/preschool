
package views.html.account

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
object password_change extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[controllers.Account.PasswordChange],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(changeForm: Form[controllers.Account.PasswordChange]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.helper.form


Seq[Any](format.raw/*1.56*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/template_user_settings(null)/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""

	<h1>"""),_display_(Seq[Any](/*6.7*/Messages("playauthenticate.change.password.title"))),format.raw/*6.57*/("""</h1>
	<p>
	"""),_display_(Seq[Any](/*8.3*/form(routes.Account.doChangePassword)/*8.40*/ {_display_(Seq[Any](format.raw/*8.42*/("""
	   
       """),_display_(Seq[Any](/*10.9*/if(changeForm.hasGlobalErrors)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/(""" 
        <p class="error">
          <span class="label label-important">"""),_display_(Seq[Any](/*12.48*/changeForm/*12.58*/.globalError.message)),format.raw/*12.78*/("""</span>
     	</p>
       """)))})),format.raw/*14.9*/("""

	   """),_display_(Seq[Any](/*16.6*/_passwordPartial(changeForm))),format.raw/*16.34*/("""
           
		<input type="submit" value=""""),_display_(Seq[Any](/*18.32*/Messages("playauthenticate.change.password.cta"))),format.raw/*18.80*/("""" class="btn btn-primary"> 
	""")))})),format.raw/*19.3*/("""
	</p>
""")))})))}
    }
    
    def render(changeForm:Form[controllers.Account.PasswordChange]): play.api.templates.HtmlFormat.Appendable = apply(changeForm)
    
    def f:((Form[controllers.Account.PasswordChange]) => play.api.templates.HtmlFormat.Appendable) = (changeForm) => apply(changeForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:29 IST 2014
                    SOURCE: W:/Pre School/app/views/account/password_change.scala.html
                    HASH: dbc0baca597c07d7134d67851fe9cfc117c33699
                    MATRIX: 826->1|1005->55|1033->89|1070->92|1106->120|1145->122|1189->132|1260->182|1309->197|1354->234|1393->236|1444->252|1483->282|1523->284|1636->361|1655->371|1697->391|1757->420|1801->429|1851->457|1933->503|2003->551|2065->582
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|40->12|40->12|40->12|42->14|44->16|44->16|46->18|46->18|47->19
                    -- GENERATED --
                */
            