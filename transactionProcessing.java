package javaLab01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class transactionProcessing {

    // Create a private Transaction ArrayList
    private ArrayList<transaction> transactions = new ArrayList<transaction>();
    final private static Logger logger = Logger.getLogger(transactionProcessing.class.getName());


    // Create a Main Function
    public static void main(String[] args) {
        transactionProcessing tp = transactionProcessing.init();
    }

    // Create an init function
    public static transactionProcessing init() {
        transactionProcessing tp = new transactionProcessing();

        // Add 5 Money Transfer objects in the Transaction ArrayList
        int mt = 0;
        if (mt < 5) {
            moneyTransfer moneyTransfer = new moneyTransfer(
                    "Store: " + mt++,
                    "Transaction ID: " + mt++,
                    LocalDate.now(),
                    "Account ID: " + mt++,
                    100f,
                    "Recipient: " + mt++);
            transaction.add(moneyTransfer);
        }
        return tp;
    }
}