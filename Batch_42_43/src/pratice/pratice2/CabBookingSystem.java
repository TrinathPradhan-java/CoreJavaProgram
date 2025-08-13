package pratice.pratice2;

import java.util.Scanner;

public class CabBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rides: ");
        int numberOfRides = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline
        
        for (int i = 1; i <= numberOfRides; i++) {
            System.out.println("\nEnter details for Ride " + i + ":");
            
            System.out.print("Ride ID: ");
            String rideID = scanner.nextLine();
            
            System.out.print("Source: ");
            String source = scanner.nextLine();
            
            System.out.print("Destination: ");
            String destination = scanner.nextLine();
            
            System.out.print("Distance (in km): ");
            double distance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline after double input

            Ride ride = new Ride(rideID, source, destination, distance);
            ride.displayRideDetails();
        }

        scanner.close();
    }
}

class Ride {
    String rideID;
    String source;
    String destination;
    double distance;
    double fare;

    public Ride(String rideID, String source, String destination, double distance) {
        this.rideID = rideID;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.fare = calculateFare(distance);
    }

    public double calculateFare(double distance) {
        return distance * 10;  // Assuming ₹10 per km
    }

    public void displayRideDetails() {
        System.out.println("\nRide Details:");
        System.out.println("Ride ID: " + rideID);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }
}
