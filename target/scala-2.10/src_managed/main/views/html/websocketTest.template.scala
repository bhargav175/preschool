
package views.html

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
object websocketTest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[models.User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(localUser: models.User = null):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*2.2*/scripts/*2.9*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.11*/("""
    <script src='"""),_display_(Seq[Any](/*3.19*/routes/*3.25*/.Assets.at("js/jquery.hotkeys.js"))),format.raw/*3.59*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*4.19*/routes/*4.25*/.Assets.at("js/google-prettify/prettify.js"))),format.raw/*4.69*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("js/bootstrap-wysiwyg.js"))),format.raw/*5.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*6.19*/routes/*6.25*/.Assets.at("js/angular.js"))),format.raw/*6.52*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*7.19*/routes/*7.25*/.Assets.at("js/angular-route.min.js"))),format.raw/*7.62*/("""'></script>
    <script src='"""),_display_(Seq[Any](/*8.19*/routes/*8.25*/.Assets.at("js/angular-sanitize.min.js"))),format.raw/*8.65*/("""'></script>
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/underscore.js/1.4.4/underscore-min.js"></script>
    <script src='"""),_display_(Seq[Any](/*10.19*/routes/*10.25*/.Assets.at("js/ui-bootstrap-tpls-0.11.0.min.js"))),format.raw/*10.73*/("""'></script>


    <script src='"""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("js/restangular.js"))),format.raw/*13.56*/("""'></script>
    <script src=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Assets.at("js/modules/user_home.js"))),format.raw/*14.62*/(""""></script>

    <script src='"""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("js/angularapps/user_profile.js"))),format.raw/*16.69*/("""'></script>

""")))};def /*19.2*/scriptsTop/*19.12*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.14*/("""

""")))};def /*22.2*/links/*22.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*22.9*/("""
    <link rel="apple-touch-icon" href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
    <link rel="shortcut icon" href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico" >
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*26.35*/routes/*26.41*/.Assets.at("css/bootstrap-wysiwyg.css"))),format.raw/*26.80*/("""'>
    <link rel="stylesheet" href='"""),_display_(Seq[Any](/*27.35*/routes/*27.41*/.Assets.at("css/google-prettify/prettify.css"))),format.raw/*27.87*/("""'>
""")))};
Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*18.2*/("""
"""),format.raw/*21.2*/("""
"""),format.raw/*28.2*/("""
"""),_display_(Seq[Any](/*29.2*/template_user_dashboard_semantic(Messages("playauthenticate.navigation.home"), "home",scriptsTop,scripts,links)/*29.113*/ {_display_(Seq[Any](format.raw/*29.115*/("""

<style>


*, *:before, *:after """),format.raw/*34.22*/("""{"""),format.raw/*34.23*/("""
-moz-box-sizing: border-box;
-webkit-box-sizing: border-box;
box-sizing: border-box;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

html """),format.raw/*40.6*/("""{"""),format.raw/*40.7*/("""
font-family: Helvetica, Arial, sans-serif;
font-size: 100%;
background: #333;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

#min-page-wrapper """),format.raw/*46.19*/("""{"""),format.raw/*46.20*/("""
width: 650px;
background: #FFF;
padding: 1em;
margin: 1em auto;
border-top: 5px solid #69c773;
box-shadow: 0 2px 10px rgba(0,0,0,0.8);
"""),format.raw/*53.1*/("""}"""),format.raw/*53.2*/("""

h1 """),format.raw/*55.4*/("""{"""),format.raw/*55.5*/("""
margin-top: 0;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""

#status """),format.raw/*59.9*/("""{"""),format.raw/*59.10*/("""
font-size: 0.9rem;
margin-bottom: 1rem;
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""

.open """),format.raw/*64.7*/("""{"""),format.raw/*64.8*/("""
color: green;
"""),format.raw/*66.1*/("""}"""),format.raw/*66.2*/("""

.closed """),format.raw/*68.9*/("""{"""),format.raw/*68.10*/("""
color: red;
"""),format.raw/*70.1*/("""}"""),format.raw/*70.2*/("""


ul """),format.raw/*73.4*/("""{"""),format.raw/*73.5*/("""
list-style: none;
margin: 0;
padding: 0;
font-size: 0.95rem;
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""

ul li """),format.raw/*80.7*/("""{"""),format.raw/*80.8*/("""
padding: 0.5rem 0.75rem;
border-bottom: 1px solid #EEE;
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""

ul li:first-child """),format.raw/*85.19*/("""{"""),format.raw/*85.20*/("""
border-top: 1px solid #EEE;
"""),format.raw/*87.1*/("""}"""),format.raw/*87.2*/("""

ul li span """),format.raw/*89.12*/("""{"""),format.raw/*89.13*/("""
display: inline-block;
width: 90px;
font-weight: bold;
color: #999;
font-size: 0.7rem;
text-transform: uppercase;
letter-spacing: 1px;
"""),format.raw/*97.1*/("""}"""),format.raw/*97.2*/("""

.sent """),format.raw/*99.7*/("""{"""),format.raw/*99.8*/("""
background-color: #F7F7F7;
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""

.received """),format.raw/*103.11*/("""{"""),format.raw/*103.12*/("""}"""),format.raw/*103.13*/("""

#message-form """),format.raw/*105.15*/("""{"""),format.raw/*105.16*/("""
margin-top: 1.5rem;
"""),format.raw/*107.1*/("""}"""),format.raw/*107.2*/("""

textarea """),format.raw/*109.10*/("""{"""),format.raw/*109.11*/("""
width: 100%;
padding: 0.5rem;
font-size: 1rem;
border: 1px solid #D9D9D9;
border-radius: 3px;
box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.1);
min-height: 100px;
margin-bottom: 1rem;
"""),format.raw/*118.1*/("""}"""),format.raw/*118.2*/("""

button """),format.raw/*120.8*/("""{"""),format.raw/*120.9*/("""
display: inline-block;
border-radius: 3px;
border: none;
font-size: 0.9rem;
padding: 0.6rem 1em;
color: white;
margin: 0 0.25rem;
text-align: center;
background: #BABABA;
border-bottom: 1px solid #999;
"""),format.raw/*131.1*/("""}"""),format.raw/*131.2*/("""

button[type="submit"] """),format.raw/*133.23*/("""{"""),format.raw/*133.24*/("""
background: #86b32d;
border-bottom: 1px solid #5d7d1f;
"""),format.raw/*136.1*/("""}"""),format.raw/*136.2*/("""

button:hover """),format.raw/*138.14*/("""{"""),format.raw/*138.15*/("""
opacity: 0.75;
cursor: pointer;
"""),format.raw/*141.1*/("""}"""),format.raw/*141.2*/("""
</style>

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Home</h1>
        </div>
            <!-- /.col-lg-12 -->
    </div>
    <div class="row">
    <div class="container-fluid" >

        <div id="min-page-wrapper">
            <h1>WebSockets Demo</h1>

            <div id="status">Connecting...</div>

            <ul id="messages"></ul>

            <form id="message-form" action="#" method="post">
                <textarea id="message" placeholder="Write your message here..." required></textarea>
                <button type="submit">Send Message</button>
                <button type="button" id="close">Close Connection</button>
            </form>
        </div>
    </div>
        <script>
        window.onload = function() """),format.raw/*168.36*/("""{"""),format.raw/*168.37*/("""

        // Get references to elements on the page.
        var form = document.getElementById('message-form');
        var messageField = document.getElementById('message');
        var messagesList = document.getElementById('messages');
        var socketStatus = document.getElementById('status');
        var closeBtn = document.getElementById('close');

        var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket;
        // Create a new WebSocket.
        """),format.raw/*179.85*/("""


        // Handle any errors that occur.
        socket.onerror = function(error) """),format.raw/*183.42*/("""{"""),format.raw/*183.43*/("""
        console.log('WebSocket Error: ' + error);
        """),format.raw/*185.9*/("""}"""),format.raw/*185.10*/(""";


        // Show a connected message when the WebSocket is opened.
        socket.onopen = function(event) """),format.raw/*189.41*/("""{"""),format.raw/*189.42*/("""
        socketStatus.innerHTML = 'Connected to: ' + event.currentTarget.URL;
        socketStatus.className = 'open';
        """),format.raw/*192.9*/("""}"""),format.raw/*192.10*/(""";


        // Handle messages sent by the server.
        socket.onmessage = function(event) """),format.raw/*196.44*/("""{"""),format.raw/*196.45*/("""
        var message = event.data;
        messagesList.innerHTML += '<li class="received"><span>Received:</span>' +
        message + '</li>';
        """),format.raw/*200.9*/("""}"""),format.raw/*200.10*/(""";


        // Show a disconnected message when the WebSocket is closed.
        socket.onclose = function(event) """),format.raw/*204.42*/("""{"""),format.raw/*204.43*/("""
        socketStatus.innerHTML = 'Disconnected from WebSocket.';
        socketStatus.className = 'closed';
        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/(""";


        // Send a message when the form is submitted.
        form.onsubmit = function(e) """),format.raw/*211.37*/("""{"""),format.raw/*211.38*/("""
        e.preventDefault();

        // Retrieve the message from the textarea.
        var message = messageField.value;

        // Send the message through the WebSocket.
        socket.send(JSON.stringify(message));

        // Add the message to the messages list.
        messagesList.innerHTML += '<li class="sent"><span>Sent:</span>' + message +
        '</li>';

        // Clear out the message field.
        messageField.value = '';

        return false;
        """),format.raw/*228.9*/("""}"""),format.raw/*228.10*/(""";


        // Close the WebSocket connection when the close button is clicked.
        closeBtn.onclick = function(e) """),format.raw/*232.40*/("""{"""),format.raw/*232.41*/("""
        e.preventDefault();

        // Close the WebSocket.
        socket.close();

        return false;
        """),format.raw/*239.9*/("""}"""),format.raw/*239.10*/(""";

        """),format.raw/*241.9*/("""}"""),format.raw/*241.10*/(""";

        </script>

</div>

""")))})))}
    }
    
    def render(localUser:models.User): play.api.templates.HtmlFormat.Appendable = apply(localUser)
    
    def f:((models.User) => play.api.templates.HtmlFormat.Appendable) = (localUser) => apply(localUser)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 28 16:26:29 IST 2014
                    SOURCE: W:/Pre School/app/views/websocketTest.scala.html
                    HASH: 2a8b5c7dc65d57a22d235b95eb1448ffbfdca8e6
                    MATRIX: 787->1|895->35|909->42|993->44|1048->64|1062->70|1117->104|1183->135|1197->141|1262->185|1328->216|1342->222|1400->259|1466->290|1480->296|1528->323|1594->354|1608->360|1666->397|1732->428|1746->434|1807->474|2002->633|2017->639|2087->687|2158->722|2173->728|2226->759|2293->790|2308->796|2367->833|2436->866|2451->872|2517->916|2556->935|2575->945|2660->947|2688->955|2701->960|2785->962|3151->1292|3166->1298|3227->1337|3301->1375|3316->1381|3384->1427|3428->32|3457->932|3486->952|3515->1432|3553->1435|3674->1546|3715->1548|3781->1586|3810->1587|3927->1677|3955->1678|3991->1687|4019->1688|4129->1771|4157->1772|4207->1794|4236->1795|4406->1938|4434->1939|4468->1946|4496->1947|4541->1965|4569->1966|4608->1978|4637->1979|4708->2023|4736->2024|4773->2034|4801->2035|4845->2052|4873->2053|4912->2065|4941->2066|4983->2081|5011->2082|5047->2091|5075->2092|5169->2159|5197->2160|5234->2170|5262->2171|5349->2231|5377->2232|5427->2254|5456->2255|5514->2286|5542->2287|5585->2302|5614->2303|5785->2447|5813->2448|5850->2458|5878->2459|5936->2489|5965->2490|6008->2504|6038->2505|6068->2506|6115->2524|6145->2525|6196->2548|6225->2549|6267->2562|6297->2563|6517->2755|6546->2756|6585->2767|6614->2768|6856->2982|6885->2983|6940->3009|6970->3010|7057->3069|7086->3070|7132->3087|7162->3088|7226->3124|7255->3125|8096->3937|8126->3938|8637->4496|8755->4585|8785->4586|8874->4647|8904->4648|9047->4762|9077->4763|9235->4893|9265->4894|9392->4992|9422->4993|9606->5149|9636->5150|9783->5268|9813->5269|9961->5389|9991->5390|10118->5488|10148->5489|10670->5983|10700->5984|10852->6107|10882->6108|11034->6232|11064->6233|11105->6246|11135->6247
                    LINES: 26->1|28->2|28->2|30->2|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|38->10|38->10|38->10|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|46->19|46->19|48->19|50->22|50->22|52->22|56->26|56->26|56->26|57->27|57->27|57->27|59->1|60->18|61->21|62->28|63->29|63->29|63->29|68->34|68->34|72->38|72->38|74->40|74->40|78->44|78->44|80->46|80->46|87->53|87->53|89->55|89->55|91->57|91->57|93->59|93->59|96->62|96->62|98->64|98->64|100->66|100->66|102->68|102->68|104->70|104->70|107->73|107->73|112->78|112->78|114->80|114->80|117->83|117->83|119->85|119->85|121->87|121->87|123->89|123->89|131->97|131->97|133->99|133->99|135->101|135->101|137->103|137->103|137->103|139->105|139->105|141->107|141->107|143->109|143->109|152->118|152->118|154->120|154->120|165->131|165->131|167->133|167->133|170->136|170->136|172->138|172->138|175->141|175->141|202->168|202->168|213->179|217->183|217->183|219->185|219->185|223->189|223->189|226->192|226->192|230->196|230->196|234->200|234->200|238->204|238->204|241->207|241->207|245->211|245->211|262->228|262->228|266->232|266->232|273->239|273->239|275->241|275->241
                    -- GENERATED --
                */
            