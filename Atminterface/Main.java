import java.util.Scanner;

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
    }
//method for Withdraw Amount
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: Rs" + account.getBalance());
        } else {
            System.out.println("Insufficient balance for this withdrawal.");
        }
    }
//method for Deposit Amount
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            account.setBalance(account.getBalance() + amount);
            System.out.println("Deposit successful. New balance: Rs" + account.getBalance());
        }
    }
//Method for Check balance 
    public void checkBalance() {
        System.out.println("Your current balance is: Rs" + account.getBalance());
    }
}

// Create a class to represent the user's bank account:

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Main class to test the ATM system:
public class Main {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of 1000
        BankAccount account = new BankAccount(1000.0);

        // Create an ATM linked to the user's bank account
        ATM atm = new ATM(account);

        // Show the ATM menu to the user
        atm.showMenu();
    }
}
