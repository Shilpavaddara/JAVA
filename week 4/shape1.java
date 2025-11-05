// Abstract class Shape
abstract class Shape {
    int a, b;

    // Constructor to initialize dimensions
    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

// Rectangle class
class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class
class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class
class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0); // b is unused
    }

    @Override
    void printArea() {
        double area = Math.PI * a * a;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the shapes
public class shape1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Triangle tri = new Triangle(8, 6);
        Circle circ = new Circle(7);

        rect.printArea();
        tri.printArea();
        circ.printArea();
    }
}

