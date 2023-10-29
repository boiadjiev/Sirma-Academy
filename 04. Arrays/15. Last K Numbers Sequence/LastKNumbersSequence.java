package Arrays;

import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            int startIndex = Math.max(0, i - k);
            for (int j = startIndex; j < i; j++) {
                sum += arr[j];
            }

            arr[i] = sum;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
