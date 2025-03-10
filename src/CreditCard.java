package src;

import java.util.Date;

public class CreditCard extends ProductBank{
    private String expirationDate;
    private double interest;
    private double quota;

    public CreditCard(String numberAccount, Date startDate, double balance, String expirationDate, double interest, double quota, Client client) {
        super(numberAccount, startDate, balance, client);
        this.expirationDate = expirationDate;
        this.interest = interest;
        this.quota = quota;
    }

    @Override
    public double calculateInterest() {
        double monthly = balance * (interest / 100) / 12;
        return Math.round(monthly * 100.0) / 100.0;
    }
}
