package dayThree;

import java.util.Scanner;

public class AddNumberDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        do {
            System.out.println("Enter the 1st number");
            double num1 = sc.nextDouble();
            System.out.println("Enter the 2nd number");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.println("would you like to sum other numbers \n write true if you want to insert another number \n if not write false");
            flag = sc.nextBoolean();

            if (flag == false) {
                System.out.println("thank you for using this program");
            }
        }
        while (flag);

    }
}
