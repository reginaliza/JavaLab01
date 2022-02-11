package javaLab01;

import java.time.LocalDate;

// Create a Money Transfer class that inherits from Transaction class
public class moneyTransfer extends transaction {
    // Recipient attribute:
    private String recipient = " ";

    // Create constructors
    public moneyTransfer(String store_id, String transaction_id, LocalDate timestamp, String account_id, Float amount, String recipient){
        super();
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = timestamp;
        this.account_id = account_id;
        this.amount = amount;
        this.recipient = recipient;
    }

    public String getRecipient(){
        return recipient;
    }


}