package Workspace_Praticing.TestInterface;

public class Test {
    public static void main(String[] args) {
        String lang = "VN";
        Person[] persons = new Person[2];
        persons[0] = new Employee();
        persons[1] = new Manager();

        for (Person per: persons) {
            per.talkByLanguage(lang);
        }

        Person a = new Employee();

    }
}
