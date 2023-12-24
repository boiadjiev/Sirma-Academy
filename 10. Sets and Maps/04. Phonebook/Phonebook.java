package SetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();
        String command = sc.nextLine();
        while (!command.equals("search")) {
            String[] token = command.split("-");
            phonebook.put(token[0], token[1]);
            command = sc.nextLine();
        }
        String name = sc.nextLine();
        while (!name.equals("stop")) {
            if (!name.contains("-")) {
                if (phonebook.containsKey(name)) {
                    System.out.printf("%s -> %s%n", name, phonebook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            } else {
                String[] token = name.split("-");
                phonebook.put(token[0], token[1]);
            }

            name = sc.nextLine();
        }
    }
}
