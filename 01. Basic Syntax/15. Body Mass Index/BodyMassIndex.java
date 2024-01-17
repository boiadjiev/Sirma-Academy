package BasicSyntax;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%.2f%n", bmi);
    }
}
