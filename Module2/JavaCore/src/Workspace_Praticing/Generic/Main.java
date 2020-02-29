package Workspace_Praticing.Generic;

public class Main {
    public static void main(String[] args) {
        Controller<Student> controller = new Controller<>();
        controller.add(new Student("1","Thien"));
        controller.add(new Student("2","Van"));

        System.out.println(controller.get(0).fullName);
        controller.get(0).studying("Math");
    }

}
