package ConditionalStatements;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        boolean isLeap = false;
        if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }

            } else {
                isLeap = true;
            }
        }

        System.out.println(isLeap ? "It‘s a leap year!" : "It‘s not a leap year.");
    }
}
