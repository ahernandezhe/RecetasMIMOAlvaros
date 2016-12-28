
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Alvaro/Documents/activator-1.3.10/bin/recetasMIMO/conf/routes
// @DATE:Wed Dec 28 23:08:17 CET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:12
  RecetasController_3: controllers.RecetasController,
  // @LINE:63
  HomeController_1: controllers.HomeController,
  // @LINE:65
  CountController_0: controllers.CountController,
  // @LINE:67
  AsyncController_2: controllers.AsyncController,
  // @LINE:70
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:12
    RecetasController_3: controllers.RecetasController,
    // @LINE:63
    HomeController_1: controllers.HomeController,
    // @LINE:65
    CountController_0: controllers.CountController,
    // @LINE:67
    AsyncController_2: controllers.AsyncController,
    // @LINE:70
    Assets_4: controllers.Assets
  ) = this(errorHandler, RecetasController_3, HomeController_1, CountController_0, AsyncController_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, RecetasController_3, HomeController_1, CountController_0, AsyncController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/id/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.recetaId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/nombre/""" + "$" + """nombre<[^/]+>""", """controllers.RecetasController.recetaNombre(nombre:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/categoria/""" + "$" + """categoria<[^/]+>""", """controllers.RecetasController.recetaCategoria(categoria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingrediente/id/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.ingredienteId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingrediente/nombre/""" + "$" + """nombre<[^/]+>""", """controllers.RecetasController.ingredienteNombre(nombre:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingrediente/tipo/""" + "$" + """tipo<[^/]+>""", """controllers.RecetasController.ingredientesTipo(tipo:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recetas""", """controllers.RecetasController.crearReceta"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingredientes""", """controllers.RecetasController.crearIngrediente"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta/""" + "$" + """id<[^/]+>""", """controllers.RecetasController.eliminarReceta(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receta""", """controllers.RecetasController.actualizarReceta()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ingrediente""", """controllers.RecetasController.actualizarIngrediente()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:12
  private[this] lazy val controllers_RecetasController_recetaId0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_recetaId0_invoker = createInvoker(
    RecetasController_3.recetaId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "recetaId",
      Seq(classOf[Long]),
      "GET",
      """listar receta por id""",
      this.prefix + """receta/id/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_RecetasController_recetaNombre1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/nombre/"), DynamicPart("nombre", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_recetaNombre1_invoker = createInvoker(
    RecetasController_3.recetaNombre(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "recetaNombre",
      Seq(classOf[String]),
      "GET",
      """listar receta por nombre""",
      this.prefix + """receta/nombre/""" + "$" + """nombre<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_RecetasController_recetaCategoria2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/categoria/"), DynamicPart("categoria", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_recetaCategoria2_invoker = createInvoker(
    RecetasController_3.recetaCategoria(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "recetaCategoria",
      Seq(classOf[String]),
      "GET",
      """listar receta por categoria""",
      this.prefix + """receta/categoria/""" + "$" + """categoria<[^/]+>"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_RecetasController_ingredienteId3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingrediente/id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_ingredienteId3_invoker = createInvoker(
    RecetasController_3.ingredienteId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "ingredienteId",
      Seq(classOf[Long]),
      "GET",
      """listar ingredientes por id""",
      this.prefix + """ingrediente/id/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_RecetasController_ingredienteNombre4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingrediente/nombre/"), DynamicPart("nombre", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_ingredienteNombre4_invoker = createInvoker(
    RecetasController_3.ingredienteNombre(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "ingredienteNombre",
      Seq(classOf[String]),
      "GET",
      """listar ingredientes por nombre""",
      this.prefix + """ingrediente/nombre/""" + "$" + """nombre<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_RecetasController_ingredientesTipo5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingrediente/tipo/"), DynamicPart("tipo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_ingredientesTipo5_invoker = createInvoker(
    RecetasController_3.ingredientesTipo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "ingredientesTipo",
      Seq(classOf[String]),
      "GET",
      """listar ingredientes por tipo""",
      this.prefix + """ingrediente/tipo/""" + "$" + """tipo<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_RecetasController_crearReceta6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recetas")))
  )
  private[this] lazy val controllers_RecetasController_crearReceta6_invoker = createInvoker(
    RecetasController_3.crearReceta,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "crearReceta",
      Nil,
      "POST",
      """crear receta""",
      this.prefix + """recetas"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_RecetasController_crearIngrediente7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingredientes")))
  )
  private[this] lazy val controllers_RecetasController_crearIngrediente7_invoker = createInvoker(
    RecetasController_3.crearIngrediente,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "crearIngrediente",
      Nil,
      "POST",
      """crear ingrediente""",
      this.prefix + """ingredientes"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_RecetasController_eliminarReceta8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RecetasController_eliminarReceta8_invoker = createInvoker(
    RecetasController_3.eliminarReceta(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "eliminarReceta",
      Seq(classOf[Long]),
      "DELETE",
      """borrar receta""",
      this.prefix + """receta/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_RecetasController_actualizarReceta9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receta")))
  )
  private[this] lazy val controllers_RecetasController_actualizarReceta9_invoker = createInvoker(
    RecetasController_3.actualizarReceta(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "actualizarReceta",
      Nil,
      "PUT",
      """actualizar receta""",
      this.prefix + """receta"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_RecetasController_actualizarIngrediente10_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ingrediente")))
  )
  private[this] lazy val controllers_RecetasController_actualizarIngrediente10_invoker = createInvoker(
    RecetasController_3.actualizarIngrediente(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RecetasController",
      "actualizarIngrediente",
      Nil,
      "PUT",
      """actualizar ingrediente""",
      this.prefix + """ingrediente"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_HomeController_index11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index11_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_CountController_count12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count12_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_AsyncController_message13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message13_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:12
    case controllers_RecetasController_recetaId0_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_recetaId0_invoker.call(RecetasController_3.recetaId(id))
      }
  
    // @LINE:15
    case controllers_RecetasController_recetaNombre1_route(params) =>
      call(params.fromPath[String]("nombre", None)) { (nombre) =>
        controllers_RecetasController_recetaNombre1_invoker.call(RecetasController_3.recetaNombre(nombre))
      }
  
    // @LINE:18
    case controllers_RecetasController_recetaCategoria2_route(params) =>
      call(params.fromPath[String]("categoria", None)) { (categoria) =>
        controllers_RecetasController_recetaCategoria2_invoker.call(RecetasController_3.recetaCategoria(categoria))
      }
  
    // @LINE:25
    case controllers_RecetasController_ingredienteId3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_ingredienteId3_invoker.call(RecetasController_3.ingredienteId(id))
      }
  
    // @LINE:28
    case controllers_RecetasController_ingredienteNombre4_route(params) =>
      call(params.fromPath[String]("nombre", None)) { (nombre) =>
        controllers_RecetasController_ingredienteNombre4_invoker.call(RecetasController_3.ingredienteNombre(nombre))
      }
  
    // @LINE:31
    case controllers_RecetasController_ingredientesTipo5_route(params) =>
      call(params.fromPath[String]("tipo", None)) { (tipo) =>
        controllers_RecetasController_ingredientesTipo5_invoker.call(RecetasController_3.ingredientesTipo(tipo))
      }
  
    // @LINE:39
    case controllers_RecetasController_crearReceta6_route(params) =>
      call { 
        controllers_RecetasController_crearReceta6_invoker.call(RecetasController_3.crearReceta)
      }
  
    // @LINE:42
    case controllers_RecetasController_crearIngrediente7_route(params) =>
      call { 
        controllers_RecetasController_crearIngrediente7_invoker.call(RecetasController_3.crearIngrediente)
      }
  
    // @LINE:49
    case controllers_RecetasController_eliminarReceta8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_RecetasController_eliminarReceta8_invoker.call(RecetasController_3.eliminarReceta(id))
      }
  
    // @LINE:56
    case controllers_RecetasController_actualizarReceta9_route(params) =>
      call { 
        controllers_RecetasController_actualizarReceta9_invoker.call(RecetasController_3.actualizarReceta())
      }
  
    // @LINE:59
    case controllers_RecetasController_actualizarIngrediente10_route(params) =>
      call { 
        controllers_RecetasController_actualizarIngrediente10_invoker.call(RecetasController_3.actualizarIngrediente())
      }
  
    // @LINE:63
    case controllers_HomeController_index11_route(params) =>
      call { 
        controllers_HomeController_index11_invoker.call(HomeController_1.index)
      }
  
    // @LINE:65
    case controllers_CountController_count12_route(params) =>
      call { 
        controllers_CountController_count12_invoker.call(CountController_0.count)
      }
  
    // @LINE:67
    case controllers_AsyncController_message13_route(params) =>
      call { 
        controllers_AsyncController_message13_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:70
    case controllers_Assets_versioned14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
