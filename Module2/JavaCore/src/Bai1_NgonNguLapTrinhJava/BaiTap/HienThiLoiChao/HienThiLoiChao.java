package Bai1_NgonNguLapTrinhJava.BaiTap.HienThiLoiChao;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");

        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        System.out.println("Hello: "  + name);
    }
}
