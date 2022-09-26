package week_6.task4;

import java.util.Scanner;

public class EvenNumbers {

    public static void main(String[] args) {

        int number, i;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        number = sc.nextInt();

        i = 2;

        System.out.println("Lit of even numbers: ");

        while (i <= number) {

            System.out.println(i + " ");
            i = i + 2;

        }

        for (i = 2; i <= number; i += 2) {

            sum += i;

        }

        System.out.println("Sum of all even numbers: " + sum);

    }

}
