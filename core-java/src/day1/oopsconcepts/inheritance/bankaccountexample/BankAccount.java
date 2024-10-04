package day1.oopsconcepts.inheritance.bankaccountexample;

public class BankAccount {

    protected String accountNumber;
    protected double balance;



    public void deposit(double amount) {
        if (amount > 0) {
            this.balance  += amount;
            System.out.println("Amount Deposit Success");
        }
    }


    public void withdraw(double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdraw Success:: "+amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void transferAmount(BankAccount toBankAccount, double amount) {
        if(amount <= this.balance) {
            this.balance -= amount;
            toBankAccount.balance += amount;
            System.out.println("Transferred "+amount + " From " + this.accountNumber + "  To " + toBankAccount.accountNumber);
        } else {
            System.out.println("Insufficient Balance in "+ this.accountNumber);
        }
    }

    // 1000 to bank account 1
    // 2500 to bank account 2
    // 5000 t0 bank account 3

    public void transferAmount(BankAccount[] toBankAccount, double toAmounts []) {
        if(toBankAccount.length != toAmounts.length) {
            throw new IllegalArgumentException("Accounts and Amounts must be same");
        }

        double totalAmount = 0;
        for (double amount : toAmounts) {
            totalAmount += amount;
        }

        if(this.balance >= totalAmount) {
            for (int i = 0; i < toBankAccount.length; i++) {
                this.balance -= toAmounts[i];
                toBankAccount[i].balance += toAmounts[i];
                System.out.println("Transferred "+toAmounts[i] + " From " + this.accountNumber + "  To " + toBankAccount[i].accountNumber);
            }
        } else {
            System.out.println("Insufficient Balance in "+ this.accountNumber);
        }
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate;



    @Override
    public void deposit(double amount) {
        this.balance += amount;
        double interestAmount = this.balance * (interestRate/100);
        this.balance += interestAmount;
    }
}



