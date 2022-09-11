package week_5.task2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTester {

    public static void main(String[] args) {

        HashMap<String, Integer> dulajResult = new HashMap<>();
        dulajResult.put("Sinhala", 67);
        dulajResult.put("Logic", 78);
        dulajResult.put("Economic", 89);

        HashMap<String, Integer> shakyaResult = new HashMap<>();
        shakyaResult.put("Biology", 77);
        shakyaResult.put("Chemistry", 69);
        shakyaResult.put("Physics", 81);

        HashMap<String, Integer> nimanthaResult = new HashMap<>();
        nimanthaResult.put("Economics", 97);
        nimanthaResult.put("Accounting", 86);
        nimanthaResult.put("Business Studies", 83);

        HashMap<String, HashMap<String, Integer>> resultMap = new HashMap<>();
        resultMap.put("Dulaj", dulajResult);
        resultMap.put("Shakya", shakyaResult);
        resultMap.put("Nimantha", nimanthaResult);

        System.out.println(resultMap);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        if (resultMap.containsKey(name)) {

            System.out.print("Enter the Subject: ");
            String subject = sc.nextLine();

            if (resultMap.get(name).containsKey(subject)) {

                System.out.println("Marks for " + subject + " = " + resultMap.get(name).get(subject));

            } else {

                System.out.println("The entered subject has not been taken by " + name);

            }

        } else {

            System.out.println("Result of " + name + " is not available.");

        }

    }

}
