package week_7.task3;

public class Calculator {

    public void addition(int num1, int num2) {
        System.out.print("Calculator: ");
        System.out.println(num1 + num2);
    }

    public void addition(int num1, int num2, int num3) {
        System.out.print("Calculator: ");
        System.out.println(num1 + num2 + num3);
    }

    public void addition(double num1, double num2) {
        System.out.print("Calculator: ");
        System.out.println(num1 + num2);
    }

    public void addition(int num1, double num2) {
        System.out.print("Calculator: ");
        System.out.println((double) num1 + num2);
    }

    public void addition(int num1, double num2, float num3) {
        System.out.print("Calculator: ");
        System.out.println((double) num1 + num2 + (double) num3);
    }

}
