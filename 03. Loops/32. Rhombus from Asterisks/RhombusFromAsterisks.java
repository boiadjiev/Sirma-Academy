package Loops;

import java.util.Scanner;

public class RhombusFromAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= input; i++) {
            System.out.println(" ".repeat(input - i) + "* ".repeat(i));
        }

        for (int j = input - 1; j >= 1; j--) {
            System.out.println(" ".repeat(input - j) + "* ".repeat(j));
        }
    }
}
