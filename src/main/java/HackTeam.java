import java.util.List;
import java.util.ArrayList;

public class HackTeam {
  private int mId;
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

  public static ArrayList<HackTeam> allTeams() {
   return totalTeams;
  }

  public String getName(){
    return mName;
  }

  public ArrayList<HackMember> getMembers(){
    return teamMembers;
  }

  public void clear() {
    teamMembers.clear();
  }
}
