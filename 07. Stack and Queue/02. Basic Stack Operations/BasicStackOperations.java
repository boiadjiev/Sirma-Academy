package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] command = sc.nextLine().split("\\s+");
        int pushCount = Integer.parseInt(command[0]);
        int popCount = Integer.parseInt(command[1]);
        int numToCheck = Integer.parseInt(command[2]);
        int min = Integer.MAX_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] elements = Arrays
                .stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < pushCount; i++) {
            stack.push(elements[i]);
        }

        for (int i = 0; i < popCount; i++) {
            stack.pop();
        }

        for (int element : stack) {
            if (element < min) {
                min = element;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println(stack.contains(numToCheck) ? "true" : min);
        } else {
            System.out.println("0");
        }
    }
}
