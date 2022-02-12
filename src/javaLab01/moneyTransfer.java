package javaLab01;

import java.math.BigDecimal;
import java.time.LocalDate;


// Create a Money Transfer class that inherits from Transaction class
public class moneyTransfer extends transaction {
    // Recipient attribute:
    protected String recipient;


    public moneyTransfer(int store_id, int transaction_id, LocalDate timestamp, int account_id, BigDecimal amount, String recipient){

        super(store_id, transaction_id, timestamp, account_id, amount);
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public String toString(){
        String output = "MONEY TRANSFER" +
                "\nStore ID: " + this.getStore_id() +
                "\nTransaction ID: " + this.getTransaction_id() +
                "\nTimestamp: " + this.getTimestamp() +
                "\nAccount ID: " + this.getAccount_id()+
                "\nAmount: " + this.getAmount() +
                "\nRecipient: " + this.getRecipient() +
                "\n";

        return output;
    }
}