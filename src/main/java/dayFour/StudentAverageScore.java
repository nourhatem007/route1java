package dayFour;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 3;
        int numberOfCourses = 4;

        for(int i  = 1; i <= numberOfStudents; i++) {

            int total = 0;

            for(int j = 1; j <= numberOfCourses; j++) {

                System.out.println("Enter score for course " + (j) + " for student " + (i));
                double score = sc.nextDouble();

                total += score;
            }
            double average = total / numberOfCourses;
            System.out.println("The average score is: " + average);


        }


    }
}
