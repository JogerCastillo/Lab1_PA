package src;

import java.util.Date;

public class SavingsAccount extends ProductBank {
    private final double percentageInterest;

    public SavingsAccount(String numberAccount, Date startDate, double balance, double percentageInterest, Client client) {
        super(numberAccount, startDate, balance, client);
        this.percentageInterest = percentageInterest;
    }

    @Override
    public double calculateInterest() {
        double monthly = balance * (percentageInterest / 100) / 12;
        return Math.round((balance + monthly) * 100.0) / 100.0;
    }
}
