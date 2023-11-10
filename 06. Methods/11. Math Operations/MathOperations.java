package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double numOne = Double.parseDouble(sc.nextLine());
        String operator = sc.nextLine();
        double numTwo = Double.parseDouble(sc.nextLine());
        System.out.println(df.format(calculator(numOne, operator, numTwo)));
    }

    private static double calculator(double numOne, String operator, double numTwo) {
        double result = 0;
        switch (operator) {
            case "/":
                result = numOne / numTwo;
                break;
            case "*":
                result = numOne * numTwo;
                break;
            case "+":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
        }
        return result;
    }
}
