package day1.controlflow;

public class AdvancedForLoop {


    public static void main(String[] args) {

        String name = "Ageon The Conquerer";

        for (char ch : name.toCharArray()) {
            System.out.println("Characeter ==> "+ ch);
        }


        String [] targaryan = {"Ageon", "Dany", "Daemon", "Ameond", "Viserys"};

        for(String prince : targaryan) {
            System.out.println(prince);
        }


        int [] integerArray = {1,2,3,4,5,9,10};

        for (int number : integerArray) {
            System.out.println("Number:: "+ number);
        }



        /*
        Syntax

            for (EACH ELEMENT FROM DATA_SOURCE : DATA_SOURCE) {

            }



        */

    }
}

