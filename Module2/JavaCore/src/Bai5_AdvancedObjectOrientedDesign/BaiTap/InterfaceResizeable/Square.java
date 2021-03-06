package Bai5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable;

public class Square extends Rectangle implements Resizeable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        System.out.println("Resize of Square changed to: " + percent);
        System.out.println("Old: "+ " Side: " + this.getSide() + " | area: " + this.getArea());
        double newSide = this.getSide() + percent;
        this.setSide(newSide);
        System.out.println("New: "+ " Side: " + this.getSide() + " | area: " + this.getArea());
        System.out.println("=============================");
    }
}
