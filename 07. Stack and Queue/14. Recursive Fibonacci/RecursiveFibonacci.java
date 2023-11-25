package StackAndQueue;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] memo = new int[n + 1];
        System.out.println(getFibonacci(n, memo));
    }

    private static int getFibonacci(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = getFibonacci(n - 1, memo) + getFibonacci(n - 2, memo);
        return memo[n];
    }
}
