//Name: Ntwali Josue, Reg num: 17832/2021, Class: Parked car
//Instant variables are Name, BadgeNumber

public class PoliceOfficer {
    private String name;
    private String badgeNumber;

    public PoliceOfficer(String name, String badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Badge Number: " + badgeNumber;
    }
}
