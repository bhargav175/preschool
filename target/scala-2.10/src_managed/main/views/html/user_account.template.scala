
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

    <div class="jumbotron">
    <h1>"""),_display_(Seq[Any](/*8.10*/localUser/*8.19*/.name)),format.raw/*8.24*/("""</h1>
    <p>
    Email address - """),_display_(Seq[Any](/*10.22*/localUser/*10.31*/.email)),format.raw/*10.37*/("""</p>
    <p>
       Your role is <span class="badge">"""),_display_(Seq[Any](/*12.42*/localUser/*12.51*/.roles.get(0).roleName)),format.raw/*12.73*/("""</span>
    </p>
    </div>

""")))})),format.raw/*16.2*/("""
"""))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 04 12:20:27 IST 2015
                    SOURCE: W:/Pre School/app/views/user_account.scala.html
                    HASH: a289c1707b4f7b92a9ba0cd43aaee98f166425d5
                    MATRIX: 786->1|956->32|986->82|1023->85|1061->115|1100->117|1177->159|1194->168|1220->173|1293->210|1311->219|1339->225|1431->281|1449->290|1493->312|1558->346
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|36->8|36->8|36->8|38->10|38->10|38->10|40->12|40->12|40->12|44->16
                    -- GENERATED --
                */
            