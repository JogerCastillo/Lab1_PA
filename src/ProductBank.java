package src;

import java.util.Date;

public abstract class ProductBank {
    protected String numberAccount;
    protected Date startDate;
    protected double balance;
    private Client client;

    public ProductBank(String numberAccount, Date startDate, double balance, Client client) {
        this.numberAccount = numberAccount;
        this.startDate = startDate;
        this.balance = balance;
        this.client =  client;
    }

    // Method calculate interest
    public abstract double calculateInterest();
}
