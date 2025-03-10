package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Working tree 🌳");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Here the rest of the logic 🧠
        try {
            Client client = new Client(1015186487, "Miguel Angel Jaramillo Munoz", "varmiguemunoz@gmail.com", 302327805, "Calle 38 A sur numero 64 - 20");
            SavingsAccount savings = new SavingsAccount("61717515888", dateFormat.parse("10-02-2025"), 1000, 9, client);
            CurrentAccount current = new CurrentAccount("61717515888", dateFormat.parse("10-02-2025"), 1000, 8, 500, client);
            CreditCard creditCard = new CreditCard("5558744898760918", dateFormat.parse("09-02-2025"), 1000, "10/36", 4.5, 5000, client);
            CDT cdt = new CDT("61717515888", dateFormat.parse("10-02-2025"), 5000, 4,  9, client);

            // Calculate interest 🧠
            System.out.println("Savings Account Monthly Interest: $" + savings.calculateInterest());
            System.out.println("Current Account Monthly Interest: $" + current.calculateInterest());
            System.out.println("Credit Card Monthly Interest: $" + creditCard.calculateInterest());
            System.out.println("CDT Monthly Interest: " + cdt.calculateInterest());
            System.out.println("Total CDT Amount: " + cdt.getTotalAmount());


        } catch (ParseException error) {
            System.out.println("Error parsing data" + error.getMessage());
        }


    }
}