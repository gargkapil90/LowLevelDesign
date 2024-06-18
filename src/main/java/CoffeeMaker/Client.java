package CoffeeMaker;

public class Client {
    public static void main(String[] args) {

//        CoffeeMaker coffeeMaker = new CoffeeMaker();
//        coffeeMaker.makeCoffee();

            BrewingUnit brewingUnit = new BrewingUnit(10, 10);
            CupHolder cupHolder = new CupHolder(1);
            Grinder grinder = new Grinder(5, 10);
            HeatElement heatElement = new HeatElement(10, 100);

            CoffeeMaker coffeeMaker = new CoffeeMaker(brewingUnit, cupHolder, grinder, heatElement);
            coffeeMaker.makeCoffee();
    }
}
