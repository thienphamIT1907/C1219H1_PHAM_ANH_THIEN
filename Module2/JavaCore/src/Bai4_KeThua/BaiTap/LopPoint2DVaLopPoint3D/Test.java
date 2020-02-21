package Bai4_KeThua.BaiTap.LopPoint2DVaLopPoint3D;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D p2D = new Point2D(10,20);

        System.out.println(p2D.toString());
        System.out.println(Arrays.toString(p2D.getXY()));

        p2D.setXY(100,200);
        System.out.println(p2D.toString());
        System.out.println(Arrays.toString(p2D.getXY()));

        Point3D p3D = new Point3D(10,20,30);

        System.out.println(p3D.toString());
        p3D.setXYZ(9,99,999);
        System.out.println(Arrays.toString(p3D.getXYZ()));

    }
}
