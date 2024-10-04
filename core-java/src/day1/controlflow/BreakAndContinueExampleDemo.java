package day1.controlflow;

import java.util.ArrayList;
import java.util.List;

public class BreakAndContinueExampleDemo {

    public static void main(String[] args) {


        List<Transaction> transactionList = new ArrayList<>();

        transactionList.add(new Transaction("T1", 300, "valid"));
        transactionList.add(new Transaction("T2", 100, "invalid"));
        transactionList.add(new Transaction("T3", 600, "valid"));
        transactionList.add(new Transaction("T4", 700, "invalid"));
        transactionList.add(new Transaction("T5", 9000, "fraudulent"));
        transactionList.add(new Transaction("T6", 250, "valid"));
        transactionList.add(new Transaction("T7", 450, "invalid"));
        transactionList.add(new Transaction("T8", 500, "valid"));


        for (Transaction transaction : transactionList) {
            if ("invalid".equalsIgnoreCase(transaction.getStatus())) {
                System.out.println("skipping invalid transaction: "+ transaction.getId());
                continue;
            }

            if ("fraudulent".equalsIgnoreCase(transaction.getStatus())) {
                System.out.println("Fraudulent transaction detected: "+ transaction.getId());
                System.out.println("Stopping processing of transactions.");
                break;
            }

            //Process the valid transactions
            System.out.println("Processing transactions: "+ transaction.getId() + " for amount : "+ transaction.getAmount());
            // Additional processing logic here, e.g. update account balance etc.
        }


        System.out.println("All transactions are processed completely.");
        System.out.println("Outside of For Loop");

    }
}


class Transaction {

    private String id;
    private double amount;
    private String status; //valid, invalid, fraudulent

    public Transaction(String id, double amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }


    // Accessors and Mutators
    // Getters and Setters are used to access and modify the private properties of another class but in a controlled way.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}