package Bai5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable;

public class ResiableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(50, 30);
        shapes[2] = new Square(10, "tomato", false);

        System.out.println("List shapes: ");

        for (Shape shape : shapes) {
            System.out.println(shape);

            //Convert Datatype
            if (shape instanceof Circle) {
                Resizeable resizeable = (Circle) shape;
                resizeable.resize(30);
            } else if (shape instanceof Rectangle) {
                Resizeable resizeable = (Rectangle) shape;
                resizeable.resize(40);
            } else {
                Resizeable resizeable = (Square) shape;
                resizeable.resize(50);
            }
        }
    }
}
