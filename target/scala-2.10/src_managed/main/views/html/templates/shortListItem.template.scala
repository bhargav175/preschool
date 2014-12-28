
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
object shortListItem extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.content.ShortNote,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(shortNote: models.content.ShortNote):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

<div class="listCard shortNote" id="shortNote"""),_display_(Seq[Any](/*3.47*/shortNote/*3.56*/.id)),format.raw/*3.59*/("""" style="overflow : hidden">
    <div class="listCardFeaturedImage">
    """),_display_(Seq[Any](/*5.6*/if(shortNote.featuredImage != null)/*5.41*/ {_display_(Seq[Any](format.raw/*5.43*/("""
        <img src="/assets"""),_display_(Seq[Any](/*6.27*/shortNote/*6.36*/.featuredImage.path.substring(6))),format.raw/*6.68*/("""">
    """)))}/*7.7*/else/*7.12*/{_display_(Seq[Any](format.raw/*7.13*/("""
        <img src=""""),_display_(Seq[Any](/*8.20*/routes/*8.26*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*8.69*/("""">
        """)))})),format.raw/*9.10*/("""
    </div>

    <div class="listCardBody">
        <div class="listCardBodyTop" >
            <h4><a href=""""),_display_(Seq[Any](/*14.27*/routes/*14.33*/.Application.getShortNote(shortNote.slug))),format.raw/*14.74*/("""">"""),_display_(Seq[Any](/*14.77*/shortNote/*14.86*/.title)),format.raw/*14.92*/("""</a></h4>


        </div>
        <div class="listCardBodyMid">
           """),_display_(Seq[Any](/*19.13*/Html(controllers.Application.excerpt(shortNote.text)))),format.raw/*19.66*/("""
        </div>
        <div class="listCardBodyBottom">
            <p class="" style="overflow: hidden">
            """),_display_(Seq[Any](/*23.14*/if(shortNote.tags.size()>0)/*23.41*/ {_display_(Seq[Any](format.raw/*23.43*/("""
                <i class="fa fa-tags"></i>
                """),_display_(Seq[Any](/*25.18*/for(tag <- shortNote.tags) yield /*25.44*/ {_display_(Seq[Any](format.raw/*25.46*/("""
                    <a href=""""),_display_(Seq[Any](/*26.31*/routes/*26.37*/.Application.tag(tag.slug))),format.raw/*26.63*/(""""> <label class="label label-default">"""),_display_(Seq[Any](/*26.102*/tag/*26.105*/.slug)),format.raw/*26.110*/("""</label></a>
                """)))})),format.raw/*27.18*/("""
            """)))})),format.raw/*28.14*/("""
             <span class="pull-right"> """),_display_(Seq[Any](/*29.41*/shortNote/*29.50*/.score)),format.raw/*29.56*/("""</span>
            </p>



        </div>

    </div>
    <div class="listCardFooter">
        """),_display_(Seq[Any](/*38.10*/if(controllers.Application.getLocalUser(session()) != null)/*38.69*/ {_display_(Seq[Any](format.raw/*38.71*/("""
            """),_display_(Seq[Any](/*39.14*/if(shortNote.user.equals(controllers.Application.getLocalUser(session())))/*39.88*/ {_display_(Seq[Any](format.raw/*39.90*/("""

                <a href=""""),_display_(Seq[Any](/*41.27*/routes/*41.33*/.Application.editShortnote(shortNote.slug))),format.raw/*41.75*/("""">Edit</a>
            """)))}/*42.14*/else/*42.18*/{_display_(Seq[Any](format.raw/*42.19*/("""
              <span class="capitalize">  <a href=""""),_display_(Seq[Any](/*43.52*/routes/*43.58*/.Application.profile(shortNote.user.name))),format.raw/*43.99*/("""">"""),_display_(Seq[Any](/*43.102*/shortNote/*43.111*/.user.name)),format.raw/*43.121*/(""" </a></span>
            """)))})),format.raw/*44.14*/("""
        """)))})),format.raw/*45.10*/("""

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
                    SOURCE: W:/Pre School/app/views/templates/shortListItem.scala.html
                    HASH: 5545c37f38b06dec325b639023f2e1c8f0c29b47
                    MATRIX: 810->1|941->38|1024->86|1041->95|1065->98|1173->172|1216->207|1255->209|1317->236|1334->245|1387->277|1412->286|1424->291|1462->292|1517->312|1531->318|1595->361|1638->373|1783->482|1798->488|1861->529|1900->532|1918->541|1946->547|2059->624|2134->677|2290->797|2326->824|2366->826|2463->887|2505->913|2545->915|2612->946|2627->952|2675->978|2751->1017|2764->1020|2792->1025|2854->1055|2900->1069|2977->1110|2995->1119|3023->1125|3156->1222|3224->1281|3264->1283|3314->1297|3397->1371|3437->1373|3501->1401|3516->1407|3580->1449|3623->1473|3636->1477|3675->1478|3763->1530|3778->1536|3841->1577|3881->1580|3900->1589|3933->1599|3991->1625|4033->1635
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|42->14|42->14|42->14|42->14|42->14|42->14|47->19|47->19|51->23|51->23|51->23|53->25|53->25|53->25|54->26|54->26|54->26|54->26|54->26|54->26|55->27|56->28|57->29|57->29|57->29|66->38|66->38|66->38|67->39|67->39|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|71->43|71->43|71->43|72->44|73->45
                    -- GENERATED --
                */
            