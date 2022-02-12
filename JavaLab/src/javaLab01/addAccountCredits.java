package javaLab01;

import java.time.LocalDate;

// Create an Add account credit class that inherits from transaction class
public class addAccountCredits extends transaction {

    // Attributes:
    private String msisdn = " ";

    // Constructor
    public addAccountCredits(String store_id, String transaction_id, LocalDate timestamp, String account_id, Float amount, String msisdn) {
        super();
        //super(store_id, transaction_id, timestamp, account_id, amount);
        this.msisdn = msisdn;

       /*
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = timestamp;
        this.account_id = account_id;
        this.amount = amount;
        this.company_name = company_name;
        */
    }

    public String getCompany_name() {
        return msisdn;
    }

    public void setCompany_name(String company_name) {
        this.msisdn = msisdn;
    }

    @Override
    public String toString() {
        return "Store ID: " + this.getStore_id() + "\n" +
                "Account ID: " + this.getAccount_id() + "\n" +
                "Transaction ID: " + this.getTransaction_id() + "\n" +
                "Timestamp: " + this.getTimestamp() + "\n" +
                "Amount: " + this.getAmount() + "\n" +
                "Company Name: " + this.getCompany_name() + "\n";
    }
}

