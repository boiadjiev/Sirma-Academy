package StringProcessing;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bigNumber = sc.nextLine();
        int digit = Integer.parseInt(sc.nextLine());
        System.out.println(multiplyBigNumber(bigNumber, digit));
    }

    private static String multiplyBigNumber (String bigNumber, int multiplyDigit) {
        int reminder = 0;
        StringBuilder resultStr = new StringBuilder();
        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(bigNumber.charAt(i) + "");
            int result = digit * multiplyDigit + reminder;
            reminder = result / 10;
            resultStr.insert(0, result % 10);
        }

        if (reminder > 0) {
            resultStr.insert(0, reminder);
        }

        return resultStr.toString();
    }
}
