package ConditionalStatements;

import java.util.Scanner;

public class AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());
        int totalMinutes = inputHours * 60 + inputMinutes + 15;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        if (hours == 24) {
            hours = 0;
        }

        System.out.printf("%d:%02d%n", hours, minutes);
    }
}
