package DesignPattern.observer;

public class WatsappGenerator implements OrderPlacedSubsriber{

    WatsappGenerator(){
        Amazon.getInstance().registerOrderPlacedSubsriber(this);
    }

    @Override
    public void onOrderPlaced() {
        // TODO Auto-generated method stub
        System.out.println("Watsapp Generation");
    }
    
}
