package week_4.task2;

public interface BankAccount {
    public void startAnAccount(int age);

    public void deposit(double amount);

    public void withdraw(double amount);

    public double calculateInterest();

    public boolean issuedebitCard();

}
