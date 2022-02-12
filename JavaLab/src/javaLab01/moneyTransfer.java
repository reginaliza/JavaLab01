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

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString(){
        String output = "MONEY TRANSFER" +
                "Store ID: " + this.getStore_id() +
                "Transaction ID: " + this.getTransaction_id() +
                "Timestamp: " + this.getTimestamp() +
                "Account ID" + this.getAccount_id()+
                "Amount: " + this.getAmount() +
                "Recipient: " + this.getRecipient();

        return output;

    }
}