import Component.Beverage;
import Component.DarkRoast;
import Decorator.Milk;
import Decorator.Mocha;
import Decorator.Whip;

public class Application {
    public static void main(String[] args) {
        Beverage bev = new Whip(new Mocha(new Mocha(new Milk(new DarkRoast()))));

        String description = bev.getDescription();
        double cost = bev.computeCost();

        System.out.println(description);
        System.out.println(cost);
    }
}
