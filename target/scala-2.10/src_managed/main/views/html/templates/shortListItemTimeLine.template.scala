
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
object shortListItemTimeLine extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.content.ShortNote],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(shortNoteList:List[models.content.ShortNote]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

"""),_display_(Seq[Any](/*3.2*/if(shortNoteList!=null)/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""
    <ul class="shortListTimeline pull-up">
    """),_display_(Seq[Any](/*5.6*/for((shortNote,index) <-shortNoteList.zipWithIndex) yield /*5.57*/{_display_(Seq[Any](format.raw/*5.58*/("""



        <li class="listCard shortNote"  id="shortNote"""),_display_(Seq[Any](/*9.55*/shortNote/*9.64*/.id)),format.raw/*9.67*/("""" style="overflow:hidden">
            <span class="timelineIcon"></span>
            <div class="listCardFeaturedImage">
            """),_display_(Seq[Any](/*12.14*/if(shortNote.featuredImage!=null)/*12.47*/{_display_(Seq[Any](format.raw/*12.48*/("""
                <img src="/assets"""),_display_(Seq[Any](/*13.35*/shortNote/*13.44*/.featuredImage.path.substring(6))),format.raw/*13.76*/("""">
            """)))}/*14.14*/else/*14.18*/{_display_(Seq[Any](format.raw/*14.19*/("""
                <img src=""""),_display_(Seq[Any](/*15.28*/routes/*15.34*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*15.77*/("""">
                """)))})),format.raw/*16.18*/("""
            </div>

            <div class="listCardBody">
                <div >
                    <h1><a href=""""),_display_(Seq[Any](/*21.35*/routes/*21.41*/.Application.getShortNote(shortNote.slug))),format.raw/*21.82*/("""">"""),_display_(Seq[Any](/*21.85*/shortNote/*21.94*/.title)),format.raw/*21.100*/("""</a></h1>

                    <p class="">
                    """),_display_(Seq[Any](/*24.22*/if(shortNote.tags!=null)/*24.46*/{_display_(Seq[Any](format.raw/*24.47*/("""
                        <i class="fa fa-tags"></i>
                        """),_display_(Seq[Any](/*26.26*/for(tag<-shortNote.tags) yield /*26.50*/{_display_(Seq[Any](format.raw/*26.51*/("""
                            <a href=""""),_display_(Seq[Any](/*27.39*/routes/*27.45*/.Application.tag(tag.slug))),format.raw/*27.71*/(""""> <label class="label label-default">"""),_display_(Seq[Any](/*27.110*/tag/*27.113*/.slug)),format.raw/*27.118*/("""</label></a>
                        """)))})),format.raw/*28.26*/("""
                    """)))})),format.raw/*29.22*/("""
                    </p>

                    """),_display_(Seq[Any](/*32.22*/if(controllers.Application.getLocalUser(session())!=null)/*32.79*/{_display_(Seq[Any](format.raw/*32.80*/("""
                        """),_display_(Seq[Any](/*33.26*/if(shortNote.user.equals(controllers.Application.getLocalUser(session())))/*33.100*/{_display_(Seq[Any](format.raw/*33.101*/("""
                            <hr>
                            <p> <a class="btn btn-info" href=""""),_display_(Seq[Any](/*35.64*/routes/*35.70*/.Application.editShortnote(shortNote.slug))),format.raw/*35.112*/("""">Edit</a></p>
                        """)))})),format.raw/*36.26*/("""
                    """)))})),format.raw/*37.22*/("""
                    <p>"""),_display_(Seq[Any](/*38.25*/shortNote/*38.34*/.score)),format.raw/*38.40*/("""</p>
                </div>
            </div>





        </li>


    """)))})),format.raw/*49.6*/("""
</ul>
""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(shortNoteList:List[models.content.ShortNote]): play.api.templates.HtmlFormat.Appendable = apply(shortNoteList)
    
    def f:((List[models.content.ShortNote]) => play.api.templates.HtmlFormat.Appendable) = (shortNoteList) => apply(shortNoteList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:44 IST 2014
                    SOURCE: W:/Pre School/app/views/templates/shortListItemTimeLine.scala.html
                    HASH: 573b2892edaf322bd7494bc9d4dea1fbcca3f4dd
                    MATRIX: 824->1|964->47|1001->50|1032->73|1070->74|1153->123|1219->174|1257->175|1350->233|1367->242|1391->245|1562->380|1604->413|1643->414|1714->449|1732->458|1786->490|1821->506|1834->510|1873->511|1937->539|1952->545|2017->588|2069->608|2222->725|2237->731|2300->772|2339->775|2357->784|2386->790|2487->855|2520->879|2559->880|2672->957|2712->981|2751->982|2826->1021|2841->1027|2889->1053|2965->1092|2978->1095|3006->1100|3076->1138|3130->1160|3214->1208|3280->1265|3319->1266|3381->1292|3465->1366|3505->1367|3638->1464|3653->1470|3718->1512|3790->1552|3844->1574|3905->1599|3923->1608|3951->1614|4055->1687|4094->1695
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|37->9|37->9|37->9|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|49->21|49->21|49->21|49->21|49->21|49->21|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|55->27|55->27|55->27|56->28|57->29|60->32|60->32|60->32|61->33|61->33|61->33|63->35|63->35|63->35|64->36|65->37|66->38|66->38|66->38|77->49|79->51
                    -- GENERATED --
                */
            