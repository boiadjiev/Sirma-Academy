package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        System.out.println(repeatString(inputStr, count));
    }

    private static String repeatString(String inputStr, int count) {
        return inputStr.repeat(count);
    }
}
