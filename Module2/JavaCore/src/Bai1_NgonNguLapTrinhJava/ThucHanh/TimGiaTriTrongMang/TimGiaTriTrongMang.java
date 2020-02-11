package Bai1_NgonNguLapTrinhJava.ThucHanh.TimGiaTriTrongMang;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {
                "Christian", "Michael", "Camila",
                "Sienna", "Tanya", "Connor", "Zachariah",
                "Mallory", "Zoe", "Emily"
        };
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter name's student: ");
        String inputName =  reader.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + inputName + " in the list.");
    }

}
