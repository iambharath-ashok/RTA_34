package day1.oopsconcepts.encapsulation;

public class EncapsulationExample {
}

// Class Person is a example for Encapsulation
class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //Authentication logic
        //Whether use is logged in
        //Authorization logic
        //Any validation

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}