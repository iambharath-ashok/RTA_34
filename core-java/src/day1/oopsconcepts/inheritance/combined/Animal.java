package day1.oopsconcepts.inheritance.combined;

public interface Animal {

    void eat();
}

interface African {

}

interface Asian {

}

class Dog {

   static String name;

    void bark() {
        System.out.println("Dog is barking");
    }

}

class Elephant implements Animal,African, Asian {

    @Override
    public void eat() {

    }
}

class GolderRetriever extends Dog implements Animal,African {

    @Override
    public void eat() {

    }
}