package week_5.task1;

import java.util.*;

public class ArrayListTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter SAARC countries as comma separated text : ");
        String saarc = sc.nextLine();

        System.out.print("Enter BIMSTEC countries as comma separated text : ");
        String bimstec = sc.nextLine();

        String[] saarcArray = saarc.split(",");
        String[] bimstecArray = bimstec.split(",");

        Arrays.sort(saarcArray);
        Arrays.sort(bimstecArray);

        ArrayList<String> saarcList = new ArrayList<>(Arrays.asList(saarcArray));
        ArrayList<String> bimstecList = new ArrayList<>(Arrays.asList(bimstecArray));

        System.out.println("SAARC Array List: " + saarcList);
        System.out.println("BIMSTEC Array List: " + bimstecList);

        System.out.println("Size of SAARC Array List: " + saarcList.size());
        System.out.println("Size of BIMSTEC Array List: " + bimstecList.size());

        bimstecList.removeIf(saarcList::contains);
        System.out.println("SAARC Array List Now: " + saarcList);
        System.out.println("BIMSTEC Array List Now: " + bimstecList);

        ArrayList<String> countryList = new ArrayList<>();
        countryList.addAll(saarcList);
        countryList.addAll(bimstecList);
        System.out.println("Country List: " + countryList);
        Collections.sort(countryList);
        System.out.println("Sorted Country List: " + countryList);

        Collections.swap(countryList, 0, countryList.size() - 1);
        System.out.println("Sorted Swapped Country List: " + countryList);

        List<String> newList = countryList.subList(countryList.size() / 2, countryList.size());
        System.out.println("Second half of the list: " + newList);

        Collections.reverse(newList);
        System.out.println("Reverse List: " + newList);

    }

}
