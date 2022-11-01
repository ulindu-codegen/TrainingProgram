package week_7.task4;

public class Bank {

    protected double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printBalance(){
        System.out.println("Balance: "+balance);
    }

}
