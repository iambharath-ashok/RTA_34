package day1.oopsconcepts.polymorphism;

public class CompileTimePolymorphismExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10, 20);
        calculator.add(30, 10, 40);
        calculator.add(33.33, 55.88);

    }
}
