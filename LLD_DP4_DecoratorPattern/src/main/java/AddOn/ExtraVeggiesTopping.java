package AddOn;

import BaseClass.BasePizza;

public class ExtraVeggiesTopping extends ToppingsDecorator{
    BasePizza basePizza;

    public ExtraVeggiesTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getPrice() {
        return basePizza.getPrice() + 30;
    }
}
