package Loops;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= input; i++) {
            if (i == 1 || i == input) {
                System.out.println("+ " + "- ".repeat(input - 2) + "+");
            } else {
                System.out.println("| " + "- ".repeat(input - 2) + "|");
            }
        }
    }
}
