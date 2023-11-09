package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.####");
        double width = Double.parseDouble(sc.nextLine());
        double length = Double.parseDouble(sc.nextLine());
        System.out.println(df.format(rectangleArea(width, length)));
    }

    private static double rectangleArea(double width, double length) {
        return width * length;
    }
}
