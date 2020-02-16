package Bai2_MangVaPhuongThucTrongJava.BaiTap.ThemPhanTuVaoMang;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }

        System.out.print("Insert: ");
        int x = input.nextInt();

        System.out.print("At: ");
        int index = input.nextInt();

        addElement(arr, x, index);
    }

    public static void addElement(int[] arr, int x, int index) {
        if (index < 0 || index > arr.length - 1) {
            System.err.println("Failed");
        }

        int[] tempArr = new int[arr.length + 1];
        for (int i = 0; i < tempArr.length - 1; i++) {
            tempArr[i] = arr[i];
        }

        for (int i = tempArr.length - 2; i >= index; i--) {
            tempArr[i + 1] = tempArr[i];
        }
        tempArr[index] = x;
        System.out.println(Arrays.toString(tempArr));
    }
}
