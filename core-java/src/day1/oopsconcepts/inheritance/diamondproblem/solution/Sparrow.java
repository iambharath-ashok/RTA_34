package day1.oopsconcepts.inheritance.diamondproblem.solution;

public class Sparrow implements Animal, Bird {

    @Override
    public void eat() {
        System.out.println("Sparrow is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}
