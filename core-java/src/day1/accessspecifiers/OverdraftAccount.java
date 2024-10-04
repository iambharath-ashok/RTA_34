package day1.accessspecifiers;

class OverdraftAccount extends BankAccount {
    
    private double overdraftLimit;

    public void depositAmount(double amount) {
        overdraftLimit += amount;
    }

}