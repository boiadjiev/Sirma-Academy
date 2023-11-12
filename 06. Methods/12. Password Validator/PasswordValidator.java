package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        boolean isValid = true;
        if (!checkLength(pass)) {
            isValid = false;
        }

        if (!checkLettersAndDigits(pass)) {
            isValid = false;
        }

        if (!atLeastTwoDigits(pass)) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid.");
        }
    }

    private static boolean checkLength(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters.");
        }
        return false;
    }

    private static boolean checkLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if (!((symbol >= 'a' && symbol <= 'z')
                    || (symbol >= 'A' && symbol <= 'Z')
                    || (symbol >= '0' && symbol <= '9'))) {
                System.out.println("Password must contain only letters and digits.");
                return false;
            }
        }
        return true;
    }

    private static boolean atLeastTwoDigits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
            if (symbol >= '0' && symbol <= '9') {
                count++;
            }
            if (count == 2) {
                return true;
            }
        }
        System.out.println("Password must have at least 2 digits.");
        return false;
    }
}
