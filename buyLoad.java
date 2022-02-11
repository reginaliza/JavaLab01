package javaLab01;

import java.time.LocalDate;

// Create Buy Load class that inherits from Transaction class
public class buyLoad extends transaction {

    //Attributes: msisdn / mobile number
    private String mobile_number = " ";

    //Constructor
    public buyLoad(String store_id, String transaction_id, LocalDate timestamp, String account_id, Float amount, String recipient) {
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = timestamp;
        this.account_id = account_id;
        this.amount = amount;
        this.mobile_number = mobile_number;
    }
}