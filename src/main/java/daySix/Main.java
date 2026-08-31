package daySix;

public class Main {
    public static void main(String[] args) {

//        Shape s1 = new Circle();
//        Shape s2 = new Square();
//
//        s1.draw();
//        s2.draw();
//        s1.info();
//        s2.info();

//        Vehicle v1 = new Bike();
//        Vehicle v2 = new Car();
//
//        v1.start();
//        v2.start();
//        v1.stop();


//        Animal[] animals = { new Cat(), new Dog(), new Cow() };
//
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }


        Calculator calculator = new Calculator();
        calculator.add(1,2,3);
        calculator.add(4,5.5);
        int x = calculator.add(6,7);
        System.out.println(x);
    }
}
