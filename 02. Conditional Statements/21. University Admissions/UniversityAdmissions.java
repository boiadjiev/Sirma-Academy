package ConditionalStatements;

import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = Integer.parseInt(sc.nextLine());
        int extracurricular = Integer.parseInt(sc.nextLine());
        boolean isAdmitted = false;
        if (score >= 90) {
            isAdmitted = true;
        } else if (score >= 80 && extracurricular >= 2) {
            isAdmitted = true;
        }

        System.out.println(isAdmitted ? "Admitted" : "Not admitted");
    }
}
