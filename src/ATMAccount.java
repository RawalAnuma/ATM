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
        if (amount >= 0){
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
       if(amount <= balance && amount > 0) {
            this.balance -= amount;
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void displayBalance(){
        System.out.println("Your current balance: Rs." + balance);
    }

}
