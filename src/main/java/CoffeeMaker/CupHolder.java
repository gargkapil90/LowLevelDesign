package CoffeeMaker;

public class CupHolder {
    private int numberOfCups;

    public CupHolder(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public void placeCup(){
        System.out.println("Placing cup");
        System.out.println("Number of cups placed: " + numberOfCups);
    }

    public void removeCup(){
        System.out.println("Removing cup");
        System.out.println("Number of cups removed: " + numberOfCups);
    }
}
