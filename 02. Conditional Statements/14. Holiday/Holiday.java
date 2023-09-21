package ConditionalStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String destination = "";
        String typeOfHoliday = "";
        double amountSpent = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                amountSpent = budget * 0.30;
            } else if (season.equals("winter")) {
                amountSpent = budget * 0.70;
            }

        } else if (budget <= 1000) {
            destination = "Europe";
            if (season.equals("summer")) {
                amountSpent = budget * 0.40;
            } else if (season.equals("winter")) {
                amountSpent = budget * 0.80;
            }

        } else if (budget > 1000) {
            destination = "Asia";
            amountSpent = budget * 0.90;
        }

        if (destination.equals("Asia")) {
            typeOfHoliday = "Hotel";
        } else {
            if (season.equals("summer")) {
                typeOfHoliday = "Camp";
            } else if (season.equals("winter")) {
                typeOfHoliday = "Hotel";
            }
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %s%n", typeOfHoliday, df.format(amountSpent));
    }
}
