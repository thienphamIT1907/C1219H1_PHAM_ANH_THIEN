package Bai2_MangVaPhuongThucTrongJava.BaiTap.XoaPhanTuKhoiMang;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size: ");
        int size = input.nextInt();
        int[] arr = new int[size];

//        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Your array: ");
        show(arr);
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter your number: ");
        int number = Integer.parseInt(input.nextLine());

        if (checkPosition(arr, number) != -1) {
            System.out.print(number + " is enable at index: " + checkPosition(arr, number) + ". Delete (yes/no) ? ");
        } else System.out.println(number + " is invalid !");

        String acceptDetele = input.nextLine();
        if (acceptDetele.equals("yes")) {
            deleteElement(arr, checkPosition(arr, number));
        } else {
            System.err.print("Refused to delete !");
            System.exit(-1);
        }
    }

    public static void show(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }

    public static int checkPosition(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteElement(int[] arr, int index) {
        for(int i = index + 1; i<= arr.length -1; i++) {
            arr[i-1] = arr[i];
        }

        int[] littleArr = new int[arr.length - 1];

        for (int i = 0; i < littleArr.length; i++) {
            littleArr[i] = arr[i];
        }
        System.out.println("New Array:" + Arrays.toString(littleArr));
    }
}
