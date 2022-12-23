package DesignPattern.Adaptor;

public interface BankAPIAdaptor {
    double checkBalance(String accountNumber);
    boolean deductBalance(int amount);
}
