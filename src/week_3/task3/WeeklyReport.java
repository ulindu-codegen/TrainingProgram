package week_3.task3;

import java.util.Scanner;

public class WeeklyReport {

    public static void main(String[] args) {

        inputFuelStation();

    }

    static void inputFuelStation() {

        Scanner sc = new Scanner(System.in);

        FuelStation station = new FuelStation();

        System.out.print("Fuel Station -");
        String fuelName = sc.nextLine();
        station.setFuelStationName(fuelName);

        System.out.print("Address -");
        String address = sc.nextLine();
        station.setAddress(address);

        System.out.print("Contact No -");
        String contNo = sc.nextLine();
        station.setContactNo(contNo);

        System.out.print("Fuel Type -");
        String fuelType = sc.nextLine();
        station.setFuelType(fuelType);

        System.out.print("Unit Price -");
        int unitPrice = sc.nextInt();
        station.setUnitPrice(unitPrice);

        System.out.print("Stock -");
        int stock = sc.nextInt();
        station.setStock(stock);


        Vehicle motoCycle = new Vehicle();

        System.out.println("------------ Motorcycles -------------");

        System.out.print("Weekly quota -");
        int quotaMotoCycle = sc.nextInt();
        motoCycle.setWeeklyQuota(quotaMotoCycle);

        System.out.print("Number of vehicles -");
        int noOfMotoCycle = sc.nextInt();
        motoCycle.setNoOfVehicles(noOfMotoCycle);

        System.out.println("");

        Vehicle car = new Vehicle();

        System.out.println("------------ Cars -------------");

        System.out.print("Weekly quota -");
        int quotaCar = sc.nextInt();
        car.setWeeklyQuota(quotaCar);

        System.out.print("Number of vehicles -");
        int noOfCar = sc.nextInt();
        car.setNoOfVehicles(noOfCar);

        System.out.println("");

        Vehicle wheel = new Vehicle();

        System.out.println("------------ Three-Wheelers -------------");

        System.out.print("Weekly quota -");
        int quotaWheel = sc.nextInt();
        wheel.setWeeklyQuota(quotaWheel);

        System.out.print("Number of vehicles -");
        int noOfWheel = sc.nextInt();
        wheel.setNoOfVehicles(noOfWheel);

        System.out.println("");


        Vehicle van = new Vehicle();

        System.out.println("------------ Vans -------------");

        System.out.print("Weekly quota -");
        int quotaVan = sc.nextInt();
        van.setWeeklyQuota(quotaVan);

        System.out.print("Number of vehicles -");
        int noOfVan = sc.nextInt();
        van.setNoOfVehicles(noOfVan);

        System.out.println("");

        Vehicle land = new Vehicle();

        System.out.println("------------ Land Vehicles -------------");

        System.out.print("Weekly quota -");
        int quotaLand = sc.nextInt();
        land.setWeeklyQuota(quotaLand);

        System.out.print("Number of vehicles -");
        int noOfLand = sc.nextInt();
        land.setNoOfVehicles(noOfLand);

        System.out.println("");

        Vehicle bus = new Vehicle();

        System.out.println("------------ Buses -------------");

        System.out.print("Weekly quota -");
        int quotaBus = sc.nextInt();
        bus.setWeeklyQuota(quotaBus);

        System.out.print("Number of vehicles -");
        int noOfBus = sc.nextInt();
        bus.setNoOfVehicles(noOfBus);

        System.out.println("");

        int totalIssuedMotocycle = totalIssueForVehicle(quotaMotoCycle, noOfMotoCycle);
        int totalIssuedCar = totalIssueForVehicle(quotaCar, noOfCar);
        int totalIssuedWheel = totalIssueForVehicle(quotaWheel, noOfWheel);
        int totalIssuedVan = totalIssueForVehicle(quotaVan, noOfVan);
        int totalIssuedLand = totalIssueForVehicle(quotaLand, noOfLand);
        int totalIssuedBus = totalIssueForVehicle(quotaBus, noOfBus);

        int totalIssued = totalIssued(totalIssuedMotocycle, totalIssuedCar, totalIssuedWheel, totalIssuedVan, totalIssuedLand, totalIssuedBus);
        int totalEarningPrice = totalEarning(totalIssued, unitPrice);
        int remainingStock = remainingStockPetrol(totalIssued, stock);

        System.out.println("--------------------------- Weekly Petrol Consumption Report -------------------------");
        System.out.println("Fuel Station  : " + fuelName + "    \tContact No : " + contNo + "\tUnit Price(Rs.) : " + unitPrice);
        System.out.println("Address : " + address + "\t\t    Received Stocks: " + stock);
        System.out.println("");
        System.out.println("Vehicle Type \tWeekly Quota\tNo of vehicles\tTotal Issued");
        System.out.println("Motorcycles  \t" + quotaMotoCycle + "\t\t\t\t" + noOfMotoCycle + "\t\t\t" + totalIssuedMotocycle);
        System.out.println("Cars         \t" + quotaCar + "\t\t\t\t" + noOfCar + "\t\t\t" + totalIssuedCar);
        System.out.println("Three-Wheels \t" + quotaWheel + "\t\t\t\t" + noOfWheel + "\t\t\t" + totalIssuedWheel);
        System.out.println("Vans         \t" + quotaVan + "\t\t\t\t" + noOfVan + "\t\t\t" + totalIssuedVan);
        System.out.println("Land Vehicles\t" + quotaLand + "\t\t\t\t" + noOfLand + "\t\t\t" + totalIssuedLand);
        System.out.println("Buses        \t" + quotaBus + "\t\t\t\t" + noOfBus + "\t\t\t" + totalIssuedBus);
        System.out.println("");
        System.out.println("Total Issued (l)         " + totalIssued);
        System.out.println("Total Earning (Rs.)      " + totalEarningPrice);
        System.out.println("Remaining stock (l)      " + remainingStock);

    }

    static int totalIssueForVehicle(int weeklyQuota, int noOfVehicle) {
        int totalIssuedForOneVehicle;
        totalIssuedForOneVehicle = weeklyQuota * noOfVehicle;
        return totalIssuedForOneVehicle;
    }

    static int totalIssued(int motoCycleTI, int carTI, int wheelTI, int vanTI, int landTI, int busTI) {
        int totalIssued;
        totalIssued = motoCycleTI + carTI + wheelTI + vanTI + landTI + busTI;
        return totalIssued;
    }

    static int totalEarning(int totalIssuedPetrol, int unitRate) {
        int totalEarning = totalIssuedPetrol * unitRate;
        return totalEarning;
    }

    static int remainingStockPetrol(int totalIssuedPetrol, int totalStock) {
        int remainingStock = totalStock - totalIssuedPetrol;
        return remainingStock;
    }

}
