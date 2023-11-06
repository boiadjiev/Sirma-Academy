package Classes;

import java.util.Scanner;

public class Articles {
    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void edit(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public void rename(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", title.trim(), content.trim(), author.trim());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        Article article = new Article(input[0], input[1], input[2]);
        int commandCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < commandCount; i++) {
            String[] command = sc.nextLine().split(": ");
            switch (command[0]) {
                case "Edit":
                    article.edit(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.rename(command[1]);
            }
        }

        System.out.println(article);
    }
}
