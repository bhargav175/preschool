
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
object shortListItemNew extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.content.ShortNote,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(shortNote: models.content.ShortNote):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

<div class="shortNoteNewItem" id="shortNote"""),_display_(Seq[Any](/*3.45*/shortNote/*3.54*/.id)),format.raw/*3.57*/("""" style="overflow : hidden">
    <div class="col-md-1">

        <p><span class="likeBox label label-primary"><i class="fa fa-star-o"></i>"""),_display_(Seq[Any](/*6.83*/shortNote/*6.92*/.score)),format.raw/*6.98*/("""</span></p>
    </div>
    <div class="col-md-3 col-xs-6">
    <div class="featuredImage">

            <a href="#" class="thumbnail">
                """),_display_(Seq[Any](/*12.18*/if(shortNote.featuredImage != null)/*12.53*/ {_display_(Seq[Any](format.raw/*12.55*/("""
                    <img src="/assets"""),_display_(Seq[Any](/*13.39*/shortNote/*13.48*/.featuredImage.path.substring(6))),format.raw/*13.80*/("""">
                """)))}/*14.19*/else/*14.24*/{_display_(Seq[Any](format.raw/*14.25*/("""
                    <img src=""""),_display_(Seq[Any](/*15.32*/routes/*15.38*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*15.81*/("""">
                """)))})),format.raw/*16.18*/("""

            </a>

    </div>
    </div>
    <div class="col-md-8">
    <div class="">
        <div class="shortNoteTitle" >
            <h4 class="capitalize"><a href=""""),_display_(Seq[Any](/*25.46*/routes/*25.52*/.Application.getShortNote(shortNote.slug))),format.raw/*25.93*/("""">"""),_display_(Seq[Any](/*25.96*/shortNote/*25.105*/.title)),format.raw/*25.111*/("""</a></h4>


        </div>
        <div class="shortNoteExcerpt">
           """),_display_(Seq[Any](/*30.13*/Html(controllers.Application.excerpt(shortNote.text)))),format.raw/*30.66*/("""
        </div>
        <div class="shortNoteTags">
            <p class="" style="overflow: hidden">
            """),_display_(Seq[Any](/*34.14*/if(shortNote.tags.size()>0)/*34.41*/ {_display_(Seq[Any](format.raw/*34.43*/("""
                <i class="fa fa-tags"></i>
                """),_display_(Seq[Any](/*36.18*/for(tag <- shortNote.tags) yield /*36.44*/ {_display_(Seq[Any](format.raw/*36.46*/("""
                    <a href=""""),_display_(Seq[Any](/*37.31*/routes/*37.37*/.Application.tag(tag.slug))),format.raw/*37.63*/(""""> <label class="label label-info">"""),_display_(Seq[Any](/*37.99*/tag/*37.102*/.slug)),format.raw/*37.107*/("""</label></a>
                """)))})),format.raw/*38.18*/("""
            """)))})),format.raw/*39.14*/("""

            </p>



        </div>

    </div>
    <div class="shortNoteEdit">
        """),_display_(Seq[Any](/*49.10*/if(controllers.Application.getLocalUser(session()) != null)/*49.69*/ {_display_(Seq[Any](format.raw/*49.71*/("""
            """),_display_(Seq[Any](/*50.14*/if(shortNote.user.equals(controllers.Application.getLocalUser(session())))/*50.88*/ {_display_(Seq[Any](format.raw/*50.90*/("""

                <a href=""""),_display_(Seq[Any](/*52.27*/routes/*52.33*/.Application.editShortnote(shortNote.slug))),format.raw/*52.75*/("""">Edit</a>
            """)))}/*53.14*/else/*53.18*/{_display_(Seq[Any](format.raw/*53.19*/("""
              <span class="capitalize">  <a href=""""),_display_(Seq[Any](/*54.52*/routes/*54.58*/.Application.profile(shortNote.user.name))),format.raw/*54.99*/("""">"""),_display_(Seq[Any](/*54.102*/shortNote/*54.111*/.user.name)),format.raw/*54.121*/(""" </a></span>
            """)))})),format.raw/*55.14*/("""
        """)))})),format.raw/*56.10*/("""

    </div>
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
                    SOURCE: W:/Pre School/app/views/templates/shortListItemNew.scala.html
                    HASH: a99941f84ba72a5477e00515ce2a888232962da9
                    MATRIX: 813->1|944->38|1025->84|1042->93|1066->96|1240->235|1257->244|1284->250|1472->402|1516->437|1556->439|1631->478|1649->487|1703->519|1742->540|1755->545|1794->546|1862->578|1877->584|1942->627|1994->647|2201->818|2216->824|2279->865|2318->868|2337->877|2366->883|2480->961|2555->1014|2706->1129|2742->1156|2782->1158|2879->1219|2921->1245|2961->1247|3028->1278|3043->1284|3091->1310|3163->1346|3176->1349|3204->1354|3266->1384|3312->1398|3438->1488|3506->1547|3546->1549|3596->1563|3679->1637|3719->1639|3783->1667|3798->1673|3862->1715|3905->1739|3918->1743|3957->1744|4045->1796|4060->1802|4123->1843|4163->1846|4182->1855|4215->1865|4273->1891|4315->1901
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|34->6|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|53->25|53->25|53->25|53->25|53->25|53->25|58->30|58->30|62->34|62->34|62->34|64->36|64->36|64->36|65->37|65->37|65->37|65->37|65->37|65->37|66->38|67->39|77->49|77->49|77->49|78->50|78->50|78->50|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|82->54|82->54|82->54|83->55|84->56
                    -- GENERATED --
                */
            