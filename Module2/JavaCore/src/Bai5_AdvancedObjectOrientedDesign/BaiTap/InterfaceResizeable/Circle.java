package Bai5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        System.out.println("Resize of Circle changed to: " + percent);
        System.out.println("Old: "+ " Radius: " + this.getRadius() + " | area: " + this.getArea());
        double newRadius = this.getRadius() + percent;
        this.setRadius(newRadius);
        System.out.println("New: "+ " Radius: " + this.getRadius() + " | area: " + this.getArea());
        System.out.println("=============================");
    }
}
