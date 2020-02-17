package Bai2_MangVaPhuongThucTrongJava.BaiTap.TimGiaTriNhoNhatTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        findMin(arr);
    }

    public static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
