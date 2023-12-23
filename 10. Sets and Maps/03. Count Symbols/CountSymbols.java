package SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.printf("%c: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
