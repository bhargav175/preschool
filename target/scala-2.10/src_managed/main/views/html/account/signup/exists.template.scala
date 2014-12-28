
package views.html.account.signup

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
object exists extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*4.2*/scripts/*4.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""

""")))};def /*7.2*/scriptsTop/*7.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.16*/("""

""")))};def /*10.2*/links/*10.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.11*/("""

    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

""")))};
Seq[Any](format.raw/*6.2*/("""
"""),format.raw/*9.2*/("""
"""),format.raw/*14.2*/("""
"""),_display_(Seq[Any](/*15.2*/template_user_account_info(Messages("playauthenticate.login.title"), "login", scriptsTop, scripts, links)/*15.107*/ {_display_(Seq[Any](format.raw/*15.109*/("""
    <div class="uauth col-md-offset-2 col-md-8">
        <div class="modal-content animated fadeInLeft">
            <div class="modal-header">
                <div class="col-md-12">
                    <h3><a href="home">The Civil Servant</a></h3>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <div class="modal-content animated fadeInLeft">
            <div class="modal-body" style="overflow : hidden">
                <div class="container-fluid modal-body-container">
	<legend>"""),_display_(Seq[Any](/*28.11*/Messages("playauthenticate.user.exists.title"))),format.raw/*28.57*/("""</legend>
	<p>"""),_display_(Seq[Any](/*29.6*/Messages("playauthenticate.user.exists.message"))),format.raw/*29.54*/("""</p>
    </div>
    </div>
    </div>
    </div>
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:30 IST 2014
                    SOURCE: W:/Pre School/app/views/account/signup/exists.scala.html
                    HASH: eab9c8a4e37d0a140f6fe4ea083fe059d930ddf1
                    MATRIX: 855->7|869->14|953->18|980->26|998->36|1082->40|1110->48|1123->53|1208->57|1355->23|1383->45|1412->166|1450->169|1565->274|1606->276|2204->838|2272->884|2323->900|2393->948
                    LINES: 28->4|28->4|30->4|32->7|32->7|34->7|36->10|36->10|38->10|43->6|44->9|45->14|46->15|46->15|46->15|59->28|59->28|60->29|60->29
                    -- GENERATED --
                */
            