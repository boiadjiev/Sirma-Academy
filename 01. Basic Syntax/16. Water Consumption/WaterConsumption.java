package BasicSyntax;

import java.util.Scanner;

public class WaterConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalWater = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        double dailyConsumption = totalWater / 7.0 / peopleCount;
        System.out.printf("%.2f%n", dailyConsumption);
    }
}
