package StringProcessing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> nameAndAge = new LinkedHashMap<>();
        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            StringBuilder personInfo = new StringBuilder(sc.nextLine());
            StringBuilder name = new StringBuilder(personInfo.substring
                    (personInfo.indexOf("@") + 1, personInfo.indexOf("|")));
            int age = Integer.parseInt(personInfo.substring
                    (personInfo.indexOf("#") + 1, personInfo.indexOf("*")));
            nameAndAge.put(name.toString(), age);
        }

        for (Map.Entry<String, Integer> entry : nameAndAge.entrySet()) {
            System.out.printf("%s is %d years old.%n", entry.getKey(), entry.getValue());
        }
    }
}
