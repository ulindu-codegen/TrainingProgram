package week_4.task1;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);

        //Input the number 1
        System.out.print("Input First Number:");
        double number01=sc.nextInt();

        //Input the number 2
        System.out.print("Input Second Number:");
        double number02=sc.nextInt();

        //Input the number 3
        System.out.print("Input Third Number:");
        double number03=sc.nextInt();

        while (number01<number02){

            while(number02<number03) {
                //Input the number 1 again
                System.out.print("Input First Number Again:");
                number01 = sc.nextInt();

                //Input the number 2 again
                System.out.print("Input Second Number Again:");
                number02 = sc.nextInt();

                //Input the number 3 again
                System.out.print("Input Third Number Again:");
                number03=sc.nextInt();
            }

        }

        Calculator calc = new Calculator(number01, number02, number03);

        //Print the calculated values
        System.out.println();

        calc.sum();
        calc.subtraction();
        calc.multiplication();
        calc.division();

    }

}
