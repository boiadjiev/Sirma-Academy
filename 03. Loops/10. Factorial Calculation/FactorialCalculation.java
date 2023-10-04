package Loops;

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        boolean isPositive = false;
        int factorial = 1;
        if (input >= 0) {
            for (int i = 2; i <= input; i++) {
                factorial *= i;
            }

            isPositive = true;
        }

        System.out.println(isPositive ? factorial : "The number must be 0 or greater!");
    }
}
