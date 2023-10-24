package Arrays;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\s*,\\s*");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int digit = Integer.parseInt(arr[i]);
            if (digit % 2 == 0) {
                sum += digit;
            }
        }

        System.out.println(sum);
    }
}
