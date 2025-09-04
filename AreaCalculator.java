package oop.ocp;

// This class helps us calculate area of any shape
public class AreaCalculator {

    public double calculateArea(Shape shape) {
        return shape.calculateArea(); // Let the shape do the work
    }
}
