package week_4.task1;

public class Calculator {
    private double number1;
    private double number2;

    private double number3;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Calculator(double number1, double number2,double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }


    public void sum()//method to sum
    {
        System.out.println("Sum is "+(number1+number2+number3));
    }
    public void subtraction()//method to subtraction
    {
        System.out.println("Subtraction is "+(number1-number2));
    }
    public void multiplication()//method to multiplication
    {
        System.out.println("Multiplication is "+(number1*number2*number3));
    }
    public void division()//method to division
    {
        System.out.println("Division of "+number1+" and "+number2+" is "+(number1/number2));
    }
}

