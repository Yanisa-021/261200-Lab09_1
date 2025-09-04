package oop.ocp;

// This is a shape: Circle
public class Circle extends Shape {
    private double radius;

    // When we make a circle, we give it a radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // This is how we calculate the area of a circle: π * r * r
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

