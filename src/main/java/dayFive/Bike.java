package dayFive;

public class Bike extends Vehicle {
    public Bike(String brand, int year) {
        super(brand, year);
    }

    public void ringBell() {
        System.out.println(brand + " says: Ring ring!");
    }
}

