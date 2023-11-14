package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();
        String currentUrl = "";
        String input = sc.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = sc.nextLine();
                    continue;
                } else {
                    currentUrl = history.pop();
                }

            } else {
                if (!currentUrl.isEmpty()) {
                    history.push(currentUrl);
                }

                currentUrl = input;
            }
            System.out.println(currentUrl);
            input = sc.nextLine();
        }
    }
}
