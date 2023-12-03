package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[size][size];
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[matrix.length - 1 - i][i];
        }

        System.out.println(sum);
    }
}
