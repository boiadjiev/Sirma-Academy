package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split("\\s*,\\s*");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("%d.%s%n", i + 1, arr[i]);
        }
    }
}
