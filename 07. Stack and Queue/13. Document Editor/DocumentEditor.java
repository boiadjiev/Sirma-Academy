package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentEditor {
    public static void main(String[] args) {
        ArrayDeque<String> undoStack = new ArrayDeque<>();
        ArrayDeque<String> redoStack = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        String[] command = inputCommand(sc).split("\\s+");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "Insert":
                    undoStack.push(command[1]);
                    printReverseStack(undoStack);
                    break;
                case "Undo":
                    redoStack.push(undoStack.pop());
                    printReverseStack(undoStack);
                    break;
                case "Redo":
                    undoStack.push(redoStack.pop());
                    printReverseStack(undoStack);
            }
            command = inputCommand(sc).split("\\s+");
        }
    }

    private static void printReverseStack(ArrayDeque<String> stack) {
        ArrayDeque<String> copyStack = new ArrayDeque<>(stack);
        while (!copyStack.isEmpty()) {
            System.out.print(copyStack.removeLast() + " ");
        }
        System.out.println();
    }

    private static String inputCommand(Scanner sc) {
        String input = sc.nextLine();
        Pattern insertPattern = Pattern.compile("Insert\\(\"(.*?)\"\\)");
        Matcher insertMatcher = insertPattern.matcher(input);

        if (insertMatcher.matches()) {
            String command = "Insert";
            String text = insertMatcher.group(1).trim(); // Extracts the text inside double quotes and trims any leading/trailing spaces
            return command + " " + text;
        } else if (input.equals("Undo()")) {
            return "Undo";
        } else if (input.equals("Redo()")) {
            return "Redo";
        } else if (input.equals("End")) {
            return "End";
        } else {
            return "Invalid input format.";
        }
    }
}
