package daySeven;
import java.util.Locale;
import java.util.Scanner;
public class LinearSearch {
    Scanner sc = new Scanner(System.in);

    String[] fruits = {"apple","orange","banana"};
    String target;
    boolean isFound = false;

    void search(){
        System.out.println("Enter fruit Name:");
        target = sc.nextLine();

        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(target.toLowerCase())){
                System.out.println("The fruit you entered is available at box: " +i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("The fruit you entered is not available at any box");
        }
    }

}
