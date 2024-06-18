package CoffeeMaker;

public class Grinder {
    public Grinder(int grindingTime, int quantity) {
        this.grindingTime = grindingTime;
        this.quantity = quantity;
    }

    private int quantity;
    private int grindingTime;

    public void grind() {
        System.out.println("Grinding coffee");
        System.out.println("Grinding done for " + grindingTime + " seconds");
    }
}
