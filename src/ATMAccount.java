public class ATMAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private int pinNumber;

    public ATMAccount(int accountNumber, double initialBalance, int pinNumber) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pinNumber = pinNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else{
            System.out.println("Withdrawal amount must be positive and less than or equal to the balance.");
        }
    }

}
