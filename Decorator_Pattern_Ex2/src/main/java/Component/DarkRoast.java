package Component;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        this.description = "A dark roast coffee, High Caffeine";
    }

    @Override
    public double computeCost() {
        return 20;
    }
}
