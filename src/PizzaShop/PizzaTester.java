
package PizzaShop;

import java.util.Scanner;

public class PizzaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pizza pizza = new Pizza();
        System.out.println("Enter the name of the pizza: "+ pizza);

        System.out.println("How many pizzas would you like to order?: ");
        int numberOfPizzas = input.nextInt();

        for (int i = 0; i < numberOfPizzas; i++) {

            try{
            System.out.println("Enter the number of slices : ");
            int numberOfSlices = input.nextInt();

            System.out.println("Choose PizzaMeat(CHICKEN, BEEF, SAUSAGES, PEPPERONI): ");
            PizzaMeatChoice meatChoice = PizzaMeatChoice.valueOf(input.next().toUpperCase());

            System.out.println("Choose PizzaVeg(ONION, CABBAGE, MUSHROOM, OLIVES, EGGPLANT): ");
            PizzaVegChoice vegChoice = PizzaVegChoice.valueOf(input.next().toUpperCase());

            Pizza CustomPizza = new Pizza(numberOfSlices, meatChoice, vegChoice);
            System.out.println("N Pizza Ordered: " + CustomPizza);
            }
            catch(IllegalArgumentException e){
            System.out.println("Pizza Not Found");}
        }

    }

}
