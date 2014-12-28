
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
object userInfoCard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user:User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import be.objectify.deadbolt.java.views.html._


Seq[Any](format.raw/*1.13*/("""

"""),format.raw/*4.1*/("""
<div class="jumbotron">

<div class="userInfoCard" ng-controller="userProfilePageController">
    <h1 id="profile-user-name">"""),_display_(Seq[Any](/*8.33*/user/*8.37*/.name)),format.raw/*8.42*/("""</h1>
    <p class="label label-info">"""),_display_(Seq[Any](/*9.34*/user/*9.38*/.score)),format.raw/*9.44*/("""</p>
    """),_display_(Seq[Any](/*10.6*/subjectPresentOr()/*10.24*/{_display_(Seq[Any](format.raw/*10.25*/("""

<hr>
        <legend> <a data-toggle="modal" data-target="#favoriteTagsModal">Favorite Tags</a></legend>
        <p>"""),_display_(Seq[Any](/*14.13*/for(tag<-user.favoriteTags) yield /*14.40*/{_display_(Seq[Any](format.raw/*14.41*/("""
            """),_display_(Seq[Any](/*15.14*/if(user.favoriteTags.indexOf(tag)<5)/*15.50*/{_display_(Seq[Any](format.raw/*15.51*/("""
                <a href=""""),_display_(Seq[Any](/*16.27*/routes/*16.33*/.Application.tag(tag.slug))),format.raw/*16.59*/("""" class="badge">"""),_display_(Seq[Any](/*16.76*/tag/*16.79*/.name)),format.raw/*16.84*/("""</a>
            """)))})),format.raw/*17.14*/("""

        """)))})),format.raw/*19.10*/("""</p>


            <!--Tag modal-->

        <div class="modal fade" id="favoriteTagsModal" tabindex="-1" role="dialog" aria-labelledby="favoriteTagsModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="favoriteTagsModalLabel">Favorite Tags</h4>
                    </div>
                    <div class="modal-body">
                        <ul class="list-group">

                        """),_display_(Seq[Any](/*34.26*/for(tag<-user.favoriteTags) yield /*34.53*/{_display_(Seq[Any](format.raw/*34.54*/("""
                            <li class="list-group-item"><a href=""""),_display_(Seq[Any](/*35.67*/routes/*35.73*/.Application.tag(tag.slug))),format.raw/*35.99*/(""""><span class="capitalize">"""),_display_(Seq[Any](/*35.127*/tag/*35.130*/.name)),format.raw/*35.135*/("""</span></a></li>

                        """)))})),format.raw/*37.26*/("""
                        </ul>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Okay</button>

                    </div>
                </div>
            </div>
        </div>


        <hr>
         <legend> <a data-toggle="modal" data-target="#followerModal">Followers</a></legend>
        <p>"""),_display_(Seq[Any](/*51.13*/user/*51.17*/.followers.size())),format.raw/*51.34*/("""</p>
            <!--Follower modal-->

        <div class="modal fade" id="followerModal" tabindex="-1" role="dialog" aria-labelledby="followersModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="followersModalLabel">Followers</h4>
                    </div>
                    <div class="modal-body">
                        <ul class="list-group">

                    """),_display_(Seq[Any](/*64.22*/for(follower<-user.followers) yield /*64.51*/{_display_(Seq[Any](format.raw/*64.52*/("""
                        <li class="list-group-item"><span class="capitalize">"""),_display_(Seq[Any](/*65.79*/follower/*65.87*/.name)),format.raw/*65.92*/("""</span></li>

                        """)))})),format.raw/*67.26*/("""
                            </ul>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Okay</button>

                    </div>
                </div>
            </div>
        </div>

            <!-- -->
        <hr>
        <legend> <a data-toggle="modal" data-target="#followingModal">
            Following</a></legend>
        <p>"""),_display_(Seq[Any](/*82.13*/user/*82.17*/.following.size())),format.raw/*82.34*/("""</p>


        <!--Foloowing modal-->

        <div class="modal fade" id="followingModal" tabindex="-1" role="dialog" aria-labelledby="followingModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                        <h4 class="modal-title" id="followingModalLabel">Following</h4>
                    </div>
                    <div class="modal-body">
                        <ul class="list-group">



                        """),_display_(Seq[Any](/*99.26*/for(following<-user.following) yield /*99.56*/{_display_(Seq[Any](format.raw/*99.57*/("""
                            <li class="list-group-item"><span class="capitalize">"""),_display_(Seq[Any](/*100.83*/following/*100.92*/.name)),format.raw/*100.97*/("""</span></li>

                        """)))})),format.raw/*102.26*/("""
                        </ul>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Okay</button>
                    </div>
                </div>
            </div>
        </div>

        <!-- -->



    """),_display_(Seq[Any](/*116.6*/defining(Application.getLocalUser(session()))/*116.51*/ { localUser =>_display_(Seq[Any](format.raw/*116.66*/("""
        """),_display_(Seq[Any](/*117.10*/if(localUser.equals(user))/*117.36*/{_display_(Seq[Any](format.raw/*117.37*/("""

        """)))}/*119.10*/else/*119.14*/{_display_(Seq[Any](format.raw/*119.15*/("""
            <hr>

            <p ng-hide="following"><button class="btn btn-primary" id="follow_button" ng-click="followUser()" >Follow <i class="fa fa-plus"></i></button></p>

            <p ng-show="following"><button class="btn btn-default" id="unfollow_button" ng-click="unfollowUser()" >UnFollow <i class="fa fa-minus"></i></button></p>
        """)))})),format.raw/*125.10*/("""
    """)))})),format.raw/*126.6*/("""
    """)))}/*127.6*/{_display_(Seq[Any](format.raw/*127.7*/("""

    """)))})),format.raw/*129.6*/("""
</div>
</div>"""))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:44 IST 2014
                    SOURCE: W:/Pre School/app/views/templates/userInfoCard.scala.html
                    HASH: b28a5a06c57ccb64946befe2f423f435c7c865b8
                    MATRIX: 789->1|941->12|969->62|1131->189|1143->193|1169->198|1243->237|1255->241|1282->247|1327->257|1354->275|1393->276|1548->395|1591->422|1630->423|1680->437|1725->473|1764->474|1827->501|1842->507|1890->533|1943->550|1955->553|1982->558|2032->576|2075->587|2827->1303|2870->1330|2909->1331|3012->1398|3027->1404|3075->1430|3140->1458|3153->1461|3181->1466|3256->1509|3707->1924|3720->1928|3759->1945|4496->2646|4541->2675|4580->2676|4695->2755|4712->2763|4739->2768|4810->2807|5298->3259|5311->3263|5350->3280|6093->3987|6139->4017|6178->4018|6298->4101|6317->4110|6345->4115|6417->4154|6773->4474|6828->4519|6882->4534|6929->4544|6965->4570|7005->4571|7036->4582|7050->4586|7090->4587|7475->4939|7513->4945|7538->4951|7577->4952|7616->4959
                    LINES: 26->1|30->1|32->4|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|44->16|44->16|44->16|45->17|47->19|62->34|62->34|62->34|63->35|63->35|63->35|63->35|63->35|63->35|65->37|79->51|79->51|79->51|92->64|92->64|92->64|93->65|93->65|93->65|95->67|110->82|110->82|110->82|127->99|127->99|127->99|128->100|128->100|128->100|130->102|144->116|144->116|144->116|145->117|145->117|145->117|147->119|147->119|147->119|153->125|154->126|155->127|155->127|157->129
                    -- GENERATED --
                */
            