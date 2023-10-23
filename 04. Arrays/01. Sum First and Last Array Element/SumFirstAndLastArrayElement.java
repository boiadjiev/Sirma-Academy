package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(arr[0] + arr[arr.length - 1]);
    }
}
