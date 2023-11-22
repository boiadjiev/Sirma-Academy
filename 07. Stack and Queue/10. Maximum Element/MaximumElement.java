package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commandsCount = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < commandsCount; i++) {
            String[] command = sc.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case "3":
                    System.out.println(getMax(stack));
            }
        }
    }

    private static int getMax(ArrayDeque<Integer> stack) {
        int max = Integer.MIN_VALUE;
        for (int element : stack) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }
}
