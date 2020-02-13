package Bai1_NgonNguLapTrinhJava.BaiTap.HienThiCacLoaiHinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4.Exit");

        Scanner input = new Scanner(System.in);
        byte choose = input.nextByte();

        switch (choose) {
            case 1:
                System.out.print("Height: ");
                int height = input.nextInt();

                System.out.print("Width: ");
                int width = input.nextInt();

                printTheRectangle(height, width);
                break;
            case 2:
                System.out.print("Number of lines: ");
                int line = input.nextInt();

                printTheSquareTriangle(line);

                break;
            case 3:
                System.out.print("Number of lines: ");
                int line2 = input.nextInt();

                printisoscelestriangle(line2);
                break;
            default:
                System.out.println("Exit!");
                break;
        }
    }

    static void printTheRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    static void printTheSquareTriangle(int line) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    static void printisoscelestriangle(int line) {
        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
