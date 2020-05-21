package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.MochaCoffeeMaker;
import lab.assignment.afterrefactoring.CapuccinoCoffeeMaker;
import lab.assignment.afterrefactoring.AmericanoCoffeeMaker;

public class CoffeeClient {


    public static void main(String[] args) {

        CoffeeMaker starbuzz = new MochaCoffeeMaker();
        starbuzz.makeCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoCoffeeMaker();
        starbuzz.makeCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoCoffeeMaker();
        starbuzz.makeCoffee();

    }

}
