
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

Seq[Any](_display_(Seq[Any](/*2.2*/main("link")/*2.14*/ {_display_(Seq[Any](format.raw/*2.16*/("""
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
	<legend>"""),_display_(Seq[Any](/*15.11*/Messages("playauthenticate.user.exists.title"))),format.raw/*15.57*/("""</legend>
	<p>"""),_display_(Seq[Any](/*16.6*/Messages("playauthenticate.user.exists.message"))),format.raw/*16.54*/("""</p>
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
                    DATE: Thu Jan 01 22:26:57 IST 2015
                    SOURCE: W:/Pre School/app/views/account/signup/exists.scala.html
                    HASH: 70b1c823f9f922f3bd8d4d82450db131cc1c2fdb
                    MATRIX: 880->3|900->15|939->17|1537->579|1605->625|1656->641|1726->689
                    LINES: 29->2|29->2|29->2|42->15|42->15|43->16|43->16
                    -- GENERATED --
                */
            