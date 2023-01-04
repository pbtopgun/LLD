package DesignPattern.DecoratorPattern;

public class Walnut implements IceCreamIngredient {
    IceCreamIngredient i;
    Walnut(IceCreamIngredient i) {
        this.i = i;
    }

    @Override
    public int getCost() {
        return 20+i.getCost();
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
