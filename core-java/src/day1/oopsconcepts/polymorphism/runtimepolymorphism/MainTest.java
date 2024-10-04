package day1.oopsconcepts.polymorphism.runtimepolymorphism;

public class MainTest {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.makeSound();

        animal = new Lion();

        animal.makeSound();





    }
}
