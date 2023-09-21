package ConditionalStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.00");
        String vegetable = sc.nextLine();
        String day = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        double productPrice = 0;
        boolean isError = false;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (vegetable) {
                    case "tomato":
                        productPrice = 2.50;
                        break;
                    case "onion":
                        productPrice = 1.20;
                        break;
                    case "lettuce":
                        productPrice = 0.85;
                        break;
                    case "cucumber":
                        productPrice = 1.45;
                        break;
                    case "pepper":
                        productPrice = 5.50;
                        break;
                    default:
                        isError = true;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (vegetable) {
                    case "tomato":
                        productPrice = 2.80;
                        break;
                    case "onion":
                        productPrice = 1.30;
                        break;
                    case "lettuce":
                        productPrice = 0.85;
                        break;
                    case "cucumber":
                        productPrice = 1.75;
                        break;
                    case "pepper":
                        productPrice = 3.50;
                        break;
                    default:
                        isError = true;
                }
                break;
            default:
                isError = true;
        }
        double total = productPrice * quantity;
        System.out.println(isError ? "error" : df.format(total));
    }
}
