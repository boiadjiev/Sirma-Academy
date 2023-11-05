package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String hometown;

        public Student (String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split("\\s+");
            students.add(new Student(command[0], command[1], Integer.parseInt(command[2]), command[3]));
            input = sc.nextLine();
        }
        String town = sc.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).hometown.equals(town)) {
                System.out.printf("%s %s is %d years old%n",
                        students.get(i).getFirstName(),
                        students.get(i).getLastName(),
                        students.get(i).getAge());
            }
        }
    }
}
