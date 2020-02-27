package Workspace_Praticing.TestInterface;

public class Manager extends Employee implements Language {
    Manager() {}

    @Override
    public void talkByLanguage(String language) {
        System.out.println("I m saying " + language + " from Manager class");
    }
}
