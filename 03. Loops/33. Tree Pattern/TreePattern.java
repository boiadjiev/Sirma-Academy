package Loops;

import java.util.Scanner;

public class TreePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int j = 0;
        for (int i = 1; i <= input; i++) {
            System.out.println(" ".repeat(input - i) + "*".repeat(i + j++));
        }

        System.out.println(" ".repeat(input - 1) + "*");
    }
}
