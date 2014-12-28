
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

def /*7.6*/scripts/*7.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.17*/("""

    """)))};def /*10.6*/scriptsTop/*10.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.20*/("""

    """)))};def /*13.6*/links/*13.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.15*/("""

        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

    """)))};
Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*5.1*/("""

    """),format.raw/*9.6*/("""
    """),format.raw/*12.6*/("""
    """),format.raw/*17.6*/("""
"""),_display_(Seq[Any](/*18.2*/template_user_account_info(Messages("playauthenticate.login.title"), "login", scriptsTop, scripts, links)/*18.107*/ {_display_(Seq[Any](format.raw/*18.109*/("""

    <div class="uauth col-md-offset-2 col-md-8">
        <div class="modal-content animated fadeInLeft">
            <div class="modal-header">
                <div class="col-md-12">
                <h3><a href="home">The Civil Servant</a></h3>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>



        <div class="modal-content animated fadeInRight">
            <div id="login" >

                <div class="modal-body" style="overflow : hidden">




                    <div class="container-fluid modal-body-container">
                        <div class="col-md-8">
                        <legend>Login</legend>
                        """),format.raw/*43.61*/("""
                        """),_display_(Seq[Any](/*44.26*/helper/*44.32*/.form(routes.Application.doLogin)/*44.65*/ {_display_(Seq[Any](format.raw/*44.67*/("""

                            """),_display_(Seq[Any](/*46.30*/if(loginForm.hasGlobalErrors)/*46.59*/ {_display_(Seq[Any](format.raw/*46.61*/("""
                                <p class="error">
                                    <span class="label label-important">"""),_display_(Seq[Any](/*48.74*/loginForm/*48.83*/.globalError.message)),format.raw/*48.103*/("""</span>
                                </p>
                            """)))})),format.raw/*50.30*/("""

                            """),_display_(Seq[Any](/*52.30*/inputText(
                                loginForm("email"),
                                'class -> "form-control",
                                '_label -> "",
                                '_showConstraints -> false,
                                'placeholder -> "Email Address"
                            ))),format.raw/*58.30*/("""

                            """),_display_(Seq[Any](/*60.30*/inputPassword(
                                loginForm("password"),
                                '_showConstraints -> false,
                                '_label -> "",
                                'class -> "form-control",
                                'placeholder -> "Password"


                            ))),format.raw/*68.30*/("""

                            <div class="clearfix">
                                <input type="submit" value=""""),_display_(Seq[Any](/*71.62*/Messages("playauthenticate.login.now"))),format.raw/*71.100*/("""" class=" btn btn-primary" style="margin-top:15px"> <br/>
                            </div>
                            <br/>


                        """)))})),format.raw/*76.26*/("""
                        </div>
                        <div class="col-md-4">

                            <legend>Sign Up With A Provider</legend>
                            """),format.raw/*81.70*/("""
                            """),_display_(Seq[Any](/*82.30*/_providerPartial(skipCurrent = false))),format.raw/*82.67*/("""
                        </div>
                    </div>

                </div>
            </div>
        </div>
        <div class="modal-content animated fadeInRight" >
            <div class="modal-header" >
                <h5><a href="javascript:void(0);" onclick="window.location.href = jsRoutes.controllers.Signup.forgotPassword ( $ ( '#email' ).val ( ) || null ).absoluteURL ( ) ;">"""),_display_(Seq[Any](/*91.181*/Messages("playauthenticate.login.forgot.password"))),format.raw/*91.231*/("""</a></h5>
            </div>
        </div>

    </div>

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
                    DATE: Sun Dec 28 16:26:22 IST 2014
                    SOURCE: W:/Pre School/app/views/login.scala.html
                    HASH: 6613d68626e1d4a18957f478a92fb6f31e46b999
                    MATRIX: 848->1|997->87|1012->94|1096->98|1128->114|1147->124|1232->128|1264->144|1278->149|1363->153|1519->21|1549->78|1583->107|1616->137|1649->270|1687->273|1802->378|1843->380|2597->1142|2660->1169|2675->1175|2717->1208|2757->1210|2826->1243|2864->1272|2904->1274|3066->1400|3084->1409|3127->1429|3235->1505|3304->1538|3653->1865|3722->1898|4077->2231|4230->2348|4291->2386|4482->2545|4692->2768|4759->2799|4818->2836|5259->3240|5332->3290
                    LINES: 28->1|33->7|33->7|35->7|37->10|37->10|39->10|41->13|41->13|43->13|48->1|50->5|52->9|53->12|54->17|55->18|55->18|55->18|80->43|81->44|81->44|81->44|81->44|83->46|83->46|83->46|85->48|85->48|85->48|87->50|89->52|95->58|97->60|105->68|108->71|108->71|113->76|118->81|119->82|119->82|128->91|128->91
                    -- GENERATED --
                */
            