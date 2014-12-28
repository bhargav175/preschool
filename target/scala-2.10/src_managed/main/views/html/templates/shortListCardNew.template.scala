
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
object shortListCardNew extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[models.content.ShortNote,Boolean,Boolean,Boolean,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(shortNote:models.content.ShortNote,hasUpvoted:Boolean,hasDownvoted:Boolean,hasReported:Boolean):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import models.content.FlagType


Seq[Any](format.raw/*2.98*/("""
"""),format.raw/*4.1*/("""
<div class="postCard shortNote"  id="shortNote"""),_display_(Seq[Any](/*5.48*/shortNote/*5.57*/.id)),format.raw/*5.60*/("""" style="overflow:hidden">
    <div class="col-md-3 postCardSidebar">

        <p><button class="btn
                            """),_display_(Seq[Any](/*9.30*/if(hasUpvoted)/*9.44*/{_display_(Seq[Any](format.raw/*9.45*/("""
            btn-success disabled

        """)))}/*12.10*/else/*12.14*/{_display_(Seq[Any](format.raw/*12.15*/("""
            btn-default
        """)))})),format.raw/*14.10*/("""
            upvote-button
        " ng-click='doUpvote($event)'><i class="fa fa-chevron-up" ></i> <span class="badge upvote-badge">"""),_display_(Seq[Any](/*16.107*/shortNote/*16.116*/.upvotes.size())),format.raw/*16.131*/("""</span></button></p>

        <p><button class="btn btn-default
                            """),_display_(Seq[Any](/*19.30*/if(hasDownvoted)/*19.46*/{_display_(Seq[Any](format.raw/*19.47*/("""
            btn-success disabled

        """)))}/*22.10*/else/*22.14*/{_display_(Seq[Any](format.raw/*22.15*/("""
            btn-default
            """)))})),format.raw/*24.14*/("""
            downvote-button
        " ng-click="doDownvote($event)"><i class="fa fa-chevron-down" ></i> <span class="badge downvote-badge"> """),_display_(Seq[Any](/*26.114*/shortNote/*26.123*/.downvotes.size())),format.raw/*26.140*/("""</span></button></p>

    </div>
    <div class="col-md-9">
        <div class="postCardHeader">

            <div class="postCardBodyContentTop">
                <h1 class="page-header capitalize">"""),_display_(Seq[Any](/*33.53*/shortNote/*33.62*/.title)),format.raw/*33.68*/("""</h1>
            </div>

            <div class="postCardHeaderContentBottom">
                <span class="capitalize userMeta">                <a href=""""),_display_(Seq[Any](/*37.77*/routes/*37.83*/.Application.profile(shortNote.user.name))),format.raw/*37.124*/("""">"""),_display_(Seq[Any](/*37.127*/shortNote/*37.136*/.user.name)),format.raw/*37.146*/(""" </a>
                </span>
                <span class="label label-info date-label">"""),_display_(Seq[Any](/*39.60*/shortNote/*39.69*/.createdTime)),format.raw/*39.81*/("""</span>
            </div>

        </div>
        <div class="postCardFeaturedImage">
        <a href="#" class="thumbnail">
        """),_display_(Seq[Any](/*45.10*/if(shortNote.featuredImage!=null)/*45.43*/{_display_(Seq[Any](format.raw/*45.44*/("""

                <img src="assets/"""),_display_(Seq[Any](/*47.35*/shortNote/*47.44*/.featuredImage.path.substring(6))),format.raw/*47.76*/("""">

        """)))}/*49.10*/else/*49.14*/{_display_(Seq[Any](format.raw/*49.15*/("""
                <img src=""""),_display_(Seq[Any](/*50.28*/routes/*50.34*/.Assets.at("img/landingpage/banner-bg.jpg"))),format.raw/*50.77*/("""">

        """)))})),format.raw/*52.10*/("""
        </a>
      </div>

        """),_display_(Seq[Any](/*56.10*/if(shortNote.flags.size()>0)/*56.38*/{_display_(Seq[Any](format.raw/*56.39*/("""

            <div class="alert alert-danger"> This post is flagged under """),_display_(Seq[Any](/*58.74*/for((flag,index)<-shortNote.flags.zipWithIndex) yield /*58.121*/{_display_(Seq[Any](format.raw/*58.122*/("""
                """),_display_(Seq[Any](/*59.18*/if(index>0)/*59.29*/{_display_(Seq[Any](format.raw/*59.30*/("""
                    ,
            """)))}/*61.14*/else/*61.18*/{_display_(Seq[Any](format.raw/*61.19*/("""

                """)))})),format.raw/*63.18*/("""
                <strong> """),_display_(Seq[Any](/*64.27*/flag/*64.31*/.flagType)),format.raw/*64.40*/("""</strong>

            """)))})),format.raw/*66.14*/("""</div>
        """)))})),format.raw/*67.10*/("""
        <div class="postCardBody">

            <div class=" ">

                <div class="postCardBodyHtml">


                """),_display_(Seq[Any](/*75.18*/Html(shortNote.html))),format.raw/*75.38*/("""
                </div>
                <div class="postCardBodyContentBottom">
                    """),_display_(Seq[Any](/*78.22*/if(shortNote.tags.size()>0)/*78.49*/{_display_(Seq[Any](format.raw/*78.50*/("""
                        <i class="fa fa-tags"></i>
                        """),_display_(Seq[Any](/*80.26*/for(tag<-shortNote.tags) yield /*80.50*/{_display_(Seq[Any](format.raw/*80.51*/("""
                            <a href=""""),_display_(Seq[Any](/*81.39*/routes/*81.45*/.Application.tag(tag.slug))),format.raw/*81.71*/(""""> <label class="label label-info">"""),_display_(Seq[Any](/*81.107*/tag/*81.110*/.slug)),format.raw/*81.115*/("""</label></a>
                        """)))})),format.raw/*82.26*/("""
                        |
                    """)))})),format.raw/*84.22*/("""

                    """),_display_(Seq[Any](/*86.22*/if(controllers.Application.getLocalUser(session())!=null)/*86.79*/{_display_(Seq[Any](format.raw/*86.80*/("""
                        """),_display_(Seq[Any](/*87.26*/if(shortNote.user.equals(controllers.Application.getLocalUser(session())))/*87.100*/{_display_(Seq[Any](format.raw/*87.101*/("""
                            <a class="" href=""""),_display_(Seq[Any](/*88.48*/routes/*88.54*/.Application.editShortnote(shortNote.slug))),format.raw/*88.96*/("""">Edit</a>
                        """)))}/*89.26*/else/*89.30*/{_display_(Seq[Any](format.raw/*89.31*/("""

                            """),_display_(Seq[Any](/*91.30*/if(hasReported)/*91.45*/{_display_(Seq[Any](format.raw/*91.46*/("""
                                <a id="reportButton"  data-toggle="tooltip" data-placement="top" title="You Have Already Reported This Post">Report Abuse  <i class="fa fa-check"></i> </a>
                                <script>
                                console.log($("#reportButton" ).tooltip());
                                $("#reportButton").tooltip();
                                </script>
                            """)))}/*97.30*/else/*97.34*/{_display_(Seq[Any](format.raw/*97.35*/("""

                                <a  data-toggle="modal" data-target="#abuseModal">Report Abuse</a>
                            """)))})),format.raw/*100.30*/("""


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
                                            <form action=""""),_display_(Seq[Any](/*113.60*/controllers/*113.71*/.content.routes.ShortNote.report)),format.raw/*113.103*/("""" method="post" ng-submit="submit($event)" >
                                                <input type="hidden"  name="id" value=""""),_display_(Seq[Any](/*114.89*/shortNote/*114.98*/.id)),format.raw/*114.101*/("""">
                                                <select name="reportType">
                                                """),_display_(Seq[Any](/*116.50*/for(fType <- FlagType.values()) yield /*116.81*/{_display_(Seq[Any](format.raw/*116.82*/("""
                                                    <option value=""""),_display_(Seq[Any](/*117.69*/fType/*117.74*/.name())),format.raw/*117.81*/("""">"""),_display_(Seq[Any](/*117.84*/fType/*117.89*/.name())),format.raw/*117.96*/("""</option>
                                                """)))})),format.raw/*118.50*/("""
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

                        """)))})),format.raw/*136.26*/("""
                    """)))})),format.raw/*137.22*/("""


                </div>

            </div>
            <div class="clearfix"></div>
        </div>





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
                    SOURCE: W:/Pre School/app/views/templates/shortListCardNew.scala.html
                    HASH: 4fd518375297d1309bb2538fc478a8c8ee5fd86d
                    MATRIX: 837->2|1058->98|1085->131|1168->179|1185->188|1209->191|1374->321|1396->335|1434->336|1497->380|1510->384|1549->385|1615->419|1785->552|1804->561|1842->576|1971->669|1996->685|2035->686|2098->730|2111->734|2150->735|2220->773|2399->915|2418->924|2458->941|2693->1140|2711->1149|2739->1155|2931->1311|2946->1317|3010->1358|3050->1361|3069->1370|3102->1380|3227->1469|3245->1478|3279->1490|3450->1625|3492->1658|3531->1659|3603->1695|3621->1704|3675->1736|3707->1749|3720->1753|3759->1754|3823->1782|3838->1788|3903->1831|3948->1844|4021->1881|4058->1909|4097->1910|4208->1985|4272->2032|4312->2033|4366->2051|4386->2062|4425->2063|4480->2099|4493->2103|4532->2104|4583->2123|4646->2150|4659->2154|4690->2163|4746->2187|4794->2203|4962->2335|5004->2355|5141->2456|5177->2483|5216->2484|5329->2561|5369->2585|5408->2586|5483->2625|5498->2631|5546->2657|5619->2693|5632->2696|5660->2701|5730->2739|5810->2787|5869->2810|5935->2867|5974->2868|6036->2894|6120->2968|6160->2969|6244->3017|6259->3023|6323->3065|6378->3101|6391->3105|6430->3106|6497->3137|6521->3152|6560->3153|7018->3592|7031->3596|7070->3597|7233->3727|8211->4668|8232->4679|8288->4711|8458->4844|8477->4853|8504->4856|8668->4983|8716->5014|8756->5015|8862->5084|8877->5089|8907->5096|8947->5099|8962->5104|8992->5111|9084->5170|9906->5959|9961->5981
                    LINES: 26->2|30->2|31->4|32->5|32->5|32->5|36->9|36->9|36->9|39->12|39->12|39->12|41->14|43->16|43->16|43->16|46->19|46->19|46->19|49->22|49->22|49->22|51->24|53->26|53->26|53->26|60->33|60->33|60->33|64->37|64->37|64->37|64->37|64->37|64->37|66->39|66->39|66->39|72->45|72->45|72->45|74->47|74->47|74->47|76->49|76->49|76->49|77->50|77->50|77->50|79->52|83->56|83->56|83->56|85->58|85->58|85->58|86->59|86->59|86->59|88->61|88->61|88->61|90->63|91->64|91->64|91->64|93->66|94->67|102->75|102->75|105->78|105->78|105->78|107->80|107->80|107->80|108->81|108->81|108->81|108->81|108->81|108->81|109->82|111->84|113->86|113->86|113->86|114->87|114->87|114->87|115->88|115->88|115->88|116->89|116->89|116->89|118->91|118->91|118->91|124->97|124->97|124->97|127->100|140->113|140->113|140->113|141->114|141->114|141->114|143->116|143->116|143->116|144->117|144->117|144->117|144->117|144->117|144->117|145->118|163->136|164->137
                    -- GENERATED --
                */
            