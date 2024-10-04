package day1.oopsconcepts.constructors;

public class Person {

    String name;

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

}

class Student {

    String name;
    int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {}


}


class Main {

    public static void main(String[] args) {
       final Person person1 = new Person();
        Person person2 = new Person();

       Person person3 = new Person("Bharath");

       Student student1 = new Student();

    }
}
