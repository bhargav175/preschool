
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
object user_account extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import com.feth.play.module.pa.views.html._


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("UserController Profile")/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""

    <h1>Your Settings</h1>
    <p>
    Your name is """),_display_(Seq[Any](/*9.19*/localUser/*9.28*/.name)),format.raw/*9.33*/(""" and your email address is """),_display_(Seq[Any](/*9.61*/if(!localUser.email)/*9.81*/ {_display_(Seq[Any](format.raw/*9.83*/("""<em>&lt;unknown&gt;</em>.""")))}/*9.110*/else/*9.115*/{_display_(Seq[Any](format.raw/*9.116*/("""
    	"""),_display_(Seq[Any](/*10.7*/localUser/*10.16*/.email)),format.raw/*10.22*/(""".
	    <i>
	    """),_display_(Seq[Any](/*12.7*/if(!localUser.emailValidated && localUser.email)/*12.55*/ {_display_(Seq[Any](format.raw/*12.57*/("""
	      (<a href=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Account.verifyEmail)),format.raw/*13.45*/("""">unverified - click to verify</a>)
	    """)))}/*14.8*/else/*14.13*/{_display_(Seq[Any](format.raw/*14.14*/("""
	      (verified)
	    """)))})),format.raw/*16.7*/("""</i>
    """)))})),format.raw/*17.6*/("""
    <br />
        """),_display_(Seq[Any](/*19.10*/if(localUser.firstName && localUser.lastName)/*19.55*/ {_display_(Seq[Any](format.raw/*19.57*/("""
            Your first name is """),_display_(Seq[Any](/*20.33*/localUser/*20.42*/.firstName)),format.raw/*20.52*/(""" and your last name is """),_display_(Seq[Any](/*20.76*/localUser/*20.85*/.lastName)),format.raw/*20.94*/("""
            <br/>
        """)))})),format.raw/*22.10*/("""
    """),_display_(Seq[Any](/*23.6*/defining(localUser.getProviders())/*23.40*/ { providers =>_display_(Seq[Any](format.raw/*23.55*/("""
        """),_display_(Seq[Any](/*24.10*/if(providers.size() > 0)/*24.34*/ {_display_(Seq[Any](format.raw/*24.36*/("""
        """),_display_(Seq[Any](/*25.10*/if(providers.size() ==1)/*25.34*/ {_display_(Seq[Any](format.raw/*25.36*/("""
            """),_display_(Seq[Any](/*26.14*/Messages("playauthenticate.user_account.providers_one"))),format.raw/*26.69*/("""
        """)))}/*27.11*/else/*27.16*/{_display_(Seq[Any](format.raw/*27.17*/("""
            """),_display_(Seq[Any](/*28.14*/Messages("playauthenticate.user_account.providers_many",providers.size().toString()))),format.raw/*28.98*/("""
        """)))})),format.raw/*29.10*/("""
        """),_display_(Seq[Any](/*30.10*/for(p <- providers) yield /*30.29*/ {_display_(Seq[Any](format.raw/*30.31*/("""
            """),_display_(Seq[Any](/*31.14*/_providerIcon(p))),format.raw/*31.30*/("""
        """)))})),format.raw/*32.10*/("""
        <br/>
        """)))})),format.raw/*34.10*/("""
    """)))})),format.raw/*35.6*/("""

    <br/>
    """),_display_(Seq[Any](/*38.6*/currentAuth()/*38.19*/ { auth =>_display_(Seq[Any](format.raw/*38.29*/("""
        """),_display_(Seq[Any](/*39.10*/Messages("playauthenticate.user_account.logged"))),format.raw/*39.58*/(""" """),_display_(Seq[Any](/*39.60*/_providerIcon(auth.getProvider()))),format.raw/*39.93*/("""<br/>
        """),_display_(Seq[Any](/*40.10*/if(auth.expires() != -1)/*40.34*/{_display_(Seq[Any](format.raw/*40.35*/("""
            """),_display_(Seq[Any](/*41.14*/Messages("playauthenticate.user_account.session", auth.getId(), Application.formatTimestamp(auth.expires())))),format.raw/*41.122*/("""
        """)))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
            """),_display_(Seq[Any](/*43.14*/Messages("playauthenticate.user_account.session_endless", auth.getId()))),format.raw/*43.85*/("""
        """)))})),format.raw/*44.10*/("""
    """)))})),format.raw/*45.6*/("""
    <br/>
    <ul>
    	<li><a href=""""),_display_(Seq[Any](/*48.20*/routes/*48.26*/.Account.changePassword)),format.raw/*48.49*/("""">"""),_display_(Seq[Any](/*48.52*/Messages("playauthenticate.user_account.password_change"))),format.raw/*48.109*/("""</a></li>
    </ul>
    </p>
""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:56 IST 2015
                    SOURCE: W:/Pre School/app/views/user_account.scala.html
                    HASH: 0186434118e6cdd2a0127a0fbe3fb91b2aef7f1a
                    MATRIX: 786->1|956->32|986->82|1023->85|1061->115|1100->117|1194->176|1211->185|1237->190|1300->218|1328->238|1367->240|1412->267|1425->272|1464->273|1507->281|1525->290|1553->296|1607->315|1664->363|1704->365|1760->385|1775->391|1817->411|1878->455|1891->460|1930->461|1988->488|2030->499|2089->522|2143->567|2183->569|2253->603|2271->612|2303->622|2363->646|2381->655|2412->664|2474->694|2516->701|2559->735|2612->750|2659->761|2692->785|2732->787|2779->798|2812->822|2852->824|2903->839|2980->894|3010->906|3023->911|3062->912|3113->927|3219->1011|3262->1022|3309->1033|3344->1052|3384->1054|3435->1069|3473->1085|3516->1096|3574->1122|3612->1129|3667->1149|3689->1162|3737->1172|3784->1183|3854->1231|3892->1233|3947->1266|3999->1282|4032->1306|4071->1307|4122->1322|4253->1430|4283->1442|4296->1447|4335->1448|4386->1463|4479->1534|4522->1545|4560->1552|4638->1594|4653->1600|4698->1623|4737->1626|4817->1683|4881->1716
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|37->9|37->9|37->9|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|44->16|45->17|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|48->20|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|55->27|55->27|55->27|56->28|56->28|57->29|58->30|58->30|58->30|59->31|59->31|60->32|62->34|63->35|66->38|66->38|66->38|67->39|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|70->42|70->42|70->42|71->43|71->43|72->44|73->45|76->48|76->48|76->48|76->48|76->48|79->51
                    -- GENERATED --
                */
            