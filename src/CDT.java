package src;

import java.util.Date;

public class CDT extends ProductBank {
    private int deadline;
    private double monthlyInterest;

    public CDT(String numberAccount, Date startDate, double balance, int deadline, double monthlyInterest, Client client) {
        super(numberAccount, startDate, balance, client);

        this.deadline = deadline;
        this.monthlyInterest = monthlyInterest;
    }

    @Override
    public double calculateInterest() {
        double monthly = balance * (monthlyInterest / 100) / deadline;
        return monthly;
    }

    public double getTotalAmount() {
        return balance + calculateInterest();
    }
}
