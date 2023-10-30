package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                System.out.print((arr[i] * 2) + " ");
            }
        }
    }
}
