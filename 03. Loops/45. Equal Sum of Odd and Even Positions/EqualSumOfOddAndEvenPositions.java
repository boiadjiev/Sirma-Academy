package Loops;

import java.util.Scanner;

public class EqualSumOfOddAndEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNumber = Integer.parseInt(sc.nextLine());
        int endNumber = Integer.parseInt(sc.nextLine());
        boolean areEquals = false;
        for (int i = startNumber; i <= endNumber; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int currentNumber = i;
            for (int j = 6; j > 0; j--) {
                int currentDigit = currentNumber % 10;
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }

                currentNumber /= 10;
            }

            if (evenSum == oddSum) {
                System.out.println(i);
                areEquals = true;
            }
        }

        if (!areEquals) {
            System.out.println("None");
        }
    }
}
