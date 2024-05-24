package bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        System.out.println();
        System.out.println("-------------------------- Welcome to PizzaMania --------------------------\n");
        System.out.println("Available Pizza:\n\n1. Veg Pizza\t\t 2. Non-Veg Pizza \n3. Deluxe Veg Pizza\t 4. Deluxe Non-Veg Pizza\n");
        System.out.print("Select which pizza you want to order: ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch(opt){
            case 1:
                pizza vegPizza = new pizza(true);
                vegPizza.addExtraCheese();
                vegPizza.addExtraToppings();
                vegPizza.takeAway();
                vegPizza.getBill();
                break;

            case 2:
                pizza nonVegPizza = new pizza(false);
                nonVegPizza.addExtraCheese();
                nonVegPizza.addExtraToppings();
                nonVegPizza.takeAway();
                nonVegPizza.getBill();
                break;

            case 3:
                DeluxePizza veg = new DeluxePizza(true);
                veg.basePizzaPrice = 550;
                veg.addExtraCheese();
                veg.addExtraToppings();
                veg.takeAway();
                veg.getBill();
                break;

            case 4:
                DeluxePizza nonVeg = new DeluxePizza(false);
                nonVeg.basePizzaPrice = 650;
                nonVeg.addExtraCheese();
                nonVeg.addExtraToppings();
                nonVeg.takeAway();
                nonVeg.getBill();
                break;

            default:
                System.out.println("Please select valid Options!");
                return;
        }

        sc.close();
    }
}
