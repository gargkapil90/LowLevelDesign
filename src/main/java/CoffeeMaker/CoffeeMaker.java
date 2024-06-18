package CoffeeMaker;

public class CoffeeMaker {
    private final BrewingUnit brewingUnit;
    private final CupHolder cupHolder;
    private final Grinder grinder;
    private final HeatElement heatElement;

    public CoffeeMaker(BrewingUnit brewingUnit, CupHolder cupHolder, Grinder grinder, HeatElement heatElement) {
        this.brewingUnit = brewingUnit;
        this.cupHolder = cupHolder;
        this.grinder = grinder;
        this.heatElement = heatElement;
    }

    public void makeCoffee() {
        cupHolder.placeCup();
        grinder.grind();
        brewingUnit.brew();
        heatElement.heat();
        cupHolder.removeCup();
        System.out.println("Coffee is ready");
    }


}
