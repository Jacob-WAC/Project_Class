
public class Project {
    private String name;
    private String description;

//object constructors 

  public Project() {
  }

  public Project(String name) {
    this.name = name;
  }

  public Project(String name, String description) {
    this.name = name;
    this.description = description;
  }
  
//get and set methods

public String getName(){
  return this.name;
}


public void setName(String name) {
  this.name = name;
}

public String getDescription() {
  return this.description;
}

public void setDescription(String description) {
  this.description = description;
}

//other methods
  public String elevatorPitch() {
    String pitch = String.format("%s: %s", this.name, this.description);
    return pitch;
  }


}