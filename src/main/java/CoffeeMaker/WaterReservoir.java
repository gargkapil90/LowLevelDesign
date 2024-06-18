package CoffeeMaker;

public class WaterReservoir {
    private int quantity;
    private int temperature;
    public void heatWater(){
        System.out.println("Heating water");
        System.out.println("Water heated to " + temperature + " degrees");
    }

    public void fillWater(){
        System.out.println("Filling water");
        System.out.println("Water filled to " + quantity + " ml");
    }
}

