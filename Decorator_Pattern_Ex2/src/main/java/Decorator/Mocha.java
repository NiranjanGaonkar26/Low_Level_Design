package Decorator;

import Component.Beverage;

public class Mocha extends CondimentsDecorator{

    public Mocha(Beverage baseComponent){
        this.baseComponent = baseComponent;
    }

    @Override
    public String getDescription(){
        return baseComponent.getDescription() + " (with mocha)";
    }
    @Override
    public double computeCost() {
        return 2 + baseComponent.computeCost();
    }
}
