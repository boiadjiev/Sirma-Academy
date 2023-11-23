package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int offerCount = Integer.parseInt(input[0]);
        int pollCount = Integer.parseInt(input[1]);
        int numToCheck = Integer.parseInt(input[2]);
        int min = Integer.MAX_VALUE;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] elements = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < offerCount; i++) {
            deque.offer(elements[i]);
        }

        for (int i = 0; i < pollCount; i++) {
            deque.poll();
        }

        for (int e : deque) {
            if (e < min) {
                min = e;
            }
        }
        if (!deque.isEmpty()) {
            System.out.println(deque.contains(numToCheck) ? "true" : min);
        } else {
            System.out.println("0");
        }
    }
}
