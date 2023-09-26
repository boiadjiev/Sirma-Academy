package ConditionalStatements;

import java.util.Scanner;

public class AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rightTool = sc.nextLine();
        String leftTool = sc.nextLine();
        String path = "";
        if (rightTool.equals("sword")) {
            if (leftTool.equals("shield")) {
                path = "Path to the castle";
            } else {
                path = "Path to the forest";
            }

        } else if (rightTool.equals("map")) {
            if (leftTool.equals("coins")) {
                path = "Go to the town";
            } else {
                path = "Camp and prepare for the next day";
            }

        } else {
            path = "Wander aimlessly";
        }

        System.out.println(path);
    }
}
