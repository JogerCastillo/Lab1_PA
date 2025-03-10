package src;

import java.util.Date;

public class CDT extends ProductBank {
    private int deadline;
    private double amount;
    private double monthlyInterest;

    public CDT(String numberAccount, Date startDate, double balance, int deadline, double amount, double monthlyInterest, Client client) {
        super(numberAccount, startDate, balance, client);

        this.deadline = deadline;
        this.amount = amount;
        this.monthlyInterest = monthlyInterest;
    }

    @Override
    public double calculateInterest() {
        return amount * (monthlyInterest / 100) * deadline;
    }

    public double getTotalAmount() {
        return amount + calculateInterest();
    }
}
