package StackAndQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TaskScheduler {

    static class Task {
        private String name;
        private int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public String getName() {
            return name;
        }

        public int getPriority() {
            return priority;
        }
    }

    static class TaskComparator implements Comparator<Task> {
        public int compare(Task taskOne, Task taskTwo) {
            return Integer.compare(taskTwo.getPriority(), taskOne.getPriority());
        }
    }

    private static Task getNextTask(PriorityQueue<Task> queue) {
        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Task> queue = new PriorityQueue<>(new TaskComparator());
        String[] command = sc.nextLine().split("\\s+");
        while (!command[0].equals("getNextTask")) {
            String task = command[1];
            int priority = Integer.parseInt(command[2]);
            if (command[0].equals("Add")) {
                queue.offer(new Task(task, priority));
            }
            else if (command[0].equals("getNextTask")) {
                System.out.println(getNextTask(queue));
            }

            command = sc.nextLine().split("\\s+");
        }
        Task nextTask = getNextTask(queue);
        if (nextTask != null) {
            System.out.println(nextTask.getName() + " - " + nextTask.getPriority());
        } else {
            System.out.println("No tasks in the queue.");
        }
    }
}
