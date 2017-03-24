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
      model.put("teamAdd", "templates/team-add.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String teamName = request.queryParams("teamName");
      HackTeam newTeam = new HackTeam(teamName);
      ArrayList<HackTeam> teamListing = newTeam.allTeams();
      model.put("newTeam", "templates/team-list.vtl");
      model.put("teamList", "templates/team-add.vtl");
      model.put("teamListing", teamListing);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }
}
