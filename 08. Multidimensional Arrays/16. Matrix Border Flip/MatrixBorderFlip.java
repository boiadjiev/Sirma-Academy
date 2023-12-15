package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixBorderFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = readMatrix(sc);
        printMatrix(borderFlip(matrix));
    }

    private static int[][] borderFlip(int[][] matrix) {
        int temp = matrix[0][0];
        for (int row = 1; row < matrix.length; row++) {
            matrix[row - 1][0] = matrix[row][0];
        }

        for (int col = 1; col < matrix[0].length; col++) {
            matrix[matrix.length - 1][col - 1] = matrix[matrix.length - 1][col];
        }

        for (int row = matrix.length - 1; row > 0; row--) {
            matrix[row][matrix[0].length - 1] = matrix[row - 1][matrix[0].length - 1];
        }

        for (int col = matrix[0].length - 1; col > 0; col--) {
            matrix[0][col] = matrix[0][col - 1];
        }

        matrix[0][1] = temp;

        return matrix;
    }

    private static int[][] readMatrix(Scanner sc) {
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
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
