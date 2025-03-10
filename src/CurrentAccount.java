package src;

import java.util.Date;

public class CurrentAccount extends ProductBank {
    private final double percentageInterest;
    private double overdraft;

    public CurrentAccount(String numberAccount, Date startDate, double balance, double percentageInterest, double overdraft, Client client) {
        super(numberAccount, startDate, balance, client);
        this.percentageInterest = percentageInterest;
        this.overdraft = overdraft;
    }

    @Override
    public double calculateInterest() {
        double monthly = balance * (percentageInterest / 100) / 12;
        return Math.round((balance + monthly) * 100.0) / 100.0;
    }
}
