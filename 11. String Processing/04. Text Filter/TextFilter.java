package StringProcessing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bannedWords = sc.nextLine().split(", ");
        Map<String, String> replacements = new HashMap<>();
        for(String bannedWord : bannedWords) {
            replacements.put(bannedWord, "*".repeat(bannedWord.length()));
        }

        StringBuilder text = new StringBuilder(sc.nextLine());
        for (String bannedWord : bannedWords) {
            String replacement = replacements.get(bannedWord);
            if (replacement != null) {
                text = new StringBuilder(text.toString().replaceAll(bannedWord, replacement));
            }
        }

        System.out.println(text);
    }
}
