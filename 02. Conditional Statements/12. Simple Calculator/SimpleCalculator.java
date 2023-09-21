package ConditionalStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double numOne = Double.parseDouble(scanner.nextLine());
        double numTwo = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        switch (operator) {
            case "add":
                result = numOne + numTwo;
                break;
            case "subtract":
                result = numOne - numTwo;
                break;
            case "divide":
                result = numOne / numTwo;
                break;
            case "multiply":
                result = numOne * numTwo;
        }
        System.out.println(df.format(result));
    }
}
