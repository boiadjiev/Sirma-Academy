package Loops;

import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int space = 1;
        System.out.println("#".repeat(n + 2));
        for (int i = n - 2; i > 0; i -= 2) {
            System.out.println(" ".repeat(space++) + "#" + " ".repeat(i) + "#");
        }

        if (n % 2 != 0) {
            System.out.println(" ".repeat(space) + "#");
        } else {
            System.out.println(" ".repeat(space) + "##");
        }

        if (n % 2 != 0) {
            for (int i = 1; i <= n - 2; i += 2) {
                System.out.println(" ".repeat(--space) + "#" + " ".repeat(i) + "#");
            }
        } else {
            for (int i = 2; i <= n - 2; i += 2) {
                System.out.println(" ".repeat(--space) + "#" + " ".repeat(i) + "#");
            }
        }

        System.out.println("#".repeat(n + 2));
    }
}
