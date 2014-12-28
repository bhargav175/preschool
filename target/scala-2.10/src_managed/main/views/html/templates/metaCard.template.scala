
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
object metaCard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Html,models.content.Image,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(contentType:String,header:String,headerHover:Html,image:models.content.Image):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._


Seq[Any](format.raw/*1.80*/("""

"""),format.raw/*4.1*/("""
<div class="metaCard">
    <div class="metaCardHeader">
    <h2 class="page-header">"""),_display_(Seq[Any](/*7.30*/contentType)),format.raw/*7.41*/(""": <span class="capitalize">"""),_display_(Seq[Any](/*7.69*/header)),format.raw/*7.75*/("""</span></h2>
    </div>
    <div class="metaCardBody">

       <a href="#" class="thumbnail">
        """),_display_(Seq[Any](/*12.10*/if(image==null)/*12.25*/{_display_(Seq[Any](format.raw/*12.26*/("""
            <img src=""""),_display_(Seq[Any](/*13.24*/routes/*13.30*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*13.73*/("""">

        """)))}/*15.10*/else/*15.14*/{_display_(Seq[Any](format.raw/*15.15*/("""
            <img src="/assets"""),_display_(Seq[Any](/*16.31*/image/*16.36*/.path.substring(6))),format.raw/*16.54*/("""">
            """)))})),format.raw/*17.14*/("""

        </a>


    </div>
    <div class="metaCardFooter">
    """),_display_(Seq[Any](/*24.6*/headerHover)),format.raw/*24.17*/("""
    </div>

</div>"""))}
    }
    
    def render(contentType:String,header:String,headerHover:Html,image:models.content.Image): play.api.templates.HtmlFormat.Appendable = apply(contentType,header,headerHover,image)
    
    def f:((String,String,Html,models.content.Image) => play.api.templates.HtmlFormat.Appendable) = (contentType,header,headerHover,image) => apply(contentType,header,headerHover,image)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:43 IST 2014
                    SOURCE: W:/Pre School/app/views/templates/metaCard.scala.html
                    HASH: d1fbbd8a8c4b37d8d0ca3e576801e74a3735f41a
                    MATRIX: 820->1|1039->79|1067->129|1188->215|1220->226|1283->254|1310->260|1449->363|1473->378|1512->379|1572->403|1587->409|1652->452|1684->465|1697->469|1736->470|1803->501|1817->506|1857->524|1905->540|2006->606|2039->617
                    LINES: 26->1|30->1|32->4|35->7|35->7|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|52->24|52->24
                    -- GENERATED --
                */
            