import java.util.List;
import java.util.ArrayList;

public class HackTeam {
  private String mId;
  private String mName;
  private ArrayList<HackMember> teamMembers = new ArrayList<HackMember>();
  private static ArrayList<HackTeam> totalTeams = new ArrayList<HackTeam>();


  public HackTeam(String name){
    mName = name;
    mId = totalTeams.size();
    totalTeams.add(this);
  }

  public void addMember(HackMember member){
    teamMembers.add(member);
  }

  public static void clear() {
    teamMembers.clear();
  }

  public static ArrayList<HackTeam> all() {
   return totalTeams;
  }

  public ArrayList<HackMember> getMembers(){
    return teamMembers;
  }
}
