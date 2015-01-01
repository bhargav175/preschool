
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
object _passwordPartial extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(f: Form[_]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*5.1*/("""
             """),_display_(Seq[Any](/*6.15*/inputPassword(
                f("password"),
                '_label -> Messages("playauthenticate.login.password.placeholder")
             ))),format.raw/*9.15*/("""
             
             """),_display_(Seq[Any](/*11.15*/inputPassword(
                f("repeatPassword"),
                '_label -> Messages("playauthenticate.login.password.repeat"),
                '_showConstraints -> false,
                '_error -> f.error("password")
             ))))}
    }
    
    def render(f:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}): play.api.templates.HtmlFormat.Appendable = apply(f)
    
    def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.api.templates.HtmlFormat.Appendable) = (f) => apply(f)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 01 22:26:56 IST 2015
                    SOURCE: W:/Pre School/app/views/_passwordPartial.scala.html
                    HASH: d6eb8f800948f4c5f6fd89b9eec8a6c9467a00d0
                    MATRIX: 859->1|1017->13|1047->70|1098->86|1265->232|1332->263
                    LINES: 28->1|34->1|36->5|37->6|40->9|42->11
                    -- GENERATED --
                */
            