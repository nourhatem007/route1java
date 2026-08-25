package dayFive;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        Person pe = new Person("Nour", 22, 'F');
//        pe.printData();


//        BankAccount bankAccount = new BankAccount(1000);
//        bankAccount.deposit(500);
//        bankAccount.getBalance();


//        Dog d = new Dog();
//        d.eat();
//        d.bark();


//        System.out.println("--- Testing Car ---");
//        Car myCar = new Car("Toyota", 2022);
//        myCar.start();
//        myCar.honk();
//
//        System.out.println();
//
//        System.out.println("--- Testing Bike ---");
//        Bike myBike = new Bike("Schwinn", 2025);
//        myBike.start();
//        myBike.ringBell();


//        MathUtils mathUtils = new MathUtils();
//        mathUtils.add(20,30);
//        mathUtils.add(20.2,30);


        Shape[] shapes = { new Circle(), new Square(), new Triangle() };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
