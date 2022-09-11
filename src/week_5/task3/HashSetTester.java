package week_5.task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values for the first set in comma separated text: ");
        String[] setOneArr = sc. nextLine().split(",");

        System.out.print("Enter values for the second set in comma separated text: ");
        String[] setTwoArr = sc. nextLine().split(",");

        HashSet<String> firstSet = new HashSet<>(Arrays.asList(setOneArr));
        HashSet<String> secondSet = new HashSet<>(Arrays.asList(setTwoArr));

        System.out.println();
        System.out.println("First set: " + firstSet );
        System.out.println("Second set: " + secondSet );
        System.out.println("");

        //Union
        HashSet<String> union = new HashSet<>();
        union.addAll(firstSet);
        union.addAll(secondSet);
        System.out.println("Union: "+union);

        //Intersection
        HashSet<String> intersection = new HashSet<>();
        intersection.addAll(firstSet);
        intersection.retainAll(secondSet);
        System.out.println("Intersection: "+intersection);

        //Difference
        HashSet<String> difference = new HashSet<>();
        difference.addAll(firstSet);
        difference.removeAll(secondSet);
        System.out.println("Difference: "+difference);

        //Subset
        System.out.println("Is first set is a subset of second set? " + secondSet.containsAll(firstSet));
        System.out.println("Is second set is a subset of first set? " + firstSet.containsAll(secondSet));

    }

}
