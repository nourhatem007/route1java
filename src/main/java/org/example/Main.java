package org.example;

import dayFive.Circle;
import dayFive.Shape;
import dayFive.Square;
import dayFive.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square(), new Triangle() };

        System.out.println("--- Executing Polymorphic Draw Calls ---");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
