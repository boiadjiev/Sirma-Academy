package ConditionalStatements;

import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        String category = "";
        if (age < 13) {
            category = "U-rated movies";
        } else if (age <= 17) {
            category = "U and PG-13 rated movies";
        } else {
            category = "All movies";
        }

        System.out.println(category);
    }
}
