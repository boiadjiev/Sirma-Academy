package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChessboardChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = readMatrix(sc);
        System.out.println(threatCheck(matrix) ? "Yes" : "No");
    }

    private static boolean threatCheck(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == 1) {
                    for (int rowCheck = 0; rowCheck < matrix.length; rowCheck++) {
                        if (matrix[rowCheck][col] == 1 && rowCheck != row) {
                            return true;
                        }
                    }

                    for (int colCheck = 0; colCheck < matrix[0].length; colCheck++) {
                        if (matrix[row][colCheck] == 1 && colCheck != col) {
                            return true;
                        }
                    }

                    for (int i = 1; i < matrix.length; i++) {
                        if (row + i < matrix.length && col + i < matrix.length && matrix[row + i][col + i] == 1) {
                            return true;
                        }
                        if (row - i >= 0 && col - i >= 0 && matrix[row - i][col - i] == 1) {
                            return true;
                        }
                        if (row + i < matrix.length && col - i >= 0 && matrix[row + i][col - i] == 1) {
                            return true;
                        }
                        if (row - i >= 0 && col + i < matrix.length && matrix[row - i][col + i] == 1) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
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
