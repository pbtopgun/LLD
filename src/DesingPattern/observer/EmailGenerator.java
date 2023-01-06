package DesignPattern.observer;

public class EmailGenerator implements OrderPlacedSubsriber, OrderCancelSubsriber{

    EmailGenerator(){
        Amazon.getInstance().registerOrderPlacedSubsriber(this); //event
        Amazon.getInstance().registerOrderCancelSubsriber(this); //event
    }

    @Override
    public void onOrderPlaced() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onOrderCancel() {
        // TODO Auto-generated method stub
        
    }
    
}
