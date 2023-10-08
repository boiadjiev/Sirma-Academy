package Loops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget  = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double saberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());
        int freeBelts = students / 6;
        double total = saberPrice * Math.ceil(students * 1.1) + robePrice * students + beltPrice * (students - freeBelts);
        if (total <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - budget);
        }
    }
}
