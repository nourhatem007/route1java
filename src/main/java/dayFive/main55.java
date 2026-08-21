package dayFive;

public class main55 {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Square(), new Triangle() };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
