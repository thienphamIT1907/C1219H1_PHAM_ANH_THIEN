package Bai3_LopVaDoiTuongTrongJava.BaiTap.XayDungLopStopWatch;

public class Test {
    public static void main(String[] args) {
        StopWatch stw = new StopWatch();
        System.out.println(stw.getStartTime());
        System.out.println(stw.getEndTime());

        stw.start();

        for(int i = 0; i <= 100000; i++) {
            System.out.print(i + " ");
            if(i % 20 == 0) {
                System.out.println();
            }
        }

        stw.stop();

        System.out.println(stw.getStartTime());
        System.out.println(stw.getEndTime());

        System.out.println("Elapsed Time: " + stw.getElapsedTime());
    }
}
