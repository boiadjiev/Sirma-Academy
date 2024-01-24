package BasicSyntax;

import java.util.Scanner;

public class AverageSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double averageSpeed = distance / time;
        System.out.printf("%.2f%n", averageSpeed);
    }
}
