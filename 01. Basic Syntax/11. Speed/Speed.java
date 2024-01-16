package BasicSyntax;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double speed = distance / totalSeconds;
        System.out.printf("%.6f%n", speed);
    }
}
