package dayThree;
import java.util.Scanner;
public class EmployeeGrossPay {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hourRate = 15;
    int weeklyWorkingHours = 40;

    System.out.println("Enter the your weekly working hours");
    double empWorkingHours = sc.nextDouble();
    while (empWorkingHours <= 0 || empWorkingHours > weeklyWorkingHours) {
        System.out.println("Invalid Entry. Please enter between 1h and 40h");
        System.out.println("Enter the your weekly working hours");
        empWorkingHours = sc.nextDouble();
    }

    double salary = empWorkingHours * hourRate;
    System.out.println("Your salary is: " + salary);




    }
}
