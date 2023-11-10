package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(evensByOdds(num));
    }

    private static int evensByOdds(int number) {
        int evenSum = 0;
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            number /= 10;
        }
        return evenSum * oddSum;
    }
}
