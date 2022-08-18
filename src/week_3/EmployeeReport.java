package week_3;

import java.util.Scanner;

public class EmployeeReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //First Employee Object
        Employee employeeOne = new Employee();

        String name = sc.nextLine();
        employeeOne.setName(name);

        int yearOfJoin = sc.nextInt();
        employeeOne.setYearOfJoin(yearOfJoin);

        double salary = sc.nextDouble();
        employeeOne.setSalary(salary);

        String project = sc.nextLine();
        employeeOne.setProject(project);

        String address = sc.nextLine();
        employeeOne.setAddress(address);

        //Second Employee Object
        Employee employeeTwo = new Employee();

        name = sc.nextLine();
        employeeTwo.setName(name);

        yearOfJoin = sc.nextInt();
        employeeTwo.setYearOfJoin(yearOfJoin);

        salary = sc.nextDouble();
        employeeTwo.setSalary(salary);

        project = sc.nextLine();
        employeeTwo.setProject(project);

        address = sc.nextLine();
        employeeTwo.setAddress(address);

        //Third Employee Object
        Employee employeeThree = new Employee();

        name = sc.nextLine();
        employeeThree.setName(name);

        yearOfJoin = sc.nextInt();
        employeeThree.setYearOfJoin(yearOfJoin);

        salary = sc.nextDouble();
        employeeThree.setSalary(salary);

        project = sc.nextLine();
        employeeThree.setProject(project);

        address = sc.nextLine();
        employeeThree.setAddress(address);



    }

}
