
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Alvaro/Documents/activator-1.3.10/bin/recetasMIMO/conf/routes
// @DATE:Wed Dec 28 23:08:17 CET 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:12
package controllers {

  // @LINE:70
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:65
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:63
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:67
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:12
  class ReverseRecetasController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def recetaCategoria(categoria:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "receta/categoria/" + implicitly[PathBindable[String]].unbind("categoria", dynamicString(categoria)))
    }
  
    // @LINE:59
    def actualizarIngrediente(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "ingrediente")
    }
  
    // @LINE:56
    def actualizarReceta(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "receta")
    }
  
    // @LINE:12
    def recetaId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "receta/id/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:42
    def crearIngrediente(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "ingredientes")
    }
  
    // @LINE:31
    def ingredientesTipo(tipo:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ingrediente/tipo/" + implicitly[PathBindable[String]].unbind("tipo", dynamicString(tipo)))
    }
  
    // @LINE:39
    def crearReceta(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "recetas")
    }
  
    // @LINE:15
    def recetaNombre(nombre:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "receta/nombre/" + implicitly[PathBindable[String]].unbind("nombre", dynamicString(nombre)))
    }
  
    // @LINE:28
    def ingredienteNombre(nombre:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ingrediente/nombre/" + implicitly[PathBindable[String]].unbind("nombre", dynamicString(nombre)))
    }
  
    // @LINE:49
    def eliminarReceta(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "receta/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:25
    def ingredienteId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ingrediente/id/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }


}
