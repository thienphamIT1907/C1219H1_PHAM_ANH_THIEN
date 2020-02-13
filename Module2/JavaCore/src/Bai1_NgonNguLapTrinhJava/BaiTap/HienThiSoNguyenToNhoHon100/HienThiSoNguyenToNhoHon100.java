package Bai1_NgonNguLapTrinhJava.BaiTap.HienThiSoNguyenToNhoHon100;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount numbers: ");

        //int amountOfNumb = input.nextInt();
        int amountOfNumb = 100;
        for(int i = 0; i < amountOfNumb; i++) {
            if(isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
