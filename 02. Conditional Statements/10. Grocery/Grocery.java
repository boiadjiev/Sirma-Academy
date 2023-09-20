package ConditionalStatements;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double productPrice = 0;
        switch (product) {
            case "coffee":
                if (city.equals("Sofia")) {
                    productPrice = 0.50;
                } else if (city.equals("Plovdiv")) {
                    productPrice = 0.40;
                } else if (city.equals("Varna")) {
                    productPrice = 0.45;
                }
                break;
            case "water":
                if (city.equals("Sofia")) {
                    productPrice = 0.80;
                } else if (city.equals("Plovdiv")) {
                    productPrice = 0.70;
                } else if (city.equals("Varna")) {
                    productPrice = 0.70;
                }
                break;
            case "juice":
                if (city.equals("Sofia")) {
                    productPrice = 1.20;
                } else if (city.equals("Plovdiv")) {
                    productPrice = 1.15;
                } else if (city.equals("Varna")) {
                    productPrice = 1.10;
                }
                break;
            case "sweets":
                if (city.equals("Sofia")) {
                    productPrice = 1.45;
                } else if (city.equals("Plovdiv")) {
                    productPrice = 1.30;
                } else if (city.equals("Varna")) {
                    productPrice = 1.35;
                }
                break;
            case "chips":
                if (city.equals("Sofia")) {
                    productPrice = 1.60;
                } else if (city.equals("Plovdiv")) {
                    productPrice = 1.50;
                } else if (city.equals("Varna")) {
                    productPrice = 1.55;
                }
        }
        double total = productPrice * quantity;
        System.out.printf("%.2f%n", total);
    }
}
