//Name: Ntwali Josue, Reg Num:17832/2021
//Instant variables for this class are numSlices, meatChoice, vegChoice

package PizzaShop;

public class Pizza {
    private int numSlices;
    private PizzaMeatChoice meatChoice;
    private PizzaVegChoice vegChoice;

    //Default constructor
    public Pizza() {
        this.numSlices = (int) (Math.random() * 8 + 1);//random slices number between 1 and 8
        this.meatChoice = PizzaMeatChoice.values()[(int) (Math.random() * PizzaMeatChoice.values().length)];
        this.vegChoice = PizzaVegChoice.values()[(int) (Math.random() * PizzaVegChoice.values().length)];

    }

    //Parameterized Constructor
    public Pizza(int numSlices, PizzaMeatChoice meatChoice, PizzaVegChoice vegChoice) {
        this.numSlices = numSlices;
        this.meatChoice = meatChoice;
        this.vegChoice = vegChoice;
    }

    //Setters and Getters
    public int getNumSlices() {
        return numSlices;
    }

    public void setNumSlices(int numSlices) {
        this.numSlices = numSlices;
    }

    public PizzaMeatChoice getMeatChoice() {
        return meatChoice;
    }

    public void setMeatChoice(PizzaMeatChoice meatChoice) {
        this.meatChoice = meatChoice;
    }

    public PizzaVegChoice getVegChoice() {
        return vegChoice;
    }

    public void setVegChoice(PizzaVegChoice vegChoice) {
        this.vegChoice = vegChoice;
    }

    @Override
    public String toString() {
        return "Pizza [Slices=" + numSlices + ", PizzaMeatChoice=" + meatChoice + ", PizzaVegChoice=" + vegChoice + "]";
    }
}

//Custom Exception
class InvalidPizzaOptionException extends Exception {
    public InvalidPizzaOptionException(String message) {
        super(message);
    }
}

