import java.util.Scanner;

public class MyBank {
    private double balance;
    
    public MyBank (double initialBalance);

        if (initialBalance > 0) {
            this.balance = initialBalance;

        } else {
            System.out.println("initial balance must be +ve, Setting balance to 0.");
            this.balance =0;
    

        }
        public double getBalance() {
            return balance;

        }

    public void deposit (double amount)  {
        if (amount > 0) {
            balance += amount;
            System.out.println("Succesfully deposited $" +amount);

        } else {
            System.out.println("Deposit amount must be positive:");


        }

    public void withdraw (double amount) throws Exception {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
            

        } else if (amount>balance) {
            throw new Exception ("Insuffecint balance"); 

        } else {
            System.out.println("Withdrawl amount must be positive");


       }  

    }
    
    }
}
class SavingAccount extends MyBank {
    private double interestrate;
    
    public SavingAccount(double innitialBalance, double interestrate) {
        super(innitialBalance);
        this.interestrate = interestrate;

    }

    public void applyInterst() {
        double interest = getBalance() * (interestrate/100);
        deposit(interest);
        System.out.println("interest applied"+ interest);


    }

}

public class AshrafBank() {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Welcome to Ashraf's Bank");
        
        
    }
    
     
    
}
