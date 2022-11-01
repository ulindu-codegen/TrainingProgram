package week_7.task4;

public class ICICBank extends Bank{

    double rate = 0.07;

    public void printInterest(){
        System.out.println("Interest Balance for ICIC Bank: "+ (balance*rate));
    }

}
