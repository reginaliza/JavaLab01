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
            int pick = type.nextInt();


            switch (pick) {
                case 1: {
                    transactionProcessing mf = new transactionProcessing();
                    mf.addMoneyTransfer();
                    return;
                }
                case 2: {
                    transactionProcessing bp = new transactionProcessing();
                    bp.addBillsPayment();
                    return;
                }
                case 3: {
                    transactionProcessing bl = new transactionProcessing();
                    bl.addBuyLoad();
                    return;
                }
                case 4: {
                    transactionProcessing aac = new transactionProcessing();
                    aac.addAddAccountCredits();
                    return;
                }
                case 5: {
                    transactionProcessing agc = new transactionProcessing();
                    agc.addAddGameCredits();
                    return;
                }
            }
        }

    }
