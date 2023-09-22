package ConditionalStatements;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int percent = Integer.parseInt(sc.nextLine());
        char grade = ' ';
        if (percent >= 90 && percent <= 100) {
            grade = 'A';
        } else if (percent >= 80 && percent <= 89) {
            grade = 'B';
        } else if (percent >= 70 && percent <= 79) {
            grade = 'C';
        } else if (percent >= 60 && percent <= 69) {
            grade = 'D';
        } else if (percent >= 0 && percent <= 59) {
            grade = 'F';
        }

        System.out.println(grade);
    }
}
