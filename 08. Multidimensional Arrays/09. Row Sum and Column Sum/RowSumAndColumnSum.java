package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RowSumAndColumnSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrix = readMatrix(dimensions, sc);
        System.out.print("Row Sums: ");
        for (int row = 0; row < matrix.length; row++) {
            int sumRows = 0;
            for (int col = 0; col < matrix[0].length; col++) {
                sumRows += matrix[row][col];
            }
            System.out.print(sumRows);
            if (row < matrix.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.print("Column Sums: ");
        for (int col = 0; col < matrix[0].length; col++) {
            int sumCols = 0;
            for (int row = 0; row < matrix.length; row++) {
                sumCols += matrix[row][col];
            }
            System.out.print(sumCols);
            if (col < matrix[0].length - 1) {
                System.out.print(", ");
            }
        }

    }

    private static int[][] readMatrix(int[] dimensions, Scanner sc) {
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
