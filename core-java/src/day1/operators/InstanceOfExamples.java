package day1.operators;

public class InstanceOfExamples {

    public static void main(String[] args) {

        Object bharath = new Person();//line 10

        Object leo = new Lion();




        int personAge = 10;

        boolean isPerson = bharath instanceof Student;

        System.out.println("Is Person type:: "+ isPerson);

        //person  or student
        //10 Millions of line of code
        if(bharath instanceof Student) {

            // Apply student discount
        } else {

            // Apply other discounts

        }


        if(bharath == leo) {
            System.out.println("is true:: "+ true);
        } else {
            System.out.println("is true:: "+ false);
        }


        boolean isLion = bharath == leo ?  true : false;

    }
}


class Person {

    private String name;
    private int age;

    private String address;

}

class Student {

    private String studentName;
    private String className;



}


class Lion {

    private String name;


}