import java.util.Scanner;

public class TestParkingTicket {

    public static void main(String[] args) {
        // Create an instance of a PoliceOfficer
        PoliceOfficer officer = new PoliceOfficer("Officer Jane", "56789");

        // Run the parking ticket simulation
        issueParkingTicket(officer);
    }

    public static void issueParkingTicket(PoliceOfficer officer) {
        Scanner scanner = new Scanner(System.in);

        // Officer inputs car details
        System.out.println("Enter car details for the scenario:");
        System.out.print("Car Make: ");
        String make = scanner.nextLine();
        System.out.print("Car Model: ");
        String model = scanner.nextLine();
        System.out.print("Car Color: ");
        String color = scanner.nextLine();
        System.out.print("Car License Number: ");
        String licenseNumber = scanner.nextLine();
        System.out.print("Minutes Parked: ");
        int minutesParked = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        ParkedCar car = new ParkedCar(make, model, color, licenseNumber, minutesParked);

        // Officer inputs parking meter details
        System.out.print("Enter parking time purchased (in minutes): ");
        int minutesPurchased = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        ParkingMeter meter = new ParkingMeter(minutesPurchased);

        // Officer inputs reason for issuing the ticket
        System.out.println("\nEnter the reason for issuing the ticket:");
        System.out.println("1. The ParkedCar is within the parking time purchased.");
        System.out.println("2. The ParkedCar is over the parking time purchased.");
        System.out.println("3. The ParkedCar is just barely within the parking time purchased.");
        System.out.println("4. The ParkedCar is just barely over the parking time purchased.");
        System.out.println("5. The ParkedCar is exactly at the parking time purchased.");
        System.out.println("6. The ParkedCar is ticketed for being less than 1 hour over the time purchased.");
        System.out.println("7. The ParkedCar is ticketed for being more than 1 hour over the time purchased.");
        System.out.println("8. The ParkedCar is ticketed for being exactly 1 hour over the time purchased.");
        System.out.print("Your reason: ");
        String reason = scanner.nextLine().trim();

        // Validate the reason
        if (!isValidReason(reason)) {
            System.out.println("No ticket issued. Reason provided is invalid.");
            return;
        }

        // Calculate minutes over parking time
        int minutesOver = car.getMinutesParked() - meter.getMinutesPurchased();
        if (minutesOver <= 0) {
            System.out.println("No ticket issued. The car is within the parking time purchased.");
            return;
        }

        // Calculate fine
        double fine = calculateFine(minutesOver);

        // Generate and display the ticket
        ParkingTicket ticket = new ParkingTicket(car, reason, fine);
        displayTicket(ticket, officer);
    }

    // Method to validate the reason
    private static boolean isValidReason(String reason) {
        String[] validReasons = {
                "The ParkedCar is within the parking time purchased.",
                "The ParkedCar is over the parking time purchased.",
                "The ParkedCar is just barely within the parking time purchased.",
                "The ParkedCar is just barely over the parking time purchased.",
                "The ParkedCar is exactly at the parking time purchased.",
                "The ParkedCar is ticketed for being less than 1 hour over the time purchased.",
                "The ParkedCar is ticketed for being more than 1 hour over the time purchased.",
                "The ParkedCar is ticketed for being exactly 1 hour over the time purchased."
        };

        for (String validReason : validReasons) {
            if (validReason.equalsIgnoreCase(reason)) {
                return true;
            }
        }
        return false;
    }
    // Method to invalidate the reason
    private static boolean isInvalidReason(String reason) {
        String[] invalidReasons = {
                "The ParkedCar is ticketed for being less than 1 hour over the time purchased.",
                "The ParkedCar is ticketed for being more than 1 hour over the time purchased.",
                "The ParkedCar is ticketed for being exactly 1 hour over the time purchased."
        };

        for (String invalidReason : invalidReasons) {
            if (invalidReason.equalsIgnoreCase(reason)) {
                return true;
            }
        }
        return false;
    }

    // Method to calculate fine based on minutes over
    private static double calculateFine(int minutesOver) {
        double fine = 25.00; // Base fine for the first hour
        if (minutesOver > 60) {
            fine += Math.ceil((minutesOver - 60) / 60.0) * 10.00; // $10 for each additional hour
        }
        return fine;
    }

    // Method to display ticket details
    private static void displayTicket(ParkingTicket ticket, PoliceOfficer officer) {
        System.out.println("\n--- Parking Ticket Issued ---");
        System.out.println("Car Details: " + ticket);
        System.out.println("Officer Details: " + officer);
        System.out.println("Fine: $" + ticket.getFine());
        System.out.println("-----------------------------\n");
    }
}
