class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class Bike extends Vehicle {

    void run() {
        System.out.println("Bike is running fast & furious!");
    }

    public static void main(String[] args) {
        Vehicle b = new Bike();
        b.run();
    }
}
