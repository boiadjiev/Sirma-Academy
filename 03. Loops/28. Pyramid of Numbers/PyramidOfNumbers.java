package Loops;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int current = 1;
        boolean isBigger = false;
        for (int row = 1; row <= input; row++) {
            for (int col = 1; col <= row; col++) {
                if (current > input) {
                    isBigger = true;
                    break;
                }

                System.out.printf("%d ", current);
                current++;
            }

            if (isBigger) {
                break;
            }

            System.out.println();
        }
    }
}
