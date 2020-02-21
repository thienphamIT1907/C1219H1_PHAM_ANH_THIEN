package Bai4_KeThua.BaiTap.LopCircleVaLopCylinder;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    Cylinder() {
        super();
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double dienTich() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    public double theTich() {
        return dienTich() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }
}
