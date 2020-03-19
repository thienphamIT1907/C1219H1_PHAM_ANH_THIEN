package Bai2_MangVaPhuongThucTrongJava.BaiTap.TinhTongCacSoO1CotXacDinh;

import java.util.Scanner;

public class TinhTongCacSoO1CotXacDinh {
    public static void main(String[] args) {
        int size;
        int selectColumn;
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

        System.out.print("Select your column to processing total: ");
        selectColumn = input.nextInt() - 1;
        for (int i = 0; i < size; i++) {
            sum += arrMatrix[i][selectColumn];
        }
        System.out.println("Sum of your column in your matrix: " + sum);
    }
}
