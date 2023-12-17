package MultidimensionalArrays;

import java.util.Scanner;

public class CheckerboardPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        printMatrix(generateCheckerboard(matrix));
    }

    private static int[][] generateCheckerboard(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row % 2 == 0 && col % 2 == 1) {
                    matrix[row][col] = 1;
                }

                if (row % 2 == 1 && col % 2 == 0) {
                    matrix[row][col] = 1;
                }
            }
        }
        return matrix;
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
