
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ingredientes_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.xml._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class ingredientes extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[List[Ingrediente],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ingredientes: List[Ingrediente]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*3.1*/("""<recetas>
"""),_display_(/*4.2*/for(i <- ingredientes) yield /*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
"""),_display_(/*5.2*/ingrediente(i)),format.raw/*5.16*/("""
""")))}),format.raw/*6.2*/("""
"""),format.raw/*7.1*/("""</recetas>"""))
      }
    }
  }

  def render(ingredientes:List[Ingrediente]): play.twirl.api.XmlFormat.Appendable = apply(ingredientes)

  def f:((List[Ingrediente]) => play.twirl.api.XmlFormat.Appendable) = (ingredientes) => apply(ingredientes)

  def ref: this.type = this

}


}

/**/
object ingredientes extends ingredientes_Scope0.ingredientes
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 23:08:17 CET 2016
                  SOURCE: C:/Users/Alvaro/Documents/activator-1.3.10/bin/recetasMIMO/app/views/ingredientes.scala.xml
                  HASH: 1b6a84fea7c92bdfad0d3145f5673ae114eab319
                  MATRIX: 764->1|891->34|921->38|958->50|995->72|1034->74|1062->77|1096->91|1128->94|1156->96
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|36->5|36->5|37->6|38->7
                  -- GENERATED --
              */
          