package OOP;

import java.util.Scanner;

public class ParkingLotApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Parking Lot System ===");

        ParkingLot parkingLot = new ParkingLot(10.0, 5.0);

        System.out.print("Enter customer's name: ");
        String name = scanner.nextLine();

        int hours;
        while (true) {
            System.out.print("Enter number of hours parked: ");
            try {
                hours = Integer.parseInt(scanner.nextLine());
                if (hours <= 0) {
                    System.out.println("Hours must be greater than zero.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        Customer customer = new Customer(name, hours);
        double totalAmount = parkingLot.calculatePrice(customer.getHoursParked());

        System.out.println("\n--- Receipt ---");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Hours parked: " + customer.getHoursParked());
        System.out.printf("Total amount to pay: $%.2f\n", totalAmount);
        System.out.println("Thank you for using our parking lot!");

        scanner.close();
    }
}

class ParkingLot {
    private double firstHourPrice;
    private double additionalHourPrice;

    public ParkingLot(double firstHourPrice, double additionalHourPrice) {
        this.firstHourPrice = firstHourPrice;
        this.additionalHourPrice = additionalHourPrice;
    }

    public double calculatePrice(int hours) {
        if (hours <= 1) {
            return firstHourPrice;
        } else {
            return firstHourPrice + (hours - 1) * additionalHourPrice;
        }
    }
}

class Customer {
    private String name;
    private int hoursParked;

    public Customer(String name, int hoursParked) {
        this.name = name;
        this.hoursParked = hoursParked;
    }

    public String getName() {
        return name;
    }

    public int getHoursParked() {
        return hoursParked;
    }
}
