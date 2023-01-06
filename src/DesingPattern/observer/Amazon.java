package DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubsriber> listOrderPlacedSubsribers = new ArrayList<>();
    static Amazon instance=null;
    
    static Amazon getInstance() {
        if(instance == null) {
            instance = new Amazon();
        }
        return instance;
    }

    void orderPlaced(){
        //Db calls will happen
        /**
        emailGenerator.sendemail();
        smsgenerator.sendSMS();
        inventoryManager.deduct();
        watsappGenerator.sendWatsapp();  ///NEW one
         */

         for(OrderPlacedSubsriber orderPlacedSubsriber: listOrderPlacedSubsribers) {
             orderPlacedSubsriber.onOrderPlaced();
         }

    }
}
