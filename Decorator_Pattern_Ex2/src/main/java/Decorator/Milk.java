package Decorator;

import Component.Beverage;

public class Milk extends CondimentsDecorator{

    public Milk(Beverage baseComponent){
        this.baseComponent = baseComponent;
    }

    @Override
    public String getDescription(){
        return baseComponent.getDescription() + " (with milk)";
    }

    @Override
    public double computeCost() {
        return 5 + baseComponent.computeCost();
    }
}
