package week_7.task4;

public class SBIBank extends Bank{

    double rate = 0.08;

    public void printInterest(){
        System.out.println("Interest Balance for SIBI Bank: "+ (balance*rate));
    }

}
