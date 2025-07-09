// User Class (Base class for Driver & Passenger)
//Step-3
class User {
    String name;
    Location currentLocation;

    public User(String name, Location location) {
        this.name = name;
        this.currentLocation = location;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + currentLocation.city);
    }
}

// Subclasses (Inheritance) - Driver Class (Child class of User)
// Step-4
class Driver extends User {
    Car car; //This uses the Car class

    public Driver(String name, Location location, Car car) {
        super(name, location);
        this.car = car;
    }

    void showCar() {
        System.out.println(name + "'s Car: " + car.model);
    }
}

//Step - 5
class Passenger extends User {
    public Passenger(String name, Location location) {
        super(name, location);
    }
}

// ========== Supporting Classes (Composition) ==========
//Step-1

class Location {
    String city;

    public Location(String city) {
        this.city = city;
    }
}

//Step-2
class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }
}

//Main Service Class using Composition
//Step-6
class Trip { // Represents a ride from one location to another
    Driver driver;
    Passenger passenger;
    Location pickup;
    Location drop;

    public Trip(Driver driver, Passenger passenger, Location pickup, Location drop) {
        this.driver = driver;
        this.passenger = passenger;
        this.pickup = pickup;
        this.drop = drop;
    }

    void startTrip() {
        System.out.println("Trip started with driver " + driver.name + " and passenger " + passenger.name);
        System.out.println("From " + pickup.city + " to " + drop.city);
    }
}

public class Main {
    public static void main(String[] args) {
        Location loc1 = new Location("Hyderabad");
        Location loc2 = new Location("Bangalore");

        Car car = new Car("Toyota Innova");
        Driver driver = new Driver("Amit", loc1, car);
        Passenger passenger = new Passenger("Rahul", loc2);

        Trip trip = new Trip(driver, passenger, loc1, loc2);

        driver.displayInfo();
        driver.showCar();
        passenger.displayInfo();
        trip.startTrip();
    }
}
