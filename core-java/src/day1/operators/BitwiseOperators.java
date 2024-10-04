package day1.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int p = 5;  // 0101 in binary
        int q = 3;  // 0011 in binary

        System.out.println("p & q: " + (p & q)); // Bitwise AND
        System.out.println("p | q: " + (p | q)); // Bitwise OR
        System.out.println("p ^ q: " + (p ^ q)); // Bitwise XOR
        System.out.println("~p: " + (~p));       // Bitwise NOT



        //XOR
        /*
        1 ^ 1 = 0
        0 ^ 0 = 0
        1 ^ 0 = 1
        0 ^ 1 = 1

        p = 5 ===> 0 1 0 1
        q = 3 ===> 0 0 1 1
                  ^
        -------------------
        P ^ q=6 <==0 1 1 0
        -------------------
        */

        //Bitwise NOT operator
        /*
           p = 5; 0 1 0 1

           ~p = ; 1 0 1 0
           -----------------
           1 * 2 ^ 3 ====>  1 * 8 ====> 8
           0 * 2 ^ 2 ====>  0 * 4 ====> 0
           1 * 2 ^ 1 ====>  1 * 2 ====> 2
           0 * 2 ^ 0 ====>  0 * 1 ====> 0
           ---------------------------------
           8 + 0 + 2 + 0 = 10
           ----------------------------------

        */



        //LogicalOperator
        // AND &&
        //|| OR
        // !
    }
}
