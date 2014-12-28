
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
object metaCardNew extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[String,String,Html,models.content.Image,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(contentType:String,header:String,headerHover:Html,image:models.content.Image,videoUrl:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._


Seq[Any](format.raw/*1.96*/("""

"""),format.raw/*4.1*/("""
<div class="metaCard">
    <div class="metaCardHeader">
    <h2 class="page-header">"""),_display_(Seq[Any](/*7.30*/contentType)),format.raw/*7.41*/(""": <span class="capitalize">"""),_display_(Seq[Any](/*7.69*/header)),format.raw/*7.75*/("""</span></h2>
    </div>
    <div class="metaCardBody">


                    """),_display_(Seq[Any](/*12.22*/if(videoUrl!=null)/*12.40*/{_display_(Seq[Any](format.raw/*12.41*/("""

                        <div style="height:450px;">
                            <iframe src=""""),_display_(Seq[Any](/*15.43*/videoUrl)),format.raw/*15.51*/("""" height="450" style="width:100%" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>

                        </div>


                     """)))}/*20.23*/else/*20.27*/{_display_(Seq[Any](format.raw/*20.28*/("""

                    """)))})),format.raw/*22.22*/("""


    </div>
    <div class="metaCardFooter">
  <br>
        <br>
        <br>
        <a href="#" class="thumbnail">
        """),_display_(Seq[Any](/*31.10*/if(image==null)/*31.25*/{_display_(Seq[Any](format.raw/*31.26*/("""
            <img height="200" style="height:200px;width:100%" src=""""),_display_(Seq[Any](/*32.69*/routes/*32.75*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*32.118*/("""">

        """)))}/*34.10*/else/*34.14*/{_display_(Seq[Any](format.raw/*34.15*/("""
            <img height="200" style="height:200px;width:100%" src="/assets"""),_display_(Seq[Any](/*35.76*/image/*35.81*/.path.substring(6))),format.raw/*35.99*/("""">
            """)))})),format.raw/*36.14*/("""

        </a>

    """),_display_(Seq[Any](/*40.6*/headerHover)),format.raw/*40.17*/("""
    </div>

</div>"""))}
    }
    
    def render(contentType:String,header:String,headerHover:Html,image:models.content.Image,videoUrl:String): play.api.templates.HtmlFormat.Appendable = apply(contentType,header,headerHover,image,videoUrl)
    
    def f:((String,String,Html,models.content.Image,String) => play.api.templates.HtmlFormat.Appendable) = (contentType,header,headerHover,image,videoUrl) => apply(contentType,header,headerHover,image,videoUrl)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:43 IST 2014
                    SOURCE: W:/Pre School/app/views/templates/metaCardNew.scala.html
                    HASH: 16ef134463c987ffe31fff58e05092944bf2a80e
                    MATRIX: 830->1|1065->95|1093->145|1214->231|1246->242|1309->270|1336->276|1450->354|1477->372|1516->373|1648->469|1678->477|1870->650|1883->654|1922->655|1977->678|2141->806|2165->821|2204->822|2309->891|2324->897|2390->940|2422->953|2435->957|2474->958|2586->1034|2600->1039|2640->1057|2688->1073|2744->1094|2777->1105
                    LINES: 26->1|30->1|32->4|35->7|35->7|35->7|35->7|40->12|40->12|40->12|43->15|43->15|48->20|48->20|48->20|50->22|59->31|59->31|59->31|60->32|60->32|60->32|62->34|62->34|62->34|63->35|63->35|63->35|64->36|68->40|68->40
                    -- GENERATED --
                */
            