package ConditionalStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MakeupShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double renovationPrice = Double.parseDouble(sc.nextLine());
        int powders = Integer.parseInt(sc.nextLine());
        int lipsticks = Integer.parseInt(sc.nextLine());
        int spirals = Integer.parseInt(sc.nextLine());
        int shadows = Integer.parseInt(sc.nextLine());
        int correctors = Integer.parseInt(sc.nextLine());
        double total = powders * 2.6 + lipsticks * 3.0 + spirals * 4.1 + shadows * 8.2 + correctors * 2.0;
        int makeupCount = powders + lipsticks + spirals + shadows + correctors;
        if (makeupCount >= 50) {
            total *= 0.75;
        }

        total *= 0.9;
        double remaining = Math.abs(total - renovationPrice);
        if (total >= renovationPrice) {
            System.out.printf("Yes! %s lv left.%n", df.format(remaining));
        } else {
            System.out.printf("Not enough money! %s lv needed.%n", df.format(remaining));
        }
    }
}
