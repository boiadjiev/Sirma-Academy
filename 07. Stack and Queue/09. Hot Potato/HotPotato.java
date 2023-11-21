package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> children = new ArrayDeque<>();
        Collections.addAll(children, names);
        while (children.size() > 1) {
            for (int i = 1; i < n; i++) {
                String lastChild = children.poll();
                children.offer(lastChild);
            }

            System.out.printf("Remove %s%n", children.poll());
        }
        System.out.printf("Last is %s%n", children.poll());
    }
}
