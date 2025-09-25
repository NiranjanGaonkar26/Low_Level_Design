package Component;

public class Espresso extends Beverage{

    public Espresso() {
        this.description = "An espresso coffee, moderate caffeine";
    }

    @Override
    public double computeCost() {
        return 40;
    }
}
