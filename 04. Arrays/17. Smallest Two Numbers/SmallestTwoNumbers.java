package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;
        int minIndexOne = 0;
        int minIndexTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minOne) {
                minOne = arr[i];
                minIndexOne = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != minIndexOne) {
                if (arr[i] < minTwo) {
                    minTwo = arr[i];
                    minIndexTwo = i;
                }
            }
        }

        if (arr.length > 1) {
            System.out.printf("%d %d%n", arr[minIndexOne], arr[minIndexTwo]);
        }
    }
}
