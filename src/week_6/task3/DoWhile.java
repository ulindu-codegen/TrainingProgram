package week_6.task3;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0;
        char ch;

        do {
            System.out.println("Enter two numbers");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            sum = sum + num1 + num2;
            System.out.println("Do you wishes to perform the operation again, Y/N");
            ch = in.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
        System.out.println("sum " + sum);

    }

}
