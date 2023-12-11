package MultidimensionalArrays;

import java.util.Scanner;

public class ExcelColumnNameToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(columnToNumber(input));
    }

    private static int columnToNumber(String column) {
        int result = 0;
        for (int i = 0; i < column.length(); i++) {
            result *= 26;
            result += column.charAt(i) - 'A' + 1;
        }

        return result;
    }
}
