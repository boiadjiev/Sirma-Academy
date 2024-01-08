package StringProcessing;

import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine().replace("\\", "");
        letter = letter.substring(letter.indexOf("'") + 1, letter.lastIndexOf("'"));
        StringBuilder result = new StringBuilder(letter);
        String[] words = sc.nextLine().replace("'", "")
                .replace("[", "")
                .replace("]", "")
                .split(", ");
        int count;
        while (result.indexOf("_") != -1) {
            int startIndex = result.indexOf("_");
            int endIndex = startIndex;
            count = 0;
            while (result.charAt(endIndex++) == '_') {
                count++;
            }
            for (int i = 0; i < words.length; i++) {
                String replaceString = words[i];
                if (replaceString.length() == count) {
                    result.replace(startIndex - 1, endIndex -1 , " " + replaceString);
                }
            }
        }

        System.out.println(result);
    }
}
