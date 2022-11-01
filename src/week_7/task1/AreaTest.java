package week_7.task1;

import java.util.Scanner;

public class AreaTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Area area1 = new Area();

        System.out.print("Enter rectangle breadth:");
        area1.breadth = input.nextInt();
        System.out.print("Enter rectangle length:");
        area1.breadth = input.nextInt();
        System.out.println("Area of Rectangle: " + area1.RectangleArea());


        System.out.print("Enter side length of Square:");
        area1.sideLength = input.nextInt();
        System.out.println("Area of Square: " + area1.SquareArea());


        System.out.print("Enter circle radius:");
        area1.radius = input.nextInt();
        System.out.println("Area of Circle: " + area1.CircleArea());

    }

}
