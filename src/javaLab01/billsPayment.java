package javaLab01;

import java.math.BigDecimal;
import java.time.LocalDate;

// Create a bills class that inherits from Transaction class
public class billsPayment extends transaction {
    // Attributes: company_name, bills_charge
    private String company_name;
    private BigDecimal bills_charge;

    // Create Constructors
    public billsPayment(int store_id, int transaction_id, LocalDate timestamp, int account_id, BigDecimal amount, String company_name, BigDecimal bills_charge) {
        super(store_id, transaction_id, timestamp, account_id, amount);
        this.company_name = company_name;
        this.bills_charge = bills_charge;
    }

    public String getCompany_name() {
        return company_name;
    }

    public BigDecimal getBills_charge() {
        return bills_charge;
    }

    @Override
    public String toString(){
        String output = "BILLS PAYMENT" +
                "\nStore ID: " + this.getStore_id() +
                "\nTransaction ID: " + this.getTransaction_id() +
                "\nTimestamp: " + this.getTimestamp() +
                "\nAccount ID: " + this.getAccount_id()+
                "\nAmount: " + this.getAmount() +
                "\nRecipient: " + this.getCompany_name() +
                "\nBills Charge: " + this.getBills_charge() +
                "\n";

        return output;
    }
}
