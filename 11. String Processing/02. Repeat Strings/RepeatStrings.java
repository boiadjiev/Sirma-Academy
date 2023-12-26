package StringProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        System.out.println(repeatString(input));
    }

    private static String repeatString(String[] input) {
        StringBuilder resultString = new StringBuilder();
        for (String element : input) {
            resultString.append(element.repeat(element.length()));
        }

        return resultString.toString();
    }
}
