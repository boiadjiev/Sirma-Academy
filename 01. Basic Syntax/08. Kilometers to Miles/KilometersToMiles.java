package BasicSyntax;

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double km = Double.parseDouble(scanner.nextLine());
        double miles = km * 0.621371192;
        System.out.println(miles);
    }
}
