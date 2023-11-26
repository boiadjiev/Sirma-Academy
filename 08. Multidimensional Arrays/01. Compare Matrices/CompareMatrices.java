package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrixOne = readMatrix(sc);
        int[][] matrixTwo = readMatrix(sc);
        System.out.println(isEqual(matrixOne, matrixTwo) ? "equal" : "not equal");
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

    private static boolean isEqual(int[][] matrixOne, int[][] matrixTwo) {
        if (matrixOne.length != matrixTwo.length || matrixOne[0].length != matrixTwo[0].length) {
            return false;
        }

        for (int row = 0; row < matrixOne.length; row++) {
            for (int col = 0; col < matrixOne[0].length; col++) {
                if (matrixOne[row][col] != matrixTwo[row][col]) {
                    return false;
                }
            }
        }

        return true;
    }
}
