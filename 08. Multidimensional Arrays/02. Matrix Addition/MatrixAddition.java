package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrixOne = readMatrix(dimensions, sc);
        int[][] matrixTwo = readMatrix(dimensions, sc);
        for (int row = 0; row < matrixOne.length; row++) {
            for (int col = 0; col < matrixOne[0].length; col++) {
                int sumCurrentNum = matrixOne[row][col] + matrixTwo[row][col];
                System.out.printf("%d ", sumCurrentNum);
            }
            System.out.println();
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
