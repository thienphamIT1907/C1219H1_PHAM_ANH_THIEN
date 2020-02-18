package Bai2_MangVaPhuongThucTrongJava.ThucHanh.Demo_ByValue_ByReferences;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        System.out.println("Your array: ");
        showArr(arr);
        System.out.println();

        //double by value
        for (int i = 0; i < size; i++) {
            doubleByValue(arr[i]);
        }
        System.out.print("After double by value: ");
        showArr(arr);
        System.out.println();

        //double by reference
        System.out.print("After double by reference: ");
        doubleByReference(arr);
        showArr(arr);
        System.out.println();
    }

    public static void doubleByReference(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
    }

    public static void doubleByValue(int value) {
        value = value * 2;
    }

    public static void showArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

}
