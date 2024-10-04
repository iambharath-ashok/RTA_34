package day1.oopsconcepts.abstraction.interfaces;

public interface Animal {

    void makeSound();

}


class Dragon implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dragon is Growling");
    }
}

class Lion implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Lion Roars");
    }
}


class MainTest {

    public static void main(String[] args) {
        Animal dragon = new Dragon();
        dragon.makeSound();

        Animal lion = new Lion();
        lion.makeSound();
    }
}