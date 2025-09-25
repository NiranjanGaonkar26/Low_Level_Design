package Component;

public class Decaf extends Beverage{

    public Decaf(){
        this.description = "A decaf coffee, no caffeine";
    }

    @Override
    public double computeCost() {
        return 30;
    }
}
