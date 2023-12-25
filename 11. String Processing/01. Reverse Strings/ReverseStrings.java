package StringProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("end")) {
            System.out.printf("%s = %s%n", input, reverseString(input));
            input = sc.nextLine();
        }
    }

    private static String reverseString (String input) {
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();
        return reversedString.toString();
    }
}
