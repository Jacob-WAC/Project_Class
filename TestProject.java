

public class TestProject {
  public static void main(String[] args) {
    Project basicProject = new Project();
    Project namedProject = new Project("epic project");
    Project fullProject = new Project("epic project","a project that will make your dreams come true");
    System.out.println(basicProject.elevatorPitch());
    System.out.println(namedProject.elevatorPitch());
    System.out.println(fullProject.elevatorPitch());
    basicProject.setName("turtle project");
    basicProject.setDescription("all about that turt");
    
    fullProject.getDescription();

    System.out.println(basicProject.elevatorPitch());
    System.out.println(namedProject.elevatorPitch());
    System.out.println(fullProject.elevatorPitch());
  }


}
