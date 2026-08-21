package dayThree;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numnber of items");
        int quantity  = sc.nextInt();

        double total = 0.0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the price for item:");
            double itemPrice = sc.nextDouble();

            total += itemPrice;
        }
        System.out.println("Your total is: " + total);
    }
}
