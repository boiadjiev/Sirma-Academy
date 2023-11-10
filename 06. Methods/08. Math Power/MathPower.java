package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        double number = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());
        System.out.println(df.format(numberToPower(number, power)));
    }

    private static double numberToPower(double number, int power) {
        return Math.pow(number, power);
    }
}
