package Decorator;

import Component.Beverage;

public class Whip extends CondimentsDecorator {

    public Whip(Beverage baseComponent){
        this.baseComponent = baseComponent;
    }

    @Override
    public String getDescription(){
        return baseComponent.getDescription() + " (with whip)";
    }

    @Override
    public double computeCost() {
        return 2.5 + baseComponent.computeCost();
    }
}
