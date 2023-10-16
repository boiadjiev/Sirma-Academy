package Loops;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String firsAndLastRow = "*".repeat(n * 2) + " ".repeat(n) + "*".repeat(n * 2);
        System.out.println(firsAndLastRow);
        for (int i = 1; i <= n - 2; i++) {
            if (i == (n - 1) / 2) {
                System.out.println("*" + "/".repeat(n * 2 - 2) + "*" + "|".repeat(n) + "*" + "/".repeat(n * 2 - 2) + "*");
            } else {
                System.out.println("*" + "/".repeat(n * 2 - 2) + "*" + " ".repeat(n) + "*" + "/".repeat(n * 2 - 2) + "*");
            }
        }

        System.out.println(firsAndLastRow);
    }
}
