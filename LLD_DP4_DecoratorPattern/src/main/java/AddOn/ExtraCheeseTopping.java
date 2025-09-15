package AddOn;

import BaseClass.BasePizza;

public class ExtraCheeseTopping extends ToppingsDecorator{
    BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getPrice() {
        return basePizza.getPrice() + 20;
    }
}
