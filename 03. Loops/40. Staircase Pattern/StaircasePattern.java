package Loops;

import java.util.Scanner;

public class StaircasePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int space = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("#".repeat(i));

            if (i > 1) {
                System.out.print(" ".repeat(space));
                space += i;
            }
        }
    }
}
