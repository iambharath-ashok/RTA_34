package day5.java8.lambdaexpressions;

public class AnonymousRunnable {

    public static void main(String[] args) {

        //Before java 8
        //Anonymous Object
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello Runnable from Anonymous Object");
            }
        };


        //After Java 8 using Lambda Expression
        //Anonymous Function
        Runnable runnableJava8 = () -> {
            System.out.println("hello Runnable from Anonymous function");
        };



        Runnable run =  ( ) -> {
            System.out.println("hello Runnable from Anonymous function");
        };


        Thread t = new Thread(run);
        t.start();
        /*

        //Syntax
        paramters -> lambda body
        () -> {}

        */
    }
}
