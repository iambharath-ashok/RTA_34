package day1.oopsconcepts.inheritance;

import java.time.LocalDateTime;

public class MethodOverloadingExample {

    public static void main(String[] args) {

    }
}


class BankAccount {

    private Integer accountNumber;
    private double accountBalance;


    //Method Overloading
    //What is Overloading?
    //

    public void transferAmount(int transferAmount, BankAccount account) {

    }


    public void transferAmount(double[] transferAmount, BankAccount[] account) {

    }


    public void transferAmount(BankAccount[] account,  double[] transferAmount) {

    }

    public int transferAmount(BankAccount[] account, BankAccount bankAccount, int transferAmount) {
        return 0;
    }

    public String transferAmount(int transferAmount, LocalDateTime time) {
        return "";
    }
}
