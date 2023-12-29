package StringProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(Character.isDigit(currentChar)) {
                digits.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                letters.append(currentChar);
            } else {
                others.append(currentChar);
            }
        }

        System.out.printf("%s%n%s%n%s%n", digits, letters, others);
    }
}
