package Loops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        int headsets = lostGames / 2;
        int mouses = lostGames / 3;
        int keyboards = lostGames / 6;
        int displays = keyboards / 2;
        double total = headsetPrice * headsets + mousePrice * mouses + keyboardPrice * keyboards + displayPrice * displays;
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
