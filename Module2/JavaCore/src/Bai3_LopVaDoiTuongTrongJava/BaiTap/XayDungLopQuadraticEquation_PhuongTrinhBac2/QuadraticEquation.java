package Bai3_LopVaDoiTuongTrongJava.BaiTap.XayDungLopQuadraticEquation_PhuongTrinhBac2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDenta() {
        return (b * b - 4 * a * c);
    }

    public double root1() {
        return (-b - Math.sqrt(getDenta()) / (2 * a));
    }

    public double root2() {
        return (-b + Math.sqrt(getDenta()) / (2 * a));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}

