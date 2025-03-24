import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        num1 = input.nextInt();

        System.out.println("Enter your second number");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter the operation");
        operation = op.next();

        if (operation == "+"); 
        {
          System.out.println("Answer is " + (num1 + num2 ));
        }
        if (operation == "-");
        {
         System.out.println("Answer is " + (num1 - num2)); 
        }

        if (operation == "/");
        {
            System.out.println("Answer is " + (num1 / num2));

        }

        if (operation == "*");
        {
            System.out.println("Asnwer is " + (num1 * num2));
        }




    }
}

import java.util.Scanner;

// Base class for Bank Account
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be positive. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Get the current balance
    public double getBalance() {
        return balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) throws Exception {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            throw new Exception("Insufficient balance!");
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }
}

// Derived class with additional functionality
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    // Apply interest to the balance
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);  // Reuse deposit method to add interest
        System.out.println("Interest applied: $" + interest);
    }
}

// Main class with program logic
public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking App!");
        System.out.print("Enter your initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter the interest rate for your savings account: ");
        double interestRate = scanner.nextDouble();

        SavingsAccount myAccount = new SavingsAccount(initialBalance, interestRate);

        int choice;
        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Apply Interest");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + myAccount.getBalance());
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    myAccount.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        myAccount.withdraw(withdrawAmount);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    myAccount.applyInterest();
                    break;

                case 5:
                    System.out.println("Exiting the Banking System.");
                    break;

                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
