package Loops;

import java.util.Scanner;

public class AlternativeConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int current = 1;
        int space = input / 2;
        boolean isBigger = false;
        for (int row = 1; row <= input; row++) {
            System.out.print(" ".repeat(space--));
            for (int col = 1; col <= row; col++) {
                if (current > input) {
                    isBigger = true;
                    break;
                }

                System.out.printf("%d ", current++);
            }

            if (isBigger) {
                break;
            }

            System.out.println();
        }
    }
}
