// Abstract class Shape
abstract class Shape {
    private String color; // Encapsulation: private property with getter and setter

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();

    // Abstract method to calculate perimeter
    public abstract double calculatePerimeter();
}

// Subclass for Circle
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color); // Calling the parent constructor
        this.radius = radius;
    }

    // Overriding calculateArea
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overriding calculatePerimeter
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Subclass for Triangle
class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double base, double height, double side1, double side2, double side3) {
        super(color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// Subclass for Square (inherits from Rectangle)
class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side); // A square is a rectangle with equal sides
    }
}

// Main class to demonstrate polymorphism
public class  ji{
    public static void main(String[] args) {
        // Polymorphism: Array of shapes
        Shape[] shapes = {
            new Circle("Red", 5),
            new Rectangle("Blue", 4, 7),
            new Triangle("Green", 3, 4, 3, 4, 5),
            new Square("Yellow", 6)
        };

        // Iterate through shapes and display their properties
        for (Shape shape : shapes) {
            System.out.println("Shape Color: " + shape.getColor());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
