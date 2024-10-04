package day1.oopsconcepts.constructorchaining;


abstract class Vehicle {

    protected String fuelType;

    public Vehicle(String fuelType) {
        this.fuelType = fuelType;
        System.out.println("Vehicle Constructor called. Fuel type: "+ fuelType);
    }

}


public class Car extends Vehicle {

    private static int counter = 100;

    //0

    private String model;
    private int year;
    private String color;

    //Zero argument Constructors
    public Car() {
        this("Unknown", 2020);
        System.out.println("Default Constructor Called");
    }

    //Constructor with 2 arguments
    public Car(String model, int year) {
        this(model, year, "Black");
        this.model = model;
        this.year = year;
        System.out.println("2 argument Constructor with model and year called");

    }

    //Constructor with 3  arguments
    public Car(String model, int year, String color) {
        this(model, year, color, "petrol");
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("3 argument Constructor with model and year and color called");

    }

    //Constructor with 4  arguments
    public Car(String model, int year, String color, String fuelType) {
        super(fuelType); // Calls the Parent Class Constructor
        this.model = model;
        this.year = year;
        this.color = color;
        System.out.println("4 argument Constructor with model and year and color called");

    }



    public void displayInfo() {
        System.out.println("Model: "+ this.model + " Year: "+ this.year + " Color: "+ this.color + " FuelType: "+ super.fuelType);
    }

}

class Main {


    public static void main(String[] args) {

        //Creating car object using default Constructor
        Car car1 = new Car();

        car1.displayInfo();

        Car car2 = new Car("Tesla Model S", 2023);
        car2.displayInfo();

        Car car3 = new Car("Ford Mustang", 2023, "Red");
        car3.displayInfo();

    }
}
