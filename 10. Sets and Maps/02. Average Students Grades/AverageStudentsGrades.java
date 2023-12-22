package SetsAndMaps;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, ArrayList<Double>> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }

        for (Map.Entry<String, ArrayList<Double>> student : students.entrySet()) {
            String name = student.getKey();
            ArrayList<Double> grades = student.getValue();
            System.out.printf("%s -> ", name);
            for (double grade : grades) {
                System.out.printf("%.2f ", grade);
            }

            double gradesSum = 0.0;
            for (double grade : grades) {
                gradesSum += grade;
            }

            System.out.printf("(avg: %.2f)%n", gradesSum / grades.size());
        }
    }
}
