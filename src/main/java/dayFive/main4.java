package dayFive;

public class main4 {
    public static void main(String[] args) {
        System.out.println("--- Testing Car ---");
        Car myCar = new Car("Toyota", 2022);
        myCar.start();
        myCar.honk();

        System.out.println();

        System.out.println("--- Testing Bike ---");
        Bike myBike = new Bike("Schwinn", 2025);
        myBike.start();
        myBike.ringBell();
    }
}
