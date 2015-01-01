
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
	"""),_display_(Seq[Any](/*4.3*/main("link")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""

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
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/password_change.scala.html
                    HASH: dd9763b6fbb30a455ba0247dabf69c5c0750038c
                    MATRIX: 826->1|1005->55|1033->89|1071->93|1091->105|1130->107|1174->117|1245->167|1294->182|1339->219|1378->221|1429->237|1468->267|1508->269|1621->346|1640->356|1682->376|1742->405|1786->414|1836->442|1918->488|1988->536|2050->567
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|36->8|36->8|36->8|38->10|38->10|38->10|40->12|40->12|40->12|42->14|44->16|44->16|46->18|46->18|47->19
                    -- GENERATED --
                */
            