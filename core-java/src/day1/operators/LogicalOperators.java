package day1.operators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        if( a && b ) {
            System.out.println("a &&  b " + (a && b)); // Logical AND
        }

        if (a || b) {
            System.out.println("a ||  b " + (a || b)); // Logical OR
        }

        System.out.println("!a "+ (!a));//Logical NOT


    }
}
