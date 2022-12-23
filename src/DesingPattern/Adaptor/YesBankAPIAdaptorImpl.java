package DesignPattern.Adaptor;

import DesignPattern.Adaptor.providers.YesBankAPI;

public class YesBankAPIAdaptorImpl implements BankAPIAdaptor{
    //YesBankSDK or YesBankAPI
    YesBankAPI  yesbankAPI = new YesBankAPI();

    @Override
    public double checkBalance(String accountNumber) {
        return (double)yesbankAPI.getBalance(accountNumber);
    }

    @Override
    public boolean deductBalance(int amount) {
        
        // TODO Auto-generated method stub
        return false;
    }
    
}
