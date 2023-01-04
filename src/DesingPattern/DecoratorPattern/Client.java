package DesignPattern.DecoratorPattern;

public class Client {
    public static void main(String[] args) throws Exception {
        //ERROR not allowed as only having the chocolate flavour is not allowed.
        //IceCreamIngredient iw = new ChocolateFlavour();

        IceCreamIngredient i = 
            new VanillaCone();
        
        //Only cone can be purchased too.
        System.out.println(i.getCost());

        

        IceCreamIngredient child1IceCream = 
        new Walnut(new ChocolateFlavour(
            new ChocolateFlavour(
                new Walnut(
                    new VanillaCone()))));
        
        System.out.println(child1IceCream.getCost());

        IceCreamIngredient child2IceCream = 
        new ChocolateFlavour(new Walnut(
            new ChocolateFlavour(
                new Walnut(
                    new VanillaCone()))));

        System.out.println(child2IceCream.getCost());
        
        //Same cost in both the cases, 
        //but different description since objects are strcutured differently.

        //Always to have to have a base vanillacone to create an icecream.
    }
}
