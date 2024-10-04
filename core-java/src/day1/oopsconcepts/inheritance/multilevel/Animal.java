package day1.oopsconcepts.inheritance.multilevel;

public class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

//1st level inheritance
class Dog extends  Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}


// 2nd level Inheritance
class GoldenRetriever extends Dog {

    void jump() {
        System.out.println("GoldenRetriever is Jumping");
    }
}


class Main {
    public static void main(String[] args) {

        GoldenRetriever leo = new GoldenRetriever();

        leo.eat();//Behaviour from Animal Class
        leo.bark();//Behaviour from Dog Class
        leo.jump();//Behaviour from GoldenRetriever Class
    }
}

