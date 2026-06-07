package dayOne;

public class FirstJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");

        /* String
        String firstNaame = "Marwa";
        String x = "2+2";
        System.out.println(x);

        String X = "10";
        String Y = "15";
        System.out.println(X+Y);

        // int
        int x = 1;
        int y = 2;
        System.out.println(x+y);
        System.out.println("Sum of x and y is: "+(x+y));

        // float
        float f =1.07f;
        System.out.println(f);

        // double
        double d =55.38;
        System.out.println(d);
        double l =55;
        System.out.println(l);

        */
        String firstName = "Nour";
        String lastName = "Sharawy";
        String fullName = firstName + " " + lastName;
        int age = 22;
        String dOB = "12/10/2004";
        String job = "Testing Engineer";
        double income = 23.5;
        double tax = income * 0.15;

        System.out.println("Hello my name is " + fullName +
                "\nmy age is " + age +
                "\nmy job is " + job +
                "\nmy income is " + (income - tax));

        System.out.printf("Hello my full name is %s%n"
        + "my age is %d%n"
        + "my job is %s%n"
        + "my income is %f%n",
                fullName, age, job, income);

    }
}
