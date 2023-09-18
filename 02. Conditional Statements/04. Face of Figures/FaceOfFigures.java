package ConditionalStatements;

import java.util.Scanner;

public class FaceOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;
        switch (figure) {
            case "square":
                double sideLength = Double.parseDouble(scanner.nextLine());
                area = Math.pow(sideLength, 2);
                break;
            case "rectangle":
                double sideA = Double.parseDouble(scanner.nextLine());
                double sideB = Double.parseDouble(scanner.nextLine());
                area = sideA * sideB;
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                area = Math.PI * Math.pow(radius, 2);
                break;
            case "triangle":
                double side = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                area = side * height / 2;
        }
        System.out.printf("%.2f%n", area);
    }
}
