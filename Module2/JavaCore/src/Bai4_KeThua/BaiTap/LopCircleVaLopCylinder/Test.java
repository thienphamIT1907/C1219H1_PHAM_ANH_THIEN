package Bai4_KeThua.BaiTap.LopCircleVaLopCylinder;

public class Test {
    public static void main(String[] args) {
        Circle cir = new Circle(5,"tomato");
        System.out.println(cir.toString());

        Cylinder cyl = new Cylinder(5, "lightblue", 10);
        System.out.println(cyl.toString());

        System.out.println("=====================");

        System.out.println("Dien tich cir: " + cir.dienTich());
        System.out.println("Dien tich cyl: " + cyl.theTich());
    }
}
