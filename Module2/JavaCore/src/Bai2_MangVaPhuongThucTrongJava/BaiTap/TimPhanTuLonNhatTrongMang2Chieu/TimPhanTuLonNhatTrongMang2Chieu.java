package Bai2_MangVaPhuongThucTrongJava.BaiTap.TimPhanTuLonNhatTrongMang2Chieu;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = input.nextInt();

        System.out.print("Column: ");
        int columns = input.nextInt();

        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Your array: ");
        for (int[] v : arr) {
            for (int h : v) {
                System.out.print(h + " ");
            }
            System.out.println();
        }

        findMax(arr);
    }

    public static void findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               if(max < arr[i][j]) {
                   max = arr[i][j];
               }
            }
        }
        System.out.print("Max elements: " + max);
    }
}
