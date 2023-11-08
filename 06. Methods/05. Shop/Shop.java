package Methods;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        printTotal(product, quantity);
    }

    private static void printTotal(String product, int quantity) {
        double productPrice = 0;
        switch (product) {
            case "coffee":
                productPrice = 1.50;
                break;
            case "water":
                productPrice = 1.00;
                break;
            case "coke":
                productPrice = 1.40;
                break;
            case "snacks":
                productPrice = 2.00;
        }
        System.out.printf("%.2f", productPrice * quantity);
    }
}
