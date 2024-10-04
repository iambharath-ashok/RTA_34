package day1.oopsconcepts.interfaces;



public interface Vehicle {

    int MAX_SPEED = 120;
    String FUEL_TYPE_GASOLINE= "Gasoline";
    String FUEL_TYPE_ELECTRIC= "Electric";

    void start();
    void stop();
    void fly();

}

class Car implements Vehicle {

    public String fuelType;

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void fly() {
        System.out.println("Not interested in flying");
    }

}


class Tesla extends  Car {

    public Tesla() {
        this.fuelType = Vehicle.FUEL_TYPE_ELECTRIC;
    }
}

class Truck implements Vehicle {

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }

    @Override
    public void fly() {
        System.out.println("Not interested in flying");
    }
}

class Aircraft implements  Vehicle {

    @Override
    public void start() {
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopping");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}


class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle truck = new Truck();
        truck.start();
        truck.stop();

        Vehicle aircraft = new Aircraft();
        aircraft.start();
        aircraft.stop();

        Vehicle tesla = new Tesla();
        System.out.println(((Tesla)tesla).fuelType);

    }
}