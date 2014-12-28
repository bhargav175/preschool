
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
object metaCardTag extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,Html,models.content.Image,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(header:String,slug:String,headerHover:Html,image:models.content.Image):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._


Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*4.1*/("""
<div class="metaCard">
    <div class="metaCardHeader">
        <h2 class="page-header"><span class="capitalize">"""),_display_(Seq[Any](/*7.59*/header)),format.raw/*7.65*/("""</span></h2>
    </div>
    <div class="metaCardBody">

        <a href="#" class="thumbnail">
        """),_display_(Seq[Any](/*12.10*/if(image==null)/*12.25*/{_display_(Seq[Any](format.raw/*12.26*/("""
            <img src=""""),_display_(Seq[Any](/*13.24*/routes/*13.30*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*13.73*/("""">

        """)))}/*15.10*/else/*15.14*/{_display_(Seq[Any](format.raw/*15.15*/("""
            <img src="/assets"""),_display_(Seq[Any](/*16.31*/image/*16.36*/.path.substring(6))),format.raw/*16.54*/("""">
            """)))})),format.raw/*17.14*/("""
        </a>


    <hr>
        </div>
    <div class="metaCardFooter">
    """),_display_(Seq[Any](/*24.6*/subjectPresentOr()/*24.24*/{_display_(Seq[Any](format.raw/*24.25*/("""
        <p ng-hide="true" id="user-name">"""),_display_(Seq[Any](/*25.43*/defining(Application.getLocalUser(session()))/*25.88*/ { user =>_display_(Seq[Any](format.raw/*25.98*/("""
          """),_display_(Seq[Any](/*26.12*/user/*26.16*/.name)),format.raw/*26.21*/("""
        """)))})),format.raw/*27.10*/("""</p>
        <p ng-hide="true" id="tag-slug-name">"""),_display_(Seq[Any](/*28.47*/slug)),format.raw/*28.51*/("""</p>
        <p ng-hide="following"><button class="btn btn-primary" id="follow_button" ng-click="followTag()" >Follow <i class="fa fa-plus"></i></button></p>

        <p ng-show="following"><button class="btn btn-default" id="unfollow_button" ng-click="unfollowTag()" >UnFollow <i class="fa fa-minus"></i></button></p>
    </div>
    """)))}/*33.6*/{_display_(Seq[Any](format.raw/*33.7*/("""

    """)))})),format.raw/*35.6*/("""



</div>"""))}
    }
    
    def render(header:String,slug:String,headerHover:Html,image:models.content.Image): play.api.templates.HtmlFormat.Appendable = apply(header,slug,headerHover,image)
    
    def f:((String,String,Html,models.content.Image) => play.api.templates.HtmlFormat.Appendable) = (header,slug,headerHover,image) => apply(header,slug,headerHover,image)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:43 IST 2014
                    SOURCE: W:/Pre School/app/views/templates/metaCardTag.scala.html
                    HASH: 8f55ebfc06bda9e02e332a471482264be91508b7
                    MATRIX: 823->1|1035->72|1063->122|1213->237|1240->243|1380->347|1404->362|1443->363|1503->387|1518->393|1583->436|1615->449|1628->453|1667->454|1734->485|1748->490|1788->508|1836->524|1949->602|1976->620|2015->621|2094->664|2148->709|2196->719|2244->731|2257->735|2284->740|2326->750|2413->801|2439->805|2792->1140|2830->1141|2868->1148
                    LINES: 26->1|30->1|32->4|35->7|35->7|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27|56->28|56->28|61->33|61->33|63->35
                    -- GENERATED --
                */
            