package week_4.task2;

import java.util.Scanner;

public class AccountHandler {
    public static void main(String[] args) {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Create Super Saving Account
        System.out.println("************ Create a Super Server Account *************");
        Scanner sc =new Scanner(System.in);

        //start an account
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        sc.nextLine();
        SuperSaver superServer= new SuperSaver();
        superServer.startAnAccount(age);
        System.out.println("Balance : " + superServer.getBalance());

        //Deposit
        System.out.print("Enter your Deposit Amount:");
        double amount= sc.nextDouble();
        sc.nextLine();
        superServer.deposit(amount);
        System.out.println("Balance : " + superServer.getBalance());


        //Withdrawal
        System.out.print("Enter your Withdrawal Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        superServer.withdraw(amount);
        System.out.println("Balance =" + superServer.getBalance());

        //Interest
        System.out.println("Interest: "+ superServer.calculateInterest());


        //Issue debit card
        if (superServer.issuedebitCard() == true){
            System.out.println("Issued debit card !!!");

        }
        else{
            System.out.println("Not Issued debit card!!!");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        //Create Real Saving Account

        System.out.println("************ Create a Real Server Account *************");
        System.out.println("");

        //start an account
        System.out.print("Enter your age :");
        age = sc.nextInt();
        sc.nextLine();
        RealSaver realSaver=new RealSaver();
        realSaver.startAnAccount(age);
        System.out.println("Balance : " + realSaver.getBalance());

        //Deposit
        System.out.print("Enter your Deposit Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        realSaver.deposit(amount);
        System.out.println("Balance : " + realSaver.getBalance());


        //Withdrawal
        System.out.print("Enter your Withdrawal Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        realSaver.withdraw(amount);
        System.out.println("Balance =" + realSaver.getBalance());

        //Interest
        System.out.println("Interest: "+ realSaver.calculateInterest());


        //Issue debit card
        if (realSaver.issuedebitCard() == true){
            System.out.println("Issued debit card !!!");

        }
        else{
            System.out.println("Not Issued debit card!!!");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        //Create Achara Account
        System.out.println("************ Create a Achara Account *************");

        //start an account
        System.out.print("Enter your age :");
        age = sc.nextInt();
        sc.nextLine();
        Achara achara=new Achara();
        achara.startAnAccount(age);
        System.out.println("Balance : " + achara.getBalance());

        //Deposit
        System.out.print("Enter your Deposit Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        achara.deposit(amount);
        System.out.println("Balance : " + achara.getBalance());


        //Withdrawal
        System.out.print("Enter your Withdrawal Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        achara.withdraw(amount);
        System.out.println("Balance =" + achara.getBalance());

        //Interest
        System.out.println("Interest: "+ achara.calculateInterest());


        //Issue debit card
        if (achara.issuedebitCard() == true){
            System.out.println("Issued debit card !!!");

        }
        else{
            System.out.println("Not Issued debit card!!!");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
