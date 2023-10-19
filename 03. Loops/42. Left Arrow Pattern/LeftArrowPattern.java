package Loops;

import java.util.Scanner;

public class LeftArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int spaceStepUp = n - 2;
        int spaceStepDown = 1;
        for (int i = 1; i < n; i++) {
            System.out.println(" ".repeat(spaceStepUp--) + "*".repeat(i));
        }

        for (int i = n; i > 2; i--) {
            System.out.println(" ".repeat(spaceStepDown++) + "*".repeat(i - 2));
        }
    }
}
