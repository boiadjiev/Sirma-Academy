package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = readMatrix(sc);
        printMaximalSumMatrix(matrix);

    }

    private static void printMaximalSumMatrix(int[][] matrix) {
        int[][] maxMatrix = new int[3][3];
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[0].length - 2; col++) {
                int currentSum;
                currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxMatrix[0][0] = matrix[row][col];
                    maxMatrix[0][1] = matrix[row][col + 1];
                    maxMatrix[0][2] = matrix[row][col + 2];
                    maxMatrix[1][0] = matrix[row + 1][col];
                    maxMatrix[1][1] = matrix[row + 1][col + 1];
                    maxMatrix[1][2] = matrix[row + 1][col + 2];
                    maxMatrix[2][0] = matrix[row + 2][col];
                    maxMatrix[2][1] = matrix[row + 2][col + 1];
                    maxMatrix[2][2] = matrix[row + 2][col + 2];
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        printMatrix(maxMatrix);
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
