package Bai1_NgonNguLapTrinhJava.BaiTap.UDChuyenDoiTienTe;

import java.util.Scanner;

public class UDChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your USD: ");
        int inputUSD = input.nextInt();

        System.out.println("USD:" + inputUSD);
        System.out.println("VND: " + (inputUSD * rate));

    }
}
