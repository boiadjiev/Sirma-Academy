package Loops;

import java.util.Scanner;

public class Numbers1toNthroughM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i += m) {
            System.out.println(i);
        }
    }
}
