package ConditionalStatements;

import java.util.Scanner;

public class NumberFrom0to9WithWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String numString = "";
        switch (num) {
            case 0:
                numString = "zero";
                break;
            case 1:
                numString = "one";
                break;
            case 2:
                numString = "two";
                break;
            case 3:
                numString = "three";
                break;
            case 4:
                numString = "four";
                break;
            case 5:
                numString = "five";
                break;
            case 6:
                numString = "six";
                break;
            case 7:
                numString = "seven";
                break;
            case 8:
                numString = "eight";
                break;
            case 9:
                numString = "nine";
                break;
            default:
                if (num > 9) {
                    numString = "too big";
                }
        }
        System.out.println(numString);
    }
}
