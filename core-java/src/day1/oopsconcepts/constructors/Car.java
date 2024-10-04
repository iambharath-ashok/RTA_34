package day1.oopsconcepts.constructors;


 class Vehicle {

}


public class Car extends Vehicle {

    private String model;
    private int year;


    // Zero argument constructor
    public Car() {
        model = "unknown";
        year = 2020;
    }


    // Parameterrized Constructors
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }


    public void display () {
        System.out.println("model:" + model +", year: "+ year);
    }


    public static void main(String[] args) {
        Car car = new Car();
        Car abcCar = new Car("abc", 2023);
    }

}
