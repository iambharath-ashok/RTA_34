package day1.controlflow;

public class DoWhileLoopExample {

    public static void main(String[] args) {

        /*

        FOR LOOP

         for (int i = 1; i != 10; i ++) {
            System.out.println("i =>: "+ i);
        }


        WHILE LOOP

        int i = 1;
        while (i < 10) {

           i++;
        }
        */

        // DO WHILE LOOP
        int count = 1;

        do {
            System.out.println("Current Count :: "+ count);
            count++;
        } while (count <= 10);


    }
}
