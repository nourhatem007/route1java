package dayFive;

public class Dog extends Animal {

    public void bark () {
        System.out.println("This animal barks");
    }

    @Override
    public void eat() {
        System.out.println("This dog eats bones");
    }

}
