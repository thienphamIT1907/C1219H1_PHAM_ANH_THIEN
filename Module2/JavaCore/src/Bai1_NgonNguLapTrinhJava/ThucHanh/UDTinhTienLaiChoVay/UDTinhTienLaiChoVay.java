package Bai1_NgonNguLapTrinhJava.ThucHanh.UDTinhTienLaiChoVay;

import java.util.Scanner;

public class UDTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;

        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = input.nextDouble();

        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);
    }
}
