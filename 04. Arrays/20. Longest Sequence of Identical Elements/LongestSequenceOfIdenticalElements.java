package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int digit = 0;
        int count = 1;
        int maxCount = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    digit = arr[i];
                }

            } else {
                count = 1;
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }
    }
}
