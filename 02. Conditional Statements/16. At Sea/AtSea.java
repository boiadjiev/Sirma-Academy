package ConditionalStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int days = Integer.parseInt(sc.nextLine());
        String room = sc.nextLine();
        String assessment = sc.nextLine();
        double total = 0;
        switch (room) {
            case "single room":
                total = (days - 1) * 25.00;
                break;
            case "apartment":
                total = (days - 1) * 50.00;
                if (days < 10) {
                    total *= 0.70;
                } else if (days <= 15) {
                    total *= 0.65;
                } else {
                    total *= 0.50;
                }
                break;
            case "presidential":
                total = (days - 1) * 100.00;
                if (days < 10) {
                    total *= 0.90;
                } else if (days <= 15) {
                    total *= 0.85;
                } else {
                    total *= 0.80;
                }
        }
        if (assessment.equals("positive")) {
            total *= 1.25;
        } else if (assessment.equals("negative")) {
            total *= 0.90;
        }

        System.out.println(df.format(total));
    }
}
