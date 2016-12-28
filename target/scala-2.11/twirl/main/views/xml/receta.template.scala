
package views.xml

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object receta_Scope0 {
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

class receta extends BaseScalaTemplate[play.twirl.api.XmlFormat.Appendable,Format[play.twirl.api.XmlFormat.Appendable]](play.twirl.api.XmlFormat) with play.twirl.api.Template2[Receta,List[Ingrediente],play.twirl.api.XmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(receta: Receta, ingredientes: List[Ingrediente]):play.twirl.api.XmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*3.1*/("""<receta id=""""),_display_(/*3.14*/receta/*3.20*/.getId()),format.raw/*3.28*/("""">
	<nombre>"""),_display_(/*4.11*/receta/*4.17*/.getNombre()),format.raw/*4.29*/("""</nombre>
	<descripcion>"""),_display_(/*5.16*/receta/*5.22*/.getDescripcion()),format.raw/*5.39*/("""</descripcion>
	<categoria>"""),_display_(/*6.14*/receta/*6.20*/.getCategoria()),format.raw/*6.35*/("""</categoria>
	<ingredientes>	
			"""),_display_(/*8.5*/for(i <- ingredientes) yield /*8.27*/ {_display_(Seq[Any](format.raw/*8.29*/("""
			"""),_display_(/*9.5*/ingrediente(i)),format.raw/*9.19*/("""
			""")))}),format.raw/*10.5*/("""
	"""),format.raw/*11.2*/("""</ingredientes>
</receta>"""))
      }
    }
  }

  def render(receta:Receta,ingredientes:List[Ingrediente]): play.twirl.api.XmlFormat.Appendable = apply(receta,ingredientes)

  def f:((Receta,List[Ingrediente]) => play.twirl.api.XmlFormat.Appendable) = (receta,ingredientes) => apply(receta,ingredientes)

  def ref: this.type = this

}


}

/**/
object receta extends receta_Scope0.receta
              /*
                  -- GENERATED --
                  DATE: Wed Dec 28 23:08:17 CET 2016
                  SOURCE: C:/Users/Alvaro/Documents/activator-1.3.10/bin/recetasMIMO/app/views/receta.scala.xml
                  HASH: fbfb72595a047e0589746782550a08735654d583
                  MATRIX: 759->1|902->50|932->54|971->67|985->73|1013->81|1053->95|1067->101|1099->113|1151->139|1165->145|1202->162|1257->191|1271->197|1306->212|1367->248|1404->270|1443->272|1474->278|1508->292|1544->298|1574->301
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->8|39->8|39->8|40->9|40->9|41->10|42->11
                  -- GENERATED --
              */
          