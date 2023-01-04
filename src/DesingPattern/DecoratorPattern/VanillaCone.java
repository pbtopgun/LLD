package DesignPattern.DecoratorPattern;

public class VanillaCone implements IceCreamIngredient{
    private int cost = 10;

    VanillaCone(){

    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
