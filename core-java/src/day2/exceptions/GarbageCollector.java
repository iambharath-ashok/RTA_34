package day2.exceptions;

public class GarbageCollector {

    public static void main(String[] args) {

        Person person = new Person("bharath");
        ///


        Person person2 = person;

        person = null;





        person2 = null;
    }
}
