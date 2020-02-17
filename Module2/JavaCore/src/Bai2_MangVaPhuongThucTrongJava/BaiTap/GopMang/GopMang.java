package Bai2_MangVaPhuongThucTrongJava.BaiTap.GopMang;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Size of array1: ");
        int size1 = input.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = input.nextInt();
        }

        System.out.print("Size of array2: ");
        int size2 = input.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr2[i] = input.nextInt();
        }

        show(arr1);
        show(arr2);

        merge(arr1, arr2);
    }

    public static void merge(int[] arr1, int[] arr2) {
        int[] bigArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            bigArr[i] = arr1[i];
        }

        for (int i = arr1.length, j = 0; i < bigArr.length; i++, j++) {
            bigArr[i] = arr2[j];
        }
        System.out.println("Merged Array:" + Arrays.toString(bigArr));
    }

    public static void show(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
