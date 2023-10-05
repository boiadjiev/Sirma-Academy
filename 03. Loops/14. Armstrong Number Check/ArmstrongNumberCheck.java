package Loops;

import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean isArmstrong = false;
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int currentDigit = Integer.parseInt(input.charAt(i) + "");
            sum += Math.pow(currentDigit, input.length());
        }

        if (Integer.parseInt(input) == sum) {
            isArmstrong = true;
        }

        System.out.println(isArmstrong ? "Armstrong" : "Not Armstrong");
    }
}
