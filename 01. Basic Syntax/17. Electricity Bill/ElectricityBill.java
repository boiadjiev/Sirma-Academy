package BasicSyntax;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unitsConsumed = Integer.parseInt(scanner.nextLine());
        double ratePerUnit = Double.parseDouble(scanner.nextLine());
        double totalBill = (unitsConsumed * ratePerUnit) + 10;
        System.out.printf("%.2f%n", totalBill);
    }
}
