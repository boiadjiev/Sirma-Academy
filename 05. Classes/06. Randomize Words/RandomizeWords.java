package Classes;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String[] words = sc.nextLine().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            int rndIndex = rd.nextInt(words.length);
            words[i] = words[rndIndex];
            words[rndIndex] = temp;
        }

        System.out.println(String.join("\n", words));
    }
}
