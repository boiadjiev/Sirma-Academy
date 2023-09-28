package ConditionalStatements;

import java.util.Scanner;

public class ArchitecturalEraIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());
        String material = sc.nextLine();
        String era;
        if (year < 500 && material.equals("stone")) {
            era = "Ancient";
        } else if (year >= 500 && year <= 1500 && material.equals("stone")) {
            era = "Medieval";
        } else if (year >= 1500 && year <= 1800 && material.equals("wood")) {
            era = "Colonial";
        } else if (year >= 1800 && year <= 1900 && material.equals("steel")) {
            era = "Industrial";
        } else if (year > 1900 && material.equals("steel")) {
            era = "Modern";
        } else {
            era = "Uncertain";
        }

        System.out.println(era);
    }
}
