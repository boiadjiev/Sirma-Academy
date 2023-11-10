package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        if (type.equals("int")) {
            int valueOne = Integer.parseInt(sc.nextLine());
            int valueTwo = Integer.parseInt(sc.nextLine());
            int result = getMax(valueOne, valueTwo);
            if (result == 0) {
                System.out.println("The values are identical!");
            } else {
                System.out.println(result);
            }

        } else if (type.equals("char")) {
            char valueOne = sc.nextLine().charAt(0);
            char valueTwo = sc.nextLine().charAt(0);
            char result = getMax(valueOne, valueTwo);
            if (result == 0) {
                System.out.println("The values are identical!");
            } else {
                System.out.println(result);
            }

        } else if (type.equals("string")) {
            String valueOne = sc.nextLine();
            String valueTwo = sc.nextLine();
            String result = getMax(valueOne, valueTwo);
            if (result.equals("" + 0)) {
                System.out.println("The values are identical!");
            } else {
                System.out.println(result);
            }
        }

        else {
            System.out.println("Invalid type!");
        }

    }

    private static int getMax(int valueOne, int valueTwo) {
        if (valueOne > valueTwo) {
            return valueOne;
        } else if (valueTwo > valueOne) {
            return valueTwo;
        } else {
            return 0;
        }
    }

    private static char getMax(char valueOne, char valueTwo) {
        if (valueOne > valueTwo) {
            return valueOne;
        } else if (valueTwo > valueOne) {
            return valueTwo;
        } else {
            return 0;
        }
    }

    private static String getMax(String valueOne, String valueTwo) {
        int result = valueOne.compareTo(valueTwo);
        if (result > 0) {
            return valueOne;
        } else if (result < 0) {
            return valueTwo;
        } else {
            return "" + 0;
        }
    }
}
