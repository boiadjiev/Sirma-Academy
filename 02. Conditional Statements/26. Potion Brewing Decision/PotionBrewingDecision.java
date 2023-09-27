package ConditionalStatements;

import java.util.Scanner;

public class PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ingredientOne = sc.nextLine();
        String ingredientTwo = sc.nextLine();
        String decision = "";
        if (ingredientOne.equals("herbs")) {
            if (ingredientTwo.equals("water")) {
                decision = "Health potion";
            } else if (ingredientTwo.equals("oil")) {
                decision = "Stealth potion";
            } else {
                decision = "Minor stamina potion";
            }

        } else if (ingredientOne.equals("berries")) {
            if (ingredientTwo.equals("sugar")) {
                decision = "Speed potion";
            } else {
                decision = "Minor energy potion";
            }

        } else {
            decision = "Can't brew any potion";
        }

        System.out.println(decision);
    }
}
