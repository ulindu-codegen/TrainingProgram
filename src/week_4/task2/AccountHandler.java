package week_4.task2;

import java.util.Scanner;

public class AccountHandler {

    public static void main(String[] args) {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("************ Create a Super Server Account *************");
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your age :");
        int age = sc.nextInt();
        sc.nextLine();
        SuperSaver superServer= new SuperSaver();
        superServer.startAnAccount(age);
        System.out.println("Balance : " + superServer.getBalance());

        System.out.print("Enter your Deposit Amount:");
        double amount= sc.nextDouble();
        sc.nextLine();
        superServer.deposit(amount);
        System.out.println("Balance : " + superServer.getBalance());

        System.out.print("Enter your Withdrawal Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        superServer.withdraw(amount);
        System.out.println("Balance =" + superServer.getBalance());

        System.out.println("Interest: "+ superServer.calculateInterest());

        if (superServer.issuedebitCard() == true){

            System.out.println("Issued debit card !!!");

        } else{

            System.out.println("Not Issued debit card!!!");

        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("************ Create a Real Server Account *************");
        System.out.println("");

        System.out.print("Enter your age :");
        age = sc.nextInt();
        sc.nextLine();
        RealSaver realSaver=new RealSaver();
        realSaver.startAnAccount(age);
        System.out.println("Balance : " + realSaver.getBalance());

        System.out.print("Enter your Deposit Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        realSaver.deposit(amount);
        System.out.println("Balance : " + realSaver.getBalance());

        System.out.print("Enter your Withdrawal Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        realSaver.withdraw(amount);
        System.out.println("Balance =" + realSaver.getBalance());

        System.out.println("Interest: "+ realSaver.calculateInterest());

        if (realSaver.issuedebitCard() == true){

            System.out.println("Issued debit card !!!");

        }
        else{

            System.out.println("Not Issued debit card!!!");

        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("************ Create a Achara Account *************");

        System.out.print("Enter your age :");
        age = sc.nextInt();
        sc.nextLine();
        Achara achara=new Achara();
        achara.startAnAccount(age);
        System.out.println("Balance : " + achara.getBalance());

        System.out.print("Enter your Deposit Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        achara.deposit(amount);
        System.out.println("Balance : " + achara.getBalance());

        System.out.print("Enter your Withdrawal Amount:");
        amount= sc.nextDouble();
        sc.nextLine();
        achara.withdraw(amount);
        System.out.println("Balance =" + achara.getBalance());

        System.out.println("Interest: "+ achara.calculateInterest());

        if (achara.issuedebitCard() == true){

            System.out.println("Issued debit card !!!");

        } else{

            System.out.println("Not Issued debit card!!!");

        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

}
