package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {
    static class Account {
        private static int nextId = 1;
        private int id;
        private double balance;
        private static double interestRate = 0.02;

        public Account() {
            this.id = nextId++;
            this.balance = 0.0;
        }

        public double getInterestRate(int years) {
            return balance * interestRate * years;
        }

        public int getId() {
            return id;
        }

        public static void setInterestRate(double interest) {
            interestRate = interest;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
            } else {
                System.out.println("Invalid deposit amount. Amount must be greater than 0.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Account> clientList = new ArrayList<>();
        while (!input.equals("End")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Create":
                    Account client = new Account();
                    clientList.add(client);
                    System.out.printf("Account ID%d created%n", client.getId());
                    break;
                case "Deposit":
                    int accountIdDeposit = Integer.parseInt(command[1]);
                    double amount = Double.parseDouble(command[2]);
                    if (accountIdDeposit >= 1 && accountIdDeposit <= clientList.size()) {
                        clientList.get(accountIdDeposit - 1).deposit(amount);
                        System.out.printf("Deposited %.2f to ID%d%n",
                                amount, clientList.get(accountIdDeposit - 1).getId());
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interestRate = Double.parseDouble(command[1]);
                    Account.setInterestRate(interestRate);
                    System.out.println("Interest set to " + interestRate);
                    break;
                case "GetInterest":
                    int accountIdGetInterest = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    if (accountIdGetInterest >= 1 && accountIdGetInterest <= clientList.size()) {
                        double interest = clientList.get(accountIdGetInterest - 1).getInterestRate(years);
                        System.out.printf("Interest rate of account ID%d is %.2f%n",
                                clientList.get(accountIdGetInterest - 1).getId(), interest);
                    } else {
                        System.out.println("Account does not exist");
                    }
            }
            input = sc.nextLine();
        }
    }
}
