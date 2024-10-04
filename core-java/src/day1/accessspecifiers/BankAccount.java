package day1.accessspecifiers;

public class BankAccount {
    protected int accountNumber;
    protected double accountBalance;
    protected String name;
    protected String panNumber;


    public void depositAmount(double amount) {
        accountBalance += amount;
        System.out.println("Amount Deposit Successfull");
        System.out.println("New Balance:: "+ accountBalance);
    }

}