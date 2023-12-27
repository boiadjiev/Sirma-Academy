package StringProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String remove = sc.nextLine();
        StringBuilder result = new StringBuilder(sc.nextLine());
        int index;
        while ((index = result.indexOf(remove)) != -1) {
            result.delete(index, index + remove.length());
        }
        System.out.println(result);
    }
}
