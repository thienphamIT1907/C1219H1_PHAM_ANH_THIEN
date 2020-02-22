package Bai3_LopVaDoiTuongTrongJava.BaiTap.XayDungLopQuadraticEquation_PhuongTrinhBac2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2!");
        System.out.print("Nhập a: ");
        double a = input.nextDouble();
        System.out.print("Nhập b: ");
        double b = input.nextDouble();
        System.out.print("Nhập c: ");
        double c = input.nextDouble();

        QuadraticEquation pt2 = new QuadraticEquation(a, b, c);
        //ax2 + bx + c = 0
        if (pt2.getA() == 0) {
            if (pt2.getB() == 0) {
                if (pt2.getC() == 0) {
                    System.err.println("Phương trình có vô số nghiệm!");
                } else {
                    System.err.println("Phương trình vô nghiệm!");
                }
            } else {
                System.out.println("Phương trình có 1 nghiệm x = : " + (-pt2.getC() / pt2.getB()));
            }
        } else {
            if (pt2.getDenta() < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (pt2.getDenta() == 0) {
                System.out.println("Phương trình có nghiệm kép x =" + (-pt2.getB() / 2 * pt2.getA()));
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt!");
                System.out.println("x1 = " + pt2.root1());
                System.out.println("x2 = " + pt2.root2());
            }
        }
    }
}
