package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.beforerefactoring.CoffeeMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        Capuccino c1 = new Capuccino();

        //using template method
        c1.makeCoffee();
        System.out.println("************");

        Mocha m1 = new Mocha();
        m1.makeCoffee();

        System.out.println("************");

        Americano a1 = new Americano();
        a1.makeCoffee();
    }

}
