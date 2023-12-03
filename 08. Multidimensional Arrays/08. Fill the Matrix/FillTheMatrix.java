package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] token = sc.nextLine().split("\\s+");
        int size = Integer.parseInt(token[0]);
        char pattern = token[1].charAt(0);
        int[][] matrix = new int[size][size];
        switch (pattern) {
            case 'A':
                fillMatrixA(matrix);
                break;
            case 'B':
                fillMatrixB(matrix);
        }
        printMatrix(matrix);
    }

    private static void fillMatrixA(int[][] matrix) {
        int digit = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix[0].length; row++) {
                matrix[row][col] = digit++;
            }
        }
    }

    private static void fillMatrixB(int[][] matrix) {
        int digit = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 != 0) {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = digit++;
                }

            } else {
                for (int row = 0; row < matrix[0].length; row++) {
                    matrix[row][col] = digit++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }

            System.out.println();
        }
    }
}
