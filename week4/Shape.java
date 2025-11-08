// Abstract class Shape
abstract class Shape {
    int dim1, dim2;

    // Constructor
    Shape(int d1, int d2) {
        dim1 = d1;
        dim2 = d2;
    }

    // Abstract method
    abstract void printArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        double area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class extending Shape
class Triangle extends Shape {

    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class extending Shape
class Circle extends Shape {

    Circle(int radius) {
        super(radius, 0); // second parameter unused
    }

    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the shapes
public class ShapeTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(7);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
