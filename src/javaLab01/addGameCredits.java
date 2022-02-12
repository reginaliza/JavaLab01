package javaLab01;

import java.math.BigDecimal;
import java.time.LocalDate;

public class addGameCredits extends transaction{
    // Attributes: company_name
    private String company_name;

    // Create Constructors
    public addGameCredits(int store_id, int transaction_id, LocalDate timestamp, int account_id, BigDecimal amount, String company_name) {
        super(store_id, transaction_id, timestamp, account_id, amount);
        this.company_name = company_name;

    }

    public String getCompany_name() {
        return company_name;
    }

    @Override
    public String toString(){
        String output = "ADD GAME CREDITS" +
                "\nStore ID: " + this.getStore_id() +
                "\nTransaction ID: " + this.getTransaction_id() +
                "\nTimestamp: " + this.getTimestamp() +
                "\nAccount ID: " + this.getAccount_id()+
                "\nAmount: " + this.getAmount() +
                "\nCompany Name: " + this.getCompany_name() +
                "\n";

        return output;
    }
}
