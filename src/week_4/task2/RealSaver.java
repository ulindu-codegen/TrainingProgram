package week_4.task2;

public class RealSaver implements BankAccount {

    private double balance;

    @Override
    public void startAnAccount(int age) {
        if (age > 18) {
            balance = 1000;
        }
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 100000) {
            balance = balance - amount;
        }
    }

    @Override
    public double calculateInterest() {
        return balance * 0.0225;
    }

    @Override
    public boolean issuedebitCard() {
        return true;
    }

    public double getBalance() {
        return balance;
    }

}
