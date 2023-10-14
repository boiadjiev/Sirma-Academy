package Loops;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= input; i++) {
            System.out.println("* ".repeat(input));
        }
    }
}
