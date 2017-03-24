import org.junit.*;
import static org.junit.Assert.*;

public class HackTeamTest {

  @Test
  public void HackMember_MemberObj_true() {
    HackMember newMember = new HackMember("Keith", "java");
    assertEquals(true, newMember instanceof HackMember);
  }

  @Test
  public void HackMember_MemberNameMethod_Keith() {
    HackMember newMember = new HackMember("Keith", "java");
    String expected = "Keith";
    assertEquals(expected, newMember.memberName());
  }

  @Test
  public void HackTeam_TeamObj_true() {
    HackTeam newMember = new HackTeam("Blossom");
    assertEquals(true, newMember instanceof HackTeam);
  }

  @Test
  public void HackTeam_HackMemberInHackTeam_true() {
    HackTeam newTeam = new HackTeam("Blossom");
    HackMember newMember = new HackMember("keith", "java");
    newTeam.addMember(newMember);
    assertTrue(newTeam.getMembers().contains(newMember));
  }
  //
  // @Test
  //   public void addTask_addsTaskToList_true() {
  //     Category testCategory = new Category("Home");
  //     Task testTask = new Task("Mow the lawn");
  //     testCategory.addTask(testTask);
  //     assertTrue(testCategory.getTasks().contains(testTask));
  //   }
}
