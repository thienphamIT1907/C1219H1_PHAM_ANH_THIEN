package Bai1_NgonNguLapTrinhJava.ThucHanh.KiemTraSoNguyenTo;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}


//* Với một số nguyên dương A lớn hơn 1, kiểm tra từ  2 đến căn bậc 2 của A,
// nếu A chia hết cho một số trong khoảng đó thì A không phải là số nguyên tố,
// ngược lại A là số nguyên tố.

