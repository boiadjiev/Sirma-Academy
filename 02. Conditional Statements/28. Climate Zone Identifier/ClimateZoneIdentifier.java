package ConditionalStatements;

import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int latitude = Math.abs(Integer.parseInt(sc.nextLine()));
        char hemisphere = sc.nextLine().charAt(0);
        String zone;
        if (latitude == 0) {
            zone = "Equator";
        } else if (latitude < 23.5) {
            zone = "Tropic Zone";
        } else if (latitude < 66.5) {
            zone = "Temperate Zone";
        } else {
            zone = "Arctic Zone";
        }

        System.out.println(zone);
    }
}
