package week_3;

import java.util.Scanner;

public class EmployeeReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //First Employee Object
        Employee employeeOne = new Employee();

        System.out.print("Enter employee one name: ");
        String name01 = sc.nextLine();
        employeeOne.setName(name01);

        System.out.print("Enter employee one project: ");
        String project01 = sc.nextLine();
        employeeOne.setProject(project01);

        System.out.print("Enter employee one address: ");
        String address01 = sc.nextLine();
        employeeOne.setAddress(address01);

        System.out.print("Enter employee one year of join: ");
        int yearOfJoin01 = sc.nextInt();
        employeeOne.setYearOfJoin(yearOfJoin01);

        System.out.print("Enter employee one salary: ");
        double salary01 = sc.nextDouble();
        employeeOne.setSalary(salary01);

        System.out.println();

        //Second Employee Object
        Employee employeeTwo = new Employee();

        System.out.print("Enter employee two name: ");
        String name02 = sc.next();
        employeeTwo.setName(name02);

        System.out.print("Enter employee two project: ");
        String project02 = sc.next();
        employeeTwo.setProject(project02);

        System.out.print("Enter employee two address: ");
        String address02 = sc.next();
        employeeTwo.setAddress(address02);

        System.out.print("Enter employee two year of join: ");
        int yearOfJoin02 = sc.nextInt();
        employeeTwo.setYearOfJoin(yearOfJoin02);

        System.out.print("Enter employee two salary: ");
        double salary02 = sc.nextDouble();
        employeeTwo.setSalary(salary02);

        System.out.println();

        //Third Employee Object
        Employee employeeThree = new Employee();

        System.out.print("Enter employee three name: ");
        String name03 = sc.next();
        employeeThree.setName(name03);

        System.out.print("Enter employee three project: ");
        String project03 = sc.next();
        employeeThree.setProject(project03);

        System.out.print("Enter employee three address: ");
        String address03 = sc.next();
        employeeThree.setAddress(address03);

        System.out.print("Enter employee three year of join: ");
        int yearOfJoin03 = sc.nextInt();
        employeeThree.setYearOfJoin(yearOfJoin03);

        System.out.print("Enter employee three salary: ");
        double salary03 = sc.nextDouble();
        employeeThree.setSalary(salary03);

        System.out.println();

        System.out.println("Name\t\t\tYear of joining\t\t\tProject\t\t\tSalary\t\t\tAddress");
        System.out.println(employeeOne.getName() + "\t\t\t" + employeeOne.getYearOfJoin() + "\t\t\t\t" + employeeOne.getProject() + "\t\t\t" + employeeOne.getSalary() + "\t\t\t" + employeeOne.getAddress());
        System.out.println(employeeTwo.getName() + "\t\t\t" + employeeTwo.getYearOfJoin() + "\t\t\t\t" + employeeTwo.getProject() + "\t\t\t" + employeeTwo.getSalary() + "\t\t\t" + employeeTwo.getAddress());
        System.out.println(employeeThree.getName() + "\t\t\t" + employeeThree.getYearOfJoin() + "\t\t\t\t" + employeeThree.getProject() + "\t\t\t" + employeeThree.getSalary() + "\t\t\t" + employeeThree.getAddress());

    }

}
