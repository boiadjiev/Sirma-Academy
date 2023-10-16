package Loops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int spaceStep = input - 1;
        for (int i = 0; i <= input; i++) {
            if (i == 0) {
                System.out.println(" ".repeat(input + 1) + "|" + " ".repeat(input + 1));
            } else {
                System.out.println(" ".repeat(spaceStep--) + "*".repeat(i) + " " + "|" + " " + "*".repeat(i));
            }
        }
    }
}
