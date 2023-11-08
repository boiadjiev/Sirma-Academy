package Methods;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        int numOne = Integer.parseInt(sc.nextLine());
        int numTwo = Integer.parseInt(sc.nextLine());
        switch (command) {
            case "add":
                addNumbers(numOne, numTwo);
                break;
            case "multiply":
                multiplyNumbers(numOne, numTwo);
                break;
            case "subtract":
                subtractNumbers(numOne, numTwo);
                break;
            case "divide":
                divideNumbers(numOne, numTwo);
        }
    }

    private static void addNumbers(int numOne, int numTwo) {
        System.out.println(numOne + numTwo);
    }

    private static void multiplyNumbers(int numOne, int numTwo) {
        System.out.println(numOne * numTwo);
    }

    private static void subtractNumbers(int numOne, int numTwo) {
        System.out.println(numOne - numTwo);
    }

    private static void divideNumbers(int numOne, int numTwo) {
        System.out.println(numOne / numTwo);
    }
}
