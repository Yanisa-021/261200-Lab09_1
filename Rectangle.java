package oop.ocp;

// This is a shape: Rectangle (like a box)
public class Rectangle extends Shape {
    private double width;
    private double height;

    // When we make a rectangle, we give it a width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // This is how we calculate the area of a rectangle: width * height
    @Override

    public double calculateArea() {
        return width * height;
    }
}
