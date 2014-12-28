
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
object shortListCard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[models.content.ShortNote,Boolean,Boolean,Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(shortNote:models.content.ShortNote,hasUpvoted:Boolean,hasDownvoted:Boolean,hasReported:Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import models.content.FlagType


Seq[Any](format.raw/*2.98*/("""
"""),format.raw/*4.1*/("""
<div class="postCard shortNote"  id="shortNote"""),_display_(Seq[Any](/*5.48*/shortNote/*5.57*/.id)),format.raw/*5.60*/("""" style="overflow:hidden">
    """),_display_(Seq[Any](/*6.6*/if(shortNote.featuredImage!=null)/*6.39*/{_display_(Seq[Any](format.raw/*6.40*/("""
        <div class="postCardFeaturedImage">
            <img src="assets/"""),_display_(Seq[Any](/*8.31*/shortNote/*8.40*/.featuredImage.path.substring(6))),format.raw/*8.72*/("""">
        </div>

    """)))}/*11.6*/else/*11.10*/{_display_(Seq[Any](format.raw/*11.11*/("""
        <div class="postCardFeaturedImage">
            <img src=""""),_display_(Seq[Any](/*13.24*/routes/*13.30*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*13.73*/("""">
        </div>
    """)))})),format.raw/*15.6*/("""
    """),_display_(Seq[Any](/*16.6*/if(shortNote.flags.size()>0)/*16.34*/{_display_(Seq[Any](format.raw/*16.35*/("""

        <div class="alert alert-danger"> This post is flagged under """),_display_(Seq[Any](/*18.70*/for((flag,index)<-shortNote.flags.zipWithIndex) yield /*18.117*/{_display_(Seq[Any](format.raw/*18.118*/("""
            """),_display_(Seq[Any](/*19.14*/if(index>0)/*19.25*/{_display_(Seq[Any](format.raw/*19.26*/("""
                ,
        """)))}/*21.10*/else/*21.14*/{_display_(Seq[Any](format.raw/*21.15*/("""

            """)))})),format.raw/*23.14*/("""
            <strong> """),_display_(Seq[Any](/*24.23*/flag/*24.27*/.flagType)),format.raw/*24.36*/("""</strong>

        """)))})),format.raw/*26.10*/("""</div>
    """)))})),format.raw/*27.6*/("""
    <div class="postCardBody">
    <div class="postCardBodySidebar">


        <p><button class="btn btn-success
                            """),_display_(Seq[Any](/*33.30*/if(hasUpvoted)/*33.44*/{_display_(Seq[Any](format.raw/*33.45*/("""
            btn-lg

        """)))})),format.raw/*36.10*/("""
        upvote-button" ng-click='doUpvote($event)'><i class="fa fa-chevron-up" ></i> <span class="badge upvote-badge">"""),_display_(Seq[Any](/*37.120*/shortNote/*37.129*/.upvotes.size())),format.raw/*37.144*/("""</span></button></p>

        <p><button class="btn btn-danger
                            """),_display_(Seq[Any](/*40.30*/if(hasDownvoted)/*40.46*/{_display_(Seq[Any](format.raw/*40.47*/("""
            btn-lg

        """)))})),format.raw/*43.10*/("""

        downvote-button" ng-click="doDownvote($event)"><i class="fa fa-chevron-down" ></i> <span class="badge downvote-badge"> """),_display_(Seq[Any](/*45.129*/shortNote/*45.138*/.downvotes.size())),format.raw/*45.155*/("""</span></button></p>



    </div>
    <div class="postCardBodyContent ">
        <div class="postCardBodyContentTop">
        <h1><a href=""""),_display_(Seq[Any](/*52.23*/routes/*52.29*/.Application.getShortNote(shortNote.slug))),format.raw/*52.70*/("""">"""),_display_(Seq[Any](/*52.73*/shortNote/*52.82*/.title)),format.raw/*52.88*/("""</a></h1>
        </div>
        <div class="postCardBodyContentMid">


        """),_display_(Seq[Any](/*57.10*/Html(shortNote.html))),format.raw/*57.30*/("""
        </div>
        <div class="postCardBodyContentBottom">
        """),_display_(Seq[Any](/*60.10*/if(shortNote.tags.size()>0)/*60.37*/{_display_(Seq[Any](format.raw/*60.38*/("""
            <i class="fa fa-tags"></i>
            """),_display_(Seq[Any](/*62.14*/for(tag<-shortNote.tags) yield /*62.38*/{_display_(Seq[Any](format.raw/*62.39*/("""
                <a href=""""),_display_(Seq[Any](/*63.27*/routes/*63.33*/.Application.tag(tag.slug))),format.raw/*63.59*/(""""> <label class="label label-default">"""),_display_(Seq[Any](/*63.98*/tag/*63.101*/.slug)),format.raw/*63.106*/("""</label></a>
            """)))})),format.raw/*64.14*/("""
            |
        """)))})),format.raw/*66.10*/("""

            """),_display_(Seq[Any](/*68.14*/if(controllers.Application.getLocalUser(session())!=null)/*68.71*/{_display_(Seq[Any](format.raw/*68.72*/("""
                """),_display_(Seq[Any](/*69.18*/if(shortNote.user.equals(controllers.Application.getLocalUser(session())))/*69.92*/{_display_(Seq[Any](format.raw/*69.93*/("""
                    <a class="" href=""""),_display_(Seq[Any](/*70.40*/routes/*70.46*/.Application.editShortnote(shortNote.slug))),format.raw/*70.88*/("""">Edit</a>
                """)))}/*71.18*/else/*71.22*/{_display_(Seq[Any](format.raw/*71.23*/("""

                    """),_display_(Seq[Any](/*73.22*/if(hasReported)/*73.37*/{_display_(Seq[Any](format.raw/*73.38*/("""
                        <a id="reportButton"  data-toggle="tooltip" data-placement="top" title="You Have Already Reported This Post">Report Abuse  <i class="fa fa-check"></i> </a>
                        <script>
                        console.log($("#reportButton" ).tooltip());
                        $("#reportButton").tooltip();
                        </script>
                    """)))}/*79.22*/else/*79.26*/{_display_(Seq[Any](format.raw/*79.27*/("""

                        <a  data-toggle="modal" data-target="#abuseModal">Report Abuse</a>
                    """)))})),format.raw/*82.22*/("""


                        <!--MOdal Part-->
                    <div class="modal fade" id="abuseModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                    <h4 class="modal-title" id="myModalLabel">Thanks for the headsup!</h4>
                                </div>
                                <div class="modal-body" ng-controller="reportSubmitController">
                                    I think this post is not a good fit because:
                                    <form action=""""),_display_(Seq[Any](/*95.52*/controllers/*95.63*/.content.routes.ShortNote.report)),format.raw/*95.95*/("""" method="post" ng-submit="submit($event)" >
                                        <input type="hidden"  name="id" value=""""),_display_(Seq[Any](/*96.81*/shortNote/*96.90*/.id)),format.raw/*96.93*/("""">
                                        <select name="reportType">
                                        """),_display_(Seq[Any](/*98.42*/for(fType <- FlagType.values()) yield /*98.73*/{_display_(Seq[Any](format.raw/*98.74*/("""
                                            <option value=""""),_display_(Seq[Any](/*99.61*/fType/*99.66*/.name())),format.raw/*99.73*/("""">"""),_display_(Seq[Any](/*99.76*/fType/*99.81*/.name())),format.raw/*99.88*/("""</option>
                                        """)))})),format.raw/*100.42*/("""
                                        </select>


                                        <input type="submit" value="Go">
                                    </form>

                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    <button type="button" class="btn btn-primary">Save changes</button>
                                </div>
                            </div>
                        </div>
                    </div>

                        <!--  End Modal-->

                """)))})),format.raw/*118.18*/("""
            """)))})),format.raw/*119.14*/("""


        </div>

    </div>
        <div class="clearfix"></div>
    </div>



<div class="postCardFooter">
    <span class="capitalize">                <a href=""""),_display_(Seq[Any](/*131.56*/routes/*131.62*/.Application.profile(shortNote.user.name))),format.raw/*131.103*/("""">"""),_display_(Seq[Any](/*131.106*/shortNote/*131.115*/.user.name)),format.raw/*131.125*/(""" </a>
    </span>
    <span class="pull-right">"""),_display_(Seq[Any](/*133.31*/shortNote/*133.40*/.createdTime)),format.raw/*133.52*/("""</span>


</div>




</div>"""))}
    }
    
    def render(shortNote:models.content.ShortNote,hasUpvoted:Boolean,hasDownvoted:Boolean,hasReported:Boolean): play.api.templates.HtmlFormat.Appendable = apply(shortNote,hasUpvoted,hasDownvoted,hasReported)
    
    def f:((models.content.ShortNote,Boolean,Boolean,Boolean) => play.api.templates.HtmlFormat.Appendable) = (shortNote,hasUpvoted,hasDownvoted,hasReported) => apply(shortNote,hasUpvoted,hasDownvoted,hasReported)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:43 IST 2014
                    SOURCE: W:/Pre School/app/views/templates/shortListCard.scala.html
                    HASH: 96b21aac644e85c7959e0e90b767bc5ac73b21a3
                    MATRIX: 834->2|1055->98|1082->131|1165->179|1182->188|1206->191|1272->223|1313->256|1351->257|1461->332|1478->341|1531->373|1573->397|1586->401|1625->402|1729->470|1744->476|1809->519|1863->542|1904->548|1941->576|1980->577|2087->648|2151->695|2191->696|2241->710|2261->721|2300->722|2347->750|2360->754|2399->755|2446->770|2505->793|2518->797|2549->806|2601->826|2644->838|2823->981|2846->995|2885->996|2947->1026|3104->1146|3123->1155|3161->1170|3289->1262|3314->1278|3353->1279|3415->1309|3582->1439|3601->1448|3641->1465|3818->1606|3833->1612|3896->1653|3935->1656|3953->1665|3981->1671|4098->1752|4140->1772|4249->1845|4285->1872|4324->1873|4413->1926|4453->1950|4492->1951|4555->1978|4570->1984|4618->2010|4693->2049|4706->2052|4734->2057|4792->2083|4848->2107|4899->2122|4965->2179|5004->2180|5058->2198|5141->2272|5180->2273|5256->2313|5271->2319|5335->2361|5382->2389|5395->2393|5434->2394|5493->2417|5517->2432|5556->2433|5966->2824|5979->2828|6018->2829|6164->2943|7053->3796|7073->3807|7127->3839|7288->3964|7306->3973|7331->3976|7478->4087|7525->4118|7564->4119|7661->4180|7675->4185|7704->4192|7743->4195|7757->4200|7786->4207|7870->4258|8588->4943|8635->4957|8837->5122|8853->5128|8918->5169|8959->5172|8979->5181|9013->5191|9098->5239|9117->5248|9152->5260
                    LINES: 26->2|30->2|31->4|32->5|32->5|32->5|33->6|33->6|33->6|35->8|35->8|35->8|38->11|38->11|38->11|40->13|40->13|40->13|42->15|43->16|43->16|43->16|45->18|45->18|45->18|46->19|46->19|46->19|48->21|48->21|48->21|50->23|51->24|51->24|51->24|53->26|54->27|60->33|60->33|60->33|63->36|64->37|64->37|64->37|67->40|67->40|67->40|70->43|72->45|72->45|72->45|79->52|79->52|79->52|79->52|79->52|79->52|84->57|84->57|87->60|87->60|87->60|89->62|89->62|89->62|90->63|90->63|90->63|90->63|90->63|90->63|91->64|93->66|95->68|95->68|95->68|96->69|96->69|96->69|97->70|97->70|97->70|98->71|98->71|98->71|100->73|100->73|100->73|106->79|106->79|106->79|109->82|122->95|122->95|122->95|123->96|123->96|123->96|125->98|125->98|125->98|126->99|126->99|126->99|126->99|126->99|126->99|127->100|145->118|146->119|158->131|158->131|158->131|158->131|158->131|158->131|160->133|160->133|160->133
                    -- GENERATED --
                */
            