package day5.java8.staticandefaultmethods;

public interface Vehicle {

    //abstract method
    void start();

    default void honk() {
        System.out.println("Vehicle is Honking");
    }

    default void stop() {
        System.out.println("Vehicle is stopping");
    }

    default void fuel() {
        System.out.println("Vehicle is fueling");
    }

    static void displayVehicleType() {
        System.out.println("This is a vehicle");
    }

}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void fuel() {
        System.out.println("Car is being fueled with petrol");
    }
}


class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}


class Main {

    public static void main(String[] args) {

        Vehicle.displayVehicleType();


        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Car Details:: ");
        car.start();
        car.honk();
        car.stop();
        car.fuel();


        System.out.println("Bike Details:: ");
        bike.start();;
        bike.honk();
        bike.stop();
        bike.fuel();

    }
}
