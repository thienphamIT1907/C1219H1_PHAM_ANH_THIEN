package Workspace_Praticing.TestInterface;

public class Employee extends Person implements Language{
    Employee() {}

    @Override
    public void talkByLanguage(String language) {
        System.out.println("I m saying" + language + " from Employee class");
    }
}
