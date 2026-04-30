class Area {

    // Area of circle
    double calculate(double r) {
        return Math.PI * r * r;
    }

    // Area of rectangle
    double calculate(double l, double b) {
        return l * b;
    }

    // Area of square
    int calculate(int side) {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Area a = new Area();

        System.out.println("Circle Area: " + a.calculate(5));
        System.out.println("Rectangle Area: " + a.calculate(4, 6));
        System.out.println("Square Area: " + a.calculate(4));
    }
}