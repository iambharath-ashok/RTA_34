package day1.oopsconcepts.superandthiskeywords;

class Vehicle {

    protected String fuelType;

    public Vehicle() {

    }

    public Vehicle(String fuelType) {
        this.fuelType = fuelType;
    }

    public void displayFuelType() {
        System.out.println(this.fuelType);
    }

    public String toString() {
        return this.fuelType;
    }


}

class Car extends Vehicle {

    private String model;
    private int year;

    public Car() {

    }

    public Car (String model, int year) {
        this.model = model;
        this.year = year;

    }


    public void sampleMethod() {
        System.out.println(super.fuelType);
        super.displayFuelType();
        super.toString();
        System.out.println(this.model);
        this.moveFast();
    }

    public void moveFast() {
        System.out.println("Moving with 10KM speed");
    }



}



public class SuperKeywordExample {
}
