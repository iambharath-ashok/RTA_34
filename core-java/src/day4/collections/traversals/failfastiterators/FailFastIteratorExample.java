package day4.collections.traversals.failfastiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorExample {

    public static void main(String[] args) throws InterruptedException {
        List<String> transactionsList = new ArrayList<>();

        transactionsList.add("Transaction #1");
        transactionsList.add("Transaction #2");
        transactionsList.add("Transaction #3");
        transactionsList.add("Transaction #4");

        Iterator<String> transactionsIterator = transactionsList.iterator();

        new Thread(() -> {
            System.out.println("Thread Name:: "+ Thread.currentThread().getName());
            System.out.println("Transactions:: "+ transactionsList);
            transactionsList.add("Transaction #5");
            transactionsList.remove("Transaction #2");
        }).start();
        Thread.sleep(1000);

        while (transactionsIterator.hasNext()) {
            String transaction = transactionsIterator.next();
            System.out.println("Transaction :: "+transaction);

        }
    }
}
