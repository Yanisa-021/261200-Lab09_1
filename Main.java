package oop.ocp;

public class Main {
    public static void main(String[] args) {
        // Create our calculator
        AreaCalculator calculator = new AreaCalculator();

// Make some shapes
        Shape rectangle = new Rectangle(7, 6);
        Shape circle = new Circle(8);
        Shape ellipse = new Ellipse(4, 3);

        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Ellipse area: " + calculator.calculateArea(ellipse));
    }
}
