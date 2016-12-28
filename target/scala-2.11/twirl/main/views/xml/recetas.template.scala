
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object recetas_Scope0 {
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

class recetas extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[List[Receta],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recetas: List[Receta]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<recetas>
"""),_display_(/*4.2*/for(r <- recetas) yield /*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
"""),_display_(/*5.2*/receta(r, r.getIngredientes())),format.raw/*5.32*/("""
""")))}),format.raw/*6.2*/("""
"""),format.raw/*7.1*/("""</recetas>"""))
      }
    }
  }

  def render(recetas:List[Receta]): play.twirl.api.XmlFormat.Appendable = apply(recetas)

  def f:((List[Receta]) => play.twirl.api.XmlFormat.Appendable) = (recetas) => apply(recetas)

  def ref: this.type = this

}


}

/**/
object recetas extends recetas_Scope0.recetas
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 23:08:17 CET 2016
                  SOURCE: C:/Users/Alvaro/Documents/activator-1.3.10/bin/recetasMIMO/app/views/recetas.scala.xml
                  HASH: fd85f3716006209417350ffa62c2ae5dd7d4a7c0
                  MATRIX: 749->1|866->24|896->28|933->40|965->57|1004->59|1032->62|1082->92|1114->95|1142->97
                  LINES: 27->1|32->1|34->3|35->4|35->4|35->4|36->5|36->5|37->6|38->7
                  -- GENERATED --
              */
          