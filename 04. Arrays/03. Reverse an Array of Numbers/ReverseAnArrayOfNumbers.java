package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] inputArr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inputArr[i];
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length -1 -i];
            arr[arr.length -1 -i] = temp;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
