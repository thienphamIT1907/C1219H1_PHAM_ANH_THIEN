package Workspace_Praticing.DemoFileCSV.Views;

import Workspace_Praticing.DemoFileCSV.Commons.FuncFileCSV;
import Workspace_Praticing.DemoFileCSV.Models.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    private static ArrayList<Student> studentArrayList = new ArrayList<>();
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.print (
            "1. Add new Student\n" +
            "2. Show student information\n" +
            "3. Exit\n"
        );

        switch (input.nextLine()) {
            case "1":
                addNewStudent();
                break;
            case "2":
                showStudentInfo();
                break;
            case "3":
                System.exit(-1);
                break;
            default:
                System.out.print("Error ! press any key to continue...");
                input.nextLine();
                displayMainMenu();
                break;
        }
    }

    private static void addNewStudent() {
        Student student = new Student();

        System.out.print("\nEnter student name: ");
        student.setName(input.nextLine());

        System.out.print("\nEnter student grade: ");
        student.setGrade(input.nextLine());

        System.out.print("\nEnter student address: ");
        student.setAddress(input.nextLine());

        studentArrayList.add(student);
        FuncFileCSV.writeToFileCSV(studentArrayList);
        System.out.print("Success ! press any key to continue...");
        input.nextLine();
        displayMainMenu();
    }

    private static void showStudentInfo() {
        studentArrayList = FuncFileCSV.getFileCSV();
        for(Student student: studentArrayList) {
            System.out.println("Name: " + student.getName());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Address: " + student.getAddress());
            System.out.println("---------------------------");
        }
        System.out.print("Press any key to continue...");
        input.nextLine();
        displayMainMenu();
    }
}
