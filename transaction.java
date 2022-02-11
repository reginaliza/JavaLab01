package javaLab01;

import java.time.LocalDate;

public class transaction {

    // Create a transaction class with the ff attributes
    protected String store_id = " ";
    protected String transaction_id = " ";
    protected LocalDate timestamp;
    protected String  account_id = " ";
    protected Float amount;

    public transaction() {

    }

    public static void add(moneyTransfer moneyTransfer) {
    }

    public transaction(String store_id, String transaction_id, String account_id, Float amount) {
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = LocalDate.now();
        this.account_id = account_id;
        this.amount = 100f;
    }

    public String getStore_id() {
        return store_id;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public String getAccount_id() {
        return account_id;
    }

    public Float getAmount() {
        return amount;
    }
}
