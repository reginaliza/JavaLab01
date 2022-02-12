package javaLab01;

import java.math.BigDecimal;
import java.time.LocalDate;

// Create an Add account credit class that inherits from transaction class
public class addAccountCredits extends transaction {
    // Attributes:
    private String msisdn = " ";

    //Constructor
    public addAccountCredits(int store_id, int transaction_id, LocalDate timestamp, int account_id, BigDecimal amount, String msisdn) {
        super(store_id, transaction_id, timestamp, account_id, amount);
        this.msisdn = msisdn;
    }

    public String getMsisdn() {
        return msisdn;
    }

    @Override
    public String toString(){
        String output = "ADD ACCOUNT CREDITS" +
                "\nStore ID: " + this.getStore_id() +
                "\nTransaction ID: " + this.getTransaction_id() +
                "\nTimestamp: " + this.getTimestamp() +
                "\nAccount ID: " + this.getAccount_id()+
                "\nAmount: " + this.getAmount() +
                "\nMobile Number: " + this.getMsisdn() +
                "\n";

        return output;
    }
}

