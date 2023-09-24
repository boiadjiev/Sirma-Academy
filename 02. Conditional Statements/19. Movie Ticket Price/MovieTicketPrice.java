package ConditionalStatements;

import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        int price = 0;
        if (age >= 0 && age <= 12) {
            price = 5;
        } else if (age >= 13 && age <= 19) {
            price = 8;
        } else {
            price = 10;
        }

        System.out.printf("$%d%n", price);
    }
}
