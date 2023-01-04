package DesignPattern.DecoratorPattern;

public class ChocolateFlavour implements IceCreamIngredient{
    IceCreamIngredient i;

    private int cost = 50;
    ChocolateFlavour(IceCreamIngredient i){
        this.i = i;
    }

    @Override
    public int getCost() {
        return this.cost + i.getCost();
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
