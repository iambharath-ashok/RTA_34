package day1.oopsconcepts.polymorphism.runtimepolymorphism;

public class Animal {

    void makeSound() {
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends  Animal {

    void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Lion extends  Animal {
    void makeSound() {
        System.out.println("Lion Roars");
    }
}


class Cat extends  Animal {
    void makeSound() {
        System.out.println("Cat Meos");
    }
}


