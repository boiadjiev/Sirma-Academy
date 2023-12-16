package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSquareChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = readMatrix(sc);
        System.out.println(isMagic(matrix) ? "True" : "False");
    }

    private static boolean isMagic(int[][] matrix) {
        int sumDiagonalOne = 0;
        int sumDiagonalTwo = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumDiagonalOne += matrix[i][i];
            sumDiagonalTwo += matrix[i][matrix.length - 1 - i];
        }

        if (sumDiagonalOne != sumDiagonalTwo) {
            return false;
        }

        int sumRow = 0;
        int sumCol = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                sumRow += matrix[row][col];
                sumCol += matrix[col][row];
            }

            if (sumRow != sumDiagonalOne || sumCol != sumDiagonalOne) {
                return false;
            }
            sumRow = 0;
            sumCol = 0;
        }
        return true;
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
