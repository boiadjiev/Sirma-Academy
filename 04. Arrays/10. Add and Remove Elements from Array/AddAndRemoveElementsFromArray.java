package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        String[] command = sc.nextLine().split("\\s*,\\s*");
        int currentDigit = 1;
        for (int i = 0; i < command.length; i++) {
            if (command[i].equals("add")) {
                arr.add(currentDigit);
            } else if (command[i].equals("remove")) {
                if (!arr.isEmpty()) {
                    arr.remove(arr.size() - 1);
                    currentDigit--;
                }
            }

            currentDigit++;
        }

        if (arr.isEmpty()) {
            System.out.print("Empty");
        } else {
            for (int element : arr) {
                System.out.print(element + " ");
            }
        }
    }
}
