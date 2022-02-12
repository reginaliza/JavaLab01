package javaLab01;

import java.math.BigDecimal;
import java.time.LocalDate;

// Create Buy Load class that inherits from Transaction class
public class buyLoad extends transaction {

    //Attributes: msisdn / mobile number
    private String msisdn = " ";

    //Constructor
    public buyLoad(int store_id, int transaction_id, LocalDate timestamp, int account_id, BigDecimal amount, String msisdn) {
        super();
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = timestamp;
        this.account_id = account_id;
        this.amount = amount;
        this.msisdn = msisdn;
    }
}