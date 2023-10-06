package Loops;

import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.nextLine());
        int column = Integer.parseInt(sc.nextLine());
        for (int n = 1; n <= row; n++) {
            if (n == 1 || n == row) {
                System.out.println("*".repeat(column));
            } else {
                System.out.println("*" + " ".repeat(column - 2) + "*");
            }
        }
    }
}
