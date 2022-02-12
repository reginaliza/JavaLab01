package javaLab01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintTypes extends transactionProcessing {

        // Create a private Transaction ArrayList
        private static ArrayList<transaction> transactions = new ArrayList<>();
        final private static Logger logger = Logger.getLogger(transactionProcessing.class.getName());

        public static void main(String[] args) {
            System.out.println("\n1. Money Transfer" + "\n2. Bills Payment" +
                    "\n3. Buy Load" + "\n4. Add Account Credits" + "\n5. Add Game Credits" + "\n\nPick a Transaction: ");
            Scanner type = new Scanner(System.in);
            int choice = type.nextInt();
            transactionProcessing tpObj = new transactionProcessing();


            switch (choice) {
                case 1:
                    tpObj.addMoneyTransfer();
                case 2:
                    tpObj.addBillsPayment();
                case 3:
                    tpObj.addBuyLoad();
                case 4:
                    tpObj.addAddAccountCredits();
                case 5:
                    tpObj.addAddGameCredits();
            }
        }

    }
