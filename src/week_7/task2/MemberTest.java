package week_7.task2;

import java.util.Scanner;

public class MemberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Manager manger1 = new Manager();

        manger1.setName("ulindu");
        manger1.setAge(24);
        manger1.setAddress("Kurunegala");
        manger1.setPhoneNumber("0716183426");
        manger1.setSalary(70000);
        manger1.setSpecialization("QA");
        manger1.setDepartment("IT");

        manger1.printSalary();
        manger1.printSpecialization();
        manger1.printDepartment();

    }

}
