package Bai4_KeThua.BaiTap.LopPointVaMoveablePoint;


public class Test {
    public static void main(String[] args) {
        Point p = new Point(50, 100);
        MoveablePoint mp = new MoveablePoint(10,20,30,40);
        System.out.println(p.toString());
        System.out.println("===============");
        System.out.println(mp.toString());
        System.out.println(mp.move());
        System.out.println("===============");
        System.out.println(mp.getX() + " " + mp.getY());

        System.out.println(p.toString());
    }
}
