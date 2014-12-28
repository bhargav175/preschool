
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
object admin_dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import views.html.admin._

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
        <script src='"""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*15.73*/("""'></script>
        <script src='"""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("js/angular-file-upload.min.js"))),format.raw/*16.72*/("""'></script>

        <script src='"""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("js/angularapps/admin-dashboard.js"))),format.raw/*18.76*/("""'></script>
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


<div ng-app="adminDashboard">
    <div class="container-fluid"  ng-controller="subjectController" ng-init="init()">

      <div class="col-md-8">



      </div>
        <div class="col-md-4" >







    </div>


    </div>
</div>

    <script>
    $(function()"""),format.raw/*56.17*/("""{"""),format.raw/*56.18*/("""
    function initToolbarBootstrapBindings() """),format.raw/*57.45*/("""{"""),format.raw/*57.46*/("""
    var fonts = ['Serif', 'Sans', 'Arial', 'Arial Black', 'Courier',
    'Courier New', 'Comic Sans MS', 'Helvetica', 'Impact', 'Lucida Grande', 'Lucida Sans', 'Tahoma', 'Times',
    'Times New Roman', 'Verdana'],
    fontTarget = $('[title=Font]').siblings('.dropdown-menu');
    $.each(fonts, function (idx, fontName) """),format.raw/*62.44*/("""{"""),format.raw/*62.45*/("""
    fontTarget.append($('<li><a data-edit="fontName ' + fontName +'" style="font-family:\''+ fontName +'\'">'+fontName + '</a></li>'));
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/(""");
    $('a[title]').tooltip("""),format.raw/*65.27*/("""{"""),format.raw/*65.28*/("""container:'body'"""),format.raw/*65.44*/("""}"""),format.raw/*65.45*/(""");
    $('.dropdown-menu input').click(function() """),format.raw/*66.48*/("""{"""),format.raw/*66.49*/("""return false;"""),format.raw/*66.62*/("""}"""),format.raw/*66.63*/(""")
    .change(function () """),format.raw/*67.25*/("""{"""),format.raw/*67.26*/("""$(this).parent('.dropdown-menu').siblings('.dropdown-toggle').dropdown('toggle');"""),format.raw/*67.107*/("""}"""),format.raw/*67.108*/(""")
    .keydown('esc', function () """),format.raw/*68.33*/("""{"""),format.raw/*68.34*/("""this.value='';$(this).change();"""),format.raw/*68.65*/("""}"""),format.raw/*68.66*/(""");

    $('[data-role=magic-overlay]').each(function () """),format.raw/*70.53*/("""{"""),format.raw/*70.54*/("""
    var overlay = $(this), target = $(overlay.data('target'));
    overlay.css('opacity', 0).css('position', 'absolute').offset(target.offset()).width(target.outerWidth()).height(target.outerHeight());
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/(""");
    if ("onwebkitspeechchange"  in document.createElement("input")) """),format.raw/*74.69*/("""{"""),format.raw/*74.70*/("""
    var editorOffset = $('.editor').offset();
    //    $('#voiceBtn').css('position','absolute').offset("""),format.raw/*76.60*/("""{"""),format.raw/*76.61*/("""top: editorOffset.top, left: editorOffset.left+$('#editor').innerWidth()-35"""),format.raw/*76.136*/("""}"""),format.raw/*76.137*/(""");
    """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""" else """),format.raw/*77.12*/("""{"""),format.raw/*77.13*/("""
    $('#voiceBtn').hide();
    """),format.raw/*79.5*/("""}"""),format.raw/*79.6*/("""
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/(""";
    function showErrorAlert (reason, detail) """),format.raw/*81.46*/("""{"""),format.raw/*81.47*/("""
    var msg='';
    if (reason==='unsupported-file-type') """),format.raw/*83.43*/("""{"""),format.raw/*83.44*/(""" msg = "Unsupported format " +detail; """),format.raw/*83.82*/("""}"""),format.raw/*83.83*/("""
    else """),format.raw/*84.10*/("""{"""),format.raw/*84.11*/("""
    console.log("error uploading file", reason, detail);
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/("""
    $('<div class="alert"> <button type="button" class="close" data-dismiss="alert">&times;</button>'+
    '<strong>File upload error</strong> '+msg+' </div>').prependTo('#alerts');
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/(""";
    initToolbarBootstrapBindings();
    $('.editor').wysiwyg("""),format.raw/*91.26*/("""{"""),format.raw/*91.27*/(""" fileUploadError: showErrorAlert"""),format.raw/*91.59*/("""}"""),format.raw/*91.60*/(""" );
    window.prettyPrint && prettyPrint();
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/(""");

    </script>



""")))})))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:35 IST 2014
                    SOURCE: W:/Pre School/app/views/admin/admin_dashboard.scala.html
                    HASH: 4aa95600c15a01c02207d65bcfd9baf6ed7fcc71
                    MATRIX: 795->1|929->65|944->72|1028->74|1086->97|1100->103|1155->137|1224->171|1238->177|1303->221|1372->255|1386->261|1444->298|1513->332|1527->338|1575->365|1644->399|1658->405|1716->442|1785->476|1799->482|1860->522|2061->687|2076->693|2146->741|2218->777|2233->783|2286->814|2356->848|2371->854|2437->898|2507->932|2522->938|2587->981|2658->1016|2673->1022|2742->1069|2782->1092|2801->1102|2886->1104|2916->1117|2930->1122|3015->1124|3393->1466|3408->1472|3469->1511|3546->1552|3561->1558|3629->1604|3676->32|3703->60|3734->1086|3766->1111|3798->1612|3835->1614|3948->1717|3989->1719|4282->1984|4311->1985|4384->2030|4413->2031|4762->2352|4791->2353|4959->2494|4987->2495|5044->2524|5073->2525|5117->2541|5146->2542|5224->2592|5253->2593|5294->2606|5323->2607|5377->2633|5406->2634|5516->2715|5546->2716|5608->2750|5637->2751|5696->2782|5725->2783|5809->2839|5838->2840|6072->3047|6100->3048|6199->3119|6228->3120|6362->3226|6391->3227|6495->3302|6525->3303|6559->3310|6587->3311|6621->3317|6650->3318|6709->3350|6737->3351|6769->3356|6797->3357|6872->3404|6901->3405|6988->3464|7017->3465|7083->3503|7112->3504|7150->3514|7179->3515|7268->3577|7296->3578|7510->3765|7538->3766|7629->3829|7658->3830|7718->3862|7747->3863|7823->3912|7851->3913
                    LINES: 26->1|29->3|29->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|39->11|39->11|39->11|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|46->18|47->20|47->20|49->20|51->23|51->23|53->23|57->27|57->27|57->27|58->28|58->28|58->28|60->1|61->3|61->19|62->22|63->29|64->30|64->30|64->30|90->56|90->56|91->57|91->57|96->62|96->62|98->64|98->64|99->65|99->65|99->65|99->65|100->66|100->66|100->66|100->66|101->67|101->67|101->67|101->67|102->68|102->68|102->68|102->68|104->70|104->70|107->73|107->73|108->74|108->74|110->76|110->76|110->76|110->76|111->77|111->77|111->77|111->77|113->79|113->79|114->80|114->80|115->81|115->81|117->83|117->83|117->83|117->83|118->84|118->84|120->86|120->86|123->89|123->89|125->91|125->91|125->91|125->91|127->93|127->93
                    -- GENERATED --
                */
            