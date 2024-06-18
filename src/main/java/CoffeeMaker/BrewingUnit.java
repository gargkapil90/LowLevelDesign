package CoffeeMaker;

import java.util.Date;

public class BrewingUnit {
    private int quantity;

    public BrewingUnit(int quantity, int brewingTime) {
        this.quantity = quantity;
        this.brewingTime = brewingTime;
    }

    private int brewingTime;

    public void brew(){
        System.out.println("Brewing coffee");
        System.out.println("Brewing done for " + brewingTime + " seconds");
    }

}
