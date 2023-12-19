package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Snowflakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matrix = readMatrix(sc);
        boolean printSeparator = false;
        while (fallSnowFlakes(matrix)) {
            if (printSeparator) {
                System.out.println("=".repeat(matrix.length));
            }

            printMatrix(matrix);
            printSeparator = true;
        }
    }

    private static boolean fallSnowFlakes(char[][] matrix) {
        boolean moved = false;
        for (int row = matrix.length - 2; row >= 0; row--) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == '*' && matrix[row + 1][col] == '0') {
                    matrix[row + 1][col] = '*';
                    matrix[row][col] = '0';
                    moved = true;
                }
            }
        }

        return moved;
    }

    private static char[][] readMatrix(Scanner sc) {
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            String[] token = sc.nextLine().split("\\s+");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = token[col].charAt(0);
            }
        }

        return matrix;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.printf("%c ", element);
            }

            System.out.println();
        }
    }
}
