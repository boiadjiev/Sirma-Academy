package Loops;

import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bgn1 = Integer.parseInt(sc.nextLine());
        int bgn2 = Integer.parseInt(sc.nextLine());
        int bgn5 = Integer.parseInt(sc.nextLine());
        int sum = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= bgn1; i++) {
            for (int j = 0; j <= bgn2; j++) {
                for (int k = 0; k <= bgn5; k++) {
                    if (i + j * 2 + k * 5 == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sum);
                    }
                }
            }
        }
    }
}
