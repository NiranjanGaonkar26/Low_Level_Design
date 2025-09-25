package Component;

abstract public class Beverage {

    protected String description;

    public String getDescription(){
        return this.description;
    }

    abstract public double computeCost();
}
