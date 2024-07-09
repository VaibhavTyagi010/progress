package router

import controllers.ProgressController
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._
import javax.inject.Inject

class ProgressRouter @Inject()(controller: ProgressController) extends SimpleRouter {
  override def routes: Routes = {
    case GET(p"/index") => controller.index()
  }
}
