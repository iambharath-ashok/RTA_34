package day1.oopsconcepts.inheritance;

public class MethodOverridingExample {

    public static void main(String[] args) {

    }
}

class BankAccountForMethodOverriding {

    protected String accountNumber;
    protected double balance;


    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }
}


class SavingAccountForMO extends BankAccountForMethodOverriding {

    private double interestRate;

    @Override
    public void deposit(double amount) {

    }

}


class CurrentAccountForMO extends BankAccountForMethodOverriding {

    private double overdraftLimit;

    @Override
    public void deposit(double amount) {

    }

}
