package ConditionalStatements;

import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        String address;
        if (age < 16) {
            if (gender == 'm') {
                address = "Master";
            } else {
                address = "Miss";
            }
        } else {
            if (gender == 'm') {
                address = "Mr.";
            } else {
                address = "Ms.";
            }
        }

        System.out.println(address);
    }
}
