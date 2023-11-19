package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<String> deque = new ArrayDeque<>();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (!deque.isEmpty()) {
                    System.out.println("Canceled " + deque.poll());
                } else {
                    System.out.println("Standby");
                }

            } else {
                deque.offer(input);
            }

            input = sc.nextLine();
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst());
        }
    }
}
