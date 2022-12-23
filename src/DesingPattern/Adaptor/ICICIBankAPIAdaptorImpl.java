package DesignPattern.Adaptor;

import DesignPattern.Adaptor.providers.ICICIBank;

public class ICICIBankAPIAdaptorImpl implements BankAPIAdaptor{
    ICICIBank bank = new ICICIBank();

    @Override
    public double checkBalance(String accountNumber) {
        return bank.getICICIBalance(Long.parseLong(accountNumber)); /// exception to handle!!
    }

    @Override
    public boolean deductBalance(int amount) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
