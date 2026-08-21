package dayThree;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*        System.out.println("Enter 1st number!");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number!");
        int num2 = input.nextInt();
        System.out.println("Enter 3rd number!");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The 1st number is the greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The 2nd number is the greatest");
        } else {
            System.out.println("The 3rd number is the greatest");
        }
*/
        System.out.println("Enter the day number: ");
        int dayNumber = input.nextInt();

/*        if (dayNumber == 1)
            System.out.println("Monday");
        else if (dayNumber == 2)
            System.out.println("Tuesday");
        else if (dayNumber == 3)
            System.out.println("Wednesday");
        else if (dayNumber == 4)
            System.out.println("Thursday");
        else if (dayNumber == 5)
            System.out.println("Friday");
        else if (dayNumber == 6)
            System.out.println("Saturday");
        else if (dayNumber == 7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid day number")
*/
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}
