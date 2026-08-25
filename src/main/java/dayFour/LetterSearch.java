package dayFour;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your full name: ");
        String fullName = sc.nextLine();
        boolean leterFound = false;
        for(int i = 0; i < fullName.length(); i++) {
            char currentLetter = fullName.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a') {
                leterFound = true;
                break;
            }
        }
        if(leterFound) {
            System.out.println("This name contains letter A");
        }
        else{
            System.out.println("This name doesn't contain letter A");
        }

    }
}
