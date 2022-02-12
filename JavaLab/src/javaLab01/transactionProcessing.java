package javaLab01;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;


public class transactionProcessing {

    // Create a private Transaction ArrayList
    private static ArrayList<transaction> transactions = new ArrayList<>();
    final private static Logger logger = Logger.getLogger(transactionProcessing.class.getName());

    // Create a Main Function
    public static void main(String[] args) {

      init();
    }

    // Create an init function
    public static void init() {

        addMoneyTransfers();

        showTransactions();

    }

    private static void showTransactions() {
        for (transaction transac: transactions){
            logger.info(transac.toString());
        }
    }

// ------------- 5 MONEY TRANSFER -------------------
    private static void addMoneyTransfers() {
        moneyTransfer moneyTransfer1 = new moneyTransfer(
                1,
                00001,
                LocalDate.of(1998, 4, 21),
                01,
                new BigDecimal("1998.0421"),
                "Regina");
        transactions.add(moneyTransfer1);

        moneyTransfer moneyTransfer2 = new moneyTransfer(
                2,
                00002,
                LocalDate.of(2008, 2, 28),
                02,
                new BigDecimal("2008.0228"),
                "Liza");
        transactions.add(moneyTransfer2);

        moneyTransfer moneyTransfer3 = new moneyTransfer(
                3,
                00003,
                LocalDate.of(1971, 10, 30),
                03,
                new BigDecimal("1971.1030"),
                "Carl");
        transactions.add(moneyTransfer3);

        moneyTransfer moneyTransfer4 = new moneyTransfer(
                4,
                00004,
                LocalDate.of(1973, 9, 28),
                04,
                new BigDecimal("1973.0928"),
                "Jefferson");
        transactions.add(moneyTransfer4);

        moneyTransfer moneyTransfer5 = new moneyTransfer(
                5,
                00005,
                LocalDate.of(2022, 2, 12),
                05,
                new BigDecimal("2022.0212"),
                "Juan");
        transactions.add(moneyTransfer5);
    }

    // ------------- END OF 5 MONEY TRANSFER -------------------
}