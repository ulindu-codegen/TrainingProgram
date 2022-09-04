package week_4.task2;

public class Achara implements BankAccount{

    private double balance;

    @Override
    public void startAnAccount(int age) {
        if (age > 60){
            balance = 5000;
        }
    }

    @Override
    public void deposit(double amount) {
        balance= balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 100000) {
            balance = balance - amount;
        }
    }

    @Override
    public double calculateInterest() {
        return balance * 0.045;
    }

    @Override
    public boolean issuedebitCard() {
        return false;
    }

    public double getBalance() {
        return balance;
    }

}
