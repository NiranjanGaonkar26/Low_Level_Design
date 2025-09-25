package Component;

public class HouseBlend extends Beverage{

    public HouseBlend(){
        this.description = "A house blend coffee, Less Caffeine";
    }

    @Override
    public double computeCost() {
        return 15;
    }
}
