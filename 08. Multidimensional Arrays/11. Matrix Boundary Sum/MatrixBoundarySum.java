package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixBoundarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = readMatrix(sc);
        System.out.println(boundarySum(matrix));
    }

    private static int boundarySum(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row == 0) {
                    sum += matrix[row][col];
                }

                if (row == matrix.length - 1) {
                    sum += matrix[row][col];
                }

                if ((row != 0 && row != matrix.length - 1) &&
                        (col == 0 || col == matrix[0].length - 1)) {
                    sum += matrix[row][col];
                }
            }
        }

        return sum;
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
}
