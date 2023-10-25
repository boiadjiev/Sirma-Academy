package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int[] arr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int element : arr) {
            if (element % 2 == 0) {
                evenSum += element;
            } else {
                oddSum += element;
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
