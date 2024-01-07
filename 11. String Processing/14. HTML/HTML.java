package StringProcessing;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder html = new StringBuilder();
        html.append("<h1>\n");
        html.append("\t");
        html.append(sc.nextLine());
        html.append("\n</h1>\n");
        html.append("<article>\n");
        html.append("\t");
        html.append(sc.nextLine());
        html.append("\n</article>\n");
        String comment = sc.nextLine();
        while (!"end of comments".equals(comment)){
            html.append("<div>\n");
            html.append("\t");
            html.append(comment);
            html.append("\n</div>\n");
            comment = sc.nextLine();
        }
        System.out.println(html);
    }
}
