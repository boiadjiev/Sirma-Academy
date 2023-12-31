package StringProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String name = input.substring(input.lastIndexOf("\\") + 1, input.lastIndexOf("."));
        String extension = input.substring(input.lastIndexOf(".") + 1);
        System.out.printf("File name: %s%nFile extension: %s%n", name, extension);
    }
}
