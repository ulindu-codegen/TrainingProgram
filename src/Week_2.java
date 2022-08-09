import java.util.Scanner;

public class Week_2 {

    public static void main(String[] args) {

        //task_1();
        //task_2();
        //task_3();
        task_4();

    }

    public static void task_1() {

        System.out.println();
        System.out.println("+”””””””+");
        System.out.println("[| 0 0 |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | ‘-’ | ");
        System.out.println(" +-----+ ");

    }

    public static void task_2() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Input Second Number: ");
        int num2 = sc.nextInt();

        while (num1 < num2) {

            System.out.print("Input First Number Again: ");
            num1 = sc.nextInt();

            System.out.print("Input Second Number Again: ");
            num2 = sc.nextInt();

        }

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;

        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " x " + num2 + " = " + multiplication);
        System.out.println(num1 + " / " + num2 + " = " + division);
        System.out.println(num1 + " mod " + num2 + " = " + remainder);

    }

    public static void task_3() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Radius of the Circle: ");
        double radius = sc.nextDouble();

        double Pi = (double) 22 / 7;
        double perimeter = 2 * Pi * radius;
        double area = Pi * radius * radius;

        System.out.println();
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }

    public static void task_4() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = sc.nextFloat();

        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = sc.nextFloat();

        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = sc.nextFloat();

        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = sc.nextFloat();

        double earthRadius = 6371.01;

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double distance = earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println();
        System.out.println("Distance between two points on the surface of earth is " + distance + " km");

    }

}
