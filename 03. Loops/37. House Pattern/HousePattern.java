package Loops;

import java.util.Scanner;

public class HousePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int oddSpaces = input / 2;
        int evenSpaces = 1;
        for (int i = 1; i <= input; i++) {
            if (i % 2 != 0 && input % 2 != 0) {
                System.out.println(" ".repeat(oddSpaces--) + "*".repeat(i));
                if (i == input && input != 1) {
                    System.out.println("*" + " ".repeat(input - 2) + "*");
                    System.out.println("*" + " ".repeat(input - 2) + "*");
                }

            } else if (i % 2 == 0 && input % 2 == 0) {
                System.out.println(" ".repeat(input - i) + "* ".repeat(i));
                if (i == input) {
                    System.out.println("*" + " ".repeat(evenSpaces) + "*");
                    System.out.println("*" + " ".repeat(evenSpaces) + "*");
                }

                evenSpaces += 4;
            }
        }
    }
}
