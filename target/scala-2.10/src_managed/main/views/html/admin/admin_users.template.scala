
package views.html.admin

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
object admin_users extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.admin.partials._

def /*3.6*/scripts/*3.13*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.15*/("""
        <script src='"""),_display_(Seq[Any](/*4.23*/routes/*4.29*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*4.63*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*5.23*/routes/*5.29*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*5.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*6.23*/routes/*6.29*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*6.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*7.23*/routes/*7.29*/.Assets.at("js/angular.js"))),format.raw/*7.56*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*8.23*/routes/*8.29*/.Assets.at("js/angular-route.min.js"))),format.raw/*8.66*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*9.69*/("""'></script>
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
        <script src='"""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*11.77*/("""'></script>


        <script src='"""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("js/restangular.js"))),format.raw/*14.60*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*15.72*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*16.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("js/angularapps/admin-dashboard.js"))),format.raw/*17.76*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("js/angularapps/admin-data.js"))),format.raw/*18.71*/("""'></script>
    """)))};def /*20.6*/scriptsTop/*20.16*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.18*/("""

    """)))};def /*23.6*/links/*23.11*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*23.13*/("""
        <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
        <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
        <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*27.39*/routes/*27.45*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*27.84*/("""'>
        <link rel="stylesheet" href='"""),_display_(Seq[Any](/*28.39*/routes/*28.45*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*28.91*/("""'>
    """)))};
Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*19.6*/("""
    """),format.raw/*22.6*/("""
    """),format.raw/*29.6*/("""
"""),_display_(Seq[Any](/*30.2*/template_admin_dashboard(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*30.105*/ {_display_(Seq[Any](format.raw/*30.107*/("""


<div class="adminData" ng-app="adminData">
    <div class="container-fluid" ng-controller="userController" ng-init="init()">
        <div class="col-md-12">
               <div class="users-table" id="users">    <legend>Users</legend>
                    <button class="btn btn-primary" ng-click="changeRoles()"  ng-disabled="!usersSelected" >Change Roles</button>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Select</th>
                                <th>#</th>
                                <th>User Name</th>
                                <th>User Email</th>
                                <th>User Role</th>
                                <th>User LastLogin</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr ng-repeat="user in usersList">
                                <td><input type="checkbox" class="user-checkbox" data-user-id=""""),format.raw/*51.96*/("""{"""),format.raw/*51.97*/("""{"""),format.raw/*51.98*/("""$index"""),format.raw/*51.104*/("""}"""),format.raw/*51.105*/("""}"""),format.raw/*51.106*/("""">
                                </td>
                                <td>"""),format.raw/*53.37*/("""{"""),format.raw/*53.38*/("""{"""),format.raw/*53.39*/("""$index+1"""),format.raw/*53.47*/("""}"""),format.raw/*53.48*/("""}"""),format.raw/*53.49*/("""</td>
                                <td>"""),format.raw/*54.37*/("""{"""),format.raw/*54.38*/("""{"""),format.raw/*54.39*/("""user.name"""),format.raw/*54.48*/("""}"""),format.raw/*54.49*/("""}"""),format.raw/*54.50*/("""</td>
                                <td>"""),format.raw/*55.37*/("""{"""),format.raw/*55.38*/("""{"""),format.raw/*55.39*/("""user.email"""),format.raw/*55.49*/("""}"""),format.raw/*55.50*/("""}"""),format.raw/*55.51*/("""</td>
                                <td><span ng-repeat="role in user.roles">"""),format.raw/*56.74*/("""{"""),format.raw/*56.75*/("""{"""),format.raw/*56.76*/("""role.roleName"""),format.raw/*56.89*/("""}"""),format.raw/*56.90*/("""}"""),format.raw/*56.91*/("""</span></td>
                                <td>"""),format.raw/*57.37*/("""{"""),format.raw/*57.38*/("""{"""),format.raw/*57.39*/("""user.lastLogin |date:'MMM d, y h:mm:ss a Z'"""),format.raw/*57.82*/("""}"""),format.raw/*57.83*/("""}"""),format.raw/*57.84*/("""</td>
                            </tr>
                        </tbody>
                    </table></div>
        </div>
    </div>

</div>




""")))})))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:42 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_users.scala.html
                    HASH: 7f177f43c6b083d36ce32a49e70377ddf90f36d3
                    MATRIX: 791->1|934->74|949->81|1033->83|1091->106|1105->112|1160->146|1229->180|1243->186|1308->230|1377->264|1391->270|1449->307|1518->341|1532->347|1580->374|1649->408|1663->414|1721->451|1790->485|1804->491|1865->531|2066->696|2081->702|2151->750|2223->786|2238->792|2291->823|2361->857|2376->863|2441->906|2511->940|2526->946|2592->990|2662->1024|2677->1030|2746->1077|2816->1111|2831->1117|2895->1159|2935->1182|2954->1192|3039->1194|3069->1207|3083->1212|3168->1214|3546->1556|3561->1562|3622->1601|3699->1642|3714->1648|3782->1694|3829->32|3856->69|3887->1176|3919->1201|3951->1702|3988->1704|4101->1807|4142->1809|5218->2857|5247->2858|5276->2859|5311->2865|5341->2866|5371->2867|5476->2944|5505->2945|5534->2946|5570->2954|5599->2955|5628->2956|5698->2998|5727->2999|5756->3000|5793->3009|5822->3010|5851->3011|5921->3053|5950->3054|5979->3055|6017->3065|6046->3066|6075->3067|6182->3146|6211->3147|6240->3148|6281->3161|6310->3162|6339->3163|6416->3212|6445->3213|6474->3214|6545->3257|6574->3258|6603->3259
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->20|47->20|49->20|51->23|51->23|53->23|57->27|57->27|57->27|58->28|58->28|58->28|60->1|61->3|61->19|62->22|63->29|64->30|64->30|64->30|85->51|85->51|85->51|85->51|85->51|85->51|87->53|87->53|87->53|87->53|87->53|87->53|88->54|88->54|88->54|88->54|88->54|88->54|89->55|89->55|89->55|89->55|89->55|89->55|90->56|90->56|90->56|90->56|90->56|90->56|91->57|91->57|91->57|91->57|91->57|91->57
                    -- GENERATED --
                */
            