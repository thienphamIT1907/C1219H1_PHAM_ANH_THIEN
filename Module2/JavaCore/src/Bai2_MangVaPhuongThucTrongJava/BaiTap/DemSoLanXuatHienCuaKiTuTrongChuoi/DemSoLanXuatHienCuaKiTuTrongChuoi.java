package Bai2_MangVaPhuongThucTrongJava.BaiTap.DemSoLanXuatHienCuaKiTuTrongChuoi;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKiTuTrongChuoi {
    public static void main(String[] args) {
        String str;
        char notation = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your String: ");
        str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == notation) {
                count++;
            }
        }
        System.out.println("Notation:  " + notation + "\n" + "Numbers: " + count);
    }
}
