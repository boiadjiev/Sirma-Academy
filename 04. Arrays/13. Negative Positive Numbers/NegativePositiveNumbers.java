package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> outputArr = new ArrayList<>();
        for (int element : inputArr) {
            if (element < 0) {
                outputArr.add(element);
            }
        }

        for (int element : inputArr) {
            if (element >= 0) {
                outputArr.add(element);
            }
        }

        for (int element : outputArr) {
            System.out.println(element);
        }
    }
}
