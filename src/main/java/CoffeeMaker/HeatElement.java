package CoffeeMaker;

public class HeatElement {
    private final int heatTime;
    private final int temperature;

    public HeatElement(int heatTime, int temperature) {
        this.heatTime = heatTime;
        this.temperature = temperature;
    }

    public void heat() {
        System.out.println("Heating element");
        System.out.println("Heating done for " + heatTime + " seconds");
        System.out.println("Heating done to " + temperature + " degrees");
    }
}
