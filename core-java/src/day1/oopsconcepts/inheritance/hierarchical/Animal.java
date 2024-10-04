package day1.oopsconcepts.inheritance.hierarchical;

public class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends  Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}


class Cow extends  Animal {
    void moo() {
        System.out.println("Cow is mooing");
    }
}



class MainTest {

    public static void main(String[] args) {

        Dog leo = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        leo.eat();
        leo.bark();

        cat.eat();
        cat.meow();

        cow.eat();
        cow.moo();



    }
}