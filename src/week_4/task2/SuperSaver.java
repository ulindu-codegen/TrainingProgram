package week_4.task2;

public class SuperSaver implements BankAccount{

    private double balance;

    @Override
    public void startAnAccount( int age) {

        if (age > 18){

            balance = 50000;

        }

    }

    @Override
    public void deposit(double amount) {
        balance= balance + amount;
    }

    @Override
    public void withdraw(double amount) {

        if (amount < 1000000) {

            balance = balance - amount;

        }

    }

    @Override
    public double calculateInterest() {

        return balance * 0.04;

    }

    @Override
    public boolean issuedebitCard() {
        return true;
    }

    public double getBalance() {
        return balance;
    }

}
