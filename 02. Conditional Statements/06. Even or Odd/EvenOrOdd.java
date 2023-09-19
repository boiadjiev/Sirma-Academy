package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String evenOrOdd = "odd";
        if (num % 2 == 0) {
            evenOrOdd = "even";
        }

        System.out.println(evenOrOdd);
    }
}
