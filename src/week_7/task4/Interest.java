package week_7.task4;

import java.util.Scanner;

public class Interest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        double balance = input.nextDouble();


        SBIBank sbib = new SBIBank();
        sbib.setBalance(balance);

        ICICBank icic = new ICICBank();
        icic.setBalance(balance);

        AXISBank axis = new AXISBank();
        axis.setBalance(balance);

        System.out.println("***** Interest of each Banks *****");
        sbib.printInterest();
        icic.printInterest();
        axis.printInterest();

    }

}
