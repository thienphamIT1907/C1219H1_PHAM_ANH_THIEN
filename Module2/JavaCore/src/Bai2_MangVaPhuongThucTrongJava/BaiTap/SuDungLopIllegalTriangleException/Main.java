package Bai2_MangVaPhuongThucTrongJava.BaiTap.SuDungLopIllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int side1, side2, side3;
            System.out.println("Nhập cạnh của tam giác");

            System.out.print("Nhập cạnh a: ");
            side1 = input.nextInt();

            System.out.print("Nhập cạnh b: ");
            side2 = input.nextInt();

            System.out.print("Nhập cạnh c: ");
            side3 = input.nextInt();

            if (!condition(side1, side2, side3)) {
                throw new IllegalTriangleException();
            } else {
                Triangle triangle = new Triangle();
                triangle.setSide1(side1);
                triangle.setSide2(side2);
                triangle.setSide3(side3);

                System.out.println(" - " + triangle.toString());
            }
        } catch (IllegalTriangleException e) {
            System.out.println("Error");
        }
    }

    public static boolean condition(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            return false;
        } else if (a + b < c || a + c < b || b + c < a) {
            return false;
        }
        return true;
    }
}
