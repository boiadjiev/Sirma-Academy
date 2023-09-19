package ConditionalStatements;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        String speedString;
        if (speed > 160) {
            speedString = "turbo-fast";
        } else if (speed > 120) {
            speedString = "super-fast";
        } else if (speed > 60) {
            speedString = "fast";
        } else if (speed > 10) {
            speedString = "average";
        } else {
            speedString = "slow";
        }

        System.out.println(speedString);
    }
}
