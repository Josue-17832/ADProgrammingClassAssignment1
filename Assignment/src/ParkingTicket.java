//Name: Ntwali Josue, Reg num: 17832/2021, Class: Parked car
//Instant variables are make, model, color, licenseNumber, reason, fine


public class ParkingTicket {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private String reason;
    private double fine;

    public ParkingTicket(ParkedCar car, String reason, double fine) {
        this.make = car.getMake();
        this.model = car.getModel();
        this.color = car.getColor();
        this.licenseNumber = car.getLicenseNumber();
        this.reason = reason;
        this.fine = fine;
    }

    public double getFine() {
        return fine;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Color: " + color + ", License: " + licenseNumber + ", Reason: " + reason;
    }
}
