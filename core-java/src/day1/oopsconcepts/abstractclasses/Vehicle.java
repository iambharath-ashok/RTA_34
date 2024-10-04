package day1.oopsconcepts.abstractclasses;

public abstract class Vehicle {

    //Below 3 properties are Constants
   public static final int MAX_SPEED = 120;
   private static final String FUEL_TYPE_GASOLINE= "Gasoline";
   protected static String FUEL_TYPE_ELECTRIC= "Electric";


   //Below are Instance Properties
   private String fuelType;
   protected String vehicleManufacturedYear;

    // Constructor Overloading
   public Vehicle() {
       super();
   }

   public Vehicle(String fuelType, String vehicleManufacturedYear) {
       this();
       this.fuelType = fuelType;
       this.vehicleManufacturedYear = vehicleManufacturedYear;
   }

    // Abstract Methods
    abstract void start();
    abstract void stop();

    //Concrete Methods
    public void fuel() {
        System.out.println("Vehicle is refueling");
    }

    void fly() {
        System.out.println("Default dummy flying functionality");
    }

}
 class Car extends Vehicle {

    public Car(String fuelType, String manFacYear) {
        super(fuelType, manFacYear);
    }

     @Override
     void start() {
         System.out.println("Car is starting");
     }

     @Override
     void stop() {
         System.out.println("Car is stopping");
     }
 }

 class Truck extends Vehicle {

     @Override
     void start() {
         System.out.println("Truck is starting");
     }

     @Override
     void stop() {
         System.out.println("Truck is stopping");
     }
 }

 class Helicopter extends  Vehicle {

     @Override
     void start() {
         System.out.println("Helicopter is starting");
     }

     @Override
     void stop() {
         System.out.println("Helicopter is stopping");
     }

     @Override
     void fly() {
         System.out.println("I'm a Helicopter and I can fly");
     }
 }

 class Main {
     public static void main(String[] args) {

         Vehicle car = new Car("Disel", "1947");
         car.start();
         car.stop();

         Vehicle truck = new Truck();
         truck.start();
         truck.stop();
     }
 }