package dayFive;

public class Person {
    String name;
    int age;
    char gender;

    Person(){
        System.out.println("I'm the default constructor");
    }

    Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printData(){
        System.out.println("Hello my name is " + name + " I'm " + age + " and my gender is " + gender);
    }
}
