package StringProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(replaceRepeatingChars(input));
    }

    private static String replaceRepeatingChars(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                result.append(input.charAt(i));
            }
        }
        result.append(input.charAt(input.length() - 1));

        return result.toString();
    }
}
