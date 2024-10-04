package day1.oopsconcepts.abstraction.abstractclass;

//Abstract class is a class that can not be instantiated - we can't create the object of Abstract
//Abstract class may contain the abstract method
//Abstract class must be implmented by the Sub-class


public abstract class Animal {

    private String animalName;
    protected String gender;


    //Abstract method (Doesn't have method body)
    abstract void makeSound();


    //Regular or Concrete Method
    //Concrete method is a method that has method body
    public void sleep() {
        System.out.println("This animal sleeps");
    }
}



class Lion extends Animal {



    @Override
    public void makeSound() {
        System.out.println("Lion Roars");
    }

}

class Dragon extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dragon Growling");
    }

}


class MainTest {

    public static void main(String[] args) {

        //Animal animal = new Animal(); // We cant instanstiate the object of Abstract class

        Animal dragon = new Dragon();

        dragon.sleep();
        dragon.makeSound();


        Animal lion = new Lion();
        lion.makeSound();
        lion.sleep();
    }


}