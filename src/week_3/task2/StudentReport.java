package week_3.task2;

import java.util.Scanner;

public class StudentReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student std = new Student();

        System.out.println("User Inputs:");

        System.out.print("Name - ");
        String stdName = sc.nextLine();
        std.setName(stdName);

        System.out.print("School - ");
        String stdSchool = sc.nextLine();
        std.setSchool(stdSchool);

        System.out.print("Class - ");
        String stdClass = sc.nextLine();
        std.setClassOfStudent(stdClass);

        System.out.print("Term - ");
        String stdTerm = sc.nextLine();
        std.setTerm(stdTerm);

        Subject sub = new Subject();

        System.out.print("Subject 01 - ");
        String stdSub1 = sc.nextLine();
        sub.setSubjectOne(stdSub1);

        System.out.print("Marks for " + stdSub1 + " - ");
        int stdSub1Mark = sc.nextInt();
        sub.setMark1(stdSub1Mark);


        System.out.print("Subject 02 - ");
        String stdSub2 = sc.next();
        sub.setSubjectTwo(stdSub2);

        System.out.print("Marks for " + stdSub2 + " - ");
        int stdSub2Mark = sc.nextInt();
        sub.setMark2(stdSub2Mark);


        System.out.print("Subject 03 - ");
        String stdSub3 = sc.next();
        sub.setSubjectThree(stdSub3);

        System.out.print("Marks for " + stdSub3 + " - ");
        int stdSub3Mark = sc.nextInt();
        sub.setMark3(stdSub3Mark);


        System.out.print("Subject 04 - ");
        String stdSub4 = sc.next();
        sub.setSubjectFour(stdSub4);

        System.out.print("Marks for " + stdSub4 + " - ");
        int stdSub4Mark = sc.nextInt();
        sub.setMark4(stdSub4Mark);


        System.out.print("Subject 05 - ");
        String stdSub5 = sc.next();
        sub.setSubjectFive(stdSub5);

        System.out.print("Marks for " + stdSub5 + " - ");
        int stdSub5Mark = sc.nextInt();
        sub.setMark5(stdSub5Mark);

        StudentReport report = new StudentReport();
        int markTotal = report.getTotal(sub);
        double avg = report.getAverage(sub);

        System.out.println("--------------------------- Term Test Report -------------------------");
        System.out.println();
        System.out.println("Student Name  : " + stdName + "\t\t\tSchool : " + stdSchool);
        System.out.println("Class         : " + stdClass + "\t\t\t\t\tTerm  : " + stdTerm);
        System.out.println();
        System.out.println("Subject   \t\t\tMarks");
        System.out.println(stdSub1 + "\t\t" + stdSub1Mark);
        System.out.println(stdSub2 + "\t\t\t" + stdSub2Mark);
        System.out.println(stdSub3 + "\t\t\t" + stdSub3Mark);
        System.out.println(stdSub4 + "\t\t\t" + stdSub4Mark);
        System.out.println(stdSub5 + "\t\t" + stdSub5Mark);
        System.out.println("");
        System.out.println("Total Marks    : " + markTotal);
        System.out.println("Average        : " + avg);

    }

    private int getTotal(Subject subject) {

        int total;
        total = subject.getMark1() + subject.getMark2() + subject.getMark3() + subject.getMark4() + subject.getMark5();
        return total;

    }

    private double getAverage(Subject subject) {

        int total = (subject.getMark1() + subject.getMark2() + subject.getMark3() + subject.getMark4() + subject.getMark5());
        double average = total / 5.0;
        return average;

    }

}
