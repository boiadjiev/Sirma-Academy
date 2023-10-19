package Loops;

import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int spaceStep = n - 2;
        for (int i = 1; i < n; i++) {
            System.out.println(" ".repeat(spaceStep--) + "* ".repeat(i));
        }

        for (int i = 1; i < n; i++) {
            System.out.println(" ".repeat(((n - 1 + n - 2) - (n - 2)) / 2) + "*".repeat(n / 2 * 2 - 1));
        }
    }
}
