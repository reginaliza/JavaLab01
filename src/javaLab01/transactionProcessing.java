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

        addMoneyTransfer();
        addBillsPayment();
        addBuyLoad();
        addAddAccountCredits();
        addAddGameCredits();

        showTransactions();

    }

    private static void showTransactions() {
        for (transaction transac: transactions){
            logger.info(transac.toString());
        }
    }

// ------------- 5 MONEY TRANSFER -------------------
    private static void addMoneyTransfer() {
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
    } // ------------- END OF 5 MONEY TRANSFER -------------------

// ------------ 3 BILLS PAYMENT ----------
    private static void addBillsPayment() {

        billsPayment billsPayment1 = new billsPayment(
                1,
                00001,
                LocalDate.of(1998, 4, 21),
                01,
                new BigDecimal("1998.0421"),
                "GCash",
                new BigDecimal("123"));
        transactions.add(billsPayment1);

        billsPayment billsPayment2 = new billsPayment(
                2,
                00002,
                LocalDate.of(1998, 1, 21),
                02,
                new BigDecimal("1998.0121"),
                "Globe",
                new BigDecimal("456"));
        transactions.add(billsPayment2);

        billsPayment billsPayment3 = new billsPayment(
                3,
                00003,
                LocalDate.of(2021, 12, 21),
                01,
                new BigDecimal("2021.1221"),
                "Apper",
                new BigDecimal("789"));
        transactions.add(billsPayment3);
    }    // ------- END OF 3 BILLS PAYMENT ---------------

// -------------- 5 BUY LOAD ------------
    private static void addBuyLoad() {
        buyLoad buyLoad1 = new buyLoad(
                1,
                00001,
                LocalDate.of(1998, 4, 21),
                01,
                new BigDecimal("10.00"),
                "09202819125");
        transactions.add(buyLoad1);

        buyLoad buyLoad2 = new buyLoad(
                2,
                00002,
                LocalDate.of(2022, 10, 9),
                02,
                new BigDecimal("20.00"),
                "09175124658");
        transactions.add(buyLoad2);

        buyLoad buyLoad3 = new buyLoad(
                3,
                00003,
                LocalDate.of(1997, 12, 3),
                03,
                new BigDecimal("30.00"),
                "09172687159");
        transactions.add(buyLoad3);

        buyLoad buyLoad4 = new buyLoad(
                4,
                00004,
                LocalDate.of(2019, 3, 15),
                04,
                new BigDecimal("40.00"),
                "09177896541");
        transactions.add(buyLoad4);

        buyLoad buyLoad5 = new buyLoad(
                5,
                00005,
                LocalDate.of(2018, 3, 18),
                05,
                new BigDecimal("50.00"),
                "09173214569");
        transactions.add(buyLoad5);
    } // ------- END OF 5 BUY LOAD ------------

// ---------- 2 ACCOUNT CREDITS ----------
    private static void addAddAccountCredits() {
        addAccountCredits addAccountCredits1 = new addAccountCredits(
                1,
                00001,
                LocalDate.of(1998, 4, 21),
                01,
                new BigDecimal("50.00"),
                "09202819125");
        transactions.add(addAccountCredits1);

        addAccountCredits addAccountCredits2 = new addAccountCredits(
                2,
                00002,
                LocalDate.of(2008, 2, 28),
                02,
                new BigDecimal("100.00"),
                "0917896542");
        transactions.add(addAccountCredits2);
    } // ------- END OF 2 ACCOUNT CREDITS ------

    // ------------- 5 GAME CREDITS -------
    private static void addAddGameCredits() {
        addGameCredits addGameCredits1 = new addGameCredits(
                1,
                00001,
                LocalDate.of(1998, 4, 21),
                01,
                new BigDecimal("1000"),
                "Genshin Impact");
        transactions.add(addGameCredits1);

        addGameCredits addGameCredits2 = new addGameCredits(
                2,
                00002,
                LocalDate.of(2008, 2, 28),
                02,
                new BigDecimal("2000"),
                "Valorant");
        transactions.add(addGameCredits2);

        addGameCredits addGameCredits3 = new addGameCredits(
                3,
                00003,
                LocalDate.of(1971, 10, 30),
                03,
                new BigDecimal("3000"),
                "PUBG");
        transactions.add(addGameCredits3);

        addGameCredits addGameCredits4 = new addGameCredits(
                4,
                00004,
                LocalDate.of(1973, 9, 28),
                04,
                new BigDecimal("4000"),
                "DOTA");
        transactions.add(addGameCredits4);

        addGameCredits addGameCredits5 = new addGameCredits(
                5,
                00005,
                LocalDate.of(2022, 2, 12),
                05,
                new BigDecimal("5000"),
                "Mobile Legends");
        transactions.add(addGameCredits5);
    }

}