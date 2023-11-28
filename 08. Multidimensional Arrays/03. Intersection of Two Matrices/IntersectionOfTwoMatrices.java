package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());
        char[][] matrixOne = readMatrix(rows, cols, sc);
        char[][] matrixTwo = readMatrix(rows, cols, sc);
        printMatrix(intersectMatrices(matrixOne, matrixTwo));
    }

    private static char[][] readMatrix(int rows, int cols, Scanner sc) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            String[] token = sc.nextLine().split("\\s+");
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = token[col].charAt(0);
            }
        }

        return matrix;
    }

    private static char[][] intersectMatrices(char[][] matrixOne, char[][] matrixTwo) {
        int rows = matrixOne.length;
        int cols = matrixOne[0].length;
        char[][] matrixResult = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrixResult[row][col] =
                        matrixOne[row][col] != matrixTwo[row][col]
                                ? '*' : matrixOne[row][col];
            }
        }

        return matrixResult;
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
