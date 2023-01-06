package DesignPattern.observer;

public class InventoryManager implements OrderPlacedSubsriber {

    InventoryManager(){
        Amazon.getInstance().registerOrderPlacedSubsriber(this);
    }

    @Override
    public void onOrderPlaced() {
        // TODO Auto-generated method stub
        
    }
    
}
