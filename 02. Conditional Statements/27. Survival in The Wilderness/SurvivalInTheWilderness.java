package ConditionalStatements;

import java.util.Scanner;

public class SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayOrNight = sc.nextLine();
        String environment = sc.nextLine();
        String item = sc.nextLine();
        String decision = "";
        switch (dayOrNight) {
            case "day":
                if (environment.equals("forest")) {
                    if (item.equals("knife")) {
                        decision = "Hunt for food";
                    } else if (item.equals("container")) {
                        decision = "Collect berries";
                    } else {
                        decision = "Explore";
                    }

                } else if (environment.equals("desert")) {
                    if (item.equals("hat")) {
                        decision = "Search for water";
                    } else {
                        decision = "Find shade";
                    }
                }
                break;

            case "night":
                if (environment.equals("forest")) {
                    if (item.equals("firestarter")) {
                        decision = "Make a campfire";
                    } else {
                        decision = "Climb a tree for safety";
                    }

                } else if (environment.equals("desert")) {
                    if (item.equals("blanket")) {
                        decision = "Sleep";
                    } else {
                        decision = "Keep moving to stay warm";
                    }
                }
        }
        System.out.println(decision);
    }
}
