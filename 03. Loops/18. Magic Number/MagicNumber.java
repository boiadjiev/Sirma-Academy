package Loops;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magic = Integer.parseInt(sc.nextLine());
        int combinations = 0;
        boolean isMagic = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;
                if (i + j == magic) {
                    System.out.printf("Combination %d - (%d + %d = %d)", combinations, i, j, magic);
                    isMagic = true;
                    break;
                }
            }

            if (isMagic) {
                break;
            }
        }

        if (!isMagic) {
            System.out.printf("%d combinations - neither equals %d", combinations, magic);
        }
    }
}
