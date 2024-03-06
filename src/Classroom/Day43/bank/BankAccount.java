package Classroom.Day43.bank;

public class BankAccount {
    private String fullName;
    private String accountNumber;
    private String routingNumber;
    private double balance;

    public BankAccount(String fullName, String accountNumber, String routingNumber, double balance) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.balance = balance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "fullName='" + fullName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", routingNumber='" + routingNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
