package Bai5_AdvancedObjectOrientedDesign.BaiTap.InterfaceResizeable;

public class ResiableTest {
    public static void main(String[] args) {
        //Tạo mảng để chứa các đối tượng hình học
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(5, 8);
        shapes[2] = new Square(1);
        //Convert Datatype because Cirle, Rectangle, Square implement interface Resizeable
//        for (Shape shape : shapes) {
////            if(shape instanceof Circle) {
////                Resizeable resizeable = (Circle) shape;
////                resizeable.resize(5);
////            }
//            ((Circle) shape).resize(5);
//            ((Rectangle)shape).resize(10);
//            ((Square)shape).resize(15);
//        }
        for (Shape x:shapes) {
        }


    }
}
