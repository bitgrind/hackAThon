import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import java.util.List;
import java.util.ArrayList;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args){
    staticFileLocation("public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("teamList", "templates/team-list.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String teamName = request.queryParams("teamName");
      if(teamName){
        Team newTeam = new Team(teamName);
      }
      model.put("teamList", "templates/team-list.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }
}
