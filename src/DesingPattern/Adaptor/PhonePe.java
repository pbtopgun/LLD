package DesignPattern.Adaptor;

import Polymorphism.A;

public class PhonePe {
    BankAPIAdaptor adaptor;
    PhonePe(BankAPIAdaptor apiAdaptor) {
        this.adaptor = apiAdaptor;
    }

    boolean addTowallet(int amount, String a){
        double balance = adaptor.checkBalance(a);  //1. Check the balance from the bank
        if(balance >= amount) {
            boolean result = adaptor.deductBalance(amount);
            if(result) {
                return true;
            }
        }
        return false;
    }
}
