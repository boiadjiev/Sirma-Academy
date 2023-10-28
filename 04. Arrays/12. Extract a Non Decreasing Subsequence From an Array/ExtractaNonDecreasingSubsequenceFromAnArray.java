package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExtractaNonDecreasingSubsequenceFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArr = Arrays
                .stream(sc.nextLine().split("\\s*,\\s*"))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> processed = new ArrayList<>();
        int biggestNum = inputArr[0];
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] >= biggestNum) {
                biggestNum = inputArr[i];
                processed.add(biggestNum);
            }
        }

        for (int element : processed) {
            System.out.print(element + " ");
        }
    }
}
