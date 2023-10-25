package Arrays;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrOne = sc.nextLine().split(",");
        String[] arrTwo = sc.nextLine().split(",");
        boolean areEquals = true;
        int sum = 0;
        for (int i = 0; i < arrOne.length; i++) {
            if (!arrOne[i].equals(arrTwo[i])) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areEquals = false;
                break;
            } else {
                sum += Integer.parseInt(arrOne[i]);
            }
        }

        if (areEquals) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
