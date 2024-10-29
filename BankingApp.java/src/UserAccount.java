import javax.security.auth.login.AccountException;

public class UserAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public UserAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful");
    }
    public void withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
            System.out.println("withdrawal successful");
        }else{
            System.out.println("Insufficient funds");
        }
    }
    public double getBalance(){
        return balance;
    }
}
