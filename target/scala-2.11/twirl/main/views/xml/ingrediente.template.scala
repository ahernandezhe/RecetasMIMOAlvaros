
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ingrediente_Scope0 {
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

class ingrediente extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template1[Ingrediente,play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ingrediente: Ingrediente):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<ingrediente id=""""),_display_(/*3.19*/ingrediente/*3.30*/.getId()),format.raw/*3.38*/("""">
	<nombre>"""),_display_(/*4.11*/ingrediente/*4.22*/.getNombre()),format.raw/*4.34*/("""</nombre>
	<descripcion>"""),_display_(/*5.16*/ingrediente/*5.27*/.getDescripcion()),format.raw/*5.44*/("""</descripcion>
	<tipo>"""),_display_(/*6.9*/ingrediente/*6.20*/.getTipo()),format.raw/*6.30*/("""</tipo>
</ingrediente>
"""))
      }
    }
  }

  def render(ingrediente:Ingrediente): play.twirl.api.XmlFormat.Appendable = apply(ingrediente)

  def f:((Ingrediente) => play.twirl.api.XmlFormat.Appendable) = (ingrediente) => apply(ingrediente)

  def ref: this.type = this

}


}

/**/
object ingrediente extends ingrediente_Scope0.ingrediente
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 23:08:17 CET 2016
                  SOURCE: C:/Users/Alvaro/Documents/activator-1.3.10/bin/recetasMIMO/app/views/ingrediente.scala.xml
                  HASH: 8962b8585ecc976813debc3af23e4c4ee295ce35
                  MATRIX: 756->1|876->27|906->31|950->49|969->60|997->68|1037->82|1056->93|1088->105|1140->131|1159->142|1196->159|1245->183|1264->194|1294->204
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6
                  -- GENERATED --
              */
          