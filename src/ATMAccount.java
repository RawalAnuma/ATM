public class ATMAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private int pinNumber;

    public ATMAccount(int accountNumber, String accountHolderName, double initialBalance, int pinNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.pinNumber = pinNumber;
    }
}
