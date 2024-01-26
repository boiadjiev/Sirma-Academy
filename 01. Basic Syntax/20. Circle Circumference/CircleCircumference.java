package BasicSyntax;

import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double circumference = 2 * Math.PI * radius;
        System.out.printf("%.2f%n", circumference);
    }
}
