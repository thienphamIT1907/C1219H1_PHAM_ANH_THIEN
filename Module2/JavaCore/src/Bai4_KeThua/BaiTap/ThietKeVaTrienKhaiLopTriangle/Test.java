package Bai4_KeThua.BaiTap.ThietKeVaTrienKhaiLopTriangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();
        String color = "Green";

        triangle.setSide1(side1);
        triangle.setSide2(side2);
        triangle.setSide3(side3);
        triangle.setColor(color);

        System.out.println(triangle.toString());
    }
}
