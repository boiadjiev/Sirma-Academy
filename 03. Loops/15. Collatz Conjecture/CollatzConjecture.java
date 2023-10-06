package Loops;

import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n != 1) {
            System.out.printf("%d ", n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.print("1");
    }
}
