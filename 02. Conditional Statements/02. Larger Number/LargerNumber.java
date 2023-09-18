package ConditionalStatements;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int largerNum = 0;
        if (numOne > numTwo) {
            largerNum = numOne;
        } else {
            largerNum = numTwo;
        }

        System.out.println(largerNum);
    }
}
