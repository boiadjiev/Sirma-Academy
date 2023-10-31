package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> intList = new ArrayList<>();
        for (String element : input) {
            intList.add(Integer.parseInt(element));
        }

        String[] commands = sc.nextLine().split("\\s*,\\s");
        for (int i = 0; i < commands.length; i++) {
            String[] command = commands[i].split(" ");
            switch (command[0]) {
                case "Add":
                    intList.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    intList.remove(Integer.valueOf(Integer.parseInt(command[1])));
                    break;
                case "RemoveAt":
                    intList.remove(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    intList.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
            }
        }
        for (int element : intList) {
            System.out.print(element + " ");
        }
    }
}
