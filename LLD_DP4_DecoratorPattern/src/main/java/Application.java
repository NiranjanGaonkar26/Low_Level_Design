import AddOn.ExtraCheeseTopping;
import AddOn.ExtraVeggiesTopping;
import BaseClass.BasePizza;
import BaseClass.MargharitaBasePizza;

public class Application {
    public static void main(String[] args) {
        BasePizza margharitaPizza = new MargharitaBasePizza();
        BasePizza margharitaPlusExtraCheese = new ExtraCheeseTopping(margharitaPizza);
        BasePizza margharitaPlusExtraCheesePlusExtraVeggies = new ExtraVeggiesTopping(margharitaPlusExtraCheese);

        System.out.println("Cost of Margharita pizza plus extra cheese: "+margharitaPlusExtraCheese.getPrice());
        System.out.println("Cost of Margharita pizza plus extra cheese plus extra veggies: "+margharitaPlusExtraCheesePlusExtraVeggies.getPrice());
    }
}
