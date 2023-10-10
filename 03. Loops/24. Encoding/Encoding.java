package Loops;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        while (input > 0) {
            int digit = input % 10;
            char symbol = (char) (digit + 33);
            if (digit != 0) {
                System.out.println((symbol + "").repeat(digit));
            } else {
                System.out.println("ZERO");
            }

            input /= 10;
        }
    }
}
