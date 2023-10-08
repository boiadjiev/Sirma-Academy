package Loops;

import java.util.Scanner;

public class NewBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floors = Integer.parseInt(sc.nextLine());
        int rooms = Integer.parseInt(sc.nextLine());
        for (int floor = floors; floor >= 1; floor--) {
            for (int room = 0; room < rooms; room++) {
                char type;
                if (floor == floors) {
                    type = 'L';
                } else if (floor % 2 == 0) {
                    type = 'O';
                } else {
                    type = 'A';
                }

                System.out.printf("%c%d%d ", type, floor, room);
            }

            System.out.println();
        }
    }
}
