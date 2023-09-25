package ConditionalStatements;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        String card = sc.nextLine();
        String discount = "";
        if (age < 18) {
            discount = "10% discount";
        } else if (age <= 64) {
            if (card.equals("Yes")) {
                discount = "20% discount";
            } else if (card.equals("No")) {
                discount = "10% discount";
            }

        } else {
            discount = "30% discount";
        }

        System.out.println(discount);
    }
}
