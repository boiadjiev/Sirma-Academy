package BasicSyntax;

import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPaint = Integer.parseInt(scanner.nextLine());
        double red = totalPaint / 13.0;
        double yellow = red * 4;
        double white = red * 8;
        System.out.printf("Red: %.4f%nYellow: %.4f%nWhite: %.4f%n", red, yellow, white);
    }
}
