import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter account number:");

            int accountNumber = scanner.nextInt();
            System.out.print("Enter account holder:");

            String accountHolder = scanner.next();
            System.out.print("Enter initial balance:");

            double balance = scanner.nextDouble();

            int option = 0;

            while (option != 4) {
                UserAccount account = new UserAccount(accountNumber, accountHolder, balance);
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter amount to deposit:");

                        double deposit = scanner.nextDouble();
                        account.deposit(deposit);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw:");
                        double withdraw = scanner.nextDouble();
                        account.withdraw(withdraw);
                        break;

                    case 3:
                        System.out.println("Balance:" + account.getBalance());
                        break;

                    case 4:
                        System.out.print("Thank you");


                    default:
                        System.out.println("Invalid option");

                }
            }
        }

        catch (InputMismatchException e) {
            System.out.print("Invalid Input");
        }
    }
}
