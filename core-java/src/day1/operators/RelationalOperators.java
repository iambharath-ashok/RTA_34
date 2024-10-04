package day1.operators;

public class RelationalOperators {

    public static int globalVariable = 100;


    public static void main(String[] args) {
        int x = 10;
        int y = 5;


        System.out.println("x == y: " + (x == y));       // Equal to
        System.out.println("x != y: " + (x != y));       // Not equal to
        System.out.println("x > y: " + (x > y));         // Greater than
        System.out.println("x < y: " + (x < y));         // Less than
        System.out.println("x >= y: " + (x >= y));       // Greater than or equal to
        System.out.println("x <= y: " + (x <= y));       // Less than or equal to

        RelationalOperators relationalOperators = new RelationalOperators();
        relationalOperators.withdraw(100);

    }

    public void withdraw(int amount) {
        int customerAccountBalance = 5;

        if (amount > customerAccountBalance) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Withdraw Success");;
        }
    }

}
