package javaLab01;

import java.math.BigDecimal;
import java.time.LocalDate;

// Create a bills class that inherits from Transaction class
public class bills extends transaction {
    // Attributes: company_name, bills_charge
    private String company_name = " ";
    private String bills_charge = " ";

    // Create Constructors
    public bills(int store_id, int transaction_id, LocalDate timestamp, int account_id, BigDecimal amount, String recipient, String s) {
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = timestamp;
        this.account_id = account_id;
        this.amount = amount;
        this.company_name = company_name;
        this.bills_charge = bills_charge;
    }
}
