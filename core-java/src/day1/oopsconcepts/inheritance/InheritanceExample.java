package day1.oopsconcepts.inheritance;


// Animal is a parent class
class Animal {

    protected String species;

    void makeSound() {
        System.out.println("Animal makes a sound");
    }

}

//Dog is a subclass or Child Class that inherits the parent class

class Dog extends Animal {

    public Dog() {
        this.species = "Dog";
    }

    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }

}


class GolderRetriever extends  Dog {

}

class Labby extends  Dog {

}




class Lion extends Animal {

    public Lion() {
        this.species = "Lion";
    }

    @Override
    void makeSound() {
        System.out.println("Lion Roars");
    }

}





public class InheritanceExample {

    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.makeSound();


        Lion lion = new Lion();
        lion.makeSound();


        Dog dog = new Dog();
        dog.makeSound();


        Animal goldenRetriever = new Dog();
        goldenRetriever.makeSound();

        Animal africanLion = new Lion();
        africanLion.makeSound();


    }
}
