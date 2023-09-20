package ConditionalStatements;

import java.util.Scanner;

public class NumberInTheRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String result = "No";
        if (num >= -100 && num <= 100 && num != 0) {
            result = "Yes";
        }

        System.out.println(result);
    }
}
