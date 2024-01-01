package StringProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(encryptString(input));
        }

        private static String encryptString(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append((char)(input.charAt(i) + 3));
        }

        return output.toString();
    }
}
