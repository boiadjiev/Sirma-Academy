package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCols = Integer.parseInt((sc.nextLine()));
        printTriangle(inputCols);
    }

    private static void printTriangle(int inputCols) {
        for (int row = 1; row <= inputCols; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

        for (int row = inputCols - 1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
