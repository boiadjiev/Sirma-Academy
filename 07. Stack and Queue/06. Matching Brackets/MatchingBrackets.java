package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                stack.push(i);
            } else if (input[i].equals(")")) {
                for (int j = stack.pop(); j < i + 1; j++) {
                    System.out.print(input[j]);
                }

                System.out.println();
            }
        }
    }
}
