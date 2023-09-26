package ConditionalStatements;

import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = Integer.parseInt(sc.nextLine());
        int dimensions = Integer.parseInt(sc.nextLine());
        int overweightFee = 0;
        int oversizeFee = 0;
        int handlingFee = 0;
        int total = 0;
        if (weight > 50) {
            overweightFee += 100;
        }

        if (dimensions > 158) {
            if (dimensions < 178) {
                oversizeFee += 50;
            } else if (dimensions < 208) {
                oversizeFee += 100;
            } else {
                oversizeFee += 200;
            }
        }

        if (overweightFee > 0 && oversizeFee > 0) {
            handlingFee += 50;
        }

        total = overweightFee + oversizeFee + handlingFee;
        System.out.println(total);
    }
}
