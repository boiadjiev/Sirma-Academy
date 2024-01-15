package BasicSyntax;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMinutes = Integer.parseInt(scanner.nextLine());
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.printf("%02d:%02d%n", hours, minutes);
    }
}
