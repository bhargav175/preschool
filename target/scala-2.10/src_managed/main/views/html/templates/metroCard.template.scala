
package views.html.templates

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
object metroCard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,models.content.Image,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(header:String,headerHover:Html,image:models.content.Image):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.61*/("""


<div class="col-sm-6 col-md-4">
    <div class="thumbnail">
        """),_display_(Seq[Any](/*7.10*/if(image==null)/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
            <img src=""""),_display_(Seq[Any](/*8.24*/routes/*8.30*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*8.73*/("""">

        """)))}/*10.10*/else/*10.14*/{_display_(Seq[Any](format.raw/*10.15*/("""
            <img src="/assets"""),_display_(Seq[Any](/*11.31*/image/*11.36*/.path.substring(6))),format.raw/*11.54*/("""">
        """)))})),format.raw/*12.10*/("""

        <div class="caption">
            <h3>"""),_display_(Seq[Any](/*15.18*/header)),format.raw/*15.24*/("""</h3>
            <p>"""),_display_(Seq[Any](/*16.17*/headerHover)),format.raw/*16.28*/("""</p>
        </div>
    </div>
</div>"""))}
    }
    
    def render(header:String,headerHover:Html,image:models.content.Image): play.api.templates.HtmlFormat.Appendable = apply(header,headerHover,image)
    
    def f:((String,Html,models.content.Image) => play.api.templates.HtmlFormat.Appendable) = (header,headerHover,image) => apply(header,headerHover,image)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:43 IST 2014
                    SOURCE: W:/Pre School/app/views/templates/metroCard.scala.html
                    HASH: a697f7dd4679b4d23fa9d824335b114f67ba5d0f
                    MATRIX: 814->2|967->61|1074->133|1097->148|1135->149|1194->173|1208->179|1272->222|1304->235|1317->239|1356->240|1423->271|1437->276|1477->294|1521->306|1606->355|1634->361|1692->383|1725->394
                    LINES: 26->2|29->2|34->7|34->7|34->7|35->8|35->8|35->8|37->10|37->10|37->10|38->11|38->11|38->11|39->12|42->15|42->15|43->16|43->16
                    -- GENERATED --
                */
            