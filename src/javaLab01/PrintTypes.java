package javaLab01;

import java.util.Scanner;

public class PrintTypes {

        // Create a Show Transactions on Type parameters
        
        public static void main(String[] args) {
            System.out.println("\n1. Money Transfer" + "\n2. Bills Payment" +
                    "\n3. Buy Load" + "\n4. Add Account Credits" + "\n5. Add Game Credits" + "\n\nPick a Transaction: ");
            Scanner type = new Scanner(System.in);
            int choice = type.nextInt();


            switch (choice) {
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
