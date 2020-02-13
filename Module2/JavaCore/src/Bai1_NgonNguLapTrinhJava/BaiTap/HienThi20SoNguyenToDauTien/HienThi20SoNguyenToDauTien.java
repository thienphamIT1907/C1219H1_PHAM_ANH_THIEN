package Bai1_NgonNguLapTrinhJava.BaiTap.HienThi20SoNguyenToDauTien;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Nhập số lượng bạn muốn hiển thị: ");
        int count = reader.nextInt();

        for(int i = 0;;i++) {
            if(isPrimeNumber(i)) {
                System.out.print(i + " ");
                if(count-1 == 0 ) {
                    break;
                } else count--;
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
