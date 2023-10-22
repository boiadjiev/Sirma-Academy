package Loops;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne = Integer.parseInt(sc.nextLine());
        int numTwo = Integer.parseInt(sc.nextLine());
        for (int i1 = 1; i1 <= numOne; i1++) {
            for (int i2 = 1; i2 <= numOne; i2++) {
                for (int i3 = 'a'; i3 < 'a' + numTwo; i3++) {
                    for (int i4 = 'a'; i4 < 'a' + numTwo; i4++) {
                        for (int i5 = Math.max(i1, i2) + 1; i5 <= numOne; i5++) {
                            System.out.printf("%d%d%c%c%d%n", i1, i2, i3, i4, i5);
                        }
                    }
                }
            }
        }
    }
}
