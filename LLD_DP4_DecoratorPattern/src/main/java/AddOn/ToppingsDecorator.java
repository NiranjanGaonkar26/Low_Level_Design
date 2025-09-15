package AddOn;

import BaseClass.BasePizza;

public abstract class ToppingsDecorator extends BasePizza {

    BasePizza basePizza;

    @Override
    public abstract int getPrice();
}
