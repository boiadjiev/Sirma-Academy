package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(",");
        int rotations = Integer.parseInt(sc.nextLine());
        for (int r = 1; r <= rotations; r++) {
            String temp = arr[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
            }

            arr[0] = temp;
        }

        for (String element : arr) {
            System.out.print(element + " ");
        }
    }
}
