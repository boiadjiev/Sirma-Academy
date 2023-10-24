package Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        if (input >=1 && input <= 7) {
            System.out.println(daysOfWeek[input-1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
