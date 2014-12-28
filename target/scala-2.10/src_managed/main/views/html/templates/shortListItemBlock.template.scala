
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
object shortListItemBlock extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.content.ShortNote,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(shortNote: models.content.ShortNote):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

<style>
    .thumbnail img"""),format.raw/*4.19*/("""{"""),format.raw/*4.20*/("""
        height:100%;
        max-height: 100%;
        width: 100%;
    """),format.raw/*8.5*/("""}"""),format.raw/*8.6*/("""

</style>
<div class="shortNoteBlock shortNote" id="shortNote"""),_display_(Seq[Any](/*11.53*/shortNote/*11.62*/.id)),format.raw/*11.65*/("""" style="overflow : hidden">
    <div class="shortNoteBlockFeaturedImage">
        <a href="#" class="thumbnail" style="max-height: 300px; overflow : hidden ;">
        """),_display_(Seq[Any](/*14.10*/if(shortNote.featuredImage != null)/*14.45*/ {_display_(Seq[Any](format.raw/*14.47*/("""
            <img src="/assets"""),_display_(Seq[Any](/*15.31*/shortNote/*15.40*/.featuredImage.path.substring(6))),format.raw/*15.72*/("""">
        """)))}/*16.11*/else/*16.16*/{_display_(Seq[Any](format.raw/*16.17*/("""
            <img src=""""),_display_(Seq[Any](/*17.24*/routes/*17.30*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*17.73*/("""">
            """)))})),format.raw/*18.14*/("""
        </a>

    </div>

    <div class="shortNoteBlockContent">
        <div class="shortNoteBlockTitle" >
            <h4><a href=""""),_display_(Seq[Any](/*25.27*/routes/*25.33*/.Application.getShortNote(shortNote.slug))),format.raw/*25.74*/("""">"""),_display_(Seq[Any](/*25.77*/shortNote/*25.86*/.title)),format.raw/*25.92*/("""</a></h4>


        </div>
        <div class="shortNoteBlockText">
           """),_display_(Seq[Any](/*30.13*/Html(controllers.Application.excerpt(shortNote.text)))),format.raw/*30.66*/("""
        </div>
        <div class="shortNoteBlockMeta">
            <p class="" style="overflow: hidden">
            """),_display_(Seq[Any](/*34.14*/if(shortNote.tags.size()>0)/*34.41*/ {_display_(Seq[Any](format.raw/*34.43*/("""
                <i class="fa fa-tags"></i>
                """),_display_(Seq[Any](/*36.18*/for(tag <- shortNote.tags) yield /*36.44*/ {_display_(Seq[Any](format.raw/*36.46*/("""
                    <a href=""""),_display_(Seq[Any](/*37.31*/routes/*37.37*/.Application.tag(tag.slug))),format.raw/*37.63*/(""""> <label class="label label-default">"""),_display_(Seq[Any](/*37.102*/tag/*37.105*/.slug)),format.raw/*37.110*/("""</label></a>
                """)))})),format.raw/*38.18*/("""
            """)))})),format.raw/*39.14*/("""
            </p>



        </div>

    </div>
    <div class="shortNoteBlockUserHelp">
        """),_display_(Seq[Any](/*48.10*/if(controllers.Application.getLocalUser(session()) != null)/*48.69*/ {_display_(Seq[Any](format.raw/*48.71*/("""
            """),_display_(Seq[Any](/*49.14*/if(shortNote.user.equals(controllers.Application.getLocalUser(session())))/*49.88*/ {_display_(Seq[Any](format.raw/*49.90*/("""

                <a href=""""),_display_(Seq[Any](/*51.27*/routes/*51.33*/.Application.editShortnote(shortNote.slug))),format.raw/*51.75*/("""">Edit</a>
            """)))}/*52.14*/else/*52.18*/{_display_(Seq[Any](format.raw/*52.19*/("""
               <span class="capitalize label label-primary" style="padding:5px; display:inline-block"> """),_display_(Seq[Any](/*53.105*/shortNote/*53.114*/.user.name)),format.raw/*53.124*/("""</span>
            """)))})),format.raw/*54.14*/("""
        """)))})),format.raw/*55.10*/("""

    </div>

</div>"""))}
    }
    
    def render(shortNote:models.content.ShortNote): play.api.templates.HtmlFormat.Appendable = apply(shortNote)
    
    def f:((models.content.ShortNote) => play.api.templates.HtmlFormat.Appendable) = (shortNote) => apply(shortNote)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:43 IST 2014
                    SOURCE: W:/Pre School/app/views/templates/shortListItemBlock.scala.html
                    HASH: fae3fe9fe82c1f9017690ce52efdab73d49d065b
                    MATRIX: 815->1|946->38|1001->66|1029->67|1128->140|1155->141|1254->204|1272->213|1297->216|1503->386|1547->421|1587->423|1654->454|1672->463|1726->495|1757->508|1770->513|1809->514|1869->538|1884->544|1949->587|1997->603|2169->739|2184->745|2247->786|2286->789|2304->798|2332->804|2448->884|2523->937|2679->1057|2715->1084|2755->1086|2852->1147|2894->1173|2934->1175|3001->1206|3016->1212|3064->1238|3140->1277|3153->1280|3181->1285|3243->1315|3289->1329|3423->1427|3491->1486|3531->1488|3581->1502|3664->1576|3704->1578|3768->1606|3783->1612|3847->1654|3890->1678|3903->1682|3942->1683|4084->1788|4103->1797|4136->1807|4189->1828|4231->1838
                    LINES: 26->1|29->1|32->4|32->4|36->8|36->8|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|53->25|53->25|53->25|53->25|53->25|53->25|58->30|58->30|62->34|62->34|62->34|64->36|64->36|64->36|65->37|65->37|65->37|65->37|65->37|65->37|66->38|67->39|76->48|76->48|76->48|77->49|77->49|77->49|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|83->55
                    -- GENERATED --
                */
            