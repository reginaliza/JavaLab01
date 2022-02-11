package javaLab01;

import java.time.LocalDate;

// Create an Add account credit class that inherits from transaction class
public class addAccountCredits extends transaction {

    // Attributes:
    private String company_name = " ";

    // Constructor
    public addAccountCredits(String store_id, String transaction_id, LocalDate timestamp, String account_id, Float amount, String recipient) {
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = timestamp;
        this.account_id = account_id;
        this.amount = amount;
        this.company_name = company_name;
    }
}
