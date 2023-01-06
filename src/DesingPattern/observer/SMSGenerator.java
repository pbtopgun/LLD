package DesignPattern.observer;

public class SMSGenerator implements OrderPlacedSubsriber{

    SMSGenerator(){
        Amazon.getInstance().registerOrderPlacedSubsriber(this);
    }

    @Override
    public void onOrderPlaced() {
        // TODO Auto-generated method stub
        
    }
    
}
