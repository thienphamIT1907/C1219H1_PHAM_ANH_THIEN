package Workspace_Praticing.Generic;

public class Student extends People {
    String rollNo;
    String fullName;

    public Student(String rollNo, String fullName) {
        this.rollNo = rollNo;
        this.fullName = fullName;
    }
    public void studying(String object) {
        System.out.println("Studying " + object);
    }
}
