package Bai2_MangVaPhuongThucTrongJava.BaiTap.Mang2Chieu_TinhTongCacSoODuongCheoMaTran;

import java.util.Scanner;

public class TinhTongSoODuongCheoMaTran {
    public static void main(String[] args) {
        int size;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Input your height and width of matrix: ");
        size = input.nextInt();

        int[][] arrMatrix = new int[size][size];

        System.out.println("Input elements of array matrix: ");
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arrMatrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Your matrix display: ");
        for (int[] columns: arrMatrix) {
            for (int rows: columns) {
                System.out.print(rows + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == j) {
                    sum += arrMatrix[i][j];
                }
            }
        }
        System.out.println("Sum of main line in your matrix: " + sum);
    }
}
