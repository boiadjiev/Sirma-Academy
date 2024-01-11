package StringProcessing;

import java.util.Scanner;

public class PascalCaseSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().replace("'", "").split("(?=[A-Z])");
        System.out.println(String.join(", ", input));
    }
}
