package dayFour;

import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);

    private double length;
    private double width;

    public void setLength(double length) {
        if (length > 0)
            this.length = length;
        else
            System.out.println("Length must be positive");
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            System.out.println("Width must be positive");
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return width * length;
    }

//    public double calculateArea(){
//        System.out.println("Enter the length and width of the rectangle");
//        length = sc.nextDouble();
//        width = sc.nextDouble();
//        double area = length *  width;
//        System.out.println("The area of the rectangle is: " + area);
//        return area;
//    }
}
