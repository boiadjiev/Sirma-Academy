package Loops;

import java.util.Scanner;

public class EvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initValueOne = Integer.parseInt(sc.nextLine());
        int initValueTwo = Integer.parseInt(sc.nextLine());
        int diffOne = Integer.parseInt(sc.nextLine());
        int diffTwo = Integer.parseInt(sc.nextLine());
        for (int i = initValueOne; i <= initValueOne + diffOne; i++) {
            for (int j = initValueTwo; j <= initValueTwo + diffTwo; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
