import java.util.List;
import java.util.ArrayList;

public class HackMember{
  private int mId;
  private String mName;
  private String mLanguage;
  private static ArrayList<HackMember> memberList = new ArrayList<HackMember>();

  public HackMember(String name, String language){
    mId = memberList.size();
    mName = name;
    mLanguage = language;
    memberList.add(this);
  }

  public String memberName(){
    return mName;
  }

  public String getLanguage(){
    return mLanguage;
  }

  public static ArrayList<HackMember> all(){
    return memberList;
  }

}
