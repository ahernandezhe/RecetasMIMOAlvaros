
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Alvaro/Documents/activator-1.3.10/bin/recetasMIMO/conf/routes
// @DATE:Wed Dec 28 23:08:17 CET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:12
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:70
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:65
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:67
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:67
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseRecetasController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def recetaCategoria: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.recetaCategoria",
      """
        function(categoria0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/categoria/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("categoria", encodeURIComponent(categoria0))})
        }
      """
    )
  
    // @LINE:59
    def actualizarIngrediente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.actualizarIngrediente",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "ingrediente"})
        }
      """
    )
  
    // @LINE:56
    def actualizarReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.actualizarReceta",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "receta"})
        }
      """
    )
  
    // @LINE:12
    def recetaId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.recetaId",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:42
    def crearIngrediente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.crearIngrediente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ingredientes"})
        }
      """
    )
  
    // @LINE:31
    def ingredientesTipo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.ingredientesTipo",
      """
        function(tipo0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingrediente/tipo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tipo", encodeURIComponent(tipo0))})
        }
      """
    )
  
    // @LINE:39
    def crearReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.crearReceta",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recetas"})
        }
      """
    )
  
    // @LINE:15
    def recetaNombre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.recetaNombre",
      """
        function(nombre0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/nombre/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nombre", encodeURIComponent(nombre0))})
        }
      """
    )
  
    // @LINE:28
    def ingredienteNombre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.ingredienteNombre",
      """
        function(nombre0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingrediente/nombre/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("nombre", encodeURIComponent(nombre0))})
        }
      """
    )
  
    // @LINE:49
    def eliminarReceta: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.eliminarReceta",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "receta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:25
    def ingredienteId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RecetasController.ingredienteId",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ingrediente/id/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }


}
