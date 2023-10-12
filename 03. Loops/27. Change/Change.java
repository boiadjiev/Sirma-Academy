package Loops;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double change = Double.parseDouble(sc.nextLine());
        int count = 0;
        double coins = Math.round(change * 100);
        while (coins > 0) {
            if (coins >= 200) {
                count++;
                coins -= 200;
            } else if (coins >= 100) {
                count++;
                coins -= 100;
            } else if (coins >= 50) {
                count++;
                coins -= 50;
            } else if (coins >= 20) {
                count++;
                coins -= 20;
            } else if (coins >= 10) {
                count++;
                coins -= 10;
            } else if (coins >= 5) {
                count++;
                coins -= 5;
            } else if (coins >= 2) {
                count++;
                coins -= 2;
            } else if (coins >= 1) {
                count++;
                coins -= 1;
            }
        }
        System.out.println(count);
    }
}
