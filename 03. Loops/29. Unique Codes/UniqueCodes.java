package Loops;

import java.util.Scanner;

public class UniqueCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxOne = Integer.parseInt(sc.nextLine());
        int maxTwo = Integer.parseInt(sc.nextLine());
        int maxThree = Integer.parseInt(sc.nextLine());
        for (int i1 = 1; i1 <= maxOne; i1++) {
            for (int i2 = 1; i2 <= maxTwo; i2++) {
                for (int i3 = 1; i3 <= maxThree; i3++) {
                    if ((i1 % 2 == 0 && i3 % 2 == 0) && (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7)) {
                        System.out.printf("%d %d %d%n", i1, i2, i3);
                    }
                }
            }
        }
    }
}
