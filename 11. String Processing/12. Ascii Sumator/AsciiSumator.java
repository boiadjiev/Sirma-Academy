package StringProcessing;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charOne = sc.nextLine().charAt(0);
        char charTwo = sc.nextLine().charAt(0);
        String text = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) > charOne && text.charAt(i) < charTwo) {
                sum += text.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
