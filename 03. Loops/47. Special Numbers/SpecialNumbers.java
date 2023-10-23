package Loops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = Double.parseDouble(sc.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int number = i;
            int count = 0;
            for (int j = 1; j <= 4; j++) {
                int digit = number % 10;
                if (input % digit == 0) {
                    count++;
                }

                number /= 10;
            }

            if (count == 4) {
                System.out.println(i);
            }
        }
    }
}
