package BasicSyntax;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int sum = numOne + numTwo;
        int difference = Math.abs(numOne - numTwo);
        int product = numOne * numTwo;
        double average = (numOne + numTwo) / 2.0;
        System.out.printf("The sum is: %d%nThe difference is: %d%nThe product is: %d%nThe average is: %f%n",
                sum, difference, product, average);
    }
}
