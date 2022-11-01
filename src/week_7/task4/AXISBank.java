package week_7.task4;

public class AXISBank extends Bank{

    double rate = 0.09;

    public void printInterest(){
        System.out.println("Interest Balance for AXIS Bank: "+ (balance*rate));
    }

}
