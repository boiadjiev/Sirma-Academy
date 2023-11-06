package Methods;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        printSign(number);
    }

    private static void printSign(int number) {
        String sigh;
        if (number > 0) {
            sigh = "positive";
        } else if (number < 0) {
            sigh = "negative";
        } else {
            sigh = "zero";
        }

        System.out.printf("The number %d is %s.", number, sigh);
    }
}
