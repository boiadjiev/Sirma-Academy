package Loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int sum = 0;
        List<Integer> fib = new ArrayList<>();
        fib.add(0, 0);
        fib.add(1, 1);
        for (int i = 0; i < input; i++) {
            fib.add(2 + i, fib.get(i) + fib.get(i + 1));
            sum += fib.get(i);
        }

        System.out.println(sum);
    }
}
