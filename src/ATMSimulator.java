import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
    ATMAccount account = new ATMAccount(123456, 1000.0, 1234);
    Scanner scanner = new Scanner(System.in);

    while(true){
        System.out.println("\nWelcome to the ATM Simulator");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                System.out.println("Deposited: Rs." + depositAmount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                System.out.println("Withdrawn: Rs." + withdrawAmount);
                break;
            case 3:
                account.displayBalance();
                break;
            case 4:
                System.out.println("Thank you for using the ATM Simulator. Goodbye!");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");

        }
    }

    }
}
