package oop.ocp;

// This is a shape: Ellipse (like a stretched circle)
public class Ellipse extends Shape {
    private double majorAxis; // long side
    private double minorAxis; // short side

    // When we make an ellipse, we give it both axes
    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    // Area of ellipse: π * majorAxis * minorAxis

    @Override
    public double calculateArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}
