package StringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] usernames = sc.nextLine().split(", ");
        String regex = "^[a-zA-Z0-9_-]{3,16}$";
        Pattern pattern = Pattern.compile(regex);
        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            if (matcher.find()) {
                System.out.println(username);
            }
        }
    }
}
