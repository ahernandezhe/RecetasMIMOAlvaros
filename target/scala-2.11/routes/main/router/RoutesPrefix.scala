
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Alvaro/Documents/activator-1.3.10/bin/recetasMIMO/conf/routes
// @DATE:Wed Dec 28 23:08:17 CET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
