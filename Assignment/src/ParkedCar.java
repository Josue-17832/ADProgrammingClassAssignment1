//Name: Ntwali Josue, Reg num: 17832/2021, Class: Parked car
//Instant variables are make, model, color, licenseNumber, minutesParked

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    // Constructor
    public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    // Getters and Setters
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public int getMinutesParked() { return minutesParked; }
    public void setMinutesParked(int minutesParked) { this.minutesParked = minutesParked; }

    @Override
    public String toString() {
        return "Car Details: " + make + " " + model + " (" + color + "), License: " + licenseNumber +
                ", Parked: " + minutesParked + " minutes";
    }
}
