// Point class
class Point {
    int x, y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to display point
    void displayPoint() {
        System.out.println("Center Point: (" + x + ", " + y + ")");
    }
}

// Circle class
class Circle {
    Point center;   // Object of Point class
    double radius;

    // Constructor
    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display details
    void displayCircle() {
        center.displayPoint();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create Point object
        Point p = new Point(3, 4);

        // Create Circle object using Point
        Circle c = new Circle(p, 5);

        // Display details
        c.displayCircle();
    }
}