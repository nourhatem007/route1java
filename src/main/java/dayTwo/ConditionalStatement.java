package dayTwo;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 /*        System.out.println("Enter your age!");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        String status = age >= 18 ? "good to vote" : "not good to vote";
        System.out.println("Your status is " + status);

        if (age >= 18) {
            System.out.println("You are good to vote");}
        else {
            System.out.println("You are not good to vote");}
      */

        System.out.println("Enter a number to decide even or odd");
        int number = sc.nextInt();
        if (number >= 0) {
            if (number == 0) {
                System.out.println("The number is Zero");
            } else if (number % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } else {
            System.out.println("The number is negative");
        }
    }

}
