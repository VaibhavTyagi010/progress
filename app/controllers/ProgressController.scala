package controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json._

@Singleton
class ProgressController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def index(): Action[AnyContent] = Action { implicit request =>
    Ok(Json.obj("message" -> "done"))
  }
}
