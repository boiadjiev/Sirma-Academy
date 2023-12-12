package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExcelSumFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = readMatrix(sc);
        String[] range = sc.nextLine().split(":");
        int startRow = Integer.parseInt("" + range[0].charAt(1)) - 1;
        int startCol = range[0].charAt(0) - 65;
        int endRow = Integer.parseInt("" + range[1].charAt(1)) - 1;
        int endCol = range[1].charAt(0) - 65;
        int sum = 0;
        for (int row = startRow; row <= endRow; row++) {
            for (int col = startCol; col <= endCol; col++) {
                sum += matrix[row][col];
            }
        }

        System.out.println(sum);
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
