package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        int sum;
        int lastDigit = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            stack.push(input[i]);
        }

        while (stack.size() > 1) {
            String lastElement = stack.pop();
            switch (lastElement) {
                case "+":
                    sum = lastDigit + Integer.parseInt(stack.pop());
                    stack.push(sum + "");
                    break;
                case "-":
                    sum = lastDigit - Integer.parseInt(stack.pop());
                    stack.push(sum + "");
                    break;
                default:
                    lastDigit = Integer.parseInt(lastElement);
            }
        }
        System.out.println(stack.peek());
    }
}
